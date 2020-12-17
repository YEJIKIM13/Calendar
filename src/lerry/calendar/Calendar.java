package lerry.calendar;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		if (A == 2) {
			System.out.println("2월은 28일까지 있습니다.");
		} else if (A == 4 || A == 6 || A == 9 || A == 11) {
			System.out.printf("%d월은 30일까지 있습니다", A);
		} else {
			System.out.printf("%d월은 31일까지 있습니다.", A);
		}
		scanner.close();
		
	}

} 
