package coreexamples;

public class MainStudent {

	public static void main(String[] args) {
		OopsStudent student = new OopsStudent();
		
		student.setId(1);
		student.setName("admin");
		student.setGender('M');
		
		student.setHindimarks(80);
		student.setTelugumarks(96);
		
		student.setMathsmarks(92);
		student.setSciencemarks(85);
		student.setSocialmarks(80);
		
		System.out.println("ID:"+student.getId());
		System.out.println("NAME:"+student.getName());
		System.out.println("GENDER:"+student.getGender());
		
		System.out.println("HINDIMARKS:"+student.getHindimarks());
		System.out.println("TELUGUMARKS:"+student.getTelugumarks());
		
		System.out.println("MATHSMARKS:"+student.getMathsmarks());
		System.out.println("SCIENCEMARKS:"+student.getSciencemarks());
		System.out.println("SOCIALMARKS:"+student.getSocialmarks());
		
		MainStudent mainStudent = new MainStudent();
		int languagemarks=mainStudent.getTotal(student.getHindimarks(),
				                      student.getTelugumarks());
		int nonlanguagemarks=mainStudent.getTotal(student.getMathsmarks(),
				                         student.getSciencemarks(), 
				                         student.getSocialmarks());
		System.out.println("language marks:"+languagemarks);
		System.out.println("nonlanguage marks:"+nonlanguagemarks);

	}
	
	public int getTotal(int hindi,int telugu) {
		return hindi+telugu;
	}
		
		public int getTotal(int maths,int science,int social) {
		return maths+science+social;
	}

}
