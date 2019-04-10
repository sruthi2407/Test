package collectionsex;

import java.util.ArrayList;
import java.util.Collections;


public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student> ();
		st.add(Student.getObject("Sruthi", new int[] {55,65,35,95,45}));
		
		st.add(Student.getObject("Akshay", new int[] {55,65,35,95,45}));		
	
		st.add(Student.getObject("Naveen", new int[] {55,65,35,95,45}));		
		
		st.add(Student.getObject("Prasanth", new int[] {55,65,35,95,45}));		
		System.out.println(st);
		
		
		
		
		
	}

}
