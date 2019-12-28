package coreexamples;

public class StudentCompare implements Comparable<StudentCompare> {
	
	private int id;
	private String name;
	
	StudentCompare(){
	
	}
	
	StudentCompare(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
	 this.id=id;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(StudentCompare other) {
		
		if(this.id>other.id) {
			return 1;
		
		}else if(this.id<other.id){
			return -1;
		}else {
			return 0;
		}
			
	}
		
}		
	



