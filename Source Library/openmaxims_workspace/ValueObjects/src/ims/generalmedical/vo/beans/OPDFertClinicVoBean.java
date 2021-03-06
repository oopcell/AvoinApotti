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

package ims.generalmedical.vo.beans;

public class OPDFertClinicVoBean extends ims.vo.ValueObjectBean
{
	public OPDFertClinicVoBean()
	{
	}
	public OPDFertClinicVoBean(ims.generalmedical.vo.OPDFertClinicVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.achieveerection = vo.getAchieveErection() == null ? null : (ims.vo.LookupInstanceBean)vo.getAchieveErection().getBean();
		this.erectdysfxtreatments = vo.getErectDysfxTreatments() == null ? null : vo.getErectDysfxTreatments().getBeanCollection();
		this.sexdrive = vo.getSexDrive() == null ? null : (ims.vo.LookupInstanceBean)vo.getSexDrive().getBean();
		this.ejaculation = vo.getEjaculation() == null ? null : (ims.vo.LookupInstanceBean)vo.getEjaculation().getBean();
		this.bladderdrainage = vo.getBladderDrainage() == null ? null : vo.getBladderDrainage().getBeanCollection();
		this.bladderdrainagetxt = vo.getBladderDrainagetxt();
		this.testatrophy = vo.getTestAtrophy() == null ? null : (ims.vo.LookupInstanceBean)vo.getTestAtrophy().getBean();
		this.endoevalperf = vo.getEndoEvalPerf() == null ? null : vo.getEndoEvalPerf().getBeanCollection();
		this.infxnscreening = vo.getInfxnScreening() == null ? null : vo.getInfxnScreening().getBeanCollection();
		this.screenconsent = vo.getScreenConsent() == null ? null : (ims.vo.LookupInstanceBean)vo.getScreenConsent().getBean();
		this.semenculture = vo.getSemenCulture() == null ? null : (ims.vo.LookupInstanceBean)vo.getSemenCulture().getBean();
		this.semenfindings = vo.getSemenFindings() == null ? null : vo.getSemenFindings().getBeanCollection();
		this.elisa = vo.getElisa() == null ? null : (ims.vo.LookupInstanceBean)vo.getElisa().getBean();
		this.methodssuccesswith = vo.getMethodssuccessWith() == null ? null : vo.getMethodssuccessWith().getBeanCollection();
		this.spermfrozen = vo.getSpermFrozen() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpermFrozen().getBean();
		this.treatmentsoffered = vo.getTreatmentsoffered() == null ? null : vo.getTreatmentsoffered().getBeanCollection();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.OPDFertClinicVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.achieveerection = vo.getAchieveErection() == null ? null : (ims.vo.LookupInstanceBean)vo.getAchieveErection().getBean();
		this.erectdysfxtreatments = vo.getErectDysfxTreatments() == null ? null : vo.getErectDysfxTreatments().getBeanCollection();
		this.sexdrive = vo.getSexDrive() == null ? null : (ims.vo.LookupInstanceBean)vo.getSexDrive().getBean();
		this.ejaculation = vo.getEjaculation() == null ? null : (ims.vo.LookupInstanceBean)vo.getEjaculation().getBean();
		this.bladderdrainage = vo.getBladderDrainage() == null ? null : vo.getBladderDrainage().getBeanCollection();
		this.bladderdrainagetxt = vo.getBladderDrainagetxt();
		this.testatrophy = vo.getTestAtrophy() == null ? null : (ims.vo.LookupInstanceBean)vo.getTestAtrophy().getBean();
		this.endoevalperf = vo.getEndoEvalPerf() == null ? null : vo.getEndoEvalPerf().getBeanCollection();
		this.infxnscreening = vo.getInfxnScreening() == null ? null : vo.getInfxnScreening().getBeanCollection();
		this.screenconsent = vo.getScreenConsent() == null ? null : (ims.vo.LookupInstanceBean)vo.getScreenConsent().getBean();
		this.semenculture = vo.getSemenCulture() == null ? null : (ims.vo.LookupInstanceBean)vo.getSemenCulture().getBean();
		this.semenfindings = vo.getSemenFindings() == null ? null : vo.getSemenFindings().getBeanCollection();
		this.elisa = vo.getElisa() == null ? null : (ims.vo.LookupInstanceBean)vo.getElisa().getBean();
		this.methodssuccesswith = vo.getMethodssuccessWith() == null ? null : vo.getMethodssuccessWith().getBeanCollection();
		this.spermfrozen = vo.getSpermFrozen() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpermFrozen().getBean();
		this.treatmentsoffered = vo.getTreatmentsoffered() == null ? null : vo.getTreatmentsoffered().getBeanCollection();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
	}

