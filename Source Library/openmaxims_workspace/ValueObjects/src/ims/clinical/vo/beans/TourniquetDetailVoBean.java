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

package ims.clinical.vo.beans;

public class TourniquetDetailVoBean extends ims.vo.ValueObjectBean
{
	public TourniquetDetailVoBean()
	{
	}
	public TourniquetDetailVoBean(ims.clinical.vo.TourniquetDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.tourniquet = vo.getTourniquet() == null ? null : (ims.vo.LookupInstanceBean)vo.getTourniquet().getBean();
		this.tourniquetposition = vo.getTourniquetPosition() == null ? null : (ims.vo.LookupInstanceBean)vo.getTourniquetPosition().getBean();
		this.tourniquetpressure = vo.getTourniquetPressure() == null ? null : (ims.vo.LookupInstanceBean)vo.getTourniquetPressure().getBean();
		this.timeon = vo.getTimeOn() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getTimeOn().getBean();
		this.timeoff = vo.getTimeOff() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getTimeOff().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.TourniquetDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.tourniquet = vo.getTourniquet() == null ? null : (ims.vo.LookupInstanceBean)vo.getTourniquet().getBean();
		this.tourniquetposition = vo.getTourniquetPosition() == null ? null : (ims.vo.LookupInstanceBean)vo.getTourniquetPosition().getBean();
		this.tourniquetpressure = vo.getTourniquetPressure() == null ? null : (ims.vo.LookupInstanceBean)vo.getTourniquetPressure().getBean();
		this.timeon = vo.getTimeOn() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getTimeOn().getBean();
		this.timeoff = vo.getTimeOff() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getTimeOff().getBean();
	}

	public ims.clinical.vo.TourniquetDetailVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.TourniquetDetailVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.TourniquetDetailVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.TourniquetDetailVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.TourniquetDetailVo();
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
	public ims.vo.LookupInstanceBean getTourniquet()
	{
		return this.tourniquet;
	}
	public void setTourniquet(ims.vo.LookupInstanceBean value)
	{
		this.tourniquet = value;
	}
	public ims.vo.LookupInstanceBean getTourniquetPosition()
	{
		return this.tourniquetposition;
	}
	public void setTourniquetPosition(ims.vo.LookupInstanceBean value)
	{
		this.tourniquetposition = value;
	}
	public ims.vo.LookupInstanceBean getTourniquetPressure()
	{
		return this.tourniquetpressure;
	}
	public void setTourniquetPressure(ims.vo.LookupInstanceBean value)
	{
		this.tourniquetpressure = value;
	}
	public ims.framework.utils.beans.DateTimeBean getTimeOn()
	{
		return this.timeon;
	}
	public void setTimeOn(ims.framework.utils.beans.DateTimeBean value)
	{
		this.timeon = value;
	}
	public ims.framework.utils.beans.DateTimeBean getTimeOff()
	{
		return this.timeoff;
	}
	public void setTimeOff(ims.framework.utils.beans.DateTimeBean value)
	{
		this.timeoff = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean tourniquet;
	private ims.vo.LookupInstanceBean tourniquetposition;
	private ims.vo.LookupInstanceBean tourniquetpressure;
	private ims.framework.utils.beans.DateTimeBean timeon;
	private ims.framework.utils.beans.DateTimeBean timeoff;
}
