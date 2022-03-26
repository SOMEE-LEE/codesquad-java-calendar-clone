package calendar_clonecoding;

import java.util.Scanner;

public class Prompt {
	int month = 0;
	int year = 0;

	public void runPrompt() {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �ڹ��� Calendar Ŭ������ �̸��� ���ؼ� ����
		Calendar cal = new Calendar();

		// Ƚ���� ������� �ʴ� �ݺ� - while���� true�� ����Ͽ� ���ѷ���
		while (true) {
			// �⵵�� �Է��϶�� ������ ������Ʈ ���� �� Ŀ�� ���, year��� ������ �⵵�� �ش��ϴ� ���ڸ� �Է¹���
			System.out.println("�⵵�� �Է��ϼ���. (exit: -1)");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			if (year == -1)
				break;

			// ���� �Է��϶�� ������ ������Ʈ ���� �� Ŀ�� ���, month��� ������ �޿� �ش��ϴ� ���ڸ� �Է¹���
			System.out.println("���� �Է��ϼ���");
			System.out.print("MONTH> ");
			month = sc.nextInt();

			// month�� 12���� ũ�ų� 1���� ���� ��� ���α׷� �ٽ� ���� (������ ó������ ���ư�)
			if (month > 12 || month < 1) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			// ���� �޼ҵ忡�� Calendar Ŭ������ cal �ڿ�, void �޼ҵ� printCalendar�� ȣ���Ͽ� ���� �޷� ���
			cal.printCalendar(year, month);
		}

		// "Bye~" ���� ���
		System.out.println("Bye~");
		// ��ĳ�� �ݱ�
		sc.close();
	}

	public static void main(String[] args) {
		// �� ����
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
