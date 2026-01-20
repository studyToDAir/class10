package _chap05;

public class ArrayExam_02 {

	public static void main(String[] args) {

		/*
		 * 배열 array
		 * 
		 * 한번에 여러 변수를 만드는 방법 같은 타입만 선언할 수 있음 생성할 때 전체 크기를 지정해줘야 함 생성된 여러 변수들은 index로
		 * 관리한다 index는 0번부터 시작
		 */

		// 선언 방법
		int[] a1; // java 스타일
		int[] a2;
		int a3[]; // c 스타일

		// 배열 변수는 참조 타입이라서 null을 넣을 수 있다
		a1 = null;

		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 70;

		/*
		 * 첫번째 [] : int[] int만으로 구성된 배열 변수 타입이다 두번째 [] : new int[30] 배열의 크기. 즉, 한번에 만들
		 * 변수의 개수 세번째 [] : score[0] 만들어진 변수 중에서 몇번째인가? index는 0부터 시작한다
		 */

		// 배열을 선언하는 첫번째 방법
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 85;
		score[2] = 70;
//		score[3] = null;

		System.out.println("score[0]: " + score[0]);

		// ArrayIndexOutOfBoundsException: Index 50 out of bounds for length 30
		// 길이가 30이라서 0~29까지 가능한데 50은 범위를 벗어났다
//		score[50] = 2;

		String[] str = new String[3];
		System.out.println("str[0]: " + str[0]);
		System.out.println("score[5]: " + score[5]);

//		int a;
//		System.out.println(a);

		// 배열 생성 후 기본값
		// 0, false, null로 초기화 됨

		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 알고 있는 경우
		int[] i1 = new int[] { 90, 85, 70 };
		System.out.println("i1[1]: " + i1[1]);

		// 선언과 초기화를 따로 할 수 있다
		int[] i2 = null;
		i2 = new int[] { 90, 85, 70 };

		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우만 사용가능
		// new int[]를 생략할 수 있다
		int[] i3 = { 90, 85, 70 };
//		i3 = {90, 85, 70};

		int sum = 0;
//		sum = sum + i3[0];
//		sum = sum + i3[1];

//		for(int i=0; i<=2)
		for (int i = 0; i < 3; i++) {
			sum = sum + i3[i];
		}
		System.out.println("총 합: " + sum);
		System.out.println("평균: " + (sum / 3.0));

		sum = 0;
		System.out.println("배열의 길이: " + i3.length);
		for (int i = 0; i < i3.length; i++) {
			sum = sum + i3[i];
		}

		// 순차적 연습
		// 5개 변수를 한번에 만들기
		// 즉, 5개 크기의 int 배열 만들기
		int[] a5 = new int[50];
		// 첫번째 변수에 1 넣기
		a5[0] = 1;
		// 두번째 변수에 2 넣기
		a5[1] = 2;

		int b0 = 2;
		int b1 = 5;
//		a5 = 3;
		a5[0] = 1;

		// 문제1
		// 첫번째 반복문에서
		// 10개의 변수에 각 1~10 값 담기
		int[] a10 = new int[10];
//		a10[0] = 1;
//		a10[1] = 2;

//		int j = 0;
//		a10[j] = j+1;
//		j = j + 1;
//		a10[j] = j+1;
//		j = j + 1;
//		a10[j] = j+1;

		for (int i = 0; i < 10; i++) { // i는 0~9
			a10[i] = i + 1;
		}

		// 두번째 반복문에서
		// 모든 값을 순서대로 출력
		for (int i = 0; i < a10.length; i++) {
			System.out.println(a10[i]);
		}

//		a10.length = 4; // 변경 불가

		// 혹시 몰라서 출력
		System.out.println("args :" + args);
		if (args != null) {
			// args의 개수 출력
			System.out.println("args 개수 : " + args.length);
			// args의 모든 내용 출력
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}

		// 문제2
		// 7, 12, 8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에도 7, 12, 8으로 저장되게 복사
		// 단 b = a 안됨
		int d0 = 7;
		int d1 = 12;
		int d2 = 8;

		int f0, f1, f2;
		f0 = d0;
		f1 = d1;

		int[] d = { 7, 12, 8 };
		int[] f = new int[d.length];
		f[0] = d[0];
		f[1] = d[2];

		for (int i = 0; i < d.length; i++) {
			f[i] = d[i];
		}
		d[0] = 9;
//		f[0];//

		// 문제3
		// 7, 12, 8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에 거꾸로 8, 12, 7로 저장되게
		int[] q3 = { 7, 12, 8 };
		int[] dap3 = new int[q3.length];

		dap3[0] = q3[2];
		dap3[1] = q3[1];
		dap3[2] = q3[0];

		for (int i = 0; i < q3.length; i++) {
			dap3[i] = q3[2 - i];
		}

		// 문제4
		// {3, 4, 7, 5, 1, 4, 6}
		// 4-1. 배열에서 홀수의 개수 구하기
		int[] q4 = { 3, 4, 7, 5, 1, 4, 6 };
		int count = 0;
		for (int i = 0; i < q4.length; i++) {
//			if( q4[i] % 2 == 1 ) {
//				count++;
//			}

			if (q4[i] % 2 == 0) {
				continue;
			}
			count++;
		}
		System.out.println("count: " + count);

		// 4-2. 4보다 큰 수의 개수 구하기
		count = 0;
		for (int i = 0; i < q4.length; i++) {
			if (q4[i] > 4) {
				count++;
			}
		}

		// --- 응용(멘탈챙겨) ---
		// 문제5
		/*
		 * 마라톤에 5명의 선수가 참여했음 선수들은 1번부터 5번까지 등번호가 있음 대회가 끝났을 때 완주하지 못한 선수를 찾으시오 완주 목록 {2,
		 * 4, 5, 1}
		 */
		int[] q5 = { 2, 4, 5, 1 };

		for (int i = 1; i <= 5; i++) {

			boolean flag = false;

			// 배열 다 돌기
			for (int j = 0; j < q5.length; j++) {
				// 첫번째가 아니어도 그 이후에 나올 수 있다
//				if( q5[i-1] == i ) {
//					System.out.println("완주");
//				} else {
//					System.out.println("완주 못함");
//				}

				if (q5[j] == i) {
					flag = true;
					break;
				}
			}

//			if(flag == false)
			if (!flag) {
				System.out.println("빠진 번호: " + i);
			}

		}

		// 문제6
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 가장 큰 수 찾기
		int[] q6 = { 3, 4, 7, 5, 1, 4, 6 };
//		int max = Integer.MIN_VALUE;
//		int max = -1;
		int max = q6[0];
		for (int i = 0; i < q6.length; i++) {
			if (q6[i] > max) {
				max = q6[i];
			}
		}
		System.out.println("가장 큰 수: " + max);

		// 문제7
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 두번째 큰 수 찾기
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int[] q7 = { 3, 4, 7, 5, 1, 4, 6 };
		// 전략 : 최대값 찾아 놓고나서(max1)
		// 다시 최대값을 찾는데
		// 단, 아까 찾은 최대값이 아닌 값 중에서 최대값
		// max1 찾기
		for (int i = 0; i < q7.length; i++) {
			if (q7[i] > max1) {
				max1 = q7[i];
			}
		}
		// max2 찾기
		for (int i = 0; i < q7.length; i++) {
			if (max1 != q7[i]) { // 아까 찾은 최대값이 아닌 값 중에서

				if (q7[i] > max2) {
					max2 = q7[i];
				}

			}
		}

		// 학생 풀이 1
		int[] q6_ = { 3, 4, 7, 5, 1, 4, 6 };// 선언 및 할당
		// 내가 찾은 특정한 상황의 값을 지정했기 때문에
		// 값을 전혀 모르더라도.. 또는 값이 바뀌더라도
		// 코드를 수정하지 않는 방향으로 다시 고민해보자
		int max_ = q6[5];// 대표 비교값 하나 확정 지정
		int max2_ = q6[2];
		for (int i1_ = 0; i1_ < q6_.length; i1_++) {// 인덱스 0부터 6까지 비교
			if (q6_[i1_] > max_) {
				max_ = q6_[i1_];// 가장 큰 값
			} else {
				max2_ = q6_[i1_];// 두번째 큰 수 max에 담는다(덮어쓰기)
			}
			//
		}
		System.out.println("두번째로 큰 수: " + max2_);
		// 학생풀이2
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 2번째 큰 수 찾기
		int[] second = { 3, 4, 7, 5, 1, 4, 6 };
		int winner = 0;

		// 2번째로 큰 수란, 가장 큰 수를 제외한 나머지 수보다 크거나 같은 수를 의미한다.
		// 즉, 내가 했던 것에서 승리 횟수만 수정하면 될 것 같다.
		//
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (second[i] >= second[j]) {
					winner++;
				}
			}
			if (winner == second.length - 1) {
				System.out.println("두 번째로 큰 수는?: " + "[ " + second[i] + " ]");
				break;
			}
			winner = 0;
		}

		// 문제8
		// 오른쪽으로 한칸 씩 밀기
		// 왼쪽은 0으로 채우기
		// 예:
		// 1라운드: {3, 4, 7, 5, 1, 4, 6}
		// 2라운드: {0, 3, 4, 7, 5, 1, 4}
		// 3라운드: {0, 0, 3, 4, 7, 5, 1}

		// 전략 : 뒤에서부터 한칸씩 뒤로 밀고
		// 맨 처음을 0 바꾼다

		// index만 보면 그냥 숫자 놀음
		// i가 6일 때 7로 만드는 방법
		System.out.println("--- 문제 8 ---");
		int[] q8 = { 3, 4, 7, 5, 1, 4, 6 };
		for (int j = 0; j < 7; j++) {
			for (int i = (q8.length - 1) - 1; i >= 0; i--) {
				q8[i + 1] = q8[i];
			}
			q8[0] = 0;
			for (int i = 0; i < q8.length; i++) {
				System.out.print(q8[i] + ", ");
			}
			System.out.println();
		}
		// 문제9
		// 오른쪽으로 한칸 씩 밀기
		// 맨 끝 값은 맨 처음으로 보내기
		// 예:
		// 1라운드: {3, 4, 7, 5, 1, 4, 6}
		// 2라운드: {6, 3, 4, 7, 5, 1, 4}
		// 3라운드: {4, 6, 3, 4, 7, 5, 1}

		// 전략 : 문제8의 맨 처음 0 대신 맨 마지막 값을 넣기로
		System.out.println("--- 문제 9 ---");
		int[] q9 = { 3, 4, 7, 5, 1, 4, 6 };
		for (int j = 0; j < 7; j++) {
			int temp = q9[q9.length - 1];
			for (int i = (q9.length - 1) - 1; i >= 0; i--) {
				q9[i + 1] = q9[i];
			}
			q9[0] = temp;
			for (int i = 0; i < q9.length; i++) {
				System.out.print(q9[i] + ", ");
			}
			System.out.println();
		}
		// 학생풀이1
		System.out.println("--- 학생풀이1 ---");
		int[] aq = { 3, 4, 7, 5, 1, 4, 6 };
		int count_ = 0;
		for (int a1_ = 0; a1_ < aq.length + 1; a1_++) {
			for (int a2_ = 0; a2_ < aq.length; a2_++) {
				System.out.print(aq[a2_] + " ");
			} // 0123456 6543210
				// aq[0]=aq[aq.length-1]; [0]이[6]으로 바껴서
				// 0123456 => 6123456으로 밑에서 계산
			count_ = aq[6];
			for (int a4 = aq.length - 1; a4 > 0; a4--) {
				aq[a4] = aq[a4 - 1];// 여기서 계산이 꼬임
			} // [6]을[5]로바꿈
				// aq[0]=[aq.length-1];[0]이[6]이아닌[5]가됨
			aq[0] = count_;
			System.out.println();
		}
		// 학생풀이2
		System.out.println("--- 학생풀이2 ---");
		int[] a9_1 = { 3, 4, 7, 5, 1, 4, 6 };
		int[][] a9 = new int[a9_1.length + 1][a9_1.length];

		for (int i = 0; i < a9_1.length; i++) {
			for (int j = 0; j < a9_1.length; j++) {
				a9[i][j] = j;
			}
		}

		a9[0] = new int[] { 3, 4, 7, 5, 1, 4, 6 };

		for (int j = 0; j < a9.length - 1; j++) {
			for (int i = a9[j].length - 1; i > 0; i--) {
				a9[j + 1][i] = a9[j][i - 1];
			}
			for (int k = 0; k <= j; k++) {
				a9[j + 1][k] = a9[0][6 - (j - k)];
			}
		}

		for (int i = 0; i < a9.length; i++) {
			for (int j = 0; j < a9[i].length; j++) {
				System.out.printf("a9[%d][%d]: %d   ", i, j, a9[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		// 학생풀이3
		System.out.println("--- 학생풀이3 ---");
		int[] q9_ = new int[] { 3, 4, 7, 5, 1, 4, 6 };
		// 1라운드: {3, 4, 7, 5, 1, 4, 6}
		// 2라운드: {6, 3, 4, 7, 5, 1, 4}
		// 3라운드: {4, 6, 3, 4, 7, 5, 1}
//		int num = 0;
		// 변수 만들어야함 값을 바꾸고 옮기네 변수에 q9_[6]을 저장해두고 꺼내서 써야함
		for (int a = 0; a < q9_.length; a++) {
			int num = q9_[6];
			System.out.print(a + "라운드 : ");

			for (int c = 0; c < q9_.length; c++) {
				System.out.print(q9_[c]);
			}
			for (int b = q9_.length; b > 1; b--) {

				q9_[b - 1] = q9_[b - 2];
			}
			System.out.println();
			q9_[0] = num;
		}

// 문제10
// 임시비밀번호 8자리
// 10-1 : 숫자만
// 10-2 : 소문자만
// HINT 1 : char + 아스키코드
// HINT 2 : {"a","b","c",...}
// 10-3 : 숫자2개 이상, 대/소문자 각 1개 이상
		int[] q10 = new int[8];
		for (int i = 0; i < q10.length; i++) {
			q10[i] = (int) (Math.random() * 10);
		}

		// 97~122 a-z
		char[] q10c = new char[8];
		for (int i = 0; i < q10c.length; i++) {
			q10c[i] = (char) ((int) (Math.random() * (122 - 97 + 1)) + 97);
		}
		for (int i = 0; i < q10c.length; i++) {
			System.out.print(q10c[i] + " ");
		}
		System.out.println();

		// 10-3
		// 대문자 하나, 소문자 하나, 나머지 숫자
		// 숫자 2개, 대문자 하나, 나머지 소문자

		// 1. 랜덤하게 숫자,대문자,소문자 고르고(가위바위보 처럼)
		// 랜덤 뽑을 때 몇개 뽑았는지 각자 count 세어 놓고
		// 2. 중간에 무조건 대1소1숫2, 앞뒤 랜덤

		// 학생풀이1
		System.out.println("=:=:= 학생풀이1");
		int[] mix = new int[8];
		char[] passq = new char[8];

		int aa = 0;
		int bb = 0;
		int cc = 0;
//		int[] aaa = new int[3];

		do {
			aa = 0; // do 안에서 초기값 0 필요!!!!
			bb = 0;
			cc = 0;

			for (int i = 0; i < 8; i++) {
				mix[i] = (int) (Math.random() * 4);
//				aaa[i]++;
				if (mix[i] == 1) { // 숫자
					passq[i] = (char) ((Math.random() * 10) + 48);
					aa = aa + 1;
				} else if (mix[i] == 2) { // 소문자
					passq[i] = (char) ((Math.random() * 26) + 97);
					bb = bb + 1;
				} else {	// 대문자
					passq[i] = (char) ((Math.random() * 26) + 65);
					cc = cc + 1;
				}

			}

		} while (!(aa > 2 && bb > 1 && cc > 1));

		for (int i = 0; i < passq.length; i++) { // for 문으로 i값 다시 설정 후 출력하기
			char mmmix = (char) passq[i];
			System.out.print(mmmix);
		}
		System.out.println();

		

		// 문제11
		// 자리가 10개 있는 소극장의 예약 시스템
		// 자리 번호는 1~10번까지 번호의 자리가 있습니다
		// 메뉴 : "1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료"
		// 조건1 : 예약이 가능하다면 "n번 자리 예약 되었습니다"
		// 조건2 : 예약이 되어있다면 "이미 예약 되어 있습니다"
	
		// 전략
		// new int[10]; new boolean[10]
		// 0: 예약가능
		// 1: 예약완료
		// 1.예약 : if(index:숫자-1) 예약 가능한지 보고 
		// 2.모든 좌석 현황 : 모두 출력, 사용자 친화적
		// 3.잔여 좌석 : 예약가능 좌석만 출력
			
			
		// 문제12
		// 로또 번호 6개 배열에 저장
		// 단, 중복 없이!
		
		// 전략 : 지금 뽑은 값이 앞에서 출현한 적(중복)이 있는가?
		// 1~45 배열에서 하나 뽑고, 뽑은 숫자 빼버린 배열에서 뽑고
		
		// 문제13
		// 주차장에
		// 0: 주차되어있음
		// 1: 비어있음
				/*
				 * { {0, 0, 0, 0}, // 1층 {0, 0, 0, 1}, // 2층 {1, 0, 1, 0}, {1, 0, 1, 1}, {1, 1,
				 * 1, 1}, }
				 */
		// 13-1 : 2층에 주차된 차량 수 출력
		// 13-2 : 전체 남은 자리 수 출력

	}

}
