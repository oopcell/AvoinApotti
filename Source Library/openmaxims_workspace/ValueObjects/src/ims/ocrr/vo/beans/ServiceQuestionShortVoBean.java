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

package ims.ocrr.vo.beans;

public class ServiceQuestionShortVoBean extends ims.vo.ValueObjectBean
{
	public ServiceQuestionShortVoBean()
	{
	}
	public ServiceQuestionShortVoBean(ims.ocrr.vo.ServiceQuestionShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean();
		this.ismandatory = vo.getIsMandatory();
		this.askforinvestigations = vo.getAskForInvestigations();
		this.questioninformation = vo.getQuestionInformation() == null ? null : (ims.core.vo.beans.QuestionInformationShortVoBean)vo.getQuestionInformation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.ServiceQuestionShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean(map);
		this.ismandatory = vo.getIsMandatory();
		this.askforinvestigations = vo.getAskForInvestigations();
		this.questioninformation = vo.getQuestionInformation() == null ? null : (ims.core.vo.beans.QuestionInformationShortVoBean)vo.getQuestionInformation().getBean(map);
	}

	public ims.ocrr.vo.ServiceQuestionShortVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.ServiceQuestionShortVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.ServiceQuestionShortVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.ServiceQuestionShortVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.ServiceQuestionShortVo();
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
	public ims.core.vo.beans.ServiceLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceLiteVoBean value)
	{
		this.service = value;
	}
	public Boolean getIsMandatory()
	{
		return this.ismandatory;
	}
	public void setIsMandatory(Boolean value)
	{
		this.ismandatory = value;
	}
	public Boolean getAskForInvestigations()
	{
		return this.askforinvestigations;
	}
	public void setAskForInvestigations(Boolean value)
	{
		this.askforinvestigations = value;
	}
	public ims.core.vo.beans.QuestionInformationShortVoBean getQuestionInformation()
	{
		return this.questioninformation;
	}
	public void setQuestionInformation(ims.core.vo.beans.QuestionInformationShortVoBean value)
	{
		this.questioninformation = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.ServiceLiteVoBean service;
	private Boolean ismandatory;
	private Boolean askforinvestigations;
	private ims.core.vo.beans.QuestionInformationShortVoBean questioninformation;
}
