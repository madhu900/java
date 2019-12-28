package coreexamples;

public class WrapperClassEx2 {

	public static void main(String[] args) {
	Float percentMarks=null;
	
	System.out.println("percent:"+percentMarks);
	
	if(percentMarks==null) {
		System.out.println("NO Grade");
	}
	else if(percentMarks<=90) {
		System.out.println("A+");
	}else if(percentMarks>50) {
		System.out.println("B");
	}else
		System.out.println("C");
}
	
	




	}


