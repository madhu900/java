package coreexamples;

public class DatatypeExamples {

	public static void main(String[] args) {
        byte stateid = 123;
        short empid = 12345;
        int intid = 123456;
        long longid = 123456789l;
        float floatid = 123456799.00000f;
        double doubleid = 123456464.1564555122d;
        char gender ='M';
        boolean issuccess = true;
        if (issuccess) {
        	System.out.println("it is success");
        }
        if (gender =='M') {
        	System.out.println("Male");
        }else {
        	System.out.println("Female");
        }
        short studentmarks = 500;
        String grade ="";
        if (studentmarks >=550) {
        	grade ="A+";
        }else if (studentmarks >=500) {
        	grade ="A";
        }else if (studentmarks >=450) {
        	grade ="B+";
        }else if (studentmarks >=400) {
        	grade ="B";
        }else if (studentmarks >=350) {
        	grade ="C";
        }else {
        	grade ="NA";
        }
        System.out.println("student Marks: "+studentmarks);
        System.out.println("Grade: "+grade);
        	
        	
        }
	}


