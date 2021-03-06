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

package ims.clinical.vo;


public class EMISAcuteVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EMISAcuteVo()
	{
	}
	public EMISAcuteVo(ims.clinical.vo.beans.EMISAcuteVoBean bean)
	{
		this.startdate = bean.getStartDate();
		this.recordtype = bean.getRecordType();
		this.specialityname = bean.getSpecialityName();
		this.description = bean.getDescription();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.EMISAcuteVoBean bean)
	{
		this.startdate = bean.getStartDate();
		this.recordtype = bean.getRecordType();
		this.specialityname = bean.getSpecialityName();
		this.description = bean.getDescription();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.EMISAcuteVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.EMISAcuteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.EMISAcuteVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getStartDateIsNotNull()
	{
		return this.startdate != null;
	}
	public String getStartDate()
	{
		return this.startdate;
	}
	public static int getStartDateMaxLength()
	{
		return 255;
	}
	public void setStartDate(String value)
	{
		this.isValidated = false;
		this.startdate = value;
	}
	public boolean getRecordTypeIsNotNull()
	{
		return this.recordtype != null;
	}
	public String getRecordType()
	{
		return this.recordtype;
	}
	public static int getRecordTypeMaxLength()
	{
		return 255;
	}
	public void setRecordType(String value)
	{
		this.isValidated = false;
		this.recordtype = value;
	}
	public boolean getSpecialityNameIsNotNull()
	{
		return this.specialityname != null;
	}
	public String getSpecialityName()
	{
		return this.specialityname;
	}
	public static int getSpecialityNameMaxLength()
	{
		return 255;
	}
	public void setSpecialityName(String value)
	{
		this.isValidated = false;
		this.specialityname = value;
	}
	public boolean getDescriptionIsNotNull()
	{
		return this.description != null;
	}
	public String getDescription()
	{
		return this.description;
	}
	public static int getDescriptionMaxLength()
	{
		return 255;
	}
	public void setDescription(String value)
	{
		this.isValidated = false;
		this.description = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof EMISAcuteVo))
			return false;
		EMISAcuteVo compareObj = (EMISAcuteVo)obj;
		if(this.getStartDate() == null && compareObj.getStartDate() != null)
			return false;
		if(this.getStartDate() != null && compareObj.getStartDate() == null)
			return false;
		if(this.getStartDate() != null && compareObj.getStartDate() != null)
			return this.getStartDate().equals(compareObj.getStartDate());
		return super.equals(obj);
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		EMISAcuteVo clone = new EMISAcuteVo();
		
		clone.startdate = this.startdate;
		clone.recordtype = this.recordtype;
		clone.specialityname = this.specialityname;
		clone.description = this.description;
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
		if (!(EMISAcuteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EMISAcuteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		EMISAcuteVo compareObj = (EMISAcuteVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getStartDate() == null && compareObj.getStartDate() != null)
				return -1;
			if(this.getStartDate() != null && compareObj.getStartDate() == null)
				return 1;
			if(this.getStartDate() != null && compareObj.getStartDate() != null)
			{
				if(caseInsensitive)
					retVal = this.getStartDate().toLowerCase().compareTo(compareObj.getStartDate().toLowerCase());
				else
					retVal = this.getStartDate().compareTo(compareObj.getStartDate());
			}
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.startdate != null)
			count++;
		if(this.recordtype != null)
			count++;
		if(this.specialityname != null)
			count++;
		if(this.description != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected String startdate;
	protected String recordtype;
	protected String specialityname;
	protected String description;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
