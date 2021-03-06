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

package ims.emergency.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class QuickRegistrationType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public QuickRegistrationType()
	{
		super();
	}
	public QuickRegistrationType(int id)
	{
		super(id, "", true);
	}
	public QuickRegistrationType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public QuickRegistrationType(int id, String text, boolean active, QuickRegistrationType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public QuickRegistrationType(int id, String text, boolean active, QuickRegistrationType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public QuickRegistrationType(int id, String text, boolean active, QuickRegistrationType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static QuickRegistrationType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new QuickRegistrationType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (QuickRegistrationType)super.getParentInstance();
	}
	public QuickRegistrationType getParent()
	{
		return (QuickRegistrationType)super.getParentInstance();
	}
	public void setParent(QuickRegistrationType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		QuickRegistrationType[] typedChildren = new QuickRegistrationType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (QuickRegistrationType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof QuickRegistrationType)
		{
			super.addChild((QuickRegistrationType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof QuickRegistrationType)
		{
			super.removeChild((QuickRegistrationType)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		QuickRegistrationTypeCollection result = new QuickRegistrationTypeCollection();
		result.add(QUICK_REG);
		result.add(UNC_UNK_PATIENT);
		result.add(EXP_ARRIVAL);
		result.add(MAJ_INCIDENT);
		return result;
	}
	public static QuickRegistrationType[] getNegativeInstances()
	{
		QuickRegistrationType[] instances = new QuickRegistrationType[4];
		instances[0] = QUICK_REG;
		instances[1] = UNC_UNK_PATIENT;
		instances[2] = EXP_ARRIVAL;
		instances[3] = MAJ_INCIDENT;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[4];
		negativeInstances[0] = "QUICK_REG";
		negativeInstances[1] = "UNC_UNK_PATIENT";
		negativeInstances[2] = "EXP_ARRIVAL";
		negativeInstances[3] = "MAJ_INCIDENT";
		return negativeInstances;
	}
	public static QuickRegistrationType getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static QuickRegistrationType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		QuickRegistrationType[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1291037;
	public static final QuickRegistrationType QUICK_REG = new QuickRegistrationType(-2438, "Quick Registration", true, null, null, Color.Default);
	public static final QuickRegistrationType UNC_UNK_PATIENT = new QuickRegistrationType(-2439, "Unconcious/Unknown Patient", true, null, null, Color.Default);
	public static final QuickRegistrationType EXP_ARRIVAL = new QuickRegistrationType(-2440, "Expected Arrival", true, null, null, Color.Default);
	public static final QuickRegistrationType MAJ_INCIDENT = new QuickRegistrationType(-2441, "Major Incident", true, null, null, Color.Default);
}
