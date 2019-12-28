package coreexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMainCompare {

	public static void main(String[] args) {
		List< StudentCompare> students=new ArrayList< StudentCompare>();
		
		students.add(new StudentCompare(3,"KOHLI"));
		students.add(new StudentCompare(2,"ROHIT"));
		students.add(new  StudentCompare(4,"DHONI"));
		students.add(new  StudentCompare(5,"RAINA"));
		students.add(new  StudentCompare(6,"YUVRAJ"));
		students.add(new  StudentCompare(7,"PRAVEEN"));
		students.add(new  StudentCompare(1,"SACHIN"));
		
		Collections.sort(students);
		
		Iterator<StudentCompare> studentIterator=students.iterator();
		
		StudentCompare student=null;
		while(studentIterator.hasNext()) {
			student=studentIterator.next();
			System.out.println(student.getId()+","+student.getName());
		}
		

	}

}
