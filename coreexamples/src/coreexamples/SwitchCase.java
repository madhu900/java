package coreexamples;

public class SwitchCase {

	public static void main(String[] args) {
		char grade='C';
		
		switch(grade) {
		case 'A' :
			System.out.println("Marvellous");
			break;
		case 'B' :
			System.out.println("Excellent");
			break;
		case 'C':
			System.out.println("well done");
			break;
		case 'D':
			System.out.println("Not bad");
			break;
		case 'E':
		   System.out.println("passed");
		   break;
		case 'F':
			System.out.println("try again");
			break;
		default:
				System.out.println("Invalid grade");
		}
		System.out.println("grade is:"+grade);
		
	}

		
		}


	


