package coreexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorEx2 {

	public static void main(String[] args) {
	
		 List<String>  li = new ArrayList<>();  
         Iterator<String> itr = null;  
         li.add("Programming");  
         li.add("Language");  
         itr = li.listIterator();   
        System.out.println("The list is given as: ");  
         while(itr.hasNext()){  
             System.out.println(itr.next());  
         }   
      }  
   }   

	


