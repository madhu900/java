package coreexamples;

public class WrapperEx3 {

	public static void main(String[] args) {
		
		String studentMarks="50";
		int marks=Integer.parseInt(studentMarks);
		System.out.println("Marks:"+marks);
		
		Integer testMarks=0;
		
		
		
		if(testMarks==null) {
			System.out.println("NO Grade");
		}
		else if(testMarks>90) {
			System.out.println("A+");
		}else if(testMarks>50) {
			System.out.println("B");
		}else
			System.out.println("C");
	}
		

	}


