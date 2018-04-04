package org.dev.warmup;

enum Day {
	Monday, Tueday, Thrusday, Friday, Saturday;
}

public class EnumTest {
	
	Day day = null;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void TypeOfDay (Day day) {
		
		switch (day) {
			case Monday : System.out.println("Mondays are bad");
		}
			
	}
	
	public static void main(String args[]) {
		Day day = Day.Monday;
		EnumTest object = new EnumTest (day);
		object.TypeOfDay(day);
	}

	
}
