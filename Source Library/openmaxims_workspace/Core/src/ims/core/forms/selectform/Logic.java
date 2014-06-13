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
// This code was generated by Ander Telleria using IMS Development Environment (version 1.70 build 3425.24971)
// Copyright (C) 1995-2009 IMS MAXIMS plc. All rights reserved.

package ims.core.forms.selectform;

import ims.admin.vo.AppFormVo;
import ims.admin.vo.AppFormVoCollection;
import ims.core.forms.selectform.GenForm.grdFormsRow;
import ims.framework.MessageButtons;
import ims.framework.cn.events.UpdateTheme;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	//---------------------------------------------------------------------------------------------------------------------------------------------
	// Region events
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{
		// Set state of include dialog check box (KEEP THIS CODE HERE - The state of the check box doesn't need to be updated)
		form.chkIncludeDialogs().setVisible(true);
		form.chkIncludeDialogs().setEnabled(true);

		if (args != null && args.length == 1 && args[0] instanceof Boolean)
		{
			form.chkIncludeDialogs().setVisible((Boolean) args[0]);
			form.chkIncludeDialogs().setEnabled((Boolean) args[0]);
		}
		
		initialize();
		
		open();
	}

	@Override
	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearControls();
		updateControlsState();
	}
	

	@Override
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.txtName().getValue() == null)
		{
			engine.showMessage("Please enter a search criteria", "Message", MessageButtons.OK);
			return;
		}
		
		form.grdForms().getRows().clear();
		AppFormVoCollection forms = null;
		
		if (form.txtName() != null)
		{
			forms = domain.listForms(form.txtName().getValue(), form.chkIncludeAliases().getValue(), form.chkIncludeDialogs().getValue());
		}
		
		if (forms != null)
		{
			for (AppFormVo item : forms)
			{
				grdFormsRow aRow = form.grdForms().getRows().newRow();
				aRow.setValue(item);
				aRow.setcolName(item.getName());
				aRow.setcolAlias(item.getAliasName());
				aRow.setcolSelect(false);
			}
		}
		else
		{
			engine.showMessage("No results found", "Message", MessageButtons.OK);
		}
	}
	
	@Override
	protected void onBtnCancelClick() throws PresentationLogicException 
	{
		form.getGlobalContext().ICP.setLinkedForm(null);
		engine.close(DialogResult.CANCEL);		
	}
	
	@Override
	protected void onBtnSelectClick() throws PresentationLogicException 
	{
		for (int i=0;i<form.grdForms().getRows().size();i++)
		{
			if (form.grdForms().getRows().get(i).getcolSelect())
			{
				form.getGlobalContext().ICP.setLinkedForm(form.grdForms().getRows().get(i).getValue());
				form.getGlobalContext().ICP.setLinkedItem(form.grdForms().getRows().get(i).getValue());
				break;
			}
		}
		if (!form.getGlobalContext().ICP.getLinkedFormIsNotNull())
		{
			engine.showMessage("Select a Form from the Grid", "Message", MessageButtons.OK);
			return;
		}
		engine.close(DialogResult.OK);
	}
	
	@Override
	protected void onGrdFormsGridCheckBoxClicked(int column, grdFormsRow row, boolean isChecked) throws PresentationLogicException 
	{
		for (int i = 0; i < form.grdForms().getRows().size(); i++)
		{
			if (isChecked)
			{
				if (!form.grdForms().getRows().get(i).getValue().getID_AppForm().equals(row.getValue().getID_AppForm()))
				{
					form.grdForms().getRows().get(i).setcolSelect(false);
				}
			}
		}
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------
	//	Methods region
	//--------------------------------------------------------------------------------------------------------------------------------------------
	private void initialize()
	{
		form.getGlobalContext().ICP.setLinkedForm(null);
		
		form.chkIncludeAliases().setValue(Boolean.TRUE);
	}
	
	private void open()
	{
		clearControls();
		updateControlsState();
	}

	private void clearControls()
	{
		form.txtName().setValue(null);
		form.grdForms().getRows().clear();
	}

	private void updateControlsState()
	{
	}
}