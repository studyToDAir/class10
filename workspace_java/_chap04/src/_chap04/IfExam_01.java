package _chap04;

import java.util.Scanner;

public class IfExam_01 {

	public static void main(String[] args) {

		int score = 90;
		
		boolean over90 = score >= 90;
		{
			System.out.println("항상 실행되는 실행 블럭");
		}
		
		// 만약
		if(over90) {
			System.out.println("90 이상입니다");
		}

//		if(over90) System.out.println("90 이상입니다");
		
		if(score < 90) {
			System.out.println("90 미만입니다");
		}
		
		// 정 반대일 경우 !를 활용하는 것도 좋다
		if( !(score >= 90) ) {
			System.out.println("90 미만입니다");
		}
		
		
		if( score >= 90 ) {
			System.out.println("90 이상입니다");
		} else { // 그렇지 않으면
			System.out.println("90 미만입니다");
		}
		// else가 있으면 무조건 하나는 실행되는게 보장된다

		score = 95;
		
		if( score >= 90 ) {
			System.out.println("90 이상");
		}
		// * 이전과 관계 없이 무조건 다시 판단
		if( (score < 100) && (score >= 80) ) {
			System.out.println("80 ~ 100");
		}
		
		System.out.println("------------");
		if( score >= 90 ) {
			System.out.println("90 이상");
//		} else if( (score < 100) && (score >= 80) ) {
//		} else if( (score < 90) && (score >= 80) ) {
		} else if( score >= 80 ) {
			// * 위의 if나 else if가 거짓일 때만 판단한다
			System.out.println("90미만 80이상");
		} else if( score >= 70 ) {
			System.out.println("80미만 70이상");
		} else {
			System.out.println("70미만");
		}
		

		// 97점이면
		// 		90이상
		//		95이상
		// 92점이면
		// 		90이상
		
		if( score >= 95 ) {
			System.out.println("90 이상");
			System.out.println("95 이상");
		} else if ( score >= 90 ) {
			System.out.println("90 이상");
		}
		
		if ( score >= 90 ) {
//			System.out.println("90 이상");
			if( score >= 95 ) {
				System.out.println("95 이상");
			}
		}
		
		if( score >= 90 
			&& score >= 95 ) {
			System.out.println("95 이상");
		}
		
		
		
		// 홀짝
		int x = 3;
//		if(/* 완성하시오 */){
//		if( x % 2 == 0){
		if( x % 2 != 1){
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 랜덤
		double random1 = Math.random();
		System.out.println("random1 : "+ random1);
		
		// Math.random()
		// 0 <= Math.random() < 1
		// 0 ~ 0.999999999999

		// 0과1을 구하는(홀짝)
		// 정교한 방식
		// 0*2 <= Math.random()*2 < 1*2
		// 0 ~ 1.999999999999
		// int로 형변환 해서 정수만 남기기
		double rand2 = Math.random(); // 0~0.999
		double temp1 = rand2 * 2; // 0~1.9999
		int result = (int) temp1;
		System.out.println("랜덤 홀짝");
		if(result == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 1~6까지 구하기(주사위)
		// 0*6 <= Math.random()*6 < 1*6
		// 0 ~ 5.99999999999999
		// int로 바꾸고
		// +1 하면 1 ~ 6
		rand2 = Math.random();
		double temp2 = rand2 * 6; // 0~5.99999999
		int result0 = (int)temp2; // 0~5
		result = result0 + 1; // 1~6
		System.out.println("주사위 결과 : "+ result);
		
		// 5~12까지 구하기
		// 0~5까지 구해서 +5
		rand2 = Math.random();
		temp2 = rand2 * 6;	  // 0~5.9999999999
		result0 = (int)temp2; // 0~5
		result = result0 + 5; // 5~10
		System.out.println("5~10: "+ result);
		
		// 변수로 범위를 잡아서 보편화
		int min = 5;
		int max = 10;
		rand2 = Math.random();
		temp2 = (int) (rand2 * (max - min + 1)) + min;
		
		// 쉬운 방식
		rand2 = Math.random();
		temp2 = rand2 * 100000;
		result0 = (int) temp2;
		result = (result0 % 6) + 1;
		
		// 로또 번호
		// 1~45까지 6개의 숫자를 랜덤으로 뽑아서 제출 하시오
		// 단, 중복 없이
		
		
		// ----- 꼭 풀 수 있어야 하는 ------
		// 임의의 수를 입력받아
		// 문제1
		// "양수", 0, "음수" 판단하여 출력
		// 문제2
		// 홀수인지 짝수인지 판단하여 출력
		System.out.println("문제1 : 수를 입력하세요");
		
		Scanner s1 = new Scanner(System.in); 			// 스캐너 선언
		int num1 = s1.nextInt();
		if(num1 == 0) {
			System.out.println("니가 입력값: "+ num1 +"은(는) 0!");
		} else if(num1 >= 0) {
			System.out.println("니가 입력값: "+ num1 +"은(는) 양수!");
//		} else if(num1 < 0) {
		} else {
			System.out.println("니가 입력값: "+ num1 +"은(는) 음수!");
		}
		
		if( num1 % 2 == 0 ) {
			System.out.println("짝수");
		} else if( num1 % 2 != 0 ) {
			System.out.println("홀수");
		}
		
		
		// 문제3
		// 임의의 두 수 x, y를 받아서
		// 둘 중에 큰 값 출력
		s1 = new Scanner(System.in);
		System.out.print("문제3 : 첫번째 수");
		num1 = s1.nextInt();
		System.out.print("두번째 수");
		int num2 = s1.nextInt();
//		if(num1 > num2) {
//			System.out.printf("%d와 %d 중 %d가 크다", num1, num2, num1);
//		} else if(num1 < num2) {
//			System.out.printf("%d와 %d 중 %d가 크다", num1, num2, num2);
//		} else {
//			System.out.printf("%d와 %d는 같다");
//		}
		int g = num1;
		if(num1 > num2) {
			g = num1;
		} else {
			g = num2;
		}
		System.out.println(num1+"과 "+num2+"중 "+g+"가 크다");
		
		
		// 문제4
		// 임의의 money를 입력 받아서
		// 7000원 이상이면 "택시타자" 출력
		// 7000~3000 사이면 "버스타자" 출력
		// 3000 미만임면 "걸어가자" 출력
		System.out.print("문제4 : 돈을 입력:");
		s1 = new Scanner(System.in);
		num1 = s1.nextInt();
		if(num1 >= 7000) {
			System.out.println("택시");
//		} else if (num1 < 7000 && num1 >= 3000) {
		} else if (num1 >= 3000) {
			System.out.println("버스");
		} else {
			System.out.println("걷기");
		}
		
		
		// ----- 도전해 볼만한 ------
		// 문제5
		// '가위', '바위', '보' 입력 받아서
		// 5-1 컴퓨터는 항상 '바위'만 낼 경우
		// 5-2 컴퓨터도 random으로
		// '이겼다', '비겼다', '졌다' 출력
		
		// 문제6
		// 임의 세 수 x, y, z를 받아서
		// z가 x~y 사이에 있는지(포함) 판단
		
		// 문제7
		// 月을 입력 받아서
		// 계절 출력
		// 13, -1등 입력하면 "정확히 입력해주세요" 출력
		
		// 문제8
		// 임의의 수를 입력받아서 다음과 같이 출력
		// 예 : 125
		// 입력한 수는 100보다 크고, 양수이고, 홀수입니다.
		
		// 문제9
		// 온도를 입력받아서 다음과 같이 출력
		// 예 : -3
		// 영하 3도 입니다
		// 예 : 5
		// 영상 5도 입니다
		
		// ----- 멘탈 챙길 자신 있으면 ------
		// 문제10
		// 시, 분을 입력 받아서 35분 후의 시, 분을 출력
		// 3, 51을 입력받으면
		// 4시 26분 출력
		
		// 문제11
		// 두자리 숫자를 입력받아서
		// 10의 자리와 1의 자리가 같은지 판단
		// 예 : 77 => 같음, 94 => 다름
		
		// 문제12
		// 1~99까지 369게임
		// 임의의 수를 받아서 3,6,9 숫자가 있으면 "박수" 출력
		// 없으면 그 숫자 그대로 출력
		// 예 : 33 => 박수, 31 => 박수, 12 => 12, 14 => 14
		
		// 문제13
		// 사각형의 한쪽 모서리 : x1:10, y1:20
		// 반대편 모서리 : x2:90, y2:100
		// 입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가
		
		
		// Scanner 사용법
		Scanner scan = new Scanner(System.in);
		// Ctrl + Shift + o 누르기
		// 글씨 받기
//		String input = scan.nextLine();
		// 숫자 받기
		int num = scan.nextInt();
		System.out.println("num: "+ num);
		
		Scanner scan2 = new Scanner(System.in);
		String aa = scan2.nextLine();
		System.out.println("aa : "+ aa);
		
	}

}










