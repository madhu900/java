package coreexamples;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSort {

	public static void main(String[] args) {
		Map<String,String> cricket =new TreeMap<String,String>();
		
		cricket.put("SA","SACHIN");
		cricket.put("RO","ROHIT");
		cricket.put("DH","DHONI");
		cricket.put("KO","KOHLI");
		cricket.put("BM","BUMRAH");
		//cricket.put(null,"BUMRAH");
	   System.out.println(cricket);
	   cricket.put("RO","ROHI");
		System.out.println(cricket);
		
		Set<String> str=cricket.keySet();
		
		Iterator<String> iterator=str.iterator();
		String key =null;
		String value=null;
		while(iterator.hasNext()) {
			key=iterator.next();
			value=cricket.get(key);
			System.out.println(key+":"+value);
					
		}
		
		System.out.println(str);
		
		Collection c =cricket.values();
		iterator = c.iterator();
		while(iterator.hasNext()) {
			value=iterator.next();
			System.out.println(value);
		
		
	}
		System.out.println(c);
		
		System.out.println(cricket.isEmpty());
		
		System.out.println(cricket.size());
		
		System.out.println(cricket.get("SA"));
		
		cricket.remove("RO");
		System.out.println(c);
		
		System.out.println(cricket.containsKey("BM"));
		
		System.out.println(cricket.containsKey("SA"));
		
		System.out.println(cricket.containsValue("BUMRAH"));
		
		cricket.putIfAbsent("AD","DHONI");
		System.out.println(cricket);
		
		cricket.putAll(cricket);
		System.out.println(cricket);
		

	}
}
