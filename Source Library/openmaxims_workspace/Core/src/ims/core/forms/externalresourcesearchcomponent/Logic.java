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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4758.16736)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.core.forms.externalresourcesearchcomponent;

import ims.core.forms.externalresourcesearchcomponent.GenForm.grdExternalResourceRow;
import ims.core.vo.ExternalResourceVo;
import ims.core.vo.ExternalResourceVoCollection;
import ims.core.vo.enums.ExternalResourceSearchEvent;
import ims.core.vo.lookups.ExternalResourceType;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onGrdExternalResourceSelectionChanged()
	{
		form.getLocalContext().setEventSelected(ExternalResourceSearchEvent.ROW_SELECTED);
		form.fireCustomControlValueChanged();
	}

	private void search()
	{
		form.grdExternalResource().getRows().clear();
		ExternalResourceVoCollection externalVoCol = domain.getExternalResources(form.cmbResourceType().getValue(), form.txtName().getValue(), form.cmbHCPType().getValue(), form.cmbStatus().getValue());

		if (externalVoCol == null || externalVoCol.size() == 0)
		{
			engine.showMessage("No records found !");
			return;
		}

		populateExternalResourceGrid(externalVoCol);
	}

	private void populateExternalResourceGrid(ExternalResourceVoCollection externalVoCol)
	{
		if (externalVoCol == null)
			return;

		for (int i = 0; i < externalVoCol.size(); i++)
		{
			ExternalResourceVo tempVo = externalVoCol.get(i);
			if (tempVo != null)
			{
				grdExternalResourceRow rowExternalResGrid = form.grdExternalResource().getRows().newRow();
				rowExternalResGrid.setColumnResourceType(tempVo.getExternalResourceType().getText());
				rowExternalResGrid.setColumnHCPType(tempVo.getHCPTypeIsNotNull() ? tempVo.getHCPType().getText() : null);
				rowExternalResGrid.setColumnName(tempVo.getResourcename());

				if (tempVo.getResourceAddressIsNotNull())
				{
					rowExternalResGrid.setColumnAddress(tempVo.getResourceAddress().getLine1() + " " + (tempVo.getResourceAddress().getLine2IsNotNull() ? tempVo.getResourceAddress().getLine2() : "") + " " + (tempVo.getResourceAddress().getLine3IsNotNull() ? tempVo.getResourceAddress().getLine3() : ""));
					rowExternalResGrid.setColumnCounty(tempVo.getResourceAddress().getCounty() != null ? tempVo.getResourceAddress().getCounty().getText() : null);
					rowExternalResGrid.setColumnWorkPhone(tempVo.getResourceAddress().getPhone());
				}
				rowExternalResGrid.setColumnStatus(tempVo.getResourceStatus().getText());
				rowExternalResGrid.setValue(tempVo);

			}
		}
	}

	public ims.core.vo.ExternalResourceVo getSelectedExternalResource()
	{
		return form.grdExternalResource().getValue();
	}

	public void initialize(ExternalResourceType externalResourceType)
	{
		form.cmbResourceType().setValue(externalResourceType);
		form.cmbResourceType().setEnabled(!(externalResourceType != null));
		form.cmbHCPType().setEnabled(ExternalResourceType.ERT_HCP.equals(externalResourceType));
		search();
	}

	@Override
	protected void onImbClearClick() throws PresentationLogicException
	{
		clearSearchCriteriaFields();
		form.grdExternalResource().getRows().clear();
		
		form.getLocalContext().setEventSelected(null);
		form.fireCustomControlValueChanged();
	}

	private void clearSearchCriteriaFields()
	{
		if (form.cmbResourceType().isEnabled())
		{
			form.cmbResourceType().setValue(null);
		}
		form.txtName().setValue(null);
		form.cmbHCPType().setValue(null);
		form.cmbStatus().setValue(null);
	}

	@Override
	protected void onImbSearchClick() throws PresentationLogicException
	{
		search();
		
		form.getLocalContext().setEventSelected(null);
		form.fireCustomControlValueChanged();
	}

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{

	}

	public ExternalResourceSearchEvent getSelectedEvent()
	{
		return form.getLocalContext().getEventSelected();
	}
}