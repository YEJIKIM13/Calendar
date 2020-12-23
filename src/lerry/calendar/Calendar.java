package lerry.calendar;
import java.util.Scanner;

	public class Calendar {	
		
		private static final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//getMaxDaysOfMonth() 메소드로 분리
		public int getMaxDaysOfMonth(int month) {
			return maxDays[month - 1];
		}
		public void printSampleCalendar() {
			System.out.println("일 월 화 수 목 금 토");
			System.out.println("--------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
		}
	public static void main(String[] args) {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램 + 반복
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");
		int count = scanner.nextInt();
		
		System.out.println();
		
		System.out.println("월을 입력하세요.");
		for(int i = 1; i <= count; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 1; i <= count; i++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", i, cal.getMaxDaysOfMonth(i));
		}
		scanner.close();
	}

} 
