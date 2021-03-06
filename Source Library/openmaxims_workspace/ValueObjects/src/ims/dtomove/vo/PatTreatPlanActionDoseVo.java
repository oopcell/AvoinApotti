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

package ims.dtomove.vo;

/**
 * Linked to Oncology.PatTreatmentPlanDose business object (ID: 1105100041).
 */
public class PatTreatPlanActionDoseVo extends ims.oncology.vo.PatTreatmentPlanDoseRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatTreatPlanActionDoseVo()
	{
	}
	public PatTreatPlanActionDoseVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatTreatPlanActionDoseVo(ims.dtomove.vo.beans.PatTreatPlanActionDoseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.edoseastat = bean.getEdoseastat();
		this.ebdur = bean.getEbdur();
		this.ebfractions = bean.getEbfractions();
		this.ebdose = bean.getEbdose();
		this.edisbooked = bean.getEdisbooked();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.dtomove.vo.beans.PatTreatPlanActionDoseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.edoseastat = bean.getEdoseastat();
		this.ebdur = bean.getEbdur();
		this.ebfractions = bean.getEbfractions();
		this.ebdose = bean.getEbdose();
		this.edisbooked = bean.getEdisbooked();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.dtomove.vo.beans.PatTreatPlanActionDoseVoBean bean = null;
		if(map != null)
			bean = (ims.dtomove.vo.beans.PatTreatPlanActionDoseVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.dtomove.vo.beans.PatTreatPlanActionDoseVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("EDOSEASTAT"))
			return getEdoseastat();
		if(fieldName.equals("EBDUR"))
			return getEbdur();
		if(fieldName.equals("EBFRACTIONS"))
			return getEbfractions();
		if(fieldName.equals("EBDOSE"))
			return getEbdose();
		if(fieldName.equals("EDISBOOKED"))
			return getEdisbooked();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getEdoseastatIsNotNull()
	{
		return this.edoseastat != null;
	}
	public Integer getEdoseastat()
	{
		return this.edoseastat;
	}
	public void setEdoseastat(Integer value)
	{
		this.isValidated = false;
		this.edoseastat = value;
	}
	public boolean getEbdurIsNotNull()
	{
		return this.ebdur != null;
	}
	public Integer getEbdur()
	{
		return this.ebdur;
	}
	public void setEbdur(Integer value)
	{
		this.isValidated = false;
		this.ebdur = value;
	}
	public boolean getEbfractionsIsNotNull()
	{
		return this.ebfractions != null;
	}
	public Integer getEbfractions()
	{
		return this.ebfractions;
	}
	public void setEbfractions(Integer value)
	{
		this.isValidated = false;
		this.ebfractions = value;
	}
	public boolean getEbdoseIsNotNull()
	{
		return this.ebdose != null;
	}
	public Integer getEbdose()
	{
		return this.ebdose;
	}
	public void setEbdose(Integer value)
	{
		this.isValidated = false;
		this.ebdose = value;
	}
	public boolean getEdisbookedIsNotNull()
	{
		return this.edisbooked != null;
	}
	public String getEdisbooked()
	{
		return this.edisbooked;
	}
	public static int getEdisbookedMaxLength()
	{
		return 1;
	}
	public void setEdisbooked(String value)
	{
		this.isValidated = false;
		this.edisbooked = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.edisbooked != null)
			if(this.edisbooked.length() > 1)
				listOfErrors.add("The length of the field [edisbooked] in the value object [ims.dtomove.vo.PatTreatPlanActionDoseVo] is too big. It should be less or equal to 1");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatTreatPlanActionDoseVo clone = new PatTreatPlanActionDoseVo(this.id, this.version);
		
		clone.edoseastat = this.edoseastat;
		clone.ebdur = this.ebdur;
		clone.ebfractions = this.ebfractions;
		clone.ebdose = this.ebdose;
		clone.edisbooked = this.edisbooked;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(PatTreatPlanActionDoseVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatTreatPlanActionDoseVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatTreatPlanActionDoseVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatTreatPlanActionDoseVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.edoseastat != null)
			count++;
		if(this.ebdur != null)
			count++;
		if(this.ebfractions != null)
			count++;
		if(this.ebdose != null)
			count++;
		if(this.edisbooked != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected Integer edoseastat;
	protected Integer ebdur;
	protected Integer ebfractions;
	protected Integer ebdose;
	protected String edisbooked;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
