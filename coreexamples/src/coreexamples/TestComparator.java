package coreexamples;

import java.util.*;


public class TestComparator {

	public static void main(String[] args) {
		ArrayList< StudentComparator> al=new ArrayList< StudentComparator>();    
		  al.add(new  StudentComparator(5,"MADHU",50));    
		  al.add(new  StudentComparator(7,"SUDHAN",40));    
		  al.add(new  StudentComparator(9,"REDDY",90));   
		
		  Comparator< StudentComparator> cm1=Comparator.comparing( StudentComparator::getName);  
		   Collections.sort(al,cm1);  
		   System.out.println("Sorting by Name");  
		   for( StudentComparator st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
		 
		    Comparator< StudentComparator> cm2=Comparator.comparing( StudentComparator::getAge);  
		Collections.sort(al,cm2);  
		   System.out.println("Sorting by Age");  
		   for( StudentComparator st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }    
		  }    
		  }    

	

