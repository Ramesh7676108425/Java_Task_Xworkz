package com.xworkz.enums.constant;

public class MonthsRunner {
	
	public static void main(String args[]) {
		
		Months months=Months.JUNE;
//	String	m=Months.APRIL.toString();
		System.out.println(months);
		switch (months) {
		case JANURAY:
			System.out.println("this month is januray");
			break;
		
		
		case FEBUARY:
			System.out.println("this month is feb");
			break;
		
		case MARCH:
			System.out.println("this month is march");
			break;
		case APRIL:
			System.out.println("this month is april");
			break;
		case MAY:
			System.out.println("this month is may");
			break;
			
			
	  default:
		  System.out.println("this is default case");
			
			
			
	}

}
}