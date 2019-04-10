package collectionsex;

import java.util.Scanner;

public class MyTime {

	private int hours, minutes, seconds;
	
	private MyTime() { // default constructor - No params
		this(5,10,20);			
		/*hours=5;
		minutes=10;
		seconds=20;*/
	}
	
	private MyTime(int h, int m, int s) { // overloaded constructor - 3 params
		System.out.print("\nMyTime - Overloaded constuctor...");
		hours=h;
		minutes=m;
		seconds=s;		
	}
	public static MyTime getObject() {
		return new MyTime();
	}
	
	public static MyTime getObject(int h, int m, int s) {
		return new MyTime(h, m, s);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter hours, minutes and seconds : ");
		hours = sc.nextInt();
		minutes = sc.nextInt();
		seconds = sc.nextInt();
	}
	
	private void align() {
		//
		if(seconds>=60) {
			minutes = minutes + (seconds/60);
			seconds= seconds%60;
		}
		if(minutes>=60) {
			hours = hours + (minutes/60);
			minutes = minutes%60;
		}	
	}
	
	public void display() {
		align();
		System.out.print("\n" + hours + " : " + minutes + " : " + seconds);		
	}

	
	
	

	// setters
	// class variable = parameter variable
	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	// getters
	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
	
	@Override
	public String toString() {
		String s;
		align();
		s=hours+ ":" + minutes + ":" + seconds;	
		return s;
	}
	
	
	
}
