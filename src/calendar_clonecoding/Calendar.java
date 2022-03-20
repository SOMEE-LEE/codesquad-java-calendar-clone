package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		// 달에 해당하는 숫자를 입력받는다.
		System.out.println("최대 일수를 알고 싶은 달을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 입력받은 달의 최대 일수를 화면에 출력한다.
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month - 1]);
		sc.close();
	}

}