package coreexamples;

public class SonImpl implements FatherI,MotherI {

	public static void main(String[] args) {
		
		FatherI fatherI= new SonImpl();
		float amountFromFather=fatherI.getAmountFromFather(60);
		MotherI motherI= new SonImpl();
		float amountFromMother=motherI.getAmountFromMother(40);
		
		System.out.println("amountfromfather:"+amountFromFather);
		System.out.println("amountfrommother:"+amountFromMother);
		
	
	}
	
	public float getAmountFromFather(int percentage) {
		return(FatherI.credits-FatherI.debits)*percentage/100;
	}
	public float getAmountFromMother(int percentage) {
		return(MotherI.credits-MotherI.debits)*percentage/100;
	}

}
