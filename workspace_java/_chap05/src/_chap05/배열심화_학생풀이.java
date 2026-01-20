package _chap05;

import java.util.Scanner;

public class 배열심화_학생풀이 {

	public static void main(String[] args) {
//		a1();
//		a2();
//		a3();
//		a4();
//		a5();
//		a6();
//		a7();
		a8();
	}

	static void a1() {

		int i = 0;
		int j = 0;
		char[] password = new char[8];

		int count = 0;
		for (i = 0; i < 2; i++) { // 숫자 두개 일단 생성
			password[count] = (char) ((int) (Math.random() * 10) + 48);
			count++;
		}
		password[count] = (char) ((int) (Math.random() * 26) + 97); // 소문자 하나 생성
		count++;
		password[count] = (char) ((int) (Math.random() * 26) + 65); // 대문자 하나 생성
		count++;

		for (j = count; j < password.length; j++) { // 남은 자리 랜덤 생성
			int tp = (int) (Math.random() * 3); // 0~2까지 랜덤으로 뽑아서

			if (tp == 0) { // tp가 0이면 숫자 생성
				password[j] = (char) ((int) (Math.random() * 10) + 48);
			} else if (tp == 1) { // tp가 1이면 소문자 생성
				password[j] = (char) ((int) (Math.random() * 26) + 97);
			} else { // tp가 2면 대문자 생성
				password[j] = (char) ((int) (Math.random() * 26) + 65);
			}
		}

		for (i = 0; i < password.length; i++) { // 나온 것들 섞기
			int k = (int) (Math.random() * password.length);
			// 변수 k를 배열 수가 랜덤으로 나오게 저장
			char han = password[i]; // i일때 변수로 저장
			password[i] = password[k]; // 랜덤으로 나온 한개를 i번째로 저장
			password[k] = han; // 변수로 저장했던 i번째를 k번째로 저장
		}

		System.out.print("임시 비밀번호: ");
		for (i = 0; i < password.length; i++) {
			System.out.print(password[i]);
		}

	}

	static void a2() {
		// 문제 10-3
		// 가위(카운트1)/바위(카운트2)/보(카운트3), 카운트 충족 시키면 깃발 들어
		// 카운트(조건) 충족 못시키면 깃발 안들기.
		System.out.println("문제 10-3 임시 비밀번호 8자리 : ");
		int[] pw = new int[8];
		int count1, count2, count3;

		boolean flag = false;

		while (!flag) {

			count1 = 0;
			count2 = 0;
			count3 = 0;

			// 배열 8자리 메우면서
			for (int j = 0; j < 8; j++) {
				// 0,1,2중 랜덤 뽑기
				int gbb = (int) (Math.random() * 3);

				// 가위,바위,보 시작
				if (gbb == 0) {
					int num = (int) (Math.random() * 10); // 0이면 숫자
					pw[j] = num;
					count1++;
				} else if (gbb == 1) {
					int aaa = (int) ((Math.random() * 26) + 97); // 1이면 소문자
					pw[j] = aaa;
					count2++;
				} else if (gbb == 2) {
					int AAA = (int) ((Math.random() * 26) + 65); // 2는 대문자
					pw[j] = AAA;
					count3++;
				}

				// 고스톱 시작
				if (count1 >= 2 && count2 >= 1 && count3 >= 1) {
					flag = true;
				}
			}
			if (flag) {
				for (int l = 0; l < 8; l++) {
					// 정교하진 않음 (대충 10 이상이면 char 변환)
					if (pw[l] > 10) {
						System.out.print((char) pw[l]);
						// 숫자 출력
					} else {
						System.out.print(pw[l]);
					}
				}
			}
		}

		System.out.println();
		System.out.println("========================================================");
	}

	static void a3() {
		int[] pw2 = new int[8];
		int cc1 = 0;
		int cc2 = 0;
		int cc3 = 0;
		for (int j = 0; j <= 1; j++) {
			for (int i = 0; i < pw2.length; i++) {
				int seat = (int) (Math.random() * 8);
				if (seat < 3) {
					pw2[i] = (int) (Math.random() * 10) + 48;
					cc1++;
				} else if (seat < 5) {
					pw2[i] = (int) (Math.random() * 26) + 65;
					cc2++;
				} else {
					pw2[i] = (int) (Math.random() * 26) + 97;
					cc3++;
				}
			}
			if (cc1 >= 2 && cc2 >= 1 && cc3 >= 1) {
				System.out.print("pw2: [ ");
				for (int i = 0; i < pw2.length; i++) {
					System.out.print((char) pw2[i] + " ");
				}
				System.out.println("]");
				break;
			} else {
				cc1 = 0;
				cc2 = 0;
				cc3 = 0;
				j--;
				System.out.println(10000);
			}
		}
	}

