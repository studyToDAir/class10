package _chap04;

import java.util.Scanner;

public class Pyramid_03_1 {

	public static void main(String[] args) {
		/*
		 * ___+___ __+++__ _+++++_ +++++++
		 */
		// 1단계
		// +++++
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
		}

		// 2단계
		// +_+_+_+_+_
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
			System.out.print("_");
		}

		// 3단계
		// +++++
		// +++++
		// +++++
		// 총 3번
		for (int i = 1; i <= 3; i++) {
			// 한줄 찍고
			for (int j = 1; j <= 5; j++) {
				System.out.print("+");
			}
			// 엔터
			System.out.println();
		}

		// 4단계
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 5단계
		// 1
		// 22
		// 333
		// 4444
		// 55555
		// 첫번째 줄에 한개
		// 2번째 줄에 2개
		// 3번째 줄에 3개
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 6단계
		// +
		// ++
		// +++
		// ++++
		// +++++
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// 7단계
		// 11111
		// 2222
		// 333
		// 44
		// 5
		// 1 => 5
		// 2 => 4
		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 8단계
		// +____
		// ++___
		// +++__
		// ++++_
		// +++++
		for (int i = 1; i <= 5; i++) {
			// + 하나씩 증가
			for (int j = 1; j <= i; j++) {
				System.out.print("+");
			}
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("_");
			}
			System.out.println();
		}

		// 9단계
		// ____+
		// ___++
		// __+++
		// _++++
		// +++++
		for (int i = 1; i <= 5; i++) {
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("_");
			}
			// + 하나씩 증가
			for (int j = 1; j <= i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}

		// 10단계
		// ____+
		// ___+++
		// __+++++
		// _+++++++
		// +++++++++
		for (int i = 1; i <= 5; i++) {
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("_");
			}
			// + 하나씩 증가
			for (int j = 1; j <= i; j++) {
				System.out.print("+");
			}
			// + 하나씩 증가
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("+");
			}

			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("_");
			}
			// + 13579로 증가
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("+");
			}

			System.out.println();
		}

		// 11단계
		// ____+____
		// ___+++___
		// __+++++__
		// _+++++++_
		// +++++++++
		for (int i = 1; i <= 5; i++) {
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("_");
			}
			// + 13579로 증가
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("+");
			}
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("_");
			}
			System.out.println();
		}

		// 12단계
		// 입력 받은 줄 수 대로 출력

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (num - i); j++) {
				System.out.print("_");
			}
			// + 13579로 증가
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("+");
			}
			// _ 하나씩 줄어드는 코드
			for (int j = 1; j <= (num - i); j++) {
				System.out.print("_");
			}
			System.out.println();
		}

		// 학생 풀이들
		System.out.print("다이아 가로 길이는?: ");
		Scanner S1 = new Scanner(System.in);
		int an = S1.nextInt();

		System.out.print("\n");
		for (int m = an / 2; m >= -an / 2; m--) {
			for (int v = 1; v <= an; v++) {
				if (m >= 0) {
					if (v <= m || v >= (an - m + 1)) {
						String e = "-";
						System.out.print(e);
					} else {
						String f = "*";
						System.out.print(f);
					}
				} else {
					if (v <= -m || v >= (an + m + 1)) {
						String e = "-";
						System.out.print(e);
					} else {
						String f = "*";
						System.out.print(f);
					}

				}
			}
			System.out.print("\n");
		}

		/*
		 * 13단계 다이아몬드 빈 공간 (입력받은 줄 수 대로)
		 */
		System.out.println("--- 13단계 ---");

		System.out.print("5 이상의 홀수를 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		int height = scanner.nextInt();

		int up = (height / 2) + 1;
		int down = height / 2;

		for (int j = 1; j <= up; j++) {
			for (int i = up; i > j; i--) {
				System.out.print(" ");
			}
			System.out.print("+");
			for (int i = 3; i < 2 * j; i++) {
				System.out.print(" ");
			}
			if (j > 1) {
				System.out.print("+");
			}
			for (int i = up; i > j; i--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int j = down; j >= 1; j--) {
			for (int i = down; i >= j; i--) {
				System.out.print(" ");
			}
			System.out.print("+");
			for (int i = 3; i < 2 * j; i++) {
				System.out.print(" ");
			}
			if (j > 1) {
				System.out.print("+");
			}
			for (int i = down; i >= j; i--) {
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();
	}

}
