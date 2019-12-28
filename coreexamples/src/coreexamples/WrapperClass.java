package coreexamples;

public class WrapperClass {

	public static void main(String[] args) {
		Integer testMarks=null;
		
		if(testMarks==null) {
			System.out.println("Absent");
		}
		else if(testMarks>90) {
			System.out.println("Selected");
		}else if(testMarks>50) {
			System.out.println("pass but not selected");
		}else
			System.out.println("Failed");
	}
		
		

	}


