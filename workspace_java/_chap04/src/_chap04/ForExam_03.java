package _chap04;

import java.util.Scanner;

public class ForExam_03 {

	public static void main(String[] args) {

		// for문의 기본 형식
//		for(;;) {
//			
//		}

		
		int sum = 0;
		
//		for( int i=1; i<=100; i++ ) {
//		for( int i=1; i<=100; i = i + 1 ) {
//		for( int i = 1; i<=100; i = i + 2 ) {
		int i=0;
//		for( i = 1; i<=100; i++ ) {
		i = 1;
		for( ; i<=100; i++ ) {
			sum = sum + i;
//			sum += i;
		}
		System.out.println(sum);
		System.out.println(i);
		
		// 깜짝퀴즈 
		// 1~10까지 출력
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		
		
		// 1+1+1+1+1
		// 1씩 더하는 것을 5번 하고 싶다
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);
		
		// 시작 값
		// 종료 조건
		int sum2 = 0;
		for(int j=1; j<=5; j++) {
			sum2 = sum2 + 1;
		}
		System.out.println(sum2);
		
		
		// 1~5까지 합을 구하기
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		sum = 0;
		int k = 1;
		sum = sum + k; // k == 1
		k++;
		sum = sum + k; // k == 2
		k++;
		sum = sum + k; // k == 3
		
//		for(k=1; k<=5; ) {
		for(k=1; k<=5; k++) {
			sum = sum + k; // k == 1
//			k++;
		}
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기
		 *     Ctrl+c, v 했을 때 바뀌지 않는 것 찾기
		 *     
		 * 2. 반복 되지 않는 것의
		 *     2-1. 규칙(패턴) 찾기
		 *     2-2. 변수로 바꿔서 더 이상 바뀌지 않게 만들기
		 *     
		 * 3. 시작 값 파악
		 * 4. 종료 조건 파악
		 */
		
		// 깜짝퀴즈
		// [1] 구구단 2단 출력
		// "2 x 1 = 2"
		// "2 x 2 = 4"
		
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6"); // 슬로우모션
		int a = 1; // 초기값
		int b = 2 * a;
		System.out.println("2 x "+ a +" = "+ b);
		a = a + 1; // 증가 규칙
		b = 2 * a;
		System.out.println("2 x "+ a +" = "+ (2 * a));// a=2, b=4
		
		a = a + 1; // 증가 규칙
		System.out.println("2 x "+ a +" = "+ (2 * a));
		System.out.println("-------------");
		
		for(a=1; a<=9; a = a + 1) {
			System.out.println("2 x "+ a +" = "+ (2 * a));
		}
		
		// [2] 10부터 1까지 출력
		for(int c = 10; c >= 1; c-- ) {
			System.out.println(c);
		}
		for(int c = 1; c <= 10; c++ ) {
			System.out.println(11 - c);
		}
		// [3] 10부터 2까지 짝수만 출력
		for(int c = 10; c >= 1; c-- ) {
			if(c%2 == 0) {
				System.out.println(c);
			}
		}
		
		for(int c = 10; c >= 1; c = c-2 ) {
			// 1. 10
			// 2. 8
			// 3. 6 ...
			System.out.println(c);
		}
		
		// --- 꼭 풀 수 있어야 함 ---
		// 문제1
		// 1~5까지 출력하되 홀수인지 짝수인지 같이 출력
		// 예) 1:홀수
		//     2:짝수
		for(int d=1; d<=5; d++) {
			System.out.print(d);
			if( d%2 == 1 ) {
				System.out.println(":홀수");
			} else {
				System.out.println(":짝수");
			}
		}
		
		// 문제2
		// 1~100까지 홀수의 합과 개수
		int sum3 = 0;
		int count = 0;
		for(int d=1; d<=100; d+=2) {	// 홀수만 반복
			sum3 += d;
			
			count++;
		}
		System.out.println("홀수의 합: "+ sum3);
		System.out.println("홀수의 개수: "+ count);
		
		// 문제3
		// 1 ~ 입력 받은 수 까지 더하기
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		sum3 = 0;
		for(int d=1; d<=input; d++) {
			sum3 += d;
		}
		System.out.println("1부터 "+ input +"까지 합 : "+ sum3);
		
		// --- 조금 난이도 있는 ---
		// 문제4
		// 1~10까지 3개씩 옆으로 찍
		//    1  2  3
		//    4  5  6 
		//    7  8  9
		//    10
		for(int d=1; d<=17; d++) {
			if(d%3 == 0) {
				System.out.print(d);
				System.out.println(); // 엔터
			} else {
				System.out.print(d +",");
			}
		}
		System.out.println();
		
		
		// --- 2중 for문 ---
		
		// 문제1
		// 구구단 모든 단 출력
		
//		// 2단
//		int dan = 2;
//		for(a=1; a<=9; a = a + 1) {
//			System.out.println(dan +" x "+ a +" = "+ (dan * a));
//		}
//		
//		dan++;
//		for(a=1; a<=9; a = a + 1) {
//			System.out.println(dan +" x "+ a +" = "+ (dan * a));
//		}
//		
//		dan++;
//		for(a=1; a<=9; a = a + 1) {
//			System.out.println(dan +" x "+ a +" = "+ (dan * a));
//		}
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println(dan+"단---");

			for(a=1; a<=9; a = a + 1) {
				System.out.println(dan +" x "+ a +" = "+ (dan * a));
			}
		}

		// 문제2
		// 구구단 단마다 옆으로 출력
		// 2x1=2 2x2=4...
		
		// 문제3
		// 구구단 3단씩 옆으로 출력
		// 2x1=2 3x1=3 4x1=4
		// 2x2=4 3x2=6 4x2=8
		// 2x3=6...
		
		// 문제4
		// 주사위 2개를 굴려서
		// 나올 수 있는 모든 조합 출력
		// [1,1] [1,2] [6,6]
		
		// 문제5
		// 주사위 2개를 굴려서
		// 합 별로 출력
		// 합2 : [1,1]
		// 합3 : [1,2] [2,1]
		
		// 문제6
		// 주사위 2개를 굴려서 나올 조합에서
		// 중복 없이 출력
		// 예: [1,2] [2,1] 중복이라서 [1,2]
		
		// 월요일 오전에 푸는 시간 주고
		// 오후에 풀이
		
	}

}























