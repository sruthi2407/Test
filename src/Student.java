package collectionsex;

import java.util.Scanner;

public class Student {
	private String name, result;
	private int marks[] = new int[5];
	
	private Student(String nm, int m[])
	{
		name=nm;
		marks=m;
	}
	public static Student getObject(String nm, int m[]) {
		return new Student(nm, m);
	}

	void input() {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter student name :");
		name = sc.nextLine();
		System.out.print("\nEnter 5 subjects marks : ");
		for (i = 0; i < 5; i++) {
			marks[i] = sc.nextInt();
		}
	}

	void validate() {
		result = "PASS";
		for (int x : marks) {
			if (x < 35) {
				result = "FAIL";
				break;
			}
		}
	}

	void displayResult() {
		System.out.print("\nName : " + name);
		System.out.print("\nMarks : ");
		for(int x: marks) {
			System.out.print("  " + x);
		}
		System.out.print("\nResult : " + result); 		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		String s;
		s=name;
		for(int i : marks) {
			s+=" : " +  i;
		}
		return s;
	}
	
	
	
	
}
