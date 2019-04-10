package collectionsex;

import java.util.ArrayList;

public class MyTimeMain {

	public static void main(String[] args) {
		ArrayList<MyTime> time = new ArrayList<MyTime>();
		time.add(MyTime.getObject(55, 55, 55));
		time.add(MyTime.getObject());
		time.add(MyTime.getObject(65, 21, 45));
		time.add(MyTime.getObject(15, 24, 64));
		System.out.print(time);
		
		MyTime temp=null;
		for(MyTime t : time) {
			if(t.getMinutes()==55) {
				temp=t;
				break;
			}			
		}
		if(temp!=null) {
			time.remove(temp);
			System.out.print(time);
		}
		else {
			System.out.print("\n" + "Not Found");
		}
		
	}

}
