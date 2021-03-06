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

/**
 * Linked to clinical.RACPSymptomRiskFactors business object (ID: 1072100072).
 */
public class RACPSymptomRiskFactorsVo extends ims.clinical.vo.RACPSymptomRiskFactorsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public RACPSymptomRiskFactorsVo()
	{
	}
	public RACPSymptomRiskFactorsVo(Integer id, int version)
	{
		super(id, version);
	}
	public RACPSymptomRiskFactorsVo(ims.clinical.vo.beans.RACPSymptomRiskFactorsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.symptomindicator = bean.getSymptomIndicator();
		this.symptoms = ims.clinical.vo.RACPSymptomsVoCollection.buildFromBeanCollection(bean.getSymptoms());
		this.symptomduration = bean.getSymptomDuration() == null ? null : ims.clinical.vo.lookups.SymptomDuration.buildLookup(bean.getSymptomDuration());
		this.symptomnotes = bean.getSymptomNotes();
		this.riskfactorindicator = bean.getRiskFactorIndicator();
		this.riskfactors = ims.core.vo.lookups.RACPRiskFactorCollection.buildFromBeanCollection(bean.getRiskFactors());
		this.smokingstatus = bean.getSmokingStatus() == null ? null : bean.getSmokingStatus().buildVo();
		this.alcoholunitsperweek = bean.getAlcoholUnitsPerWeek() == null ? null : bean.getAlcoholUnitsPerWeek().buildVo();
		this.diabetesstatus = bean.getDiabetesStatus() == null ? null : ims.clinical.vo.lookups.DiabetesStatus.buildLookup(bean.getDiabetesStatus());
		this.othernotes = bean.getOtherNotes();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.symptomdurationunit = bean.getSymptomDurationUnit();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.RACPSymptomRiskFactorsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.symptomindicator = bean.getSymptomIndicator();
		this.symptoms = ims.clinical.vo.RACPSymptomsVoCollection.buildFromBeanCollection(bean.getSymptoms());
		this.symptomduration = bean.getSymptomDuration() == null ? null : ims.clinical.vo.lookups.SymptomDuration.buildLookup(bean.getSymptomDuration());
		this.symptomnotes = bean.getSymptomNotes();
		this.riskfactorindicator = bean.getRiskFactorIndicator();
		this.riskfactors = ims.core.vo.lookups.RACPRiskFactorCollection.buildFromBeanCollection(bean.getRiskFactors());
		this.smokingstatus = bean.getSmokingStatus() == null ? null : bean.getSmokingStatus().buildVo(map);
		this.alcoholunitsperweek = bean.getAlcoholUnitsPerWeek() == null ? null : bean.getAlcoholUnitsPerWeek().buildVo(map);
		this.diabetesstatus = bean.getDiabetesStatus() == null ? null : ims.clinical.vo.lookups.DiabetesStatus.buildLookup(bean.getDiabetesStatus());
		this.othernotes = bean.getOtherNotes();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.symptomdurationunit = bean.getSymptomDurationUnit();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.RACPSymptomRiskFactorsVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.RACPSymptomRiskFactorsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.RACPSymptomRiskFactorsVoBean();
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
		if(fieldName.equals("SYMPTOMINDICATOR"))
			return getSymptomIndicator();
		if(fieldName.equals("SYMPTOMS"))
			return getSymptoms();
		if(fieldName.equals("SYMPTOMDURATION"))
			return getSymptomDuration();
		if(fieldName.equals("SYMPTOMNOTES"))
			return getSymptomNotes();
		if(fieldName.equals("RISKFACTORINDICATOR"))
			return getRiskFactorIndicator();
		if(fieldName.equals("RISKFACTORS"))
			return getRiskFactors();
		if(fieldName.equals("SMOKINGSTATUS"))
			return getSmokingStatus();
		if(fieldName.equals("ALCOHOLUNITSPERWEEK"))
			return getAlcoholUnitsPerWeek();
		if(fieldName.equals("DIABETESSTATUS"))
			return getDiabetesStatus();
		if(fieldName.equals("OTHERNOTES"))
			return getOtherNotes();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("SYMPTOMDURATIONUNIT"))
			return getSymptomDurationUnit();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSymptomIndicatorIsNotNull()
	{
		return this.symptomindicator != null;
	}
	public Boolean getSymptomIndicator()
	{
		return this.symptomindicator;
	}
	public void setSymptomIndicator(Boolean value)
	{
		this.isValidated = false;
		this.symptomindicator = value;
	}
	public boolean getSymptomsIsNotNull()
	{
		return this.symptoms != null;
	}
	public ims.clinical.vo.RACPSymptomsVoCollection getSymptoms()
	{
		return this.symptoms;
	}
	public void setSymptoms(ims.clinical.vo.RACPSymptomsVoCollection value)
	{
		this.isValidated = false;
		this.symptoms = value;
	}
	public boolean getSymptomDurationIsNotNull()
	{
		return this.symptomduration != null;
	}
	public ims.clinical.vo.lookups.SymptomDuration getSymptomDuration()
	{
		return this.symptomduration;
	}
	public void setSymptomDuration(ims.clinical.vo.lookups.SymptomDuration value)
	{
		this.isValidated = false;
		this.symptomduration = value;
	}
	public boolean getSymptomNotesIsNotNull()
	{
		return this.symptomnotes != null;
	}
	public String getSymptomNotes()
	{
		return this.symptomnotes;
	}
	public static int getSymptomNotesMaxLength()
	{
		return 1500;
	}
	public void setSymptomNotes(String value)
	{
		this.isValidated = false;
		this.symptomnotes = value;
	}
	public boolean getRiskFactorIndicatorIsNotNull()
	{
		return this.riskfactorindicator != null;
	}
	public Boolean getRiskFactorIndicator()
	{
		return this.riskfactorindicator;
	}
	public void setRiskFactorIndicator(Boolean value)
	{
		this.isValidated = false;
		this.riskfactorindicator = value;
	}
	public boolean getRiskFactorsIsNotNull()
	{
		return this.riskfactors != null;
	}
	public ims.core.vo.lookups.RACPRiskFactorCollection getRiskFactors()
	{
		return this.riskfactors;
	}
	public void setRiskFactors(ims.core.vo.lookups.RACPRiskFactorCollection value)
	{
		this.isValidated = false;
		this.riskfactors = value;
	}
	public boolean getSmokingStatusIsNotNull()
	{
		return this.smokingstatus != null;
	}
	public ims.core.vo.Smoking getSmokingStatus()
	{
		return this.smokingstatus;
	}
	public void setSmokingStatus(ims.core.vo.Smoking value)
	{
		this.isValidated = false;
		this.smokingstatus = value;
	}
	public boolean getAlcoholUnitsPerWeekIsNotNull()
	{
		return this.alcoholunitsperweek != null;
	}
	public ims.core.vo.AlcoholVo getAlcoholUnitsPerWeek()
	{
		return this.alcoholunitsperweek;
	}
	public void setAlcoholUnitsPerWeek(ims.core.vo.AlcoholVo value)
	{
		this.isValidated = false;
		this.alcoholunitsperweek = value;
	}
	public boolean getDiabetesStatusIsNotNull()
	{
		return this.diabetesstatus != null;
	}
	public ims.clinical.vo.lookups.DiabetesStatus getDiabetesStatus()
	{
		return this.diabetesstatus;
	}
	public void setDiabetesStatus(ims.clinical.vo.lookups.DiabetesStatus value)
	{
		this.isValidated = false;
		this.diabetesstatus = value;
	}
	public boolean getOtherNotesIsNotNull()
	{
		return this.othernotes != null;
	}
	public String getOtherNotes()
	{
		return this.othernotes;
	}
	public static int getOtherNotesMaxLength()
	{
		return 1500;
	}
	public void setOtherNotes(String value)
	{
		this.isValidated = false;
		this.othernotes = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getSymptomDurationUnitIsNotNull()
	{
		return this.symptomdurationunit != null;
	}
	public Integer getSymptomDurationUnit()
	{
		return this.symptomdurationunit;
	}
	public void setSymptomDurationUnit(Integer value)
	{
		this.isValidated = false;
		this.symptomdurationunit = value;
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
		if(this.symptomnotes != null)
			if(this.symptomnotes.length() > 1500)
				listOfErrors.add("The length of the field [symptomnotes] in the value object [ims.clinical.vo.RACPSymptomRiskFactorsVo] is too big. It should be less or equal to 1500");
		if(this.othernotes != null)
			if(this.othernotes.length() > 1500)
				listOfErrors.add("The length of the field [othernotes] in the value object [ims.clinical.vo.RACPSymptomRiskFactorsVo] is too big. It should be less or equal to 1500");
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.countFieldsWithValue() < 3)
		{
			listOfErrors.add("A minimum of 3 data fields must be entered");
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
	
		RACPSymptomRiskFactorsVo clone = new RACPSymptomRiskFactorsVo(this.id, this.version);
		
		clone.symptomindicator = this.symptomindicator;
		if(this.symptoms == null)
			clone.symptoms = null;
		else
			clone.symptoms = (ims.clinical.vo.RACPSymptomsVoCollection)this.symptoms.clone();
		if(this.symptomduration == null)
			clone.symptomduration = null;
		else
			clone.symptomduration = (ims.clinical.vo.lookups.SymptomDuration)this.symptomduration.clone();
		clone.symptomnotes = this.symptomnotes;
		clone.riskfactorindicator = this.riskfactorindicator;
		if(this.riskfactors == null)
			clone.riskfactors = null;
		else
			clone.riskfactors = (ims.core.vo.lookups.RACPRiskFactorCollection)this.riskfactors.clone();
		if(this.smokingstatus == null)
			clone.smokingstatus = null;
		else
			clone.smokingstatus = (ims.core.vo.Smoking)this.smokingstatus.clone();
		if(this.alcoholunitsperweek == null)
			clone.alcoholunitsperweek = null;
		else
			clone.alcoholunitsperweek = (ims.core.vo.AlcoholVo)this.alcoholunitsperweek.clone();
		if(this.diabetesstatus == null)
			clone.diabetesstatus = null;
		else
			clone.diabetesstatus = (ims.clinical.vo.lookups.DiabetesStatus)this.diabetesstatus.clone();
		clone.othernotes = this.othernotes;
		clone.carecontext = this.carecontext;
		clone.symptomdurationunit = this.symptomdurationunit;
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
		if (!(RACPSymptomRiskFactorsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A RACPSymptomRiskFactorsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((RACPSymptomRiskFactorsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((RACPSymptomRiskFactorsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.symptomindicator != null)
			count++;
		if(this.symptoms != null)
			count++;
		if(this.symptomduration != null)
			count++;
		if(this.symptomnotes != null)
			count++;
		if(this.riskfactorindicator != null)
			count++;
		if(this.riskfactors != null)
			count++;
		if(this.smokingstatus != null)
			count++;
		if(this.alcoholunitsperweek != null)
			count++;
		if(this.diabetesstatus != null)
			count++;
		if(this.othernotes != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.symptomdurationunit != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected Boolean symptomindicator;
	protected ims.clinical.vo.RACPSymptomsVoCollection symptoms;
	protected ims.clinical.vo.lookups.SymptomDuration symptomduration;
	protected String symptomnotes;
	protected Boolean riskfactorindicator;
	protected ims.core.vo.lookups.RACPRiskFactorCollection riskfactors;
	protected ims.core.vo.Smoking smokingstatus;
	protected ims.core.vo.AlcoholVo alcoholunitsperweek;
	protected ims.clinical.vo.lookups.DiabetesStatus diabetesstatus;
	protected String othernotes;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected Integer symptomdurationunit;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
