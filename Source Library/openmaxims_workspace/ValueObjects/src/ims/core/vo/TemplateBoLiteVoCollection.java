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

package ims.core.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.admin.TemplateBo business object (ID: 1004100008).
 */
public class TemplateBoLiteVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<TemplateBoLiteVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<TemplateBoLiteVo> col = new ArrayList<TemplateBoLiteVo>();
	public String getBoClassName()
	{
		return "ims.core.admin.domain.objects.TemplateBo";
	}
	public boolean add(TemplateBoLiteVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, TemplateBoLiteVo value)
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
	public int indexOf(TemplateBoLiteVo instance)
	{
		return col.indexOf(instance);
	}
	public TemplateBoLiteVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, TemplateBoLiteVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(TemplateBoLiteVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(TemplateBoLiteVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		TemplateBoLiteVoCollection clone = new TemplateBoLiteVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((TemplateBoLiteVo)this.col.get(x).clone());
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
	public TemplateBoLiteVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public TemplateBoLiteVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public TemplateBoLiteVoCollection sort(SortOrder order)
	{
		return sort(new TemplateBoLiteVoComparator(order));
	}
	public TemplateBoLiteVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new TemplateBoLiteVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public TemplateBoLiteVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.core.admin.vo.TemplateBoRefVoCollection toRefVoCollection()
	{
		ims.core.admin.vo.TemplateBoRefVoCollection result = new ims.core.admin.vo.TemplateBoRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public TemplateBoLiteVo[] toArray()
	{
		TemplateBoLiteVo[] arr = new TemplateBoLiteVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<TemplateBoLiteVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class TemplateBoLiteVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public TemplateBoLiteVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public TemplateBoLiteVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public TemplateBoLiteVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			TemplateBoLiteVo voObj1 = (TemplateBoLiteVo)obj1;
			TemplateBoLiteVo voObj2 = (TemplateBoLiteVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.core.vo.beans.TemplateBoLiteVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.core.vo.beans.TemplateBoLiteVoBean[] getBeanCollectionArray()
	{
		ims.core.vo.beans.TemplateBoLiteVoBean[] result = new ims.core.vo.beans.TemplateBoLiteVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			TemplateBoLiteVo vo = ((TemplateBoLiteVo)col.get(i));
			result[i] = (ims.core.vo.beans.TemplateBoLiteVoBean)vo.getBean();
		}
		return result;
	}
	public static TemplateBoLiteVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		TemplateBoLiteVoCollection coll = new TemplateBoLiteVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.core.vo.beans.TemplateBoLiteVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static TemplateBoLiteVoCollection buildFromBeanCollection(ims.core.vo.beans.TemplateBoLiteVoBean[] beans)
	{
		TemplateBoLiteVoCollection coll = new TemplateBoLiteVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}