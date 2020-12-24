package lerry.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "> ";
	
	public void runPrompt() {
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
			cal.printSampleCalendar(2021, month);
			
		}
		System.out.println("Bye~");
		scanner.close();
	}
	
	public static void main(String[] args){
		//셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
	}

}
