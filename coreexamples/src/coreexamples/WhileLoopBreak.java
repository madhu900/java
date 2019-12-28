package coreexamples;

public class WhileLoopBreak {

	public static void main(String[] args) {
		short whiletotal=0;
		short whileindex=1;
		while(whileindex<=100) {
			if(whileindex==60) {
				break;
			}
			whiletotal+=whileindex;
			whileindex++;
		}
		System.out.println("whilebreak:"+whiletotal);

	}

}
