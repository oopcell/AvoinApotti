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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class CommunityServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CommunityServiceVo copy(ims.core.vo.CommunityServiceVo valueObjectDest, ims.core.vo.CommunityServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CommunityServices(valueObjectSrc.getID_CommunityServices());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// LocationService
		valueObjectDest.setLocationService(valueObjectSrc.getLocationService());
		// CurrentFrequency
		valueObjectDest.setCurrentFrequency(valueObjectSrc.getCurrentFrequency());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// isCurrentlyActive
		valueObjectDest.setIsCurrentlyActive(valueObjectSrc.getIsCurrentlyActive());
		// SuppliedService
		valueObjectDest.setSuppliedService(valueObjectSrc.getSuppliedService());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// DischargeFrequency
		valueObjectDest.setDischargeFrequency(valueObjectSrc.getDischargeFrequency());
		// isDischargeService
		valueObjectDest.setIsDischargeService(valueObjectSrc.getIsDischargeService());
		// isServiceInPlace
		valueObjectDest.setIsServiceInPlace(valueObjectSrc.getIsServiceInPlace());
		// ConfirmedDate
		valueObjectDest.setConfirmedDate(valueObjectSrc.getConfirmedDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCommunityServiceVoCollectionFromCommunityServices(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.CommunityServices objects.
	 */
	public static ims.core.vo.CommunityServiceVoCollection createCommunityServiceVoCollectionFromCommunityServices(java.util.Set domainObjectSet)	
	{
		return createCommunityServiceVoCollectionFromCommunityServices(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.CommunityServices objects.
	 */
	public static ims.core.vo.CommunityServiceVoCollection createCommunityServiceVoCollectionFromCommunityServices(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CommunityServiceVoCollection voList = new ims.core.vo.CommunityServiceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.CommunityServices domainObject = (ims.core.clinical.domain.objects.CommunityServices) iterator.next();
			ims.core.vo.CommunityServiceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.CommunityServices objects.
	 */
	public static ims.core.vo.CommunityServiceVoCollection createCommunityServiceVoCollectionFromCommunityServices(java.util.List domainObjectList) 
	{
		return createCommunityServiceVoCollectionFromCommunityServices(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.CommunityServices objects.
	 */
	public static ims.core.vo.CommunityServiceVoCollection createCommunityServiceVoCollectionFromCommunityServices(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CommunityServiceVoCollection voList = new ims.core.vo.CommunityServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.CommunityServices domainObject = (ims.core.clinical.domain.objects.CommunityServices) domainObjectList.get(i);
			ims.core.vo.CommunityServiceVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.CommunityServices set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCommunityServicesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommunityServiceVoCollection voCollection) 
	 {
	 	return extractCommunityServicesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCommunityServicesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommunityServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CommunityServiceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.CommunityServices domainObject = CommunityServiceVoAssembler.extractCommunityServices(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.CommunityServices list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCommunityServicesList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommunityServiceVoCollection voCollection) 
	 {
	 	return extractCommunityServicesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCommunityServicesList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommunityServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CommunityServiceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.CommunityServices domainObject = CommunityServiceVoAssembler.extractCommunityServices(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.CommunityServices object.
	 * @param domainObject ims.core.clinical.domain.objects.CommunityServices
	 */
	 public static ims.core.vo.CommunityServiceVo create(ims.core.clinical.domain.objects.CommunityServices domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.CommunityServices object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CommunityServiceVo create(DomainObjectMap map, ims.core.clinical.domain.objects.CommunityServices domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CommunityServiceVo valueObject = (ims.core.vo.CommunityServiceVo) map.getValueObject(domainObject, ims.core.vo.CommunityServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CommunityServiceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.CommunityServices
	 */
	 public static ims.core.vo.CommunityServiceVo insert(ims.core.vo.CommunityServiceVo valueObject, ims.core.clinical.domain.objects.CommunityServices domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.CommunityServices
	 */
	 public static ims.core.vo.CommunityServiceVo insert(DomainObjectMap map, ims.core.vo.CommunityServiceVo valueObject, ims.core.clinical.domain.objects.CommunityServices domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CommunityServices(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
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
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// LocationService
		valueObject.setLocationService(ims.core.vo.domain.LocationServiceVoAssembler.create(map, domainObject.getLocationService()) );
		// CurrentFrequency
		valueObject.setCurrentFrequency(domainObject.getCurrentFrequency());
		// Comments
		valueObject.setComments(domainObject.getComments());
		// isCurrentlyActive
		valueObject.setIsCurrentlyActive( domainObject.isIsCurrentlyActive() );
		// SuppliedService
		valueObject.setSuppliedService(ims.core.vo.domain.SuppNetworkServiceProfessionDetailVoAssembler.create(map, domainObject.getSuppliedService()) );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getService()) );
		// DischargeFrequency
		valueObject.setDischargeFrequency(domainObject.getDischargeFrequency());
		// isDischargeService
		valueObject.setIsDischargeService( domainObject.isIsDischargeService() );
		// isServiceInPlace
		valueObject.setIsServiceInPlace( domainObject.isIsServiceInPlace() );
		// ConfirmedDate
		java.util.Date ConfirmedDate = domainObject.getConfirmedDate();
		if ( null != ConfirmedDate ) 
		{
			valueObject.setConfirmedDate(new ims.framework.utils.Date(ConfirmedDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.CommunityServices extractCommunityServices(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommunityServiceVo valueObject) 
	{
		return 	extractCommunityServices(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.CommunityServices extractCommunityServices(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommunityServiceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CommunityServices();
		ims.core.clinical.domain.objects.CommunityServices domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.CommunityServices)domMap.get(valueObject);
			}
			// ims.core.vo.CommunityServiceVo ID_CommunityServices field is unknown
			domainObject = new ims.core.clinical.domain.objects.CommunityServices();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CommunityServices());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.CommunityServices)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.CommunityServices) domainFactory.getDomainObject(ims.core.clinical.domain.objects.CommunityServices.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CommunityServices());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		ims.core.admin.domain.objects.ClinicalContact value3 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value3 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getClinicalContact();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value3);
		domainObject.setLocationService(ims.core.vo.domain.LocationServiceVoAssembler.extractLocationService(domainFactory, valueObject.getLocationService(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCurrentFrequency() != null && valueObject.getCurrentFrequency().equals(""))
		{
			valueObject.setCurrentFrequency(null);
		}
		domainObject.setCurrentFrequency(valueObject.getCurrentFrequency());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		domainObject.setIsCurrentlyActive(valueObject.getIsCurrentlyActive());
		domainObject.setSuppliedService(ims.core.vo.domain.SuppNetworkServiceProfessionDetailVoAssembler.extractSuppNetworkServiceProfessionDetail(domainFactory, valueObject.getSuppliedService(), domMap));
		domainObject.setService(ims.core.vo.domain.ServiceLiteVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDischargeFrequency() != null && valueObject.getDischargeFrequency().equals(""))
		{
			valueObject.setDischargeFrequency(null);
		}
		domainObject.setDischargeFrequency(valueObject.getDischargeFrequency());
		domainObject.setIsDischargeService(valueObject.getIsDischargeService());
		domainObject.setIsServiceInPlace(valueObject.getIsServiceInPlace());
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getConfirmedDate();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setConfirmedDate(value13);

		return domainObject;
	}

}
