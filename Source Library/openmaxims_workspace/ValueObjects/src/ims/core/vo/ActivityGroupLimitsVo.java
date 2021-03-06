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

package ims.core.vo;

/**
 * Linked to core.clinical.ActivityLimitGroup business object (ID: 1003100040).
 */
public class ActivityGroupLimitsVo extends ims.core.clinical.vo.ActivityLimitGroupRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ActivityGroupLimitsVo()
	{
	}
	public ActivityGroupLimitsVo(Integer id, int version)
	{
		super(id, version);
	}
	public ActivityGroupLimitsVo(ims.core.vo.beans.ActivityGroupLimitsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.activities = ims.core.vo.ActivityVoCollection.buildFromBeanCollection(bean.getActivities());
		this.adultlimit = bean.getAdultLimit();
		this.numberofadultreferrals = bean.getNumberOfAdultReferrals();
		this.paediatriclimit = bean.getPaediatricLimit();
		this.numberofpaediatricreferrals = bean.getNumberOfPaediatricReferrals();
		this.isactive = bean.getIsActive();
		this.memberofstaff = bean.getMemberOfStaff() == null ? null : bean.getMemberOfStaff().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.ActivityGroupLimitsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.activities = ims.core.vo.ActivityVoCollection.buildFromBeanCollection(bean.getActivities());
		this.adultlimit = bean.getAdultLimit();
		this.numberofadultreferrals = bean.getNumberOfAdultReferrals();
		this.paediatriclimit = bean.getPaediatricLimit();
		this.numberofpaediatricreferrals = bean.getNumberOfPaediatricReferrals();
		this.isactive = bean.getIsActive();
		this.memberofstaff = bean.getMemberOfStaff() == null ? null : bean.getMemberOfStaff().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.ActivityGroupLimitsVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.ActivityGroupLimitsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.ActivityGroupLimitsVoBean();
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
		if(fieldName.equals("NAME"))
			return getName();
		if(fieldName.equals("DESCRIPTION"))
			return getDescription();
		if(fieldName.equals("ACTIVITIES"))
			return getActivities();
		if(fieldName.equals("ADULTLIMIT"))
			return getAdultLimit();
		if(fieldName.equals("NUMBEROFADULTREFERRALS"))
			return getNumberOfAdultReferrals();
		if(fieldName.equals("PAEDIATRICLIMIT"))
			return getPaediatricLimit();
		if(fieldName.equals("NUMBEROFPAEDIATRICREFERRALS"))
			return getNumberOfPaediatricReferrals();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("MEMBEROFSTAFF"))
			return getMemberOfStaff();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNameIsNotNull()
	{
		return this.name != null;
	}
	public String getName()
	{
		return this.name;
	}
	public static int getNameMaxLength()
	{
		return 255;
	}
	public void setName(String value)
	{
		this.isValidated = false;
		this.name = value;
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
	public boolean getActivitiesIsNotNull()
	{
		return this.activities != null;
	}
	public ims.core.vo.ActivityVoCollection getActivities()
	{
		return this.activities;
	}
	public void setActivities(ims.core.vo.ActivityVoCollection value)
	{
		this.isValidated = false;
		this.activities = value;
	}
	public boolean getAdultLimitIsNotNull()
	{
		return this.adultlimit != null;
	}
	public Integer getAdultLimit()
	{
		return this.adultlimit;
	}
	public void setAdultLimit(Integer value)
	{
		this.isValidated = false;
		this.adultlimit = value;
	}
	public boolean getNumberOfAdultReferralsIsNotNull()
	{
		return this.numberofadultreferrals != null;
	}
	public Integer getNumberOfAdultReferrals()
	{
		return this.numberofadultreferrals;
	}
	public void setNumberOfAdultReferrals(Integer value)
	{
		this.isValidated = false;
		this.numberofadultreferrals = value;
	}
	public boolean getPaediatricLimitIsNotNull()
	{
		return this.paediatriclimit != null;
	}
	public Integer getPaediatricLimit()
	{
		return this.paediatriclimit;
	}
	public void setPaediatricLimit(Integer value)
	{
		this.isValidated = false;
		this.paediatriclimit = value;
	}
	public boolean getNumberOfPaediatricReferralsIsNotNull()
	{
		return this.numberofpaediatricreferrals != null;
	}
	public Integer getNumberOfPaediatricReferrals()
	{
		return this.numberofpaediatricreferrals;
	}
	public void setNumberOfPaediatricReferrals(Integer value)
	{
		this.isValidated = false;
		this.numberofpaediatricreferrals = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public boolean getMemberOfStaffIsNotNull()
	{
		return this.memberofstaff != null;
	}
	public ims.core.vo.MemberOfStaffShortVo getMemberOfStaff()
	{
		return this.memberofstaff;
	}
	public void setMemberOfStaff(ims.core.vo.MemberOfStaffShortVo value)
	{
		this.isValidated = false;
		this.memberofstaff = value;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		if(this.name != null)
			sb.append(this.name);
		return sb.toString();
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
		if(this.activities != null)
		{
			if(!this.activities.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.memberofstaff != null)
		{
			if(!this.memberofstaff.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.activities != null)
		{
			String[] listOfOtherErrors = this.activities.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.memberofstaff != null)
		{
			String[] listOfOtherErrors = this.memberofstaff.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	
		ActivityGroupLimitsVo clone = new ActivityGroupLimitsVo(this.id, this.version);
		
		clone.name = this.name;
		clone.description = this.description;
		if(this.activities == null)
			clone.activities = null;
		else
			clone.activities = (ims.core.vo.ActivityVoCollection)this.activities.clone();
		clone.adultlimit = this.adultlimit;
		clone.numberofadultreferrals = this.numberofadultreferrals;
		clone.paediatriclimit = this.paediatriclimit;
		clone.numberofpaediatricreferrals = this.numberofpaediatricreferrals;
		clone.isactive = this.isactive;
		if(this.memberofstaff == null)
			clone.memberofstaff = null;
		else
			clone.memberofstaff = (ims.core.vo.MemberOfStaffShortVo)this.memberofstaff.clone();
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
		if (!(ActivityGroupLimitsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ActivityGroupLimitsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		ActivityGroupLimitsVo compareObj = (ActivityGroupLimitsVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getName() == null && compareObj.getName() != null)
				return -1;
			if(this.getName() != null && compareObj.getName() == null)
				return 1;
			if(this.getName() != null && compareObj.getName() != null)
			{
				if(caseInsensitive)
					retVal = this.getName().toLowerCase().compareTo(compareObj.getName().toLowerCase());
				else
					retVal = this.getName().compareTo(compareObj.getName());
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
		if(this.name != null)
			count++;
		if(this.description != null)
			count++;
		if(this.activities != null)
			count++;
		if(this.adultlimit != null)
			count++;
		if(this.numberofadultreferrals != null)
			count++;
		if(this.paediatriclimit != null)
			count++;
		if(this.numberofpaediatricreferrals != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.memberofstaff != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected String name;
	protected String description;
	protected ims.core.vo.ActivityVoCollection activities;
	protected Integer adultlimit;
	protected Integer numberofadultreferrals;
	protected Integer paediatriclimit;
	protected Integer numberofpaediatricreferrals;
	protected Boolean isactive;
	protected ims.core.vo.MemberOfStaffShortVo memberofstaff;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
