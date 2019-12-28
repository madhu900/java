package coreexamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx3 {

	public static void main(String[] args) {
	
		  ArrayList < Character > characters = new ArrayList < Character > ();  
		    characters.add('R');  
		    characters.add('E');  
		    characters.add('A');  
		    characters.add('L');  
		ListIterator < Character > listIterator = characters.listIterator();  
		System.out.println("The letters are listed as : "+characters);  
		       System.out.println("The Previous Index is : " + listIterator.previousIndex());  
		       listIterator.next();     
		       System.out.println("The Previous Index is : " + listIterator.previousIndex());  
		       listIterator.next();  
		       System.out.println("The Next Index is : " + listIterator.previousIndex());  
		       listIterator.next();  
		       System.out.println("The Next index is : " + listIterator.previousIndex());       
		   }  
		

	}

