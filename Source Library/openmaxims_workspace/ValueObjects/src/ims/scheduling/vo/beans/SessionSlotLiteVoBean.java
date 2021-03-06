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

package ims.scheduling.vo.beans;

public class SessionSlotLiteVoBean extends ims.vo.ValueObjectBean
{
	public SessionSlotLiteVoBean()
	{
	}
	public SessionSlotLiteVoBean(ims.scheduling.vo.SessionSlotLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.directoryofservices = vo.getDirectoryOfServices() == null ? null : vo.getDirectoryOfServices().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.SessionSlotLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.directoryofservices = vo.getDirectoryOfServices() == null ? null : vo.getDirectoryOfServices().getBeanCollection();
	}

	public ims.scheduling.vo.SessionSlotLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.SessionSlotLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.SessionSlotLiteVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.SessionSlotLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.SessionSlotLiteVo();
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
	public ims.scheduling.vo.beans.DirectoryOfServiceSessionSlotVoBean[] getDirectoryOfServices()
	{
		return this.directoryofservices;
	}
	public void setDirectoryOfServices(ims.scheduling.vo.beans.DirectoryOfServiceSessionSlotVoBean[] value)
	{
		this.directoryofservices = value;
	}

	private Integer id;
	private int version;
	private ims.scheduling.vo.beans.DirectoryOfServiceSessionSlotVoBean[] directoryofservices;
}
