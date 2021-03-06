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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.forms.demographicscomponent;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		RefMan = new RefManContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getDeathDetailsIsNotNull()
		{
			return !cx_CoreDeathDetails.getValueIsNull(context);
		}
		public ims.core.vo.DeathDetailsVo getDeathDetails()
		{
			return (ims.core.vo.DeathDetailsVo)cx_CoreDeathDetails.getValue(context);
		}
		public void setDeathDetails(ims.core.vo.DeathDetailsVo value)
		{
			cx_CoreDeathDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreDeathDetails = new ims.framework.ContextVariable("Core.DeathDetails", "_cv_Core.DeathDetails");
		public boolean getGPDetailsIsNotNull()
		{
			return !cx_CoreGPDetails.getValueIsNull(context);
		}
		public ims.core.vo.GpShortVo getGPDetails()
		{
			return (ims.core.vo.GpShortVo)cx_CoreGPDetails.getValue(context);
		}
		public void setGPDetails(ims.core.vo.GpShortVo value)
		{
			cx_CoreGPDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreGPDetails = new ims.framework.ContextVariable("Core.GPDetails", "_cv_Core.GPDetails");
		public boolean getGPSurgeryIsNotNull()
		{
			return !cx_CoreGPSurgery.getValueIsNull(context);
		}
		public ims.core.vo.LocSiteShortVo getGPSurgery()
		{
			return (ims.core.vo.LocSiteShortVo)cx_CoreGPSurgery.getValue(context);
		}
		public void setGPSurgery(ims.core.vo.LocSiteShortVo value)
		{
			cx_CoreGPSurgery.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreGPSurgery = new ims.framework.ContextVariable("Core.GPSurgery", "_cv_Core.GPSurgery");
		public boolean getNOKDetailsIsNotNull()
		{
			return !cx_CoreNOKDetails.getValueIsNull(context);
		}
		public ims.core.vo.NextOfKin getNOKDetails()
		{
			return (ims.core.vo.NextOfKin)cx_CoreNOKDetails.getValue(context);
		}
		public void setNOKDetails(ims.core.vo.NextOfKin value)
		{
			cx_CoreNOKDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreNOKDetails = new ims.framework.ContextVariable("Core.NOKDetails", "_cv_Core.NOKDetails");
		public boolean getOtherAddressesIsNotNull()
		{
			return !cx_CoreOtherAddresses.getValueIsNull(context);
		}
		public ims.core.vo.PersonAddressCollection getOtherAddresses()
		{
			return (ims.core.vo.PersonAddressCollection)cx_CoreOtherAddresses.getValue(context);
		}
		public void setOtherAddresses(ims.core.vo.PersonAddressCollection value)
		{
			cx_CoreOtherAddresses.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreOtherAddresses = new ims.framework.ContextVariable("Core.OtherAddresses", "_cv_Core.OtherAddresses");
		public boolean getOtherNamesIsNotNull()
		{
			return !cx_CoreOtherNames.getValueIsNull(context);
		}
		public ims.core.vo.PersonNameCollection getOtherNames()
		{
			return (ims.core.vo.PersonNameCollection)cx_CoreOtherNames.getValue(context);
		}
		public void setOtherNames(ims.core.vo.PersonNameCollection value)
		{
			cx_CoreOtherNames.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreOtherNames = new ims.framework.ContextVariable("Core.OtherNames", "_cv_Core.OtherNames");
		public boolean getParentFormModeIsNotNull()
		{
			return !cx_CoreParentFormMode.getValueIsNull(context);
		}
		public ims.framework.enumerations.FormMode getParentFormMode()
		{
			return (ims.framework.enumerations.FormMode)cx_CoreParentFormMode.getValue(context);
		}
		public void setParentFormMode(ims.framework.enumerations.FormMode value)
		{
			cx_CoreParentFormMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreParentFormMode = new ims.framework.ContextVariable("Core.ParentFormMode", "_cv_Core.ParentFormMode");
		public boolean getAddressSearchTextIsNotNull()
		{
			return !cx_CoreAddressSearchText.getValueIsNull(context);
		}
		public String getAddressSearchText()
		{
			return (String)cx_CoreAddressSearchText.getValue(context);
		}
		public void setAddressSearchText(String value)
		{
			cx_CoreAddressSearchText.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreAddressSearchText = new ims.framework.ContextVariable("Core.AddressSearchText", "_cv_Core.AddressSearchText");
		public boolean getAddressSearchTypeIsNotNull()
		{
			return !cx_CoreAddressSearchType.getValueIsNull(context);
		}
		public String getAddressSearchType()
		{
			return (String)cx_CoreAddressSearchType.getValue(context);
		}
		public void setAddressSearchType(String value)
		{
			cx_CoreAddressSearchType.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreAddressSearchType = new ims.framework.ContextVariable("Core.AddressSearchType", "_cv_Core.AddressSearchType");
		public boolean getHideCancelButtonIsNotNull()
		{
			return !cx_CoreHideCancelButton.getValueIsNull(context);
		}
		public Boolean getHideCancelButton()
		{
			return (Boolean)cx_CoreHideCancelButton.getValue(context);
		}
		public void setHideCancelButton(Boolean value)
		{
			cx_CoreHideCancelButton.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreHideCancelButton = new ims.framework.ContextVariable("Core.HideCancelButton", "_cv_Core.HideCancelButton");
		public boolean getPatientFilterIsNotNull()
		{
			return !cx_CorePatientFilter.getValueIsNull(context);
		}
		public ims.core.vo.PatientFilter getPatientFilter()
		{
			return (ims.core.vo.PatientFilter)cx_CorePatientFilter.getValue(context);
		}
		public void setPatientFilter(ims.core.vo.PatientFilter value)
		{
			cx_CorePatientFilter.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientFilter = new ims.framework.ContextVariable("Core.PatientFilter", "_cvp_Core.PatientFilter");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");
		public boolean getPatientToBeDisplayedIsNotNull()
		{
			return !cx_CorePatientToBeDisplayed.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientToBeDisplayed()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientToBeDisplayed.getValue(context);
		}
		public void setPatientToBeDisplayed(ims.core.vo.PatientShort value)
		{
			cx_CorePatientToBeDisplayed.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientToBeDisplayed = new ims.framework.ContextVariable("Core.PatientToBeDisplayed", "_cv_Core.PatientToBeDisplayed");
		public boolean getPersonAddressIsNotNull()
		{
			return !cx_CorePersonAddress.getValueIsNull(context);
		}
		public ims.core.vo.PersonAddress getPersonAddress()
		{
			return (ims.core.vo.PersonAddress)cx_CorePersonAddress.getValue(context);
		}
		public void setPersonAddress(ims.core.vo.PersonAddress value)
		{
			cx_CorePersonAddress.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePersonAddress = new ims.framework.ContextVariable("Core.PersonAddress", "_cv_Core.PersonAddress");
		public boolean getYesNoDialogMessageIsNotNull()
		{
			return !cx_CoreYesNoDialogMessage.getValueIsNull(context);
		}
		public String getYesNoDialogMessage()
		{
			return (String)cx_CoreYesNoDialogMessage.getValue(context);
		}
		public void setYesNoDialogMessage(String value)
		{
			cx_CoreYesNoDialogMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreYesNoDialogMessage = new ims.framework.ContextVariable("Core.YesNoDialogMessage", "_cv_Core.YesNoDialogMessage");
		public boolean getCommChannelsIsNotNull()
		{
			return !cx_CoreCommChannels.getValueIsNull(context);
		}
		public ims.core.vo.CommChannelVoCollection getCommChannels()
		{
			return (ims.core.vo.CommChannelVoCollection)cx_CoreCommChannels.getValue(context);
		}
		public void setCommChannels(ims.core.vo.CommChannelVoCollection value)
		{
			cx_CoreCommChannels.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCommChannels = new ims.framework.ContextVariable("Core.CommChannels", "_cv_Core.CommChannels");
		public boolean getNOKPersonAddressIsNotNull()
		{
			return !cx_CoreNOKPersonAddress.getValueIsNull(context);
		}
		public ims.core.vo.PersonAddress getNOKPersonAddress()
		{
			return (ims.core.vo.PersonAddress)cx_CoreNOKPersonAddress.getValue(context);
		}
		public void setNOKPersonAddress(ims.core.vo.PersonAddress value)
		{
			cx_CoreNOKPersonAddress.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreNOKPersonAddress = new ims.framework.ContextVariable("Core.NOKPersonAddress", "_cv_Core.NOKPersonAddress");

		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientsGPIsNotNull()
		{
			return !cx_RefManPatientsGP.getValueIsNull(context);
		}
		public ims.core.vo.GpShortVo getPatientsGP()
		{
			return (ims.core.vo.GpShortVo)cx_RefManPatientsGP.getValue(context);
		}
		public void setPatientsGP(ims.core.vo.GpShortVo value)
		{
			cx_RefManPatientsGP.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPatientsGP = new ims.framework.ContextVariable("RefMan.PatientsGP", "_cv_RefMan.PatientsGP");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public RefManContext RefMan;
}
