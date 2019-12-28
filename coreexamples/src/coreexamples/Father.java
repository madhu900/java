package coreexamples;

public abstract class Father {

	float credits = 1000000;
	float debits = 300000;
	
	//abstract: Incomplete behavior
	abstract float getAmount(int percentage);
	
}
