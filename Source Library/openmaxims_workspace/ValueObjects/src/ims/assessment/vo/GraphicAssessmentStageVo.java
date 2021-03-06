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

package ims.assessment.vo;

/**
 * Linked to Assessment.Configuration.GraphicAssessmentStage business object (ID: 1083100003).
 */
public class GraphicAssessmentStageVo extends ims.assessment.configuration.vo.GraphicAssessmentStageRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public GraphicAssessmentStageVo()
	{
	}
	public GraphicAssessmentStageVo(Integer id, int version)
	{
		super(id, version);
	}
	public GraphicAssessmentStageVo(ims.assessment.vo.beans.GraphicAssessmentStageVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.isannotated = bean.getIsAnnotated();
		this.stagename = bean.getStageName();
		this.equivalentstage = bean.getEquivalentStage() == null ? null : bean.getEquivalentStage().buildVo();
		this.isactive = bean.getIsActive();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.beans.GraphicAssessmentStageVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.isannotated = bean.getIsAnnotated();
		this.stagename = bean.getStageName();
		this.equivalentstage = bean.getEquivalentStage() == null ? null : bean.getEquivalentStage().buildVo(map);
		this.isactive = bean.getIsActive();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.beans.GraphicAssessmentStageVoBean bean = null;
		if(map != null)
			bean = (ims.assessment.vo.beans.GraphicAssessmentStageVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.assessment.vo.beans.GraphicAssessmentStageVoBean();
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
		if(fieldName.equals("ISANNOTATED"))
			return getIsAnnotated();
		if(fieldName.equals("STAGENAME"))
			return getStageName();
		if(fieldName.equals("EQUIVALENTSTAGE"))
			return getEquivalentStage();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getIsAnnotatedIsNotNull()
	{
		return this.isannotated != null;
	}
	public Boolean getIsAnnotated()
	{
		return this.isannotated;
	}
	public void setIsAnnotated(Boolean value)
	{
		this.isValidated = false;
		this.isannotated = value;
	}
	public boolean getStageNameIsNotNull()
	{
		return this.stagename != null;
	}
	public String getStageName()
	{
		return this.stagename;
	}
	public static int getStageNameMaxLength()
	{
		return 50;
	}
	public void setStageName(String value)
	{
		this.isValidated = false;
		this.stagename = value;
	}
	public boolean getEquivalentStageIsNotNull()
	{
		return this.equivalentstage != null;
	}
	public ims.assessment.vo.GraphicAssessmentStageVo getEquivalentStage()
	{
		return this.equivalentstage;
	}
	public void setEquivalentStage(ims.assessment.vo.GraphicAssessmentStageVo value)
	{
		this.isValidated = false;
		this.equivalentstage = value;
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
		if(this.equivalentstage != null)
		{
			if(!this.equivalentstage.isValidated())
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
		if(this.stagename != null)
			if(this.stagename.length() > 50)
				listOfErrors.add("The length of the field [stagename] in the value object [ims.assessment.vo.GraphicAssessmentStageVo] is too big. It should be less or equal to 50");
		if(this.equivalentstage != null)
		{
			String[] listOfOtherErrors = this.equivalentstage.validate();
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
	
		GraphicAssessmentStageVo clone = new GraphicAssessmentStageVo(this.id, this.version);
		
		clone.isannotated = this.isannotated;
		clone.stagename = this.stagename;
		if(this.equivalentstage == null)
			clone.equivalentstage = null;
		else
			clone.equivalentstage = (ims.assessment.vo.GraphicAssessmentStageVo)this.equivalentstage.clone();
		clone.isactive = this.isactive;
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
		if (!(GraphicAssessmentStageVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A GraphicAssessmentStageVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((GraphicAssessmentStageVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((GraphicAssessmentStageVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.isannotated != null)
			count++;
		if(this.stagename != null)
			count++;
		if(this.equivalentstage != null)
			count++;
		if(this.isactive != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected Boolean isannotated;
	protected String stagename;
	protected ims.assessment.vo.GraphicAssessmentStageVo equivalentstage;
	protected Boolean isactive;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
