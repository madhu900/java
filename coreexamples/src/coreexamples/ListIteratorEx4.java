package coreexamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx4 {

	public static void main(String[] args) {
		
		 ArrayList < String > vehicles = new ArrayList < String > ();       
	        vehicles.add("Car");  
	        vehicles.add("Truck");  
	        vehicles.add("Bike");  
	        vehicles.add("Cycle");  
	        System.out.println("The list for the vehicles is given as :"+vehicles);  
	        ListIterator < String > listIterator = vehicles.listIterator();  
	        System.out.println("Before remove() method is called. : " + vehicles);  
	        listIterator.next();  
	        listIterator.next();  
	        listIterator.remove();  
	        System.out.println("After remove() method is called.: " + vehicles);  
	    }  
	

	}


