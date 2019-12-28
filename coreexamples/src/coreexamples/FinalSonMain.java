package coreexamples;

public class FinalSonMain extends FinalFather {

	public static void main(String[] args) {
		
		FinalFather father = new FinalSonMain() ;
		float amountToSon=father.getAmount(60);
	System.out.println("amounttoson:"+amountToSon);
	}
		
		
			float getAmount(int percentage) {
				//super.credits=200000;
				return(super.credits-super.debits)*percentage/100;
			}
		
		
	

}
