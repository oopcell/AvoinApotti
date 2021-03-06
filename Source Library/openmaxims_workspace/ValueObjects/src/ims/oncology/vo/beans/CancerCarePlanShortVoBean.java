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

package ims.oncology.vo.beans;

public class CancerCarePlanShortVoBean extends ims.vo.ValueObjectBean
{
	public CancerCarePlanShortVoBean()
	{
	}
	public CancerCarePlanShortVoBean(ims.oncology.vo.CancerCarePlanShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean();
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextShortVoBean)vo.getCareContext().getBean();
		this.careplandate = vo.getCarePlanDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCarePlanDate().getBean();
		this.consultantincharge = vo.getConsultantInCharge() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultantInCharge().getBean();
		this.careplanintent = vo.getCarePlanIntent() == null ? null : (ims.vo.LookupInstanceBean)vo.getCarePlanIntent().getBean();
		this.recurrenceindicator = vo.getRecurrenceIndicator() == null ? null : (ims.vo.LookupInstanceBean)vo.getRecurrenceIndicator().getBean();
		this.iscurrent = vo.getIsCurrent();
		this.mdtmeeting = vo.getMdtMeeting() == null ? null : (ims.oncology.vo.beans.CancerMDTMeetingVoBean)vo.getMdtMeeting().getBean();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.careplannotes = vo.getCarePlanNotes();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.oncology.vo.CancerCarePlanShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : (ims.core.vo.beans.ClinicalContactShortVoBean)vo.getClinicalContact().getBean(map);
		this.carecontext = vo.getCareContext() == null ? null : (ims.core.vo.beans.CareContextShortVoBean)vo.getCareContext().getBean(map);
		this.careplandate = vo.getCarePlanDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCarePlanDate().getBean();
		this.consultantincharge = vo.getConsultantInCharge() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultantInCharge().getBean(map);
		this.careplanintent = vo.getCarePlanIntent() == null ? null : (ims.vo.LookupInstanceBean)vo.getCarePlanIntent().getBean();
		this.recurrenceindicator = vo.getRecurrenceIndicator() == null ? null : (ims.vo.LookupInstanceBean)vo.getRecurrenceIndicator().getBean();
		this.iscurrent = vo.getIsCurrent();
		this.mdtmeeting = vo.getMdtMeeting() == null ? null : (ims.oncology.vo.beans.CancerMDTMeetingVoBean)vo.getMdtMeeting().getBean(map);
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.careplannotes = vo.getCarePlanNotes();
	}

	public ims.oncology.vo.CancerCarePlanShortVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.oncology.vo.CancerCarePlanShortVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.oncology.vo.CancerCarePlanShortVo vo = null;
		if(map != null)
			vo = (ims.oncology.vo.CancerCarePlanShortVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.oncology.vo.CancerCarePlanShortVo();
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
	public ims.core.vo.beans.ClinicalContactShortVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.beans.ClinicalContactShortVoBean value)
	{
		this.clinicalcontact = value;
	}
	public ims.core.vo.beans.CareContextShortVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.vo.beans.CareContextShortVoBean value)
	{
		this.carecontext = value;
	}
	public ims.framework.utils.beans.DateBean getCarePlanDate()
	{
		return this.careplandate;
	}
	public void setCarePlanDate(ims.framework.utils.beans.DateBean value)
	{
		this.careplandate = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getConsultantInCharge()
	{
		return this.consultantincharge;
	}
	public void setConsultantInCharge(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.consultantincharge = value;
	}
	public ims.vo.LookupInstanceBean getCarePlanIntent()
	{
		return this.careplanintent;
	}
	public void setCarePlanIntent(ims.vo.LookupInstanceBean value)
	{
		this.careplanintent = value;
	}
	public ims.vo.LookupInstanceBean getRecurrenceIndicator()
	{
		return this.recurrenceindicator;
	}
	public void setRecurrenceIndicator(ims.vo.LookupInstanceBean value)
	{
		this.recurrenceindicator = value;
	}
	public Boolean getIsCurrent()
	{
		return this.iscurrent;
	}
	public void setIsCurrent(Boolean value)
	{
		this.iscurrent = value;
	}
	public ims.oncology.vo.beans.CancerMDTMeetingVoBean getMdtMeeting()
	{
		return this.mdtmeeting;
	}
	public void setMdtMeeting(ims.oncology.vo.beans.CancerMDTMeetingVoBean value)
	{
		this.mdtmeeting = value;
	}
	public ims.vo.RefVoBean getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.vo.RefVoBean value)
	{
		this.episodeofcare = value;
	}
	public String getCarePlanNotes()
	{
		return this.careplannotes;
	}
	public void setCarePlanNotes(String value)
	{
		this.careplannotes = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.ClinicalContactShortVoBean clinicalcontact;
	private ims.core.vo.beans.CareContextShortVoBean carecontext;
	private ims.framework.utils.beans.DateBean careplandate;
	private ims.core.vo.beans.HcpLiteVoBean consultantincharge;
	private ims.vo.LookupInstanceBean careplanintent;
	private ims.vo.LookupInstanceBean recurrenceindicator;
	private Boolean iscurrent;
	private ims.oncology.vo.beans.CancerMDTMeetingVoBean mdtmeeting;
	private ims.vo.RefVoBean episodeofcare;
	private String careplannotes;
}
