package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		// Ű����� �� ������ �Է��� �޴´�.
		System.out.println("2���� ������ �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// �� ������ �Է��ϸ� ȭ�鿡 �� ������ ���� ����Ѵ�.
		System.out.println("�� ���� ����" + (a + b) + "�̴�");
		sc.close();
	}

}