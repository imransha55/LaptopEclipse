package org.jsp.collection;

import java.util.Collections;

public class ArrayList 
{ //AllPrograms Project
	//https://www.w3resource.com/java-exercises/collection/index.php
	public static void main(String[] args) {
		java.util.ArrayList<String> col=new java.util.ArrayList<String>();
		java.util.ArrayList<String> copycol=new java.util.ArrayList<String>();
		java.util.ArrayList<String> c1c2=new java.util.ArrayList<String>();
		col.add("red");
		col.add("Black");
		col.add("Green");
		col.add("Coffee");
		copycol.add("volt");
		copycol.add("white");
		copycol.add("Balck");
		
		System.out.println(col);
		for(String element : col) 
		{
			System.out.println("Iterating using'String element : col' "+element);
		}
		col.add(0, "blue");
		System.out.println(col);
		System.out.println("Element at given index is using .get():"+col.get(2));
		col.set(1, "gray");
		System.out.println("Setting Gray at index(1) using .set()"+col);
		col.remove(0);
		System.out.println("After Removing Element using .remove()"+col);
		Collections.copy(col,copycol);
		System.out.println("Copycol elements added to col,Elemewnts in col"+col);
		Collections.shuffle(col);
		System.out.println("Elements after shuffling elements in col using Collections.shuffle(col): "+col);
		Collections.reverse(col);
		System.out.println("Reversing the col list using .reverse() "+col);
		System.out.println("Elements at Given index(0,3) using col.sublist(index,index): "+col.subList(0,3));
		/*System.out.println("----Comparing two array---");
		java.util.ArrayList<String> com=new java.util.ArrayList<String>();
		for (String e:col)
		{
			com.add(copycol.contains(e) ? "Yes":"No");
			System.out.println(com);	
		}*/
		System.out.println(col);
		System.out.println("Swaping Collections.swap(list,index,index)");
		Collections.swap(col, 0, 1);
		System.out.println(col);
		System.out.println("---Merging Two Arrays--");
		c1c2.addAll(col);
		c1c2.addAll(copycol);
		System.out.println("After adding col n copycol arraylists in c1c2: "+c1c2);
		System.out.println("--Cloning col into clon --");
		Object clon = col.clone();
		System.out.println("Elements of clon: "+clon);
		c1c2.removeAll(c1c2);
		System.out.println("After Removing all Elements from c1c2 using removeAll(): "+c1c2);
		System.out.println("IS c1c2 is empty: "+c1c2.isEmpty());
		System.out.println("is col isEmpty: "+col.isEmpty());
		System.out.println("Let Trim to size using trimToSize()");
		col.trimToSize();
		System.out.println(col);
		System.out.println("Increasing capacity: using col.ensureCapacity(7) ");
		col.ensureCapacity(7);
		col.set(2, "fullbalck");
		System.out.println(col);
		System.out.println("to print all the elements of a ArrayList using the position of the elements.");
		for (int i = 0; i < col.size(); i++)
		{
			System.out.println(col.get(i));
			
		}
		
		 
		
	}

}
