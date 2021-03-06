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

package ims.emergency.forms.chartrequestedcc;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.emergency.domain.ChartRequestedCc.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.emergency.domain.ChartRequestedCc domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void setMode(ims.framework.enumerations.FormMode mode)
	{
		form.setMode(mode);
	}
	public ims.framework.enumerations.FormMode getMode()
	{
		return form.getMode();
	}
	protected final void oncmbChartReceivedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbChartReceived().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbChartReceivedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNo)
		{
			ims.core.vo.lookups.YesNo instance = (ims.core.vo.lookups.YesNo)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbChartReceivedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbChartReceived().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbChartReceivedLookup()
	{
		this.form.cmbChartReceived().clear();
		ims.core.vo.lookups.YesNoCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNo(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbChartReceived().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbChartReceivedLookupValue(int id)
	{
		ims.core.vo.lookups.YesNo instance = ims.core.vo.lookups.LookupHelper.getYesNoInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbChartReceived().setValue(instance);
	}
	protected final void defaultcmbChartReceivedLookupValue()
	{
		this.form.cmbChartReceived().setValue((ims.core.vo.lookups.YesNo)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNo.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNo.TYPE_ID));
	}
	protected final void oncmbReasonNotRequestedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReasonNotRequested().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.admin.vo.lookups.ReasonChartNotRequested existingInstance = (ims.admin.vo.lookups.ReasonChartNotRequested)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReasonNotRequestedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.admin.vo.lookups.ReasonChartNotRequested)
		{
			ims.admin.vo.lookups.ReasonChartNotRequested instance = (ims.admin.vo.lookups.ReasonChartNotRequested)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReasonNotRequestedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.admin.vo.lookups.ReasonChartNotRequested existingInstance = (ims.admin.vo.lookups.ReasonChartNotRequested)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReasonNotRequested().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReasonNotRequestedLookup()
	{
		this.form.cmbReasonNotRequested().clear();
		ims.admin.vo.lookups.ReasonChartNotRequestedCollection lookupCollection = ims.admin.vo.lookups.LookupHelper.getReasonChartNotRequested(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReasonNotRequested().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReasonNotRequestedLookupValue(int id)
	{
		ims.admin.vo.lookups.ReasonChartNotRequested instance = ims.admin.vo.lookups.LookupHelper.getReasonChartNotRequestedInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReasonNotRequested().setValue(instance);
	}
	protected final void defaultcmbReasonNotRequestedLookupValue()
	{
		this.form.cmbReasonNotRequested().setValue((ims.admin.vo.lookups.ReasonChartNotRequested)domain.getLookupService().getDefaultInstance(ims.admin.vo.lookups.ReasonChartNotRequested.class, engine.getFormName().getID(), ims.admin.vo.lookups.ReasonChartNotRequested.TYPE_ID));
	}
	protected final void oncmbChartRequestedByReceptionValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbChartRequestedByReception().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbChartRequestedByReceptionLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNo)
		{
			ims.core.vo.lookups.YesNo instance = (ims.core.vo.lookups.YesNo)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbChartRequestedByReceptionLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbChartRequestedByReception().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbChartRequestedByReceptionLookup()
	{
		this.form.cmbChartRequestedByReception().clear();
		ims.core.vo.lookups.YesNoCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNo(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbChartRequestedByReception().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbChartRequestedByReceptionLookupValue(int id)
	{
		ims.core.vo.lookups.YesNo instance = ims.core.vo.lookups.LookupHelper.getYesNoInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbChartRequestedByReception().setValue(instance);
	}
	protected final void defaultcmbChartRequestedByReceptionLookupValue()
	{
		this.form.cmbChartRequestedByReception().setValue((ims.core.vo.lookups.YesNo)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNo.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNo.TYPE_ID));
	}
	protected final void oncmbChartRequiredByTriageValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbChartRequiredByTriage().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbChartRequiredByTriageLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNo)
		{
			ims.core.vo.lookups.YesNo instance = (ims.core.vo.lookups.YesNo)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbChartRequiredByTriageLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbChartRequiredByTriage().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbChartRequiredByTriageLookup()
	{
		this.form.cmbChartRequiredByTriage().clear();
		ims.core.vo.lookups.YesNoCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNo(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbChartRequiredByTriage().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbChartRequiredByTriageLookupValue(int id)
	{
		ims.core.vo.lookups.YesNo instance = ims.core.vo.lookups.LookupHelper.getYesNoInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbChartRequiredByTriage().setValue(instance);
	}
	protected final void defaultcmbChartRequiredByTriageLookupValue()
	{
		this.form.cmbChartRequiredByTriage().setValue((ims.core.vo.lookups.YesNo)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNo.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNo.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.emergency.domain.ChartRequestedCc domain;
}
