package com.aaludra.enums;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumDays {
	Day day;

	public EnumDays(Day day) {
		this.day = day;
	}

	public void dayOrder() {
		switch (day) {
		case MONDAY:
			System.out.println("Monday - First day");
			break;
		case FRIDAY:
			System.out.println("Friday - Fifth day");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Week have Seven days");
			break;
		default:
			System.out.println("Midweek");
			break;
		}
	}

	public static void main(String[] args) {
		String s = "SUNDAY";
		EnumDays day = new EnumDays(Day.valueOf(s));
		day.dayOrder();
	}
}
