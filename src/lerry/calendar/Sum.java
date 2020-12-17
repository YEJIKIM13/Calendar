package lerry.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 입력: 키보드로 두 수의 입력을 받는다.
		// 출력: 화면에 두 수의 합을 출력한다.
		System.out.println("두 수를 입력하세요.");
		
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();
		String input2 = scanner.next();

		a = Integer.parseInt(input1);
		b = Integer.parseInt(input2);
		
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b);
		scanner.close();
	}

}
