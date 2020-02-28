package com.org.acpgimini.collection;

public class CustomList {
String[] list;
int pointer=0;                                                                                  
public CustomList()
{
	list  =new String[10];
}
public CustomList(int size) {
 list=new String[size];
}

public String get(int index)
{
  return list[index];
}
public boolean contain(String element)
{
	boolean flag=false;
	for (int i = 0; i < list.length; i++) {
		if (flag) {
			
		
		flag=true;
		return flag;
	}
		}
	return flag;
}
public void add(String element)
{
 if(pointer>=list.length-2) {
	 list[pointer] =element;
	 pointer++;
 }else {
	String[] newList=new String[list.length+6];
	System.arraycopy(list, 0, newList, 0, list.length);
	list=newList;
	list[pointer]=element;
	pointer++;
}
 }
public int getIndex(String element)
{
for (int i = 0; i < list.length; i++) {
	if (list[i].equalsIgnoreCase(element)) {
		return i;
	}
}
return -1;
}

public int size()
{
int size=0;
 {
	for (int i = 0; i < list.length; i++) {
		if (list[i]==null) {
			return size;
		}else {
			size++;
		}
		
	}
}
return size;
}
}
