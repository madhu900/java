package coreexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {

		List<String> southStates = new ArrayList<String>();
		southStates.add("TG");
		southStates.add("TN");
		southStates.add(1, "AP");
		southStates.add("KT");
		//southStates.add(3242);
		southStates.add("KR");
		southStates.add("AP");
		//southStates.add(null);
		
		List<String> northStates = new ArrayList<String>();
		northStates.add("DL");
		northStates.add("MR");
		northStates.add("HR");
		northStates.add("PB");
		northStates.add(0, "OD");
		
		
		ArrayList<String> indiaStates = new ArrayList<String>();
		indiaStates.addAll(northStates);
		indiaStates.addAll(0, southStates);
		
		Collections.sort(indiaStates);
		
		Iterator<String> iterator = indiaStates.iterator();
		String stateCode = null;
		while(iterator.hasNext()) {
			stateCode = iterator.next();
			System.out.println(stateCode);
		}
		
		
		
		int size = indiaStates.size();
		
		List<String> indiaStatesCopy = indiaStates;
		List<String> indiaStatesClone = (List<String>) indiaStates.clone();
		
		boolean contains = indiaStates.contains("AP");
		contains = indiaStates.contains("AG");
		contains = indiaStates.containsAll(southStates);
		
		String element = indiaStates.get(1);
		int indexOf = indiaStates.indexOf("AP");
		int lastIndexOf = indiaStates.lastIndexOf("AP");
		
		String removed = indiaStates.remove(1);
		String oldElement = indiaStates.set(1, "TS");
		
		indiaStates.clear();
		
		System.out.println("End");
		
		
		
		
		
		
		
		
	}

}
