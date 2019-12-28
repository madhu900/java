package coreexamples;

public class DoWhileLoopState {

	public static void main(String[] args) {
		int dowhiletotal=0;
		int dowhileindex=10;
		do {
			dowhiletotal+=dowhileindex;
			dowhileindex++;
		}while(dowhileindex<=5);
		System.out.println("dowhile:"+dowhiletotal);

	}

}
