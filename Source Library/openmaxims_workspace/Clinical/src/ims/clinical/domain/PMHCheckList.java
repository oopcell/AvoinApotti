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

package ims.clinical.domain;

// Generated from form domain impl
public interface PMHCheckList extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* save a Patient Past Medical History Checklist Record
	*/
	public ims.clinical.vo.PatientPMHChecklistVo savePatientPMHChecklist(ims.clinical.vo.PatientPMHChecklistVo voPatientPMHChecklist, ims.core.vo.PatientShort voPatientShort) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Get a Patient Past Medical History Checklist Record
	*/
	public ims.clinical.vo.PatientPMHChecklistVo getPatientPMHChecklist(ims.core.admin.vo.CareContextRefVo refVoCareContext);

	// Generated from form domain interface definition
	/**
	* getPMHCheckListConfig
	*/
	public ims.clinicaladmin.vo.PMHChecklistConfigVo getPMHCheckListConfig();

	// Generated from form domain interface definition
	/**
	* getPastMedicalHistory
	*/
	public ims.core.vo.PatientPastMedicalHistoryVo getPastMedicalHistory(ims.core.vo.PatientShort patient);

	// Generated from form domain interface definition
	/**
	* savePMH
	*/
	public ims.core.vo.PatientPastMedicalHistoryVo savePMH(ims.core.vo.PatientPastMedicalHistoryVo pmh) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Get a PMHCheckListConfig for a Specialty
	*/
	public ims.clinicaladmin.vo.PMHChecklistConfigVo getPMHCheckListConfigForSpecialty(ims.core.vo.ClinicalContactShortVo clinicalcontactVo);

	// Generated from form domain interface definition
	public ims.core.vo.lookups.Specialty getSpecialtyForEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo refVoEpisodeOfCare);

	// Generated from form domain interface definition
	public ims.clinicaladmin.vo.PMHChecklistConfigVo getPMHCheckListConfigForSpecialty(ims.core.vo.lookups.Specialty lkupSpecialty);
}
