package calendar_clonecoding;

import java.util.Scanner;

public class Prompt {

	int month = 0;
	int year = 0;

	public static void runCommand() {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);

		System.out.println("+-----------------+");
		System.out.println("| 1. ���� ���");
		System.out.println("| 2. ���� �˻�");
		System.out.println("| 3. ���� �޷� ����");
		System.out.println("| h. ����  q. ����");
		System.out.println("+-----------------+");

		System.out.println("����� �Է��ϼ��� (1, 2, 3, h, q)");
		System.out.print("COMMAND> ");
		String command = sc.nextLine();

		Prompt p = new Prompt();

		if (command.equals("1")) {
			System.out.println("���� ���");
		} else if (command.equals("2")) {
			System.out.println("���� �˻�");
		} else if (command.equals("3")) {
			p.runPrompt();
		} else if (command.equals("h")) {
			System.out.println("����");
		} else if (command.equals("q")) {
			System.out.println("\nBye~");
			// ��ĳ�� �ݱ�
			sc.close();
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			System.out.println("\n����� �Է��ϼ��� (1, 2, 3, h, q)");
			System.out.print("COMMAND> ");
			command = sc.nextLine();
		}
	}

	public void runPrompt() {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �ڹ��� Calendar Ŭ������ �̸��� ���ؼ� ����
		Calendar cal = new Calendar();

		// Ƚ���� ������� �ʴ� �ݺ� - while���� true�� ����Ͽ� ���ѷ���
		while (true) {
			// �⵵�� �Է��϶�� ������ ������Ʈ ���� �� Ŀ�� ���, year��� ������ �⵵�� �ش��ϴ� ���ڸ� �Է¹���
			System.out.println("\n�⵵�� �Է��ϼ���. (exit: -1)");
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

		System.out.println("Bye~");
		// ��ĳ�� �ݱ�
		sc.close();
	}

	public static void main(String[] args) {
		// ������Ʈ Ŭ���� ����
		runCommand();
	}

}
