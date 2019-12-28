package coreexamples;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<String> southStates=new Vector<String>();
		
		southStates.add("AP");
		southStates.add("TS");
		southStates.add("KN");
		southStates.add("TN");
		//southStates.add(123);
		southStates.add("KR");
		southStates.add("KR");
		southStates.add(null);
		
		Vector<String> northStates =new Vector<String>();
		
		northStates.add("PB");
		northStates.add("MP");
		northStates.add("MH");
		northStates.add(0,"HR");
		northStates.add("PN");
		
		Vector<String> indiaStates =new Vector<String>();
		indiaStates.addAll(northStates);
		indiaStates.addAll(0,southStates);
		
		Iterator<String> iterator=indiaStates.iterator();
		String statecode=null;
		while(iterator.hasNext()) {
			statecode= iterator.next();
			System.out.println(statecode);
		}
		
		int size=indiaStates.size();
		Vector<String> indiaStatesCopy=indiaStates;
		Vector<String> indiaStatesClone = (Vector<String>) indiaStates.clone();
		
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


