package coreexamples;

public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			
	String i=null;
	System.out.println(i.length());
		}catch(NullPointerException e) {
			System.out.println("nullpointerexception");
		}


	}

}
