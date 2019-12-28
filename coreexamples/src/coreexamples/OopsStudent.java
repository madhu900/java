package coreexamples;

public class OopsStudent {
	public int getId() {
		return id;
	}
	//this: To access current class properties and methods
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getHindimarks() {
		return hindimarks;
	}
	public void setHindimarks(int hindimarks) {
		this.hindimarks = hindimarks;
	}
	public int getTelugumarks() {
		return telugumarks;
	}
	public void setTelugumarks(int telugumarks) {
		this.telugumarks = telugumarks;
	}
	public int getMathsmarks() {
		return mathsmarks;
	}
	public void setMathsmarks(int mathsmarks) {
		this.mathsmarks = mathsmarks;
	}
	public int getSciencemarks() {
		return sciencemarks;
	}
	public void setSciencemarks(int sciencemarks) {
		this.sciencemarks = sciencemarks;
	}
	public int getSocialmarks() {
		return socialmarks;
	}
	public void setSocialmarks(int socialmarks) {
		this.socialmarks = socialmarks;
	}
	private int id;
	private String name;
	private char gender;
	
	private int hindimarks;
	private int telugumarks;
	
	private int mathsmarks;
	private int sciencemarks;
	private int socialmarks;
	

}
