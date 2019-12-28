package coreexamples;

public class ExceptionEx3 {

	public static void main(String[] args) {
	System.out.println("start");
	int totalmarks=550;
	int totalsubjects=0;
	float averagemarks=0;
	String errormsg="";
	try {
		averagemarks=getAvgMarks(totalmarks,totalsubjects);
	}catch(ArithmeticException ae) {
		errormsg="program had issue at this moment.please try again later..";
	}catch(Exception ae) {
		errormsg="program had issue at this moment.please try again later..";
	}finally {
	}
	if(errormsg!="") {
		System.out.println(errormsg);
	}else {
		System.out.println("average marks:"+averagemarks);
	}
	System.out.println("end");
	}
	static float getAvgMarks(int totalmarks,int totalsubjects)throws ArithmeticException,Exception{
		return totalmarks/totalsubjects;
	}
	}


