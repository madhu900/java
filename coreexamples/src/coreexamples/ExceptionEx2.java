package coreexamples;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("start");
		int totalmarks=500;
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
	static float getAvgMarks(int totalmarks,int totalsubjects) {
		float averagemarks=0;
		try {
			averagemarks=totalmarks/totalsubjects;
		}catch(ArithmeticException ae) {
			throw ae;
		}catch(Exception ex) {
			throw ex;
		}
		return averagemarks;
		
		}
	}
		



