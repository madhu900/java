package coreexamples;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableEx {

	public static void main(String[] args) {
		
       Hashtable<Integer,String> h =new Hashtable<Integer,String>();
       Hashtable<Integer,String> h1=new Hashtable<Integer,String>();
       
       h.put(1,"MADHU");
       h.put(2,"SUDHAN");
       h.put(3,"REDDY");
       
       h1=(Hashtable<Integer,String>)h.clone();
       System.out.println("values in clone:"+h1);
       
       h.clear();
       System.out.println("after clearing:"+h);
       
       System.out.println(h1.size());
       
       System.out.println(h1.get(1));
    
      
		
       
       
	}
	
	
     

}
