package coreexamples;

public class StringBuilderEx {

	public static void main(String[] args) {
		String s1="abc";
		String s2=new String("Abc");
		
		System.out.println(s1.hashCode()+" and "+s2.hashCode());
		if (s1==s2) {
			System.out.println("hashcode references  are same");
		}
		if(s1.equals(s2)) {
			System.out.println("values are same and it is case sensitive");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("values are same and it is case insensitive");
		
		}
		
		StringBuilder fullname=new StringBuilder("");
		System.out.println(fullname+","+fullname.hashCode());
		
		fullname.append("kamireddy");
		System.out.println(fullname+","+fullname.hashCode());
		
		fullname.append("Madhu");
		System.out.println(fullname+","+fullname.hashCode());
		
		fullname.delete(0,4);
		System.out.println(fullname+","+fullname.hashCode());
		
		fullname.reverse();
		System.out.println(fullname+","+fullname.hashCode());
		
		fullname.replace(0,7,"javaclass");
		System.out.println(fullname+","+fullname.hashCode());
		
		fullname.insert(1,"javaclass");
		System.out.println(fullname+","+fullname.hashCode());
	
		fullname.deleteCharAt(1);
		System.out.println(fullname+","+fullname.hashCode());
		
		fullname.append("sudhan");
		System.out.println(fullname+","+fullname.hashCode());
		
		System.out.println("Length:"+fullname.length());
		char charDT;
		for(int index=0;index<fullname.length();index++) {
			 charDT=fullname.charAt(index);
			System.out.println(charDT);
		}
		
		
		int indexOf=fullname.indexOf("d");
		int lastIndexOf=fullname.lastIndexOf("d");
		
		String subString1=fullname.substring(0,9);
		String subString2=fullname.substring(9);
		
		System.out.println("End");
		
		
		
		
		
		
		

		

	


	}
}
