package coreexamples;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableEx2 {

	public static void main(String[] args) {
		Hashtable<String, String> states=new Hashtable<String, String>();
		
		states.put("AP","ANDHRAPRADESH");
		states.put("TS","TELANGANA");
		states.put("KR","KARNATAKA");
		states.put("TN","TAMILNADU");
		states.put("KR","KERALA");
		//states.put(null,"KERALA");
		
		
		
		Set<String> s=states.keySet();
	
		Iterator<String> iterator=s.iterator();
		String key =null;
		String value=null;
		while(iterator.hasNext()) {
			key=iterator.next();
			value=states.get(key);
			System.out.println(key+":"+value);
					
		}
		
		
		boolean containskey = states.containsKey("AP");
		System.out.println("containkey:"+containskey);
		
		boolean containsvalue=states.containsValue("ANDHRAPRADESH");
		System.out.println("containsvalue:"+containsvalue);
		
		boolean remove=states.remove("KR", "KERALA");
		System.out.println("remove:"+remove);
		
		String replace=states.replace("KR", "SOUTH");
		System.out.println("replace:"+replace);
		
		boolean empty=states.isEmpty();
		System.out.println("empty:"+empty);
		
		
	

		}

	


	}




	


