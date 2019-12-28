package coreexamples;

public class StringExamples {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("Abc");
		
		//hashcode: Memory location address of the object
		System.out.println(s1.hashCode()+" and "+s2.hashCode());
		
		if(s1 == s2) {
			System.out.println("Hashcode references are same");
		}
		if(s1.equals(s2)) {
			System.out.println("Values are same and it is case sensitive");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Values are same and it is case insesitive");
		}
		
		
		String fullname = "";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname = fullname +"Munnangi ";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname += "Yashoda ";
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname = fullname.concat("Krishna");
		System.out.println(fullname+", "+fullname.hashCode());
		
		System.out.println("Length: "+fullname.length());
		char charDT;
		for(int index=0; index<fullname.length(); index++) {
			charDT = fullname.charAt(index);
			System.out.println(charDT);
		}
		
		int indexOf = fullname.indexOf("i");
		int lastIndexOf = fullname.lastIndexOf("i");
		
		boolean contains = fullname.contains("ngi");
		contains = fullname.contains("ewrewrrew");
		
		String replace = fullname.replace(" ", ",");
		
		String[] split = fullname.split(" ");
		
		String subString1 = fullname.substring(0, 9);
		String subString2 = fullname.substring(9);
		
		System.out.println("End");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
