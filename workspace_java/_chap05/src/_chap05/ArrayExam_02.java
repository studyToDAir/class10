package _chap05;

public class ArrayExam_02 {

	public static void main(String[] args) {
		
		/*
		 * 배열 array
		 * 
		 * 한번에 여러 변수를 만드는 방법
		 * 같은 타입만 선언할 수 있음
		 * 생성할 때 전체 크기를 지정해줘야 함
		 * 생성된 여러 변수들은 index로 관리한다
		 *      index는 0번부터 시작
		 */
		
		// 선언 방법
		int[] a1;	// java 스타일
		int [] a2;
		int a3[];	// c 스타일
		
		// 배열 변수는 참조 타입이라서 null을 넣을 수 있다
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 70;
		
		/*
		 * 첫번째 [] : int[]
		 * 		int만으로 구성된 배열 변수 타입이다
		 * 두번째 [] : new int[30]
		 * 		배열의 크기. 즉, 한번에 만들 변수의 개수
		 * 세번째 [] : score[0]
		 * 		만들어진 변수 중에서 몇번째인가?
		 * 		index는 0부터 시작한다
		 */
		
		// 배열을 선언하는 첫번째 방법
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 85;
		score[2] = 70;
//		score[3] = null;
		
		System.out.println("score[0]: "+ score[0]);
		
		// ArrayIndexOutOfBoundsException: Index 50 out of bounds for length 30
		// 길이가 30이라서 0~29까지 가능한데 50은 범위를 벗어났다
//		score[50] = 2;
		
		String[] str = new String[3];
		System.out.println("str[0]: "+ str[0]);
		System.out.println("score[5]: "+ score[5]);
		
//		int a;
//		System.out.println(a);
		
		// 배열 생성 후 기본값
		// 0, false, null로 초기화 됨
		
		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 알고 있는 경우
		int[] i1 = new int[] {90, 85, 70};
		System.out.println("i1[1]: "+ i1[1]);
		
		// 선언과 초기화를 따로 할 수 있다
		int[] i2 = null;
		i2 = new int[]{90, 85, 70};
		
		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우만 사용가능
		// new int[]를 생략할 수 있다
		int[] i3 = {90, 85, 70};
//		i3 = {90, 85, 70};
		
		int sum = 0;
//		sum = sum + i3[0];
//		sum = sum + i3[1];
		
//		for(int i=0; i<=2)
		for(int i=0; i<3; i++) {
			sum = sum + i3[i];
		}
		System.out.println("총 합: "+ sum);
		System.out.println("평균: "+ (sum/3.0));
		
		sum = 0;
		System.out.println("배열의 길이: "+ i3.length);
		for(int i=0; i<i3.length; i++) {
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
		//		10개의 변수에 각 1~10 값 담기
		int[] a10 = new int[10];
//		a10[0] = 1;
//		a10[1] = 2;
		
//		int j = 0;
//		a10[j] = j+1;
//		j = j + 1;
//		a10[j] = j+1;
//		j = j + 1;
//		a10[j] = j+1;
		
		for(int i=0; i<10; i++) { // i는 0~9
			a10[i] = i+1;
		}
		
		// 두번째 반복문에서
		//		모든 값을 순서대로 출력
		for(int i=0; i<a10.length; i++) {
			System.out.println(a10[i]);
		}
		
//		a10.length = 4; // 변경 불가
		
		// 혹시 몰라서 출력
		System.out.println("args :"+ args);
		if(args != null) {
			// args의 개수 출력
			System.out.println("args 개수 : "+ args.length);
			// args의 모든 내용 출력
			for(int i=0; i<args.length; i++) {
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
		
		int[] d = {7, 12, 8};
		int[] f = new int[d.length];
		f[0] = d[0];
		f[1] = d[2];
		
		for(int i=0; i<d.length; i++) {
			f[i] = d[i];
		}
		d[0] = 9;
//		f[0];//
		
		// 문제3
		// 7, 12, 8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에 거꾸로 8, 12, 7로 저장되게
		int[] q3 = {7, 12, 8};
		int[] dap3 = new int[q3.length];
		
		dap3[0] = q3[2];
		dap3[1] = q3[1];
		dap3[2] = q3[0];
		
		for(int i=0; i<q3.length; i++) {
			dap3[i] = q3[2-i];
		}
		
		
		// 문제4
		// {3, 4, 7, 5, 1, 4, 6}
		// 4-1. 배열에서 홀수의 개수 구하기
		int[] q4 = {3, 4, 7, 5, 1, 4, 6};
		int count = 0;
		for(int i=0; i<q4.length; i++) {
//			if( q4[i] % 2 == 1 ) {
//				count++;
//			}
			
			if(q4[i] % 2 == 0) {
				continue;
			}
			count++;
		}
		System.out.println("count: "+ count);
		
		// 4-2. 4보다 큰 수의 개수 구하기
		count = 0;
		for(int i=0; i<q4.length; i++) {
			if( q4[i] > 4 ) {
				count++;
			}
		}
		
		// --- 응용(멘탈챙겨) ---
		// 문제5
		/*
		 * 마라톤에 5명의 선수가 참여했음
		 * 선수들은 1번부터 5번까지 등번호가 있음
		 * 대회가 끝났을 때 완주하지 못한 선수를 찾으시오
		 * 완주 목록 {2, 4, 5, 1} 
		 */
		int[] q5 = {2, 4, 5, 1};

		for(int i=1; i<=5; i++) {

			boolean flag = false;

			// 배열 다 돌기
			for(int j=0; j<q5.length; j++) {
				// 첫번째가 아니어도 그 이후에 나올 수 있다
//				if( q5[i-1] == i ) {
//					System.out.println("완주");
//				} else {
//					System.out.println("완주 못함");
//				}

				if( q5[j] == i ) {
					flag = true;
					break;
				}
			}

//			if(flag == false)
			if( !flag ) {
				System.out.println("빠진 번호: "+ i);
			}
			
		}
		
		
		// 문제6
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 가장 큰 수 찾기
		int[] q6 = {3, 4, 7, 5, 1, 4, 6};
//		int max = Integer.MIN_VALUE;
//		int max = -1;
		int max = q6[0];
		for(int i=0; i<q6.length; i++) {
			if( q6[i] > max ) {
				max = q6[i];
			}
		}
		System.out.println("가장 큰 수: "+ max);
		

		// 문제7
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 두번째 큰 수 찾기
		
		// 문제8
		// 오른쪽으로 한칸 씩 밀기 
		// 왼쪽은 0으로 채우기
		// 예: 
		// 1라운드: {3, 4, 7, 5, 1, 4, 6}
		// 2라운드: {0, 3, 4, 7, 5, 1, 4}
		// 3라운드: {0, 0, 3, 4, 7, 5, 1}
		
		// 문제9
		// 오른쪽으로 한칸 씩 밀기
		// 맨 끝 값은 맨 처음으로 보내기
		// 예: 
		// 1라운드: {3, 4, 7, 5, 1, 4, 6}
		// 2라운드: {6, 3, 4, 7, 5, 1, 4}
		// 3라운드: {4, 6, 3, 4, 7, 5, 1}
		
		// 문제10
		// 임시비밀번호 8자리
		// 10-1 : 숫자만
		// 10-2 : 소문자만
		// 	   HINT 1 : char + 아스키코드
		// 	   HINT 2 : {"a","b","c",...}
		// 10-3 : 숫자2개 이상, 대/소문자 각 1개 이상
		
		// 문제11
		// 자리가 10개 있는 소극장의 예약 시스템
		// 자리 번호는 1~10번까지 번호의 자리가 있습니다
		// 메뉴 : "1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료"
		// 조건1 : 예약이 가능하다면 "n번 자리 예약 되었습니다"
		// 조건2 : 예약이 되어있다면 "이미 예약 되어 있습니다"
		
		// 문제12
		// 로또 번호 6개 배열에 저장
		// 단, 중복 없이!
		
		// 문제13
		// 주차장에 
		// 0: 주차되어있음
		// 1: 비어있음
		/*
		 * {
		 * 		{0, 0, 0, 0},	// 1층
		 * 		{0, 0, 0, 1},	// 2층
		 * 		{1, 0, 1, 0},
		 * 		{1, 0, 1, 1},
		 * 		{1, 1, 1, 1},
		 * }
		 */
		// 13-1 : 2층에 주차된 차량 수 출력
		// 13-2 : 전체 남은 자리 수 출력
	}
	
	
}
















