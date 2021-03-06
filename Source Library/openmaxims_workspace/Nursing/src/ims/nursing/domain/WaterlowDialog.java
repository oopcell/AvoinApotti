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

package ims.nursing.domain;

// Generated from form domain impl
public interface WaterlowDialog extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* getRecord ==> Nursing.WaterlowAssessmentVo
	*/
	public ims.nursing.vo.WaterlowAssessmentVo getRecord(Integer recordId) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* save waterlow Record
	*/
	public ims.nursing.vo.AssessmentHeaderInfo saveRecord(ims.nursing.vo.WaterlowAssessmentVo waterRecord, ims.nursing.vo.AssessmentHeaderInfo assessment, ims.nursing.vo.AssessmentComponent component) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* true if it is Part Of SkinAssessment
	*/
	public Boolean isPartOfSkinAssessment(ims.nursing.vo.WaterlowAssessmentVo waterRecord) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* saveSkinComponent
	*/
	public ims.nursing.vo.AssessmentHeaderInfo saveSkinComponent(ims.nursing.vo.AssessmentHeaderInfo assessment, ims.nursing.vo.AssessmentComponent component, ims.core.vo.ClinicalContactShortVo voClinicalContactShort) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getLastWaterlowForCurrentAdmission
	*/
	public ims.nursing.vo.WaterlowAssessmentVo getLastWaterlowForCurrentAdmission(ims.core.admin.vo.CareContextRefVo careContextRef);
}
