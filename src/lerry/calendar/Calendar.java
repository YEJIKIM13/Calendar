package lerry.calendar;
import java.util.Scanner;

	public class Calendar {	
		public static int year;
		public static int month;
		private static final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		private static final int[] leapMaxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		public static boolean isLeapYear(int year) {
			if(year % 4 ==0 && (year % 100 !=0 || year % 400 == 0)) {
			return true;
			} else {
			return false;
			}
		}
		//getMaxDaysOfMonth() 메소드로 분리
		public static int getMaxDaysOfMonth(int year, int month) {
			if(isLeapYear(year)) {
				return leapMaxDays[month - 1];
			} else {
				return maxDays[month - 1];
			}
		}
		public static void printSampleCalendar(int year, int month) {
			System.out.printf("      <<%4d%3d>> \n", year, month);
			System.out.println(" SU MO TU WE TH FR SA");
			System.out.println(" --------------------");
			
			//최대 일수를 나타내고 싶은 새로운 변수
			int maxDay = getMaxDaysOfMonth(year, month);
			for(int i = 1; i <= maxDay; i++) {
				System.out.printf("%3d", i);	
				if (i % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			
			
//			System.out.println(" 1  2  3  4  5  6  7");
//			System.out.println(" 8  9 10 11 12 13 14");
//			System.out.println("15 16 17 18 19 20 21");
//			System.out.println("22 23 24 25 26 27 28");
		}
		
} 
