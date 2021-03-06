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

package ims.admin.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.configuration.AppUser business object (ID: 1021100004).
 */
public class AppUserShortVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<AppUserShortVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<AppUserShortVo> col = new ArrayList<AppUserShortVo>();
	public String getBoClassName()
	{
		return "ims.core.configuration.domain.objects.AppUser";
	}
	public boolean add(AppUserShortVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, AppUserShortVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(AppUserShortVo instance)
	{
		return col.indexOf(instance);
	}
	public AppUserShortVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, AppUserShortVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(AppUserShortVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(AppUserShortVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		AppUserShortVoCollection clone = new AppUserShortVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((AppUserShortVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public AppUserShortVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public AppUserShortVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public AppUserShortVoCollection sort(SortOrder order)
	{
		return sort(new AppUserShortVoComparator(order));
	}
	public AppUserShortVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new AppUserShortVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public AppUserShortVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.core.configuration.vo.AppUserRefVoCollection toRefVoCollection()
	{
		ims.core.configuration.vo.AppUserRefVoCollection result = new ims.core.configuration.vo.AppUserRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public AppUserShortVo[] toArray()
	{
		AppUserShortVo[] arr = new AppUserShortVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<AppUserShortVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class AppUserShortVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public AppUserShortVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public AppUserShortVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public AppUserShortVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			AppUserShortVo voObj1 = (AppUserShortVo)obj1;
			AppUserShortVo voObj2 = (AppUserShortVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.admin.vo.beans.AppUserShortVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.admin.vo.beans.AppUserShortVoBean[] getBeanCollectionArray()
	{
		ims.admin.vo.beans.AppUserShortVoBean[] result = new ims.admin.vo.beans.AppUserShortVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			AppUserShortVo vo = ((AppUserShortVo)col.get(i));
			result[i] = (ims.admin.vo.beans.AppUserShortVoBean)vo.getBean();
		}
		return result;
	}
	public static AppUserShortVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		AppUserShortVoCollection coll = new AppUserShortVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.admin.vo.beans.AppUserShortVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static AppUserShortVoCollection buildFromBeanCollection(ims.admin.vo.beans.AppUserShortVoBean[] beans)
	{
		AppUserShortVoCollection coll = new AppUserShortVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
