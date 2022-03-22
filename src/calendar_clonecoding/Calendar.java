package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	// 1월~12월의 최대 일수들을 순서대로 배열 안에 넣음
	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// MAX_DAYS 정적 메소드를 만들고 1월~12월의 최대 일수들을 순서대로 배열 안에 넣음
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

// 가상 달력 샘플 (void 메소드인 printSampleCalendar를 만들어 가상의 달력 생성)
	public void printSampleCalendar() {
		System.out.println("  일 월  화  수  목 금  토");
		System.out.println("----------------------");
		System.out.println("  1  2  3  4  5  6  7");
		System.out.println("  8  9 10 11 12 13 14");
		System.out.println(" 15 16 17 18 19 20 21");
		System.out.println(" 22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		// 자바의 Calendar 클래스를 cal이라는 이름으로 생성
		Calendar cal = new Calendar();
		// 반복횟수를 입력하라는 문구를 출력하고, repeat이라는 변수로 숫자를 입력받음
		System.out.println("반복횟수를 입력하세요.");
		int repeat = sc.nextInt();

		// 정수 i를 0으로 설정하고, repeat에 입력한 수보다 작으면 1씩 증가시킨다.
		for (int i = 0; i < repeat; i++) {
			// 달을 입력하라는 문구를 출력하고, month라는 변수로 숫자를 입력받음
			System.out.println("달을 입력하세요");
			int month = sc.nextInt();
			// 입력한 월에 대한 최대 일수를 출력
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
		}

		// "Bye~" 문구 출력
		System.out.println("Bye~");
		/*
		 * 메인 메소드에서 Calendar 클래스인 cal 뒤에, 위의 void 메소드인 printSampleCalendar를 호출하여 가상 달력
		 * 샘플 출력
		 */
		cal.printSampleCalendar();
		// 스캐너 닫기
		sc.close();
	}

}