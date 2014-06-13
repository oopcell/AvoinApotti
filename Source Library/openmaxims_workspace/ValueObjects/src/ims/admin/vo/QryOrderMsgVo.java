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

package ims.admin.vo;

/**
 * Linked to OCRR.OrderingResults.OrderMessage business object (ID: 1070100013).
 */
public class QryOrderMsgVo extends ims.ocrr.orderingresults.vo.OrderMessageRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public QryOrderMsgVo()
	{
	}
	public QryOrderMsgVo(Integer id, int version)
	{
		super(id, version);
	}
	public QryOrderMsgVo(ims.admin.vo.beans.QryOrderMsgVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.orderdetails = bean.getOrderDetails() == null ? null : bean.getOrderDetails().buildVo();
		this.messagestatus = bean.getMessageStatus() == null ? null : ims.ocrr.vo.lookups.OrderMessageStatus.buildLookup(bean.getMessageStatus());
		this.providersystem = bean.getProviderSystem() == null ? null : bean.getProviderSystem().buildVo();
		this.placerordnum = bean.getPlacerOrdNum();
		this.hl7message = bean.getHL7Message();
		this.ordercategory = bean.getOrderCategory() == null ? null : ims.ocrr.vo.lookups.Category.buildLookup(bean.getOrderCategory());
		this.failuremessage = bean.getFailureMessage();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.beans.QryOrderMsgVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.orderdetails = bean.getOrderDetails() == null ? null : bean.getOrderDetails().buildVo(map);
		this.messagestatus = bean.getMessageStatus() == null ? null : ims.ocrr.vo.lookups.OrderMessageStatus.buildLookup(bean.getMessageStatus());
		this.providersystem = bean.getProviderSystem() == null ? null : bean.getProviderSystem().buildVo(map);
		this.placerordnum = bean.getPlacerOrdNum();
		this.hl7message = bean.getHL7Message();
		this.ordercategory = bean.getOrderCategory() == null ? null : ims.ocrr.vo.lookups.Category.buildLookup(bean.getOrderCategory());
		this.failuremessage = bean.getFailureMessage();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.beans.QryOrderMsgVoBean bean = null;
		if(map != null)
			bean = (ims.admin.vo.beans.QryOrderMsgVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.admin.vo.beans.QryOrderMsgVoBean();
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
		if(fieldName.equals("ORDERDETAILS"))
			return getOrderDetails();
		if(fieldName.equals("MESSAGESTATUS"))
			return getMessageStatus();
		if(fieldName.equals("PROVIDERSYSTEM"))
			return getProviderSystem();
		if(fieldName.equals("PLACERORDNUM"))
			return getPlacerOrdNum();
		if(fieldName.equals("HL7MESSAGE"))
			return getHL7Message();
		if(fieldName.equals("ORDERCATEGORY"))
			return getOrderCategory();
		if(fieldName.equals("FAILUREMESSAGE"))
			return getFailureMessage();
		if(fieldName.equals("SYSINFO"))
			return getSysInfo();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getOrderDetailsIsNotNull()
	{
		return this.orderdetails != null;
	}
	public ims.ocrr.vo.OcsOrderListVo getOrderDetails()
	{
		return this.orderdetails;
	}
	public void setOrderDetails(ims.ocrr.vo.OcsOrderListVo value)
	{
		this.isValidated = false;
		this.orderdetails = value;
	}
	public boolean getMessageStatusIsNotNull()
	{
		return this.messagestatus != null;
	}
	public ims.ocrr.vo.lookups.OrderMessageStatus getMessageStatus()
	{
		return this.messagestatus;
	}
	public void setMessageStatus(ims.ocrr.vo.lookups.OrderMessageStatus value)
	{
		this.isValidated = false;
		this.messagestatus = value;
	}
	public boolean getProviderSystemIsNotNull()
	{
		return this.providersystem != null;
	}
	public ims.ocrr.vo.ProviderSystemLiteVo getProviderSystem()
	{
		return this.providersystem;
	}
	public void setProviderSystem(ims.ocrr.vo.ProviderSystemLiteVo value)
	{
		this.isValidated = false;
		this.providersystem = value;
	}
	public boolean getPlacerOrdNumIsNotNull()
	{
		return this.placerordnum != null;
	}
	public String getPlacerOrdNum()
	{
		return this.placerordnum;
	}
	public static int getPlacerOrdNumMaxLength()
	{
		return 20;
	}
	public void setPlacerOrdNum(String value)
	{
		this.isValidated = false;
		this.placerordnum = value;
	}
	public boolean getHL7MessageIsNotNull()
	{
		return this.hl7message != null;
	}
	public String getHL7Message()
	{
		return this.hl7message;
	}
	public static int getHL7MessageMaxLength()
	{
		return 4000;
	}
	public void setHL7Message(String value)
	{
		this.isValidated = false;
		this.hl7message = value;
	}
	public boolean getOrderCategoryIsNotNull()
	{
		return this.ordercategory != null;
	}
	public ims.ocrr.vo.lookups.Category getOrderCategory()
	{
		return this.ordercategory;
	}
	public void setOrderCategory(ims.ocrr.vo.lookups.Category value)
	{
		this.isValidated = false;
		this.ordercategory = value;
	}
	public boolean getFailureMessageIsNotNull()
	{
		return this.failuremessage != null;
	}
	public String getFailureMessage()
	{
		return this.failuremessage;
	}
	public static int getFailureMessageMaxLength()
	{
		return 1000;
	}
	public void setFailureMessage(String value)
	{
		this.isValidated = false;
		this.failuremessage = value;
	}
	public boolean getSysInfoIsNotNull()
	{
		return this.sysinfo != null;
	}
	public ims.vo.SystemInformation getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SystemInformation value)
	{
		this.isValidated = false;
		this.sysinfo = value;
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
		if(this.orderdetails != null)
		{
			if(!this.orderdetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.providersystem != null)
		{
			if(!this.providersystem.isValidated())
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
		if(this.orderdetails == null)
			listOfErrors.add("OrderDetails is mandatory");
		if(this.orderdetails != null)
		{
			String[] listOfOtherErrors = this.orderdetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.messagestatus == null)
			listOfErrors.add("messageStatus is mandatory");
		if(this.providersystem == null)
			listOfErrors.add("ProviderSystem is mandatory");
		if(this.providersystem != null)
		{
			String[] listOfOtherErrors = this.providersystem.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.placerordnum == null || this.placerordnum.length() == 0)
			listOfErrors.add("PlacerOrdNum is mandatory");
		else if(this.placerordnum.length() > 20)
			listOfErrors.add("The length of the field [placerordnum] in the value object [ims.admin.vo.QryOrderMsgVo] is too big. It should be less or equal to 20");
		if(this.ordercategory == null)
			listOfErrors.add("OrderCategory is mandatory");
		if(this.failuremessage != null)
			if(this.failuremessage.length() > 1000)
				listOfErrors.add("The length of the field [failuremessage] in the value object [ims.admin.vo.QryOrderMsgVo] is too big. It should be less or equal to 1000");
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
	
		QryOrderMsgVo clone = new QryOrderMsgVo(this.id, this.version);
		
		if(this.orderdetails == null)
			clone.orderdetails = null;
		else
			clone.orderdetails = (ims.ocrr.vo.OcsOrderListVo)this.orderdetails.clone();
		if(this.messagestatus == null)
			clone.messagestatus = null;
		else
			clone.messagestatus = (ims.ocrr.vo.lookups.OrderMessageStatus)this.messagestatus.clone();
		if(this.providersystem == null)
			clone.providersystem = null;
		else
			clone.providersystem = (ims.ocrr.vo.ProviderSystemLiteVo)this.providersystem.clone();
		clone.placerordnum = this.placerordnum;
		clone.hl7message = this.hl7message;
		if(this.ordercategory == null)
			clone.ordercategory = null;
		else
			clone.ordercategory = (ims.ocrr.vo.lookups.Category)this.ordercategory.clone();
		clone.failuremessage = this.failuremessage;
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
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
		if (!(QryOrderMsgVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A QryOrderMsgVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((QryOrderMsgVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((QryOrderMsgVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.orderdetails != null)
			count++;
		if(this.messagestatus != null)
			count++;
		if(this.providersystem != null)
			count++;
		if(this.placerordnum != null)
			count++;
		if(this.hl7message != null)
			count++;
		if(this.ordercategory != null)
			count++;
		if(this.failuremessage != null)
			count++;
		if(this.sysinfo != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected ims.ocrr.vo.OcsOrderListVo orderdetails;
	protected ims.ocrr.vo.lookups.OrderMessageStatus messagestatus;
	protected ims.ocrr.vo.ProviderSystemLiteVo providersystem;
	protected String placerordnum;
	protected String hl7message;
	protected ims.ocrr.vo.lookups.Category ordercategory;
	protected String failuremessage;
	protected ims.vo.SystemInformation sysinfo;
	private boolean isValidated = false;
	private boolean isBusy = false;
}