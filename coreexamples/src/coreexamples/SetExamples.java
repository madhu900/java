package coreexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {

		Set<String> southStates = new TreeSet<String>();
		southStates.add("TG");
		southStates.add("TN");
		//southStates.add(1, "AP");
		southStates.add("KT");
		//southStates.add(3242);
		southStates.add("KR");
		southStates.add("AP");
		southStates.add("AP");
		southStates.add("AP");
		southStates.add("AP");
		//southStates.add(null);
		
		Set<String> northStates = new TreeSet<String>();
		northStates.add("DL");
		northStates.add("MR");
		northStates.add("HR");
		northStates.add("PB");
		northStates.add("OD");
		
		
		Set<String> indiaStates = new TreeSet<String>();
		indiaStates.addAll(northStates);
		indiaStates.addAll(southStates);
		
		Iterator<String> iterator = indiaStates.iterator();
		String stateCode = null;
		while(iterator.hasNext()) {
			stateCode = iterator.next();
			System.out.println(stateCode);
		}
		
		
		
		int size = indiaStates.size();
		
		Set<String> indiaStatesCopy = indiaStates;
		//Set<String> indiaStatesClone = (Set<String>) indiaStates.clone();
		
		boolean contains = indiaStates.contains("AP");
		contains = indiaStates.contains("AG");
		contains = indiaStates.containsAll(southStates);
		
		/*
		 * String element = indiaStates.get(1); int indexOf = indiaStates.indexOf("AP");
		 * int lastIndexOf = indiaStates.lastIndexOf("AP");
		 * 
		 * String removed = indiaStates.remove(1); String oldElement =
		 * indiaStates.set(1, "TS");
		 */
		
		indiaStates.clear();
		
		System.out.println("End");
		
		
		
		
		
		
		
		
	}

}
