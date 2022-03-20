package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		// 달에 해당하는 숫자를 입력받는다.
		System.out.println("최대 일수를 알고 싶은 달을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int days[] = { 29, 30, 31 };

		// 입력받은 달의 최대 일수를 화면에 출력한다.
		if (month == 2) {
			System.out.printf("2월의 최대 일수는 %d일이다.", days[0]);
		} else if (month > 2 && month % 2 == 0) {
			System.out.printf("%d월의 최대 일수는 %d일이다.", month, days[1]);
		} else if (month % 2 == 1) {
			System.out.printf("%d월의 최대 일수는 %d일이다.", month, days[2]);
		}

		sc.close();
	}

}