	public ims.generalmedical.vo.OPDFertClinicVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.generalmedical.vo.OPDFertClinicVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.OPDFertClinicVo vo = null;
		if(map != null)
			vo = (ims.generalmedical.vo.OPDFertClinicVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.generalmedical.vo.OPDFertClinicVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.LookupInstanceBean getAchieveErection()
	{
		return this.achieveerection;
	}
	public void setAchieveErection(ims.vo.LookupInstanceBean value)
	{
		this.achieveerection = value;
	}
	public java.util.Collection getErectDysfxTreatments()
	{
		return this.erectdysfxtreatments;
	}
	public void setErectDysfxTreatments(java.util.Collection value)
	{
		this.erectdysfxtreatments = value;
	}
	public void addErectDysfxTreatments(java.util.Collection value)
	{
		if(this.erectdysfxtreatments == null)
			this.erectdysfxtreatments = new java.util.ArrayList();
		this.erectdysfxtreatments.add(value);
	}
	public ims.vo.LookupInstanceBean getSexDrive()
	{
		return this.sexdrive;
	}
	public void setSexDrive(ims.vo.LookupInstanceBean value)
	{
		this.sexdrive = value;
	}
	public ims.vo.LookupInstanceBean getEjaculation()
	{
		return this.ejaculation;
	}
	public void setEjaculation(ims.vo.LookupInstanceBean value)
	{
		this.ejaculation = value;
	}
	public java.util.Collection getBladderDrainage()
	{
		return this.bladderdrainage;
	}
	public void setBladderDrainage(java.util.Collection value)
	{
		this.bladderdrainage = value;
	}
	public void addBladderDrainage(java.util.Collection value)
	{
		if(this.bladderdrainage == null)
			this.bladderdrainage = new java.util.ArrayList();
		this.bladderdrainage.add(value);
	}
	public String getBladderDrainagetxt()
	{
		return this.bladderdrainagetxt;
	}
	public void setBladderDrainagetxt(String value)
	{
		this.bladderdrainagetxt = value;
	}
	public ims.vo.LookupInstanceBean getTestAtrophy()
	{
		return this.testatrophy;
	}
	public void setTestAtrophy(ims.vo.LookupInstanceBean value)
	{
		this.testatrophy = value;
	}
	public java.util.Collection getEndoEvalPerf()
	{
		return this.endoevalperf;
	}
	public void setEndoEvalPerf(java.util.Collection value)
	{
		this.endoevalperf = value;
	}
	public void addEndoEvalPerf(java.util.Collection value)
	{
		if(this.endoevalperf == null)
			this.endoevalperf = new java.util.ArrayList();
		this.endoevalperf.add(value);
	}
	public java.util.Collection getInfxnScreening()
	{
		return this.infxnscreening;
	}
	public void setInfxnScreening(java.util.Collection value)
	{
		this.infxnscreening = value;
	}
	public void addInfxnScreening(java.util.Collection value)
	{
		if(this.infxnscreening == null)
			this.infxnscreening = new java.util.ArrayList();
		this.infxnscreening.add(value);
	}
	public ims.vo.LookupInstanceBean getScreenConsent()
	{
		return this.screenconsent;
	}
	public void setScreenConsent(ims.vo.LookupInstanceBean value)
	{
		this.screenconsent = value;
	}
	public ims.vo.LookupInstanceBean getSemenCulture()
	{
		return this.semenculture;
	}
	public void setSemenCulture(ims.vo.LookupInstanceBean value)
	{
		this.semenculture = value;
	}
	public ims.generalmedical.vo.beans.OPDFertCLinicSemenAnaBean[] getSemenFindings()
	{
		return this.semenfindings;
	}
	public void setSemenFindings(ims.generalmedical.vo.beans.OPDFertCLinicSemenAnaBean[] value)
	{
		this.semenfindings = value;
	}
	public ims.vo.LookupInstanceBean getElisa()
	{
		return this.elisa;
	}
	public void setElisa(ims.vo.LookupInstanceBean value)
	{
		this.elisa = value;
	}
	public java.util.Collection getMethodssuccessWith()
	{
		return this.methodssuccesswith;
	}
	public void setMethodssuccessWith(java.util.Collection value)
	{
		this.methodssuccesswith = value;
	}
	public void addMethodssuccessWith(java.util.Collection value)
	{
		if(this.methodssuccesswith == null)
			this.methodssuccesswith = new java.util.ArrayList();
		this.methodssuccesswith.add(value);
	}
	public ims.vo.LookupInstanceBean getSpermFrozen()
	{
		return this.spermfrozen;
	}
	public void setSpermFrozen(ims.vo.LookupInstanceBean value)
	{
		this.spermfrozen = value;
	}
	public java.util.Collection getTreatmentsoffered()
	{
		return this.treatmentsoffered;
	}
	public void setTreatmentsoffered(java.util.Collection value)
	{
		this.treatmentsoffered = value;
	}
	public void addTreatmentsoffered(java.util.Collection value)
	{
		if(this.treatmentsoffered == null)
			this.treatmentsoffered = new java.util.ArrayList();
		this.treatmentsoffered.add(value);
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean achieveerection;
	private java.util.Collection erectdysfxtreatments;
	private ims.vo.LookupInstanceBean sexdrive;
	private ims.vo.LookupInstanceBean ejaculation;
	private java.util.Collection bladderdrainage;
	private String bladderdrainagetxt;
	private ims.vo.LookupInstanceBean testatrophy;
	private java.util.Collection endoevalperf;
	private java.util.Collection infxnscreening;
	private ims.vo.LookupInstanceBean screenconsent;
	private ims.vo.LookupInstanceBean semenculture;
	private ims.generalmedical.vo.beans.OPDFertCLinicSemenAnaBean[] semenfindings;
	private ims.vo.LookupInstanceBean elisa;
	private java.util.Collection methodssuccesswith;
	private ims.vo.LookupInstanceBean spermfrozen;
	private java.util.Collection treatmentsoffered;
	private ims.vo.RefVoBean carecontext;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
}
