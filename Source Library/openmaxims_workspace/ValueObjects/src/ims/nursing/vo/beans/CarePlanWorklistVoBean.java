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

package ims.nursing.vo.beans;

public class CarePlanWorklistVoBean extends ims.vo.ValueObjectBean
{
	public CarePlanWorklistVoBean()
	{
	}
	public CarePlanWorklistVoBean(ims.nursing.vo.CarePlanWorklistVo vo)
	{
		this.patient = vo.getPatient() == null ? null : (ims.nursing.vo.beans.PatientForCarePlanWorklistVoBean)vo.getPatient().getBean();
		this.careplan = vo.getCarePlan() == null ? null : (ims.nursing.vo.beans.CarePlanForCarePlanWorklistVoBean)vo.getCarePlan().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.CarePlanWorklistVo vo)
	{
		this.patient = vo.getPatient() == null ? null : (ims.nursing.vo.beans.PatientForCarePlanWorklistVoBean)vo.getPatient().getBean(map);
		this.careplan = vo.getCarePlan() == null ? null : (ims.nursing.vo.beans.CarePlanForCarePlanWorklistVoBean)vo.getCarePlan().getBean(map);
	}

	public ims.nursing.vo.CarePlanWorklistVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.nursing.vo.CarePlanWorklistVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.CarePlanWorklistVo vo = null;
		if(map != null)
			vo = (ims.nursing.vo.CarePlanWorklistVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.nursing.vo.CarePlanWorklistVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.nursing.vo.beans.PatientForCarePlanWorklistVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.nursing.vo.beans.PatientForCarePlanWorklistVoBean value)
	{
		this.patient = value;
	}
	public ims.nursing.vo.beans.CarePlanForCarePlanWorklistVoBean getCarePlan()
	{
		return this.careplan;
	}
	public void setCarePlan(ims.nursing.vo.beans.CarePlanForCarePlanWorklistVoBean value)
	{
		this.careplan = value;
	}

	private ims.nursing.vo.beans.PatientForCarePlanWorklistVoBean patient;
	private ims.nursing.vo.beans.CarePlanForCarePlanWorklistVoBean careplan;
}
