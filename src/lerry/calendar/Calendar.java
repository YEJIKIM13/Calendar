package lerry.calendar;
import java.util.Scanner;

	public class Calendar {	
		
		private static final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//getMaxDaysOfMonth() 메소드로 분리
		public int getMaxDaysOfMonth(int month) {
			return maxDays[month - 1];
		}
		public static void printSampleCalendar28() {
			System.out.println("일 월 화 수 목 금 토");
			System.out.println("--------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
		}
		public static void printSampleCalendar30() {
			System.out.println("일 월 화 수 목 금 토");
			System.out.println("--------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30");
		}
		public static void printSampleCalendar31() {
			System.out.println("일 월 화 수 목 금 토");
			System.out.println("--------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30 31");
		}
	public static void main(String[] args){
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램 + 반복
		String prompt = "> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 0;
		while (true) {
			System.out.println("월을 입력하세요");
			System.out.print(prompt);
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {	
				printSampleCalendar31();
			} else if(month==2) {
				printSampleCalendar28();
			} else {
				printSampleCalendar30();
			}
		}
		System.out.println("Bye~");
		scanner.close();
	}

} 
