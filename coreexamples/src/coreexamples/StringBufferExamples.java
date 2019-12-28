package coreexamples;

public class StringBufferExamples {

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
		
		
		StringBuffer fullname = new StringBuffer("");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.append("Munnangi ");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.append("Yashoda ");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.append("Krishna");
		System.out.println(fullname+", "+fullname.hashCode());
		
		System.out.println("Length: "+fullname.length());
		char charDT;
		for(int index=0; index<fullname.length(); index++) {
			charDT = fullname.charAt(index);
			System.out.println(charDT);
		}
		
		int indexOf = fullname.indexOf("i");
		int lastIndexOf = fullname.lastIndexOf("i");
		
		String subString1 = fullname.substring(0, 9);
		String subString2 = fullname.substring(9);
		
		System.out.println("End");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
