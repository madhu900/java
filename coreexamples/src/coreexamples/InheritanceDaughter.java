package coreexamples;

public class InheritanceDaughter extends InheritanceFather {

	public static void main(String[] args) {
		InheritanceFather father=new InheritanceDaughter();
		float amountToDaughter=father.getAmount(40);
		System.out.println("amountToDaughter:"+amountToDaughter);
	}
	float getAmount(int percentage) {
		return(super.credits-super.debits)*percentage/100;
	}


}
