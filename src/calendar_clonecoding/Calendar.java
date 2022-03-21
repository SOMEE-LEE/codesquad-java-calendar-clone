package calendar_clonecoding;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받은 달의 최대 일수를 화면에 출력한다.
		System.out.println("최대 일수를 알고 싶은 월을 입력하세요: ");
		// 입력받을 달을 month라는 변수로 설정
		int month = sc.nextInt();
		// 월별 최대 일수를 배열에 저장
		int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 0 이하의 숫자나 12보다 큰 숫자 입력 시 출력할 문구
		if (month <= 0 || month > 12) {
			System.out.printf("\n%d월은 없습니다.", month);

			// 정상적으로 1~12사이의 숫자를 입력하면 출력할 문구
		} else {
			System.out.println("반복횟수를 입력하세요: ");
		}

		// n번 반복 출력이 가능하게 한다.
		// 입력받을 반복 횟수를 repeat이라는 변수로 설정
		int repeat = sc.nextInt();
		// 0이하의 숫자 입력 시 출력할 문구
		if (repeat <= 0) {
			System.out.printf("\n%d번 반복은 할 수 없습니다.", repeat);
		}

		// 문장 반복 출력을 위해 새로 변수를 만들고 값을 1로 설정
		int num = 1;
		// 위의 넘 변수++로 repeat에 입력한 반복횟수만큼 아래 문장을 출력함
		while (repeat != 0 && repeat >= num) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month - 1]);
			num++;
		}
		sc.close();
	}
}