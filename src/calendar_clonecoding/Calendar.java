package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		// �޿� �ش��ϴ� ���ڸ� �Է¹޴´�.
		System.out.println("�ִ� �ϼ��� �˰� ���� ���� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int days[] = { 29, 30, 31 };

		// �Է¹��� ���� �ִ� �ϼ��� ȭ�鿡 ����Ѵ�.
		if (month == 2) {
			System.out.printf("2���� �ִ� �ϼ��� %d���̴�.", days[0]);
		} else if (month > 2 && month % 2 == 0) {
			System.out.printf("%d���� �ִ� �ϼ��� %d���̴�.", month, days[1]);
		} else if (month % 2 == 1) {
			System.out.printf("%d���� �ִ� �ϼ��� %d���̴�.", month, days[2]);
		}

		sc.close();
	}

}