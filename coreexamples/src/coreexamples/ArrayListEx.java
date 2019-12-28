package coreexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
	List<String> southStates=new ArrayList<String>();
	
	southStates.add("AP");
	southStates.add("TS");
	southStates.add("KN");
	southStates.add("TN");
	//southStates.add(123);
	southStates.add("KR");
	southStates.add("KR");
	southStates.add(null);
	
	List<String> northStates =new ArrayList<String>();
	
	northStates.add("PB");
	northStates.add("MP");
	northStates.add("MH");
	northStates.add(0,"HR");
	northStates.add("PN");
	
	ArrayList<String> indiaStates =new ArrayList<String>();
	indiaStates.addAll(northStates);
	indiaStates.addAll(0,southStates);
	
	Iterator<String> iterator=indiaStates.iterator();
	String statecode=null;
	while(iterator.hasNext()) {
		statecode= iterator.next();
		System.out.println(statecode);
	}
	
	int size=indiaStates.size();
	List<String> indiaStatesCopy=indiaStates;
	List<String> indiaStatesClone = (List<String>) indiaStates.clone();
	
	boolean contains= indiaStates.contains("AP");
	contains=indiaStates.contains("AB");
	contains=indiaStates.containsAll(southStates);
	
	String element=indiaStates.get(1);
	int indexof=indiaStates.indexOf("AP");
	int lastIndexOf=indiaStates.lastIndexOf("TS");
	
	String remove=indiaStates.remove(1);
	String oldElement=indiaStates.set(1, "TS");
	
	indiaStates.clear();
	
	
	System.out.println("End");
	
	}

	}


