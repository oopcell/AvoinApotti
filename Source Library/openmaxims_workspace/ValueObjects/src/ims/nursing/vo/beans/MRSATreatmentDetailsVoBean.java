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

public class MRSATreatmentDetailsVoBean extends ims.vo.ValueObjectBean
{
	public MRSATreatmentDetailsVoBean()
	{
	}
	public MRSATreatmentDetailsVoBean(ims.nursing.vo.MRSATreatmentDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.treatment = vo.getTreatment() == null ? null : (ims.vo.LookupInstanceBean)vo.getTreatment().getBean();
		this.dailytreatment = vo.getDailyTreatment() == null ? null : vo.getDailyTreatment().getBeanCollection();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.MRSATreatmentDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.treatment = vo.getTreatment() == null ? null : (ims.vo.LookupInstanceBean)vo.getTreatment().getBean();
		this.dailytreatment = vo.getDailyTreatment() == null ? null : vo.getDailyTreatment().getBeanCollection();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
	}

	public ims.nursing.vo.MRSATreatmentDetailsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.nursing.vo.MRSATreatmentDetailsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.MRSATreatmentDetailsVo vo = null;
		if(map != null)
			vo = (ims.nursing.vo.MRSATreatmentDetailsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.nursing.vo.MRSATreatmentDetailsVo();
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
	public ims.vo.LookupInstanceBean getTreatment()
	{
		return this.treatment;
	}
	public void setTreatment(ims.vo.LookupInstanceBean value)
	{
		this.treatment = value;
	}
	public ims.nursing.vo.beans.MRSADailyTreatmentVoBean[] getDailyTreatment()
	{
		return this.dailytreatment;
	}
	public void setDailyTreatment(ims.nursing.vo.beans.MRSADailyTreatmentVoBean[] value)
	{
		this.dailytreatment = value;
	}
	public ims.vo.SysInfoBean getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SysInfoBean value)
	{
		this.sysinfo = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean treatment;
	private ims.nursing.vo.beans.MRSADailyTreatmentVoBean[] dailytreatment;
	private ims.vo.SysInfoBean sysinfo;
}
