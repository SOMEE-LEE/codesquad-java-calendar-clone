package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �Է¹��� ���� �ִ� �ϼ��� ȭ�鿡 ����Ѵ�.
		System.out.println("�ִ� �ϼ��� �˰� ���� ���� �Է��ϼ���: ");
		// �Է¹��� ���� month��� ������ ����
		int month = sc.nextInt();
		// ���� �ִ� �ϼ��� �迭�� ����
		int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 0 ������ ���ڳ� 12���� ū ���� �Է� �� ����� ����
		if (month <= 0 || month > 12) {
			System.out.printf("\n%d���� �����ϴ�.", month);

			// ���������� 1~12������ ���ڸ� �Է��ϸ� ����� ����
		} else {
			System.out.println("�ݺ�Ƚ���� �Է��ϼ���: ");
		}

		// n�� �ݺ� ����� �����ϰ� �Ѵ�.
		// �Է¹��� �ݺ� Ƚ���� repeat�̶�� ������ ����
		int repeat = sc.nextInt();
		// 0������ ���� �Է� �� ����� ����
		if (repeat <= 0) {
			System.out.printf("\n%d�� �ݺ��� �� �� �����ϴ�.", repeat);
		}

		// ���� �ݺ� ����� ���� ���� ������ ����� ���� 1�� ����
		int num = 1;
		// ���� �� ����++�� repeat�� �Է��� �ݺ�Ƚ����ŭ �Ʒ� ������ �����
		while (repeat != 0 && repeat >= num) {
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, maxDays[month - 1]);
			num++;
		}
		sc.close();
	}
}