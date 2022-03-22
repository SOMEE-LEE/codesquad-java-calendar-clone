package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	// 1��~12���� �ִ� �ϼ����� ������� �迭 �ȿ� ����
	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// MAX_DAYS ���� �޼ҵ带 ����� 1��~12���� �ִ� �ϼ����� ������� �迭 �ȿ� ����
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	// ���� �޷� ���� (void �޼ҵ��� printSampleCalendar�� ����� ������ �޷� ����)
	public void printSampleCalendar() {
		System.out.println("  �� ��  ȭ  ��  �� ��  ��");
		System.out.println("----------------------");
		System.out.println("  1  2  3  4  5  6  7");
		System.out.println("  8  9 10 11 12 13 14");
		System.out.println(" 15 16 17 18 19 20 21");
		System.out.println(" 22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		// ���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�

		// ����� ������Ʈ ����
		String PROMPT = "cal> ";
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �ڹ��� Calendar Ŭ������ �̸��� ���ؼ� ����
		Calendar cal = new Calendar();

		int month = 1;

		// Ƚ���� ������� �ʴ� �ݺ� - while���� true�� ����Ͽ� ���ѷ���
		while (true) {
			// ���� �Է��϶�� ������ ���
			System.out.println("���� �Է��ϼ���");
			// ������Ʈ ���� �� Ŀ�� ���
			System.out.print(PROMPT);
			// month��� ������ ���ڸ� �Է¹���
			month = sc.nextInt();
			// month�� -1�� �Է��Ұ�� ���α׷� ����
			if (month == -1) {
				break;
			}
			// month�� 12���� Ŭ ��� ���α׷� �ٽ� ���� (������ ó������ ���ư�)
			if (month > 12) {
				continue;
			}
			// �Է��� ���� ���� �ִ� �ϼ��� ���
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, cal.getMaxDaysOfMonth(month));
		}

		// "Bye~" ���� ���
		System.out.println("Bye~");
		/*
		 * ���� �޼ҵ忡�� Calendar Ŭ������ cal �ڿ�, ���� void �޼ҵ��� printSampleCalendar�� ȣ���Ͽ� ���� �޷�
		 * ���� ���
		 */
		cal.printSampleCalendar();
		// ��ĳ�� �ݱ�
		sc.close();
	}

}