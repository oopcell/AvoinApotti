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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class PatientProcedureForSurgicalAuditPreOpChecksVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo copy(ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo valueObjectDest, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientProcedure(valueObjectSrc.getID_PatientProcedure());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProcedureDescription
		valueObjectDest.setProcedureDescription(valueObjectSrc.getProcedureDescription());
		// InfoSource
		valueObjectDest.setInfoSource(valueObjectSrc.getInfoSource());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// isPrimary
		valueObjectDest.setIsPrimary(valueObjectSrc.getIsPrimary());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureStatus
		valueObjectDest.setProcedureStatus(valueObjectSrc.getProcedureStatus());
		// ProcedureOutcome
		valueObjectDest.setProcedureOutcome(valueObjectSrc.getProcedureOutcome());
		// CancelledDate
		valueObjectDest.setCancelledDate(valueObjectSrc.getCancelledDate());
		// PeformedBy
		valueObjectDest.setPeformedBy(valueObjectSrc.getPeformedBy());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(java.util.Set domainObjectSet)	
	{
		return createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection voList = new ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) iterator.next();
			ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(java.util.List domainObjectList) 
	{
		return createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientProcedure objects.
	 */
	public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection createPatientProcedureForSurgicalAuditPreOpChecksVoCollectionFromPatientProcedure(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection voList = new ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientProcedure domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainObjectList.get(i);
			ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.core.clinical.domain.objects.PatientProcedure set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection voCollection) 
	 {
	 	return extractPatientProcedureSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientProcedureSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureForSurgicalAuditPreOpChecksVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.core.clinical.domain.objects.PatientProcedure list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection voCollection) 
	 {
	 	return extractPatientProcedureList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientProcedureList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientProcedure domainObject = PatientProcedureForSurgicalAuditPreOpChecksVoAssembler.extractPatientProcedure(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo create(ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientProcedure object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo valueObject = (ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo) map.getValueObject(domainObject, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo insert(ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientProcedure
	 */
	 public static ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo insert(DomainObjectMap map, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo valueObject, ims.core.clinical.domain.objects.PatientProcedure domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientProcedure(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// ProcedureDescription
		valueObject.setProcedureDescription(domainObject.getProcedureDescription());
		// InfoSource
		ims.domain.lookups.LookupInstance instance2 = domainObject.getInfoSource();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup2 = new ims.core.vo.lookups.SourceofInformation(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.SourceofInformation(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setInfoSource(voLookup2);
		}
				// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
		// isPrimary
		valueObject.setIsPrimary( domainObject.isIsPrimary() );
		// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getProcedureStatus();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientProcedureStatus voLookup7 = new ims.core.vo.lookups.PatientProcedureStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.PatientProcedureStatus parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.PatientProcedureStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setProcedureStatus(voLookup7);
		}
				// ProcedureOutcome
		ims.domain.lookups.LookupInstance instance8 = domainObject.getProcedureOutcome();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.PatientProcedureOutcome voLookup8 = new ims.clinical.vo.lookups.PatientProcedureOutcome(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.PatientProcedureOutcome parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.PatientProcedureOutcome(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setProcedureOutcome(voLookup8);
		}
				// CancelledDate
		java.util.Date CancelledDate = domainObject.getCancelledDate();
		if ( null != CancelledDate ) 
		{
			valueObject.setCancelledDate(new ims.framework.utils.Date(CancelledDate) );
		}
		// PeformedBy
		valueObject.setPeformedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getPeformedBy()) );
		// Consultant
		valueObject.setConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultant()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo valueObject) 
	{
		return 	extractPatientProcedure(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientProcedure extractPatientProcedure(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientProcedure();
		ims.core.clinical.domain.objects.PatientProcedure domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientProcedureForSurgicalAuditPreOpChecksVo ID_PatientProcedure field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientProcedure();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientProcedure());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientProcedure) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientProcedure());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureDescription() != null && valueObject.getProcedureDescription().equals(""))
		{
			valueObject.setProcedureDescription(null);
		}
		domainObject.setProcedureDescription(valueObject.getProcedureDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getInfoSource() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getInfoSource().getID());
		}
		domainObject.setInfoSource(value2);
		ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getCareContext();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value3);
		ims.core.admin.domain.objects.EpisodeOfCare value4 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value4 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value4);
		domainObject.setIsPrimary(valueObject.getIsPrimary());
		domainObject.setProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.extractProcedure(domainFactory, valueObject.getProcedure(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getProcedureStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getProcedureStatus().getID());
		}
		domainObject.setProcedureStatus(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getProcedureOutcome() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getProcedureOutcome().getID());
		}
		domainObject.setProcedureOutcome(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getCancelledDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setCancelledDate(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getPeformedBy() ) 
		{
			if (valueObject.getPeformedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getPeformedBy()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getPeformedBy());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getPeformedBy().getBoId());
			}
		}
		domainObject.setPeformedBy(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value11);

		return domainObject;
	}

}