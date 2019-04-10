package collectionsex;

import java.util.ArrayList;

import oops.Time;

public class ArrayListex {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<Character> ar1 = new ArrayList<Character>();
		ArrayList<Float> ar2 = new ArrayList<Float>();
		ArrayList<Time> ar3 = new ArrayList<Time>();
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		ar.add("ABCD");
		System.out.print("\n" + ar);
		ar1.add('G');
		System.out.print("\n" + ar1);
		ar2.add(25.8f);
		System.out.print("\n" + ar2);
		ar3.add(new Time(40, 50, 60));
		System.out.print("\n" + ar3);
		ar4.add(1234);
		System.out.print("\n" + ar4);
		
}

}
