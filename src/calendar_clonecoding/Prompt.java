package calendar_clonecoding;

import java.util.Scanner;

public class Prompt {
	int month = 0;
	int year = 0;

	public void runPrompt() {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		// 자바의 Calendar 클래스를 이름을 정해서 생성
		Calendar cal = new Calendar();

		// 횟수가 사라지지 않는 반복 - while문에 true를 사용하여 무한루프
		while (true) {
			// 년도를 입력하라는 문구와 프롬프트 문자 및 커서 출력, year라는 변수로 년도에 해당하는 숫자를 입력받음
			System.out.println("년도를 입력하세요. (exit: -1)");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			if (year == -1)
				break;

			// 달을 입력하라는 문구와 프롬프트 문자 및 커서 출력, month라는 변수로 달에 해당하는 숫자를 입력받음
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = sc.nextInt();

			// month가 12보다 크거나 1보다 작을 경우 프로그램 다시 실행 (루프의 처음으로 돌아감)
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			// 메인 메소드에서 Calendar 클래스인 cal 뒤에, void 메소드 printCalendar를 호출하여 가상 달력 출력
			cal.printCalendar(year, month);
		}

		// "Bye~" 문구 출력
		System.out.println("Bye~");
		// 스캐너 닫기
		sc.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
