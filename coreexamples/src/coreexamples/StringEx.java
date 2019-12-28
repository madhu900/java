package coreexamples;

public class StringEx {

	public static void main(String[] args) {
	String s1="abc";
	String s2= new String("Abc");
	System.out.println(s1.hashCode()+" and "+s2.hashCode());
	
	if(s1==s2) {
		System.out.println("hashcode references are same");
	}
	if(s1.equals(s2)) {
		System.out.println("values are same and it is case sensitive");
	}
	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("values are same and it is insensitive");
	}
	
	String fullname="";
	System.out.println(fullname+", "+fullname.hashCode());
	fullname=fullname+"Kamireddy";
	System.out.println(fullname+","+fullname.hashCode());
	fullname+="Madhu";
	System.out.println(fullname+","+fullname.hashCode());
	fullname=fullname.concat("Sudhan");
	System.out.println(fullname+","+fullname.hashCode());
	
	
	System.out.println("Length:"+fullname.length());
	char charDT;
	
	for (int index=0;index<fullname.length();index++) {
		charDT=fullname.charAt(index);
		System.out.println(charDT);
	}
	
	int indexOf=fullname.indexOf("d");
	int lastIndexOf=fullname.lastIndexOf("d");
	
	boolean contains=fullname.contains("dhu");
	contains=fullname.contains("hdjhds");
	
	String replace=fullname.replace("",",");
	String[] split=fullname.split("");
	
	String subString1=fullname.substring(0,9);
	String subString2=fullname.substring(9);
	
	String upper=fullname.toUpperCase();
	
	System.out.println("End");
	
	
	
	
		


	}

}
