package coreexamples;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> states=new TreeMap<String, String>();
		//put method
		//key value pair insertion order is not maintained.
		states.put("AP","ANDHRAPRADESH");
		states.put("TS","TELANGANA");
		states.put("KR","KARNATAKA");
		states.put("TN","TAMILNADU");
		states.put("KR","KERALA");
		//states.put(null,"KERALA");
		System.out.println(states);
		//keys will be same but old value is replaced by new value.
		states.put("TS","TELANG");
		System.out.println(states);
		
		//only keys keyset method.
		
		Set<String> s=states.keySet();
	
		Iterator<String> iterator=s.iterator();
		String key =null;
		String value=null;
		while(iterator.hasNext()) {
			key=iterator.next();
			value=states.get(key);
			System.out.println(key+":"+value);
					
		}
		
		
		System.out.println(s);
		
		//for values values method.
		
		Collection c =states.values();
		iterator = c.iterator();
		while(iterator.hasNext()) {
			value=iterator.next();
			System.out.println(value);
					
		}
		System.out.println(c);
		
		//entryset
		
		Set s2=states.entrySet();
		System.out.println(s2);
		
		//empty method
		
		System.out.println(states.isEmpty());
		
		//size method
		System.out.println(states.size());
		
		//get method
		
		System.out.println(states.get("KR"));
		
		//remove method
		
		states.remove("TG");
		System.out.println(c);
		
		//contains method for key 
		
		System.out.println(states.containsKey("KT"));
		
		//contains method for values
		
		System.out.println(states.containsValue("Kerala"));
		
		states.putAll(states);
		System.out.println(states);
		
		states.putIfAbsent("AD","ANDHRAPRADESH");
		System.out.println(states);
		
		

		}

	


	}


