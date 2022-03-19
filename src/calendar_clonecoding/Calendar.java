package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		// 키보드로 두 정수의 입력을 받는다.
		System.out.println("2개의 정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 두 정수를 입력하면 화면에 두 정수의 합을 출력한다.
		System.out.println("두 수의 합은" + (a + b) + "이다");
		sc.close();
	}

}