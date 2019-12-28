package coreexamples;

public class WrapperClassEx {

	public static void main(String[] args) {
	int intDT2=255;
	byte byteDT2=(byte)intDT2;
	System.out.println("byteDT2:"+byteDT2);
	
	if(intDT2>=Byte.MIN_VALUE && intDT2<=Byte.MAX_VALUE) {
	byte byteDT3 =Byte.parseByte(""+intDT2);
	System.out.println("Byte converted value:"+byteDT3);
	}

	}

}
