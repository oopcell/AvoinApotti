//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.racpc.forms.racpcprintsummarydialog;

import ims.configuration.gen.ConfigFlag;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.PrinterScope;
import ims.framework.interfaces.ILocation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.SeedValue;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	private static final int RACPCSUMMARY_REPORT_IMSID = 299; 
	private static final String CARE_CONTEXT_SEED = "CareContext_id";

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		ILocation locs = domain.getCurrentLocation();
		
		form.lblLoc().setValue(locs != null ? locs.getName() : "No location selected");
		form.ccPrinter().initialize(locs, PrinterScope.DEFAULT);	
	}
	
	@Override
	protected void onBtnPreviewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument() != null
			&& form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument().getServerDocument() != null)
		{
			openDocument();	
		}
		else
		{
			print(true);
		}
	}
	
	private void openDocument() 
	{
		if(form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument() == null || form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument().getServerDocument() == null)
			return;
		
		String fileName = form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument().getServerDocument().getFileName();
		String fullPath = getMaximsDocumentStorePath();

		fullPath += fileName;
		
		engine.open(form.getForms().Core.PatientDocumentView, new Object[] { fullPath.replace("/", "\\") });
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);	
	}
	
	@Override
	protected void onBtnPrintClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(validateRules())
			print(false);
	}
	
	private boolean validateUIRules() 
	{
		ArrayList<String> errors = new ArrayList<String>();
		
		if (form.ccPrinter().getSelectedPrinter() == null)
		{
			errors.add("No printer selected.");
		}
		
		if(errors.size() == 0)
			return true;
		
		engine.showErrors(errors.toArray(new String[errors.size()]));
		
		return false;
	}
	
	private boolean validateRules() 
	{
		if(!validateReportConfigFlags())
			return false;
		
		if(!validateUIRules())
			return false;
		
		return true;
	}
	
	private void print(boolean buildAsURL) 
	{
		String urlQueryServer = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		String urlReportServer = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		QueryBuilderClient cl = new QueryBuilderClient(urlQueryServer, engine.getSessionId());
			
		String url = null;
		String fileName = null;
		Object[] obj = null;
		
		if(form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument() != null
			&& form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument().getServerDocument() != null)
		{
			fileName = form.getGlobalContext().RACPC.getRACPCSummary().getSummaryDocument().getServerDocument().getFileName();
		}
		
		if(fileName == null || buildAsURL)
		{
			obj = domain.getSystemReportAndTemplate(RACPCSUMMARY_REPORT_IMSID);
			
			if(obj == null || obj.length < 2)
			{
				engine.showMessage("I could not get the report and template !");
				return;
			}

			if(obj[0] == null || obj[1] == null)
			{
				engine.showMessage("The report has not been deployed !");
				return;
			}
			
			cl.addSeed(new SeedValue(CARE_CONTEXT_SEED, form.getGlobalContext().Core.getCurrentCareContext().getID_CareContext(), Integer.class));	
		}

		try
		{
			if(buildAsURL)
			{
				url = cl.buildReportAsUrl((String)obj[0], (String)obj[1], urlReportServer, QueryBuilderClient.PDF, "", 1);
			}
			else
			{
				if(fileName != null)
				{
					cl.printReport(readFile(getFilePath(fileName)), urlReportServer, form.ccPrinter().getSelectedPrinter().getIPrinterName(), 1);
				}
				else
				{
					cl.buildReport((String)obj[0], (String)obj[1], urlReportServer, QueryBuilderClient.PDF, form.ccPrinter().getSelectedPrinter().getIPrinterName(), 1);
				}
			}
		}
		catch (QueryBuilderClientException e)
		{
			engine.showMessage("Error printing report: " + e.getMessage());
			return;
		}
		
		if(buildAsURL)
			engine.openUrl(url);
		else
			engine.close(DialogResult.OK);
	}
	
	private String getMaximsDocumentStorePath()
	{
		String storePath = ConfigFlag.GEN.FILE_SERVER_URL.getValue();//WDEV-13366
		
		if(!(storePath.endsWith("/") || storePath.endsWith("\\")))
			storePath = storePath + "/";
				
		return storePath;
	}
	
	private String getFilePath(String fileName)
	{
		return getPDFStorePath() + fileName;
	}
	
	private String getPDFStorePath()
	{
		String storePath = ConfigFlag.GEN.PDF_STORE_PATH.getValue();
		
		if(!(storePath.endsWith("/") || storePath.endsWith("\\")))
			storePath = storePath + "/";
				
		return storePath;
	}
	
	private byte[] readFile(String filePath)
	{
		File pdf = new File(filePath);
		long size = pdf.length();

		if (size == 0)
		{
			return null;
		}

		FileInputStream fileInputStream = null;
		byte[] buffer = null;

		try
		{
			fileInputStream = new FileInputStream(pdf);
			int bytesAvailable = fileInputStream.available();
			int maxBufferSize = (int) size;
			int bufferSize = Math.min(bytesAvailable, maxBufferSize);
			buffer = new byte[bufferSize];
			int bytesRead = fileInputStream.read(buffer, 0, bufferSize);
			while (bytesRead > 0)
			{
				bytesAvailable = fileInputStream.available();
				bufferSize = Math.min(bytesAvailable, maxBufferSize);
				bytesRead = fileInputStream.read(buffer, 0, bufferSize);
			}

		}
		catch (IOException e)
		{
			buffer = null;
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fileInputStream.close();
			}
			catch (IOException e)
			{

			}
		}

		return buffer;
	}

	private boolean validateReportConfigFlags() 
	{
		String queryServerUrl = ConfigFlag.GEN.QUERY_SERVER_URL.getValue();
		String reportServerUrl = ConfigFlag.GEN.REPORT_SERVER_URL.getValue();
		
		ArrayList<String> errors = new ArrayList<String>();
		
		if(queryServerUrl == null || queryServerUrl.length() == 0 || queryServerUrl.equals(ConfigFlag.GEN.QUERY_SERVER_URL.getDefaultValue()))
		{
			errors.add("The config flag QUERY_SERVER_URL is not set!");
		}
		
		if(reportServerUrl == null || reportServerUrl.length() == 0 || reportServerUrl.equals(ConfigFlag.GEN.REPORT_SERVER_URL.getDefaultValue()))
		{
			errors.add("The config flag REPORT_SERVER_URL is not set !");
		}
		
		if(errors.size() == 0)
			return true;
		
		engine.showErrors(errors.toArray(new String[errors.size()]));
		
		return false;
	}
}