	static void a4() {
		int i = 0;
		int[] seats = new int[10];
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예약 2. 모든 좌석 현황 3. 잔여 좌석 0. 종료");
			System.out.println("------------------------------");

			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				System.out.println("선택>" + menu);
				System.out.println("좌석을 선택하세요");
				int sn = scanner.nextInt();
				if (seats[sn - 1] == 1) {
					System.out.println(sn + "번 좌석은 이미 예약되었습니다.");
				} else {
					seats[sn - 1] = 1; // 예약 처리
					System.out.println(sn + "번 좌석이 예약되었습니다.");
				}
			} else if (menu == 2) {
				System.out.println("모든 좌석 현황");
				for (i = 0; i < seats.length; i++) {
					if (seats[i] == 0) {
						System.out.println((i + 1) + "(예약가능)");
					} else {
						System.out.println((i + 1) + "(예약석)");
					}
				}
			} else if (menu == 3) {
				System.out.println("잔여 좌석입니다");
				for (i = 0; i < seats.length; i++) {
					if (seats[i] == 0) {
						System.out.print((i + 1) + " ");
					}
				}
				System.out.println();
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("메뉴를 다시 입력해주세요");
			}

		}
	}

	static void a5() {
		boolean[] ticket = new boolean[10];

		Scanner scan = new Scanner(System.in);

		do {
			// 잔여좌석

			int tcnt = 0;
			for (int i = 0; i < ticket.length; i++) {
				if (!ticket[i])
					tcnt++;
			}
			System.out.println("1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료");
			int num = scan.nextInt();
			if (num == 0) {
				System.out.println("종료 합니다.");
				break;
			} else if (num == 1) {
				if (tcnt > 0) {
					for (int i = 0; i < ticket.length; i++) {
						if (ticket[i] == false) {
							ticket[i] = true;
							System.out.println(i + "번 자리 예약 되었습니다");
							break;
						}
					}
				} else {
					System.out.println("전좌석 매진 입니다.");
				}
			} else if (num == 2) {
				System.out.println("-----------------좌석 현황-----------------");
				for (int i = 0; i < ticket.length; i++) {
					System.out.print(", " + i + " : " + ((ticket[i]) ? "예약" : "가능"));
				}
				System.out.println();
			} else if (num == 3) {
				System.out.println("잔여 수량:" + tcnt + " , ");
			}
			System.out.println();
		} while (true);
	}

	static void a6() {
		Scanner ss = new Scanner(System.in);

		int[] seat = new int[10];
		int le = 1;
		int les;
		while (le != 0) {
			System.out.println();
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println("메뉴| | 1. 예약| 2 모든 좌석 현황| 3. 잔여 좌석| 0. 종료|");
			System.out.println("---------------------------------------------------------");
			le = ss.nextInt();

			if (le == 1) {
				System.out.println("예약할 좌석번호를 입력해주세요.");
				les = ss.nextInt();
				if (seat[les - 1] == 0) {
					seat[les - 1] = 1;
					System.out.println((les) + "번 자리 예약되었습니다.");
				} else {
					System.out.println("이미 예약된 좌석입니다.");
				}
			} else if (le == 2) {
				System.out.println("모든 좌석 현황: ");
				for (int i = 0; i < seat.length; i++) {
					System.out.println((i + 1) + "번 좌석 " + seat[i] + " ");
				}
			} else if (le == 3) {
				System.out.println("잔여 좌석: ");
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 0) {
						System.out.println((i + 1) + "번 좌석 " + seat[i] + " ");
					}
				}
			} else if (le == 0) {
				System.out.println("이용해주셔서 감사합니다.");
			} else {
				System.out.println("0, 1, 2, 3번 중 하나를 입력해주세요.");
			}
		}
		System.out.println("System을 종료합니다.");
	}

	static void a7() {
		Scanner scan = new Scanner(System.in);
		int[] vnum = new int[10];
		int menu = 1;
		int input;
		for (int a = 0; a < vnum.length; a++) {
			vnum[a] = 0;
		}
		System.out.println("================메뉴===============");
		System.out.println("1. 예약 | 2.모든 좌석 현황 | 3.잔여 좌석 | 0.종료");
		System.out.println("==============문제11번==============");
		input = scan.nextInt();
		while (input != 0) {

			while (input < 0 || input > 3) {
				System.out.print("잘못 입력 하였습니다. 다시 입력하세요.");
				input = scan.nextInt();
				if (input == 0)
					break;
			}
			switch (input) {
			case 1:
				System.out.println("예약 하실 좌석의 번호를 입력해 주세요.");
				int menu1 = scan.nextInt();
				while (menu1 > vnum.length || menu1 < 1) {
					System.out.print("존재하지 않는 좌석번호입니다. 다시 입력해 주세요");
					menu1 = scan.nextInt();
				}
				while (vnum[menu1 - 1] == 1) {
					System.out.println("이미 예약되어 있는 좌석입니다. 다시 입력해 주세요");
					menu1 = scan.nextInt();
					while (menu1 > vnum.length || menu1 < 1) {
						System.out.print("존재하지 않는 좌석번호입니다. 다시 입력해 주세요");
						menu1 = scan.nextInt();
					}
				}
				while (menu1 < 1 || menu1 > vnum.length) {
					System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
					menu1 = scan.nextInt();
				}
				if (vnum[menu1 - 1] == 0) {
					vnum[menu1 - 1] = 1;
					System.out.println("예약이 완료 되었습니다. 감사합니다.");
					System.out.println("================메뉴===============");
					System.out.println("1. 예약 | 2.모든 좌석 현황 | 3.잔여 좌석 | 0.종료");
					System.out.println("==============문제11번==============");
				}
				break;

			case 2:
				System.out.println("좌석 현황");
				for (int i = 0; i < vnum.length; i++) {
					if (vnum[i] == 0) {
						System.out.println(i + 1 + "번 좌석: 예약가능 ╰(*°▽°*)╯");
					} else {
						System.out.println(i + 1 + "번 좌석: 예약 불가능 ಥ_ಥ ");
					}
				}
				System.out.println("================메뉴===============");
				System.out.println("1. 예약 | 2.모든 좌석 현황 | 3.잔여 좌석 | 0.종료");
				System.out.println("==============문제11번==============");
				break;

			case 3:
				System.out.println("예약이 가능한 좌석 번호는");
				boolean first = true;
				for (int i = 0; i < vnum.length; i++) {
					if (vnum[i] == 0) {
						if (!first) {
							System.out.print(", ");
						}
						System.out.print(i + 1 + "번");
						first = false;
					}
				}
				System.out.println("입니다.");
				System.out.println("================메뉴===============");
				System.out.println("1. 예약 | 2.모든 좌석 현황 | 3.잔여 좌석 | 0.종료");
				System.out.println("==============문제11번==============");
				break;

			case 0:
				System.out.println("종료되었습니다.");
			}// 스위치문
			input = scan.nextInt();
		}
		System.out.println("종료되었습니다.");
	}

	static void a8() {
		int i = 0, j = 0;
		int temp = 0;
		System.out.println("-----문제12-----");
		int[] lotto = new int[6];

		for (i = 0; i < lotto.length; i++) { // lotto[0]~[5] 까지
			// 1~45 중에서 랜덤 넣기
			lotto[i] = (int) ((Math.random() * 45) + 1);

			// 중복 없애기
			for (j = 0; j < i; j++) { // 0~(i-1)
				if (lotto[i] == lotto[j]) { // lotto[i] 일때 lotto[0]~ 비교
					i--; // 다시 뽑기
					break; // i로 돌아가기
				}
			}
		}
		// 정렬해보기
		temp = 0;
		for (i = 0; i < lotto.length - 1; i++) { // i + 1 < lotto.length
			// 가장 작은 수부터 for문 사이클마다 점점 앞쪽으로 정렬됨
			// 버블정렬이었나?
			for (j = 0; j < lotto.length - 1 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					temp = lotto[j]; // 앞의 수가
					lotto[j] = lotto[j + 1]; // 바로 뒤의 수보다 크면
					lotto[j + 1] = temp; // 서로 위치 바꾸기
				}
			}

		}
		// 출력
		int k = 0;
		System.out.print("로또 번호: [");
		for (k = 0; k < lotto.length; k++) {
			if (k < lotto.length - 1) {
				System.out.print(lotto[k] + ", ");
			} else {
				System.out.print(lotto[k]);
			}
		}
		System.out.println("]");
	}

	static void a9() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int in = (int) (Math.random() * 45) + 1;
			// 값이 있는지 무한 반복
			boolean boo = true;
			int chk = 0;
			while (boo) {
				if (lotto[chk] == in) {
					in = (int) (Math.random() * 45) + 1;
				} else {
					chk++;
				}
				if (chk == lotto.length - 1)
					break;
			}
			lotto[i] = in;
			System.out.println(lotto[i]);
		}
	}
}
