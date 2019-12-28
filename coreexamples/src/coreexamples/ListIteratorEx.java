package coreexamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
	
		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("A");  
		arrlist.add("BB");  
		arrlist.add("CCC");  
		arrlist.add("DDDD");  
		arrlist.add("EEEEE");  
		System.out.println(arrlist);     
		  
		ListIterator<String> iterator = arrlist.listIterator(2);  
		while (iterator.hasNext())  
		{  
		String i = iterator.next();  
		System.out.println(i);  
		}  
		}  

	}


