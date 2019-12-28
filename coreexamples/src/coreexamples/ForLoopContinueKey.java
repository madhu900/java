package coreexamples;

public class ForLoopContinueKey {

	public static void main(String[] args) {
		short fortotal=0;
		for(int index=1;index<=100;index++) {
			if(index==50) {
				continue;
		}
		fortotal+=index;
	}
	System.out.println("for:"+fortotal);
}
	
	
		

	}

