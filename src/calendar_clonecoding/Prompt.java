package calendar_clonecoding;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {

	int month = 0;
	int year = 0;

	public static void runCommand() {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);

		System.out.println("+-----------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 일정 달력 보기");
		System.out.println("| h. 도움말  q. 종료");
		System.out.println("+-----------------+");

		System.out.println("명령을 입력하세요 (1, 2, 3, h, q)");
		System.out.print("COMMAND> ");
		String command = sc.nextLine();

		if (command.equals("1")) {
			System.out.println("[일정 등록] 날짜를 입력하세요.(ex.2020-01-01)\n>");
			String theDate = sc.nextLine();

			HashMap<String, ArrayList<String>> listMap = new HashMap<String, ArrayList<String>>();

			// 오늘 날짜
			String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			// 오늘 날짜를 년, 월, 일로 나눔
			String[] toDate = today.split("-");

			// 기존의 일정이 없다면, 빈 ArrayList를 추가
			if (!listMap.containsKey(theDate)) {
				ArrayList<String> emptyList = new ArrayList<String>();
				listMap.put(theDate, emptyList);
			}

			// 기존의 일정이 있다면, 일정을 추가로 등록
			System.out.print("[일정 등록] 일정을 입력하세요. \n>");
			String theList = sc.nextLine();

			ArrayList<String> existList = listMap.get(theDate);

			existList.add(theList);
			listMap.put(theDate, existList);

		} else if (command.equals("2")) {
			System.out.println("일정 검색");
		} else if (command.equals("3")) {
			Prompt p = new Prompt();
			p.runPrompt();
		} else if (command.equals("h")) {
			System.out.println("도움말");
		} else if (command.equals("q")) {
			System.out.println("\nBye~");
			// 스캐너 닫기
			sc.close();
		} else {
			System.out.println("잘못된 입력입니다.");
			System.out.println("\n명령을 입력하세요 (1, 2, 3, h, q)");
			System.out.print("COMMAND> ");
			command = sc.nextLine();
		}
	}

	public void runPrompt() {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		// 자바의 Calendar 클래스를 이름을 정해서 생성
		Calendar cal = new Calendar();

		// 횟수가 사라지지 않는 반복 - while문에 true를 사용하여 무한루프
		while (true) {
			// 년도를 입력하라는 문구와 프롬프트 문자 및 커서 출력, year라는 변수로 년도에 해당하는 숫자를 입력받음
			System.out.println("\n년도를 입력하세요. (exit: -1)");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			if (year == -1)
				break;

			// 달을 입력하라는 문구와 프롬프트 문자 및 커서 출력, month라는 변수로 달에 해당하는 숫자를 입력받음
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = sc.nextInt();

			// month가 12보다 크거나 1보다 작을 경우 프로그램 다시 실행 (루프의 처음으로 돌아감)
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			// 메인 메소드에서 Calendar 클래스인 cal 뒤에, void 메소드 printCalendar를 호출하여 가상 달력 출력
			cal.printCalendar(year, month);
		}

		System.out.println("Bye~");
		// 스캐너 닫기
		sc.close();
	}

	public static void main(String[] args) {
		// 프롬프트 클래스 실행
		runCommand();
	}

}
