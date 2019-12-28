package coreexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
	
		Set<String>cricketGame =new HashSet<String>();
		cricketGame.add("SACHIN");
		cricketGame.add("ROHIT");
		cricketGame.add("DHONI");
		cricketGame.add("SACHIN");
		
		System.out.println( cricketGame);
		System.out.println( cricketGame.contains("SACHIN"));
		
		Iterator<String> iterator=cricketGame.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		cricketGame.clear();
		System.out.println(cricketGame);
		System.out.println(cricketGame.isEmpty());
		System.out.println(cricketGame.size());
		
		
		
		
		
		

	}

}
