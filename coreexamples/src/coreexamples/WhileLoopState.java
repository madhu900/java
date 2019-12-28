package coreexamples;

public class WhileLoopState {

	public static void main(String[] args) {
		short whiletotal = 0;
		short whileindex=10;
		while(whileindex<=5) {
			whiletotal+=whileindex;
			whileindex++;
		}
		System.out.println("whiletotal:"+whiletotal);
		}

	}


