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
// This code was generated by Vasile Purdila using IMS Development Environment (version 1.62 build 2971.25997)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.emergency.domain.impl;

import ims.configuration.gen.ConfigFlag;
import ims.core.admin.domain.objects.CareContext;
import ims.core.admin.domain.objects.EmergencyAttendance;
import ims.core.admin.vo.EmergencyAttendanceRefVo;
import ims.core.patient.domain.objects.Patient;
import ims.core.vo.CareContextShortVo;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.PatientShortAssembler;
import ims.core.vo.lookups.PatIdType;
import ims.domain.DomainFactory;
import ims.emergency.domain.base.impl.BaseAttendanceListImpl;
import ims.emergency.vo.EmergencyAttendanceListVo;
import ims.emergency.vo.EmergencyAttendanceListVoCollection;
import ims.emergency.vo.AttendanceDetailsVo;
import ims.emergency.vo.domain.AttendanceDetailsVoAssembler;
import ims.emergency.vo.lookups.PatientCategory;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;

import java.util.ArrayList;
import java.util.List;

public class AttendanceListImpl extends BaseAttendanceListImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* listEmergencyAttendance
	*/
	
	@SuppressWarnings("unchecked")
	public EmergencyAttendanceListVoCollection listEmergencyAttendance(String surname, String forename, PatientCategory category, Boolean include24, Boolean includeUnCoded) //WDEV-17015
	{
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList values = new ArrayList();

		StringBuilder pidlist = new StringBuilder("select p1_1.id, p2_1.value from Patient as p1_1 left join p1_1.identifiers as p2_1 left join p2_1.type as l1_1 where	l1_1.id = :TYPE and p1_1.id in(");
		
		ArrayList<Integer> pids = new ArrayList<Integer>();
		EmergencyAttendanceListVoCollection result = new EmergencyAttendanceListVoCollection();
		
		DomainFactory domainFactory = getDomainFactory();
		
		StringBuilder hql = new StringBuilder("select e1_1.id, e1_1.arrivalDateTime, p1_1.id, p1_1.name.surname, p1_1.name.forename, e3_1.injuryDateTime, l1_1.text, l2_1.text, e1_1.dischargeDateTime from EmergencyAttendance as e1_1 left join e1_1.careContext as c1_1 left join c1_1.episodeOfCare as e2_1 left join e2_1.careSpell as c2_1 left join c2_1.patient as p1_1 left join e1_1.emergencyEpisode as e3_1 left join e3_1.category as l1_1 left join e3_1.presentingComplaint as l2_1 left join e1_1.outcome as l3_1 where 1 = 1 ");
		
		//WDEV-17015
		if (surname == null && forename == null && category == null && include24 == null)
		{
			hql.append(" and e1_1.outcome is null and e1_1.dischargeDateTime is null ");
		}
		else
		{
			if(surname != null)
			{
				hql.append(" and p1_1.name.upperSurname like :SNM");
				markers.add("SNM");
				values.add(surname.toUpperCase() + (surname.endsWith("%") ? "" : "%"));
			}

			if(forename != null)
			{
				hql.append(" and p1_1.name.upperForename like :FNM");
				markers.add("FNM");
				values.add(forename.toUpperCase() + (forename.endsWith("%") ? "" : "%"));
			}

			if(category != null)
			{
				hql.append(" and e3_1.category.id = :CAT");
				markers.add("CAT");
				values.add(new Integer(category.getId()));
			}
			
			if(include24 != null)
			{
				DateTime now = new DateTime();
				
				now = now.addHours(-24);
				
				hql.append(" and (e1_1.dischargeDateTime >= :LAST24 or e1_1.dischargeDateTime is null)");
				markers.add("LAST24");
				values.add(now.getJavaDate());
			}
			else
			{
				hql.append(" and e1_1.outcome is null and e1_1.dischargeDateTime is null ");	
			}
			
		}
		
		hql.append(" order by e1_1.arrivalDateTime asc");
		
		List list = domainFactory.find(hql.toString(), markers, values);
		
		/*
		 * Indexes
		 * 
		 * 0	EmergencyAttendance id
		 * 1	EmergencyAttendance arrivalDateTime
		 * 2	Patient id
		 * 3	PersonName surname
		 * 4	PersonName forename
		 * 5	EmergencyEpisode injuryDateTime
		 * 6	Patient category
		 * 7	Presenting Complaint
		 * 8	Discharge Date
		 */
		for (int i = 0; i < list.size(); i++)
		{
			EmergencyAttendanceListVo item = new EmergencyAttendanceListVo();
			
			Object[] objects = (Object[])list.get(i);
			
			item.setId((Integer)objects[0]);
			item.setAttendanceDate(objects[1] != null ? new DateTime((java.util.Date)objects[1]) : null);
			item.setPatientId((Integer)objects[2]);
			item.setSurname((String)objects[3]);
			item.setForename((String)objects[4]);
			item.setInjuryDate(objects[5] != null ? new DateTime((java.util.Date)objects[5]) : null);
			item.setPatientCategory((String)objects[6]);
			item.setPresentingComplaint((String)objects[7]);
			item.setDischargeDate(objects[8] != null ? new DateTime((java.util.Date)objects[8]) : null);
			
			result.add(item);
			
			if(!pids.contains(objects[2]))
			{
				if(pids.size() > 0)
					pidlist.append(", ");
				
				pidlist.append(objects[2]);
				
				pids.add((Integer) objects[2]);
			}
		}
		
		pidlist.append(")");
		
		if(pids.size() > 0)
		{
			list = domainFactory.find(pidlist.toString(), new String[] {"TYPE"}, new Object[] {getPatIdentifierFlag()});
	
			for (int i = 0; i < result.size(); i++)
			{
				if(result.get(i).getPatientIdIsNotNull())
				{
					EmergencyAttendanceListVo item = result.get(i);
					
					item.setHospitalNo(getPatientIdentifier(item.getPatientId(), list));
					
					result.set(i, item);
				}
			}
		}
		
		return result;
	}
	
	private Integer getPatIdentifierFlag()
	{
		PatIdType patIdType = PatIdType.getNegativeInstance(ConfigFlag.UI.DISPLAY_PATID_TYPE.getValue());
		if(patIdType != null)
			return new Integer(patIdType.getID());
			
		return null;
	}
	
	private String getPatientIdentifier(Integer pid, List list)
	{
		if(list == null || list.size() == 0 || pid == null)
			return null;
		
		for (int i = 0; i < list.size(); i++)
		{
			Object[] item = (Object[]) list.get(i);
			
			if(pid.equals(item[0]))
				return (String) item[1]; 
		}
		
		return null;
	}

	public CareContextShortVo getCareContext(EmergencyAttendanceRefVo emergencyAttendanceRef)
	{
		String hql = "select e.careContext from EmergencyAttendance as e where e.id = :ID";
		
		DomainFactory domainFactory = getDomainFactory();
		
		List list = domainFactory.find(hql, new String[] {"ID"}, new Object[] {emergencyAttendanceRef.getID_EmergencyAttendance()});

		if(list != null && list.size() > 0)
			return CareContextShortVoAssembler.create((CareContext) list.get(0));
		
		return null;
	}

	public PatientShort getPatient(EmergencyAttendanceRefVo emergencyAttendanceRef)
	{
		String hql = "select c2_1.patient\r\n" + 
				"from EmergencyAttendance as e1_1 left join e1_1.careContext as c1_1 left join c1_1.episodeOfCare as e2_1 left join e2_1.careSpell as c2_1 where e1_1.id = :ID";
		
		DomainFactory domainFactory = getDomainFactory();
		
		List list = domainFactory.find(hql, new String[] {"ID"}, new Object[] {emergencyAttendanceRef.getID_EmergencyAttendance()});

		if(list != null && list.size() > 0)
			return PatientShortAssembler.create((Patient) list.get(0));
		
		return null;
	}

	public AttendanceDetailsVo getEmergencyAttendance(EmergencyAttendanceRefVo emergencyAttendanceRef)
	{
		if(emergencyAttendanceRef == null || emergencyAttendanceRef.getID_EmergencyAttendance() == null)
			throw new CodingRuntimeException("The emergencyAttendanceRef paramater cannot be null !");

		DomainFactory domainFactory = getDomainFactory();
		
		return AttendanceDetailsVoAssembler.create((EmergencyAttendance)domainFactory.loadDomainObject(EmergencyAttendance.class, emergencyAttendanceRef.getID_EmergencyAttendance()));
	}

}
