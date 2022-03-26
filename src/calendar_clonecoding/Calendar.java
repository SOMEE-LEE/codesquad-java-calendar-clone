package calendar_clonecoding;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
	// ���� �޼ҵ���� �����, 1��~12���� ����/��� �ִ� �ϼ����� ���� ������� �迭 �ȿ� ����
	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// �Է��� ������ �������� Ȯ��
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0))
			return true;
		else
			return false;
	}

	// �����̸� LEAP_MAX_DAYS �޼ҵ带 ȣ���ϰ�, ����̸� MAX_DAYS �޼ҵ� ȣ��
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	// ���� �޷� (void �޼ҵ��� printCalendar�� ����� ������ �޷� ����)
	public void printCalendar(int year, int month) {
		System.out.printf("    <<%d�� %d��>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		// get weekday automatically
		// 1. LocalDate ����
		LocalDate date = LocalDate.of(year, month, 1);
		// 2. DayOfWeek ��ü ���ϱ�
		DayOfWeek dayofweek = date.getDayOfWeek();
		// 3. ���� ���� ���ϱ�
		int weekday = dayofweek.getValue();

		// �� ����(����)�� �־� ���
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		// �ش� �⵵ & �ش� ���� �ִ� �ϼ� ���ϱ�
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;

		// count�� 7���� ������ delim=count�̰� �� �ܿ��� delim=0
		int delim = count < 7 ? count : 0;

		// ù° ���� ����ϱ��� ���
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		// ��° �� ���� ������ �� ����ϱ��� ���
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