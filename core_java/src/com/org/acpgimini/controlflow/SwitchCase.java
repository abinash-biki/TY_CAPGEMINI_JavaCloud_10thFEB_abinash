package com.org.acpgimini.controlflow;

public class SwitchCase {
	public static void main(String[] args) {
		String day="monday";
	switch (day) {
	case "monday":
		System.out.println("weekday");
          break;
	case "tuesday":
		System.out.println("weekday");
          break;
     case "wed":
		System.out.println("weekday");
        break;

	default:
		System.out.println("invalid");
		break;
	}
	}

}
