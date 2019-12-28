package coreexamples;

public class InheritanceSon extends InheritanceFather {

	public static void main(String[] args) {
		InheritanceFather father=new InheritanceSon();
		float amountToSon=father.getAmount(60);
		System.out.println("amountToSon:"+amountToSon);
		
	}
	
	float getAmount(int percentage) {
		return(super.credits-super.debits)*percentage/100;
		
	}

}

