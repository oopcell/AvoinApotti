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
// This code was generated by Marius Mihalec using IMS Development Environment (version 1.30 build 2042.19436)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.ocrr.forms.itemselection;

import ims.configuration.gen.ConfigFlag;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.ocrr.vo.InvestShortVo;
import ims.ocrr.vo.InvestShortVoCollection;
import ims.ocrr.vo.OrderSetShortVo;
import ims.ocrr.vo.OrderSetShortVoCollection;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.ItemSelectionType;

public class Logic extends BaseLogic
{
	protected void onFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		initialize();
		openPreselectedItems();
	}
	protected void onImbClearClick() throws PresentationLogicException 
	{
		clearSearchData();
	}
	protected void onImbSearchClick() throws PresentationLogicException 
	{
		searchData();		
	}
	protected void onBtnOKClick() throws PresentationLogicException 
	{
		buildSelection();
		engine.close(DialogResult.OK);
	}
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearResultData();		
		engine.close(DialogResult.CANCEL);
	}
	protected void onImbAddToListClick() throws PresentationLogicException 
	{
		addSelectedItems();
	}
	protected void onImbRemoveFromListClick() throws PresentationLogicException 
	{
		removeSelectedItems();
	}
	private void openPreselectedItems()
	{
		if(form.getGlobalContext().OCRR.getItemSelectionTypeIsNotNull())
		{
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.INVESTIGATION) && form.getGlobalContext().OCRR.getPreselectedInvestigationsIsNotNull())
			{
				for(int x = 0; x < form.getGlobalContext().OCRR.getPreselectedInvestigations().size(); x++)
				{
					InvestShortVo item = form.getGlobalContext().OCRR.getPreselectedInvestigations().get(x);
					if(!isSelected(item))
						addToSelection(item, false);
				}
			}
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.PROFILE) && form.getGlobalContext().OCRR.getPreselectedProfilesIsNotNull())
			{
				for(int x = 0; x < form.getGlobalContext().OCRR.getPreselectedProfiles().size(); x++)
				{
					InvestShortVo item = form.getGlobalContext().OCRR.getPreselectedProfiles().get(x);
					if(!isSelected(item))
						addToSelection(item, false);
				}
			}
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.ORDERSET) && form.getGlobalContext().OCRR.getPreselectedOrderSetsIsNotNull())
			{
				for(int x = 0; x < form.getGlobalContext().OCRR.getPreselectedOrderSets().size(); x++)
				{
					OrderSetShortVo item = form.getGlobalContext().OCRR.getPreselectedOrderSets().get(x);
					if(!isSelected(item))
						addToSelection(item, false);
				}
			}
		}
	}
	private void initialize()
	{
		clearResultData();
		
		form.cmbCategory().removeRow(Category.PAS);
		
		if(form.getGlobalContext().OCRR.getCategoryIsNotNull())
		{
			form.cmbCategory().setValue(form.getGlobalContext().OCRR.getCategory());
			form.cmbCategory().setEnabled(false);
		}
		
		if(form.getGlobalContext().OCRR.getItemSelectionTypeIsNotNull())
		{
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.INVESTIGATION))
				engine.setCaption("Investigations Selection");
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.PROFILE))
				engine.setCaption("Profiles Selection");
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.ORDERSET))
			{
				engine.setCaption("Order Sets Selection");
				form.lblCategory().setVisible(false);
				form.cmbCategory().setVisible(false);
				form.txtName().setRequired(true);//WDEV-16438
			}			
		}
	}	
	private void clearSearchData()
	{
		form.txtName().setValue(null);
		//WDEV-13861
		if (form.cmbCategory().isEnabled())
		{
			form.cmbCategory().setValue(null);
		}
		
		form.grdListedTests().getRows().clear(); //WDEV-13810
	}
	private void searchData()
	{
		form.grdListedTests().getRows().clear();
		
		if(form.cmbCategory().getValue() == null && form.txtName().getValue() == null)
		{
			engine.showMessage("Please Enter Some Search Criteria");
			return;
		}
		
		if(form.getGlobalContext().OCRR.getItemSelectionTypeIsNotNull())
		{
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.INVESTIGATION) || form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.PROFILE))
			{
				InvestShortVoCollection voColl = domain.listInvestigationsOrProfiles(
						form.cmbCategory().getValue(), 
						form.txtName().getValue(),
						form.getGlobalContext().OCRR.getProvider(), 
						form.getGlobalContext().OCRR.getProviderService(), 
						new Boolean(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.PROFILE)),Boolean.TRUE, engine.getPreviousNonDialogFormName().equals(form.getForms().OCRR.TestEdit) || engine.getPreviousNonDialogFormName().equals(form.getForms().OCRR.ProfileEdit), Boolean.TRUE, new Boolean(engine.getPreviousNonDialogFormName().equals(form.getForms().OCRR.ProfileEdit)),null,null);
				populateSearchResults(voColl);
			}
			else if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.ORDERSET))
			{
				OrderSetShortVoCollection results = domain.listOrderSets(form.txtName().getValue());
				populateSearchResults(results);
			}
		}		
	}
	private void populateSearchResults(InvestShortVoCollection searchResults)
	{
		form.grdListedTests().getRows().clear();
		if(searchResults.size() == 0)
		{
			engine.showMessage("There are no Records for the Search Criteria Provided");
			return;
		}
		
		for(int x = 0; x < searchResults.size(); x++)
		{
			addToList(searchResults.get(x));			
		}
	}
	private void populateSearchResults(OrderSetShortVoCollection searchResults)
	{
		if(searchResults == null || searchResults.size() == 0)  //WDEV-10275
		{
			engine.showMessage("There are no Records for the Search Criteria Provided");
			return;
		}
		
		for(int x = 0; x < searchResults.size(); x++)
		{
			addToList(searchResults.get(x));			
		}
	}
	private boolean isSelected(Object value)
	{
		for(int x = 0; x < form.grdSelectedTests().getRows().size(); x++)
		{
			Object existingItem = form.grdSelectedTests().getRows().get(x).getValue();
			if(existingItem != null && existingItem.equals(value))
				return true;
		}
		return false;
	}
	private boolean isListed(Object value)
	{
		for(int x = 0; x < form.grdListedTests().getRows().size(); x++)
		{
			Object existingItem = form.grdListedTests().getRows().get(x).getValue();
			if(existingItem != null && existingItem.equals(value))
				return true;
		}
		return false;
	}	
	private void addSelectedItems()
	{	
		for(int x = 0; x < form.grdListedTests().getRows().size(); x++)
		{
			if(form.grdListedTests().getRows().get(x).getcolSelected())
			{
				Object existingItem = form.grdListedTests().getRows().get(x).getValue();
				
				if(existingItem instanceof InvestShortVo)
				{
					InvestShortVo item = (InvestShortVo)existingItem;
					if(!isSelected(item))
						addToSelection(item);											
				}
				if(existingItem instanceof OrderSetShortVo)
				{
					OrderSetShortVo item = (OrderSetShortVo)existingItem;
					if(!isSelected(item))
						addToSelection(item);					
				}
			}
		}
		int size = form.grdListedTests().getRows().size();
		for(int x = size - 1; x >= 0 ; x--)
		{
			if(form.grdListedTests().getRows().get(x).getcolSelected())
				form.grdListedTests().getRows().remove(x);
		}
	}
	private void removeSelectedItems()
	{	
		for(int x = 0; x < form.grdSelectedTests().getRows().size(); x++)
		{
			if(form.grdSelectedTests().getRows().get(x).getcolSelected())
			{
				Object existingItem = form.grdSelectedTests().getRows().get(x).getValue();
				
				if(existingItem instanceof InvestShortVo)
				{
					InvestShortVo item = (InvestShortVo)existingItem;
					if(!isListed(item))
						addToList(item);					
				}
				if(existingItem instanceof OrderSetShortVo)
				{
					OrderSetShortVo item = (OrderSetShortVo)existingItem;
					if(!isListed(item))
						addToList(item);					
				}
			}
		}
		int size = form.grdSelectedTests().getRows().size();
		for(int x = size - 1; x >= 0 ; x--)
		{
			if(form.grdSelectedTests().getRows().get(x).getcolSelected())
				form.grdSelectedTests().getRows().remove(x);
		}
	}
	private void addToList(InvestShortVo item)
	{
		if(item == null)
			return;
		
		if(form.getGlobalContext().OCRR.getCurrentInvestigationIsNotNull())
			if(item.equals(form.getGlobalContext().OCRR.getCurrentInvestigation()))
				return;
		
		GenForm.grdListedTestsRow row = form.grdListedTests().getRows().newRow();
		row.setValue(item);
		if(item.getInvestigationIndexIsNotNull())
		{
			boolean isAdditionalInfoToBeShown = ConfigFlag.UI.OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME.getValue();
			row.setcolName(isAdditionalInfoToBeShown == true ? item.getNameWithLocationInfo() : item.getName());
			row.setTooltip("Description: " + item.getInvestigationIndex().getDescription());
		
			if(item.getInvestigationIndex().getIsProfileIsNotNull() && item.getInvestigationIndex().getIsProfile().booleanValue())
				row.setcolImage(form.getImages().OCRR.Profile);
			else
				row.setcolImage(form.getImages().OCRR.Investigation);
		
		}
	}	

	private void addToList(OrderSetShortVo item)
	{
		GenForm.grdListedTestsRow row = form.grdListedTests().getRows().newRow();
		row.setValue(item);
		row.setcolImage(form.getImages().OCRR.OrderSet);
		row.setcolName(item.getName());		
	}	
	private void addToSelection(InvestShortVo item)
	{
		addToSelection(item, true);
	}
	private void addToSelection(InvestShortVo item, boolean canBeRemoved)
	{
		GenForm.grdSelectedTestsRow row = form.grdSelectedTests().getRows().newRow();
		row.setValue(item);
		if(item.getInvestigationIndexIsNotNull())
		{
			row.setReadOnly(!canBeRemoved);
			boolean isAdditionalInfoToBeShown = ConfigFlag.UI.OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME.getValue();
			row.setcolName(isAdditionalInfoToBeShown == true ? item.getNameWithLocationInfo() : item.getName());
			if(item.getInvestigationIndex().getIsProfileIsNotNull() && item.getInvestigationIndex().getIsProfile().booleanValue())
				row.setcolImage(form.getImages().OCRR.Profile);
			else
				row.setcolImage(form.getImages().OCRR.Investigation);
		}
	}
	private void addToSelection(OrderSetShortVo item)
	{
		addToSelection(item, true);
	}
	private void addToSelection(OrderSetShortVo item, boolean canBeRemoved)
	{
		GenForm.grdSelectedTestsRow row = form.grdSelectedTests().getRows().newRow();
		row.setReadOnly(!canBeRemoved);
		row.setValue(item);
		row.setcolImage(form.getImages().OCRR.OrderSet);
		row.setcolName(item.getName());
	}	
	private void buildSelection()
	{
		clearResultData();
		
		InvestShortVoCollection investigations = new InvestShortVoCollection();
		InvestShortVoCollection profiles = new InvestShortVoCollection();
		OrderSetShortVoCollection orderSets = new OrderSetShortVoCollection();
		
		for(int x = 0; x < form.grdSelectedTests().getRows().size(); x++)
		{
			Object item = form.grdSelectedTests().getRows().get(x).getValue();
			if(item != null)
			{
				if(item instanceof InvestShortVo)
				{
					InvestShortVo cast = (InvestShortVo)item;
					if(cast.getInvestigationIndexIsNotNull() && cast.getInvestigationIndex().getIsProfileIsNotNull() && cast.getInvestigationIndex().getIsProfile().booleanValue())
					{
						if(!wasProfilePreselected(cast))
							profiles.add(cast);
					}
					else
					{
						if(!wasInvastigationPreselected(cast))
							investigations.add(cast);
					}
				}
				if(item instanceof OrderSetShortVo)
				{
					OrderSetShortVo cast = (OrderSetShortVo)item;
					if(!wasOrderSetPreselected(cast))
						orderSets.add(cast);
				}
			}
		}
			
		form.getGlobalContext().OCRR.setSelectedInvestigations(investigations);
		form.getGlobalContext().OCRR.setSelectedProfiles(profiles);
		form.getGlobalContext().OCRR.setSelectedOrderSets(orderSets);
	}
	private void clearResultData()
	{
		form.getGlobalContext().OCRR.setSelectedInvestigations(null);
		form.getGlobalContext().OCRR.setSelectedProfiles(null);
		form.getGlobalContext().OCRR.setSelectedOrderSets(null);
	}
	private boolean wasInvastigationPreselected(InvestShortVo item)
	{
		if(form.getGlobalContext().OCRR.getItemSelectionTypeIsNotNull())
		{
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.INVESTIGATION) && form.getGlobalContext().OCRR.getPreselectedInvestigationsIsNotNull())
			{
				for(int x = 0; x < form.getGlobalContext().OCRR.getPreselectedInvestigations().size(); x++)
				{
					InvestShortVo existingItem = form.getGlobalContext().OCRR.getPreselectedInvestigations().get(x);
					if(existingItem != null && existingItem.equals(item))
						return true;
				}
			}
		}
		
		return false;
	}
	private boolean wasProfilePreselected(InvestShortVo item)
	{
		if(form.getGlobalContext().OCRR.getItemSelectionTypeIsNotNull())
		{
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.PROFILE) && form.getGlobalContext().OCRR.getPreselectedProfilesIsNotNull())
			{
				for(int x = 0; x < form.getGlobalContext().OCRR.getPreselectedProfiles().size(); x++)
				{
					InvestShortVo existingItem = form.getGlobalContext().OCRR.getPreselectedProfiles().get(x);
					if(existingItem != null && existingItem.equals(item))
						return true;
				}
			}
		}
		
		return false;
	}
	private boolean wasOrderSetPreselected(OrderSetShortVo item)
	{
		if(form.getGlobalContext().OCRR.getItemSelectionTypeIsNotNull())
		{
			if(form.getGlobalContext().OCRR.getItemSelectionType().equals(ItemSelectionType.ORDERSET) && form.getGlobalContext().OCRR.getPreselectedOrderSetsIsNotNull())
			{
				for(int x = 0; x < form.getGlobalContext().OCRR.getPreselectedOrderSets().size(); x++)
				{
					OrderSetShortVo existingItem = form.getGlobalContext().OCRR.getPreselectedOrderSets().get(x);
					if(existingItem != null && existingItem.equals(item))
						return true;
				}
			}
		}
		
		return false;
	}
}