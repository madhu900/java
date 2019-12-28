package coreexamples;

public class ExceptionExample {

	public static void main(String[] args) {
	System.out.println("start");
	int totalmarks=550;
	int totalsubjects=0;
	float averagemarks=0;
	String errormsg="";
	try {
		//System.out.println("to write doughtable code");
		averagemarks=totalmarks/totalsubjects;
	}catch(ArithmeticException ae) {
		//System.out.println("to catch and handle the exception");
		errormsg="program had issue at this moment.please try again later..";
	}finally {
		//System.out.println("to close the object refrences and can be called always");
	}
	if(errormsg!="") {
		System.out.println(errormsg);
	}else {
		System.out.println("averagemarks:"+averagemarks);
	}
	System.out.println("end");
		
	}

	}


