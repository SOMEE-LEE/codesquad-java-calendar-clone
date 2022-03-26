package calendar_clonecoding;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
	// 정적 메소드들을 만들어, 1월~12월의 윤년/평년 최대 일수들을 각각 순서대로 배열 안에 넣음
	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 입력한 연도가 윤년인지 확인
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0))
			return true;
		else
			return false;
	}

	// 윤년이면 LEAP_MAX_DAYS 메소드를 호출하고, 평년이면 MAX_DAYS 메소드 호출
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	// 가상 달력 (void 메소드인 printCalendar를 만들어 가상의 달력 생성)
	public void printCalendar(int year, int month) {
		System.out.printf("    <<%d년 %d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		// get weekday automatically
		// 1. LocalDate 생성
		LocalDate date = LocalDate.of(year, month, 1);
		// 2. DayOfWeek 객체 구하기
		DayOfWeek dayofweek = date.getDayOfWeek();
		// 3. 숫자 요일 구하기
		int weekday = dayofweek.getValue();

		// 빈 공간(공백)을 넣어 출력
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		// 해당 년도 & 해당 달의 최대 일수 구하기
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;

		// count가 7보다 작으면 delim=count이고 그 외에는 delim=0
		int delim = count < 7 ? count : 0;

		// 첫째 주의 토요일까지 출력
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		// 둘째 주 부터 마지막 주 토요일까지 출력
		count++;
		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

}