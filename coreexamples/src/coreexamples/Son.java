package coreexamples;

//extends: To derive the behavior from super to sub class
public class Son extends Father {

	public static void main(String[] args) {
		Father father = new Son();
		
		float amountToSon = father.getAmount(60);
		System.out.println("amountToSon: "+amountToSon);
	}

	//super: To access the super class properties and methods
	@Override
	float getAmount(int percentage) {
		return (super.credits - super.debits) * percentage / 100;
	}

}
