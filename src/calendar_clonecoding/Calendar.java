package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		// �޿� �ش��ϴ� ���ڸ� �Է¹޴´�.
		System.out.println("�ִ� �ϼ��� �˰� ���� ���� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// �Է¹��� ���� �ִ� �ϼ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, maxDays[month - 1]);
		sc.close();
	}

}