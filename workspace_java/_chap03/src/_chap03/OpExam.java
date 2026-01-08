package _chap03;

public class OpExam {

	public static void main(String[] args) {

		int x = 10;
		
		x++;
		System.out.println("x: "+ x);
		
		x = 10;
		x = x + 1;
		// 나한테 + 1 해서 다시 나한테 저장할 때
		// 줄여쓰는 형태
		x += 1;	// 위와 같은 코드
		x++;	// 위와 같은 코드
				// 단, + 1만 가능
		x = 10;
		++x;
		System.out.println("++x : "+ x);
		
		x = 10;
		x--;
		--x;
		System.out.println("x : "+ x);
		System.out.println();
		
		x = 10;
		int z = ++x;
		System.out.println("z(++x): "+ z);
		System.out.println("x(++x): "+ x);
		System.out.println();
		
		x = 10;
		z = x++;
		System.out.println("z(x++): "+ z);
		System.out.println("x(x++): "+ x);
		
		x = 10;
		System.out.println( "x++: "+ x++ + " x:"+ x );
		
		x = 10;
		//  10 + 12
		z = x++ + ++x;
		// 예측: 
		System.out.println("z: "+ z);
		
		x = 1;
		// x : 1
		//  1   -   1 * 1   - 2
		z = x++ - --x * x++ - x--;
		// z와 x의 출력값
		// 예측 z: -2
		// 예측 x: 1
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		int x1 = 1;
		System.out.println(x1++);
		System.out.println(x1++);
		System.out.println(x1++);
		System.out.println(x1++);
		System.out.println(x1++);
		
		// 나누기 할 때 0으로 나누지 않도록 조심
		int b = 10;
//		int c = b / 0;
		double d = 7.3;
		double e = d / 0;
		System.out.println("d/0 : "+ e); // Infinity
		
		// 나머지
		int f = 3 % 3;
		System.out.println(f);
		// 특징: 0 부터 ~ 나머지 하는 숫자보다 하나 작은 것만 나온다
		
		/*
		 * 숫자 149
		 * ---------
		 * 출력 결과
		 * ---------
		 * "백의 자리 : 1"
		 * "십의 자리 : 4"
		 * "일의 자리 : 9"
		 */
		// %를 한번 이상 활용해서 풀어보자
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.1 == 0.1f);
		// 소수점은 근사치로 저장된다
		// 그나마 같은 타입으로 변환해서 비교하면 수월하다
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println( s1.equals(s2) );
		// 글씨는 무조건 equals()로 비교한다
		System.out.println("asdfa".equals(s1));
		
		int c1 = 22;
		int c2 = 4;
		System.out.println("몫 : "+ (c1/c2));
		System.out.println("나머지 : "+ (c1%c2));
		
		// 문제1
		// 난 돈이 10000원있음
		// 1. 4500원 짜리 쌍화차를 최대 몇 잔 살 수 있는가?
		// 2. 그리고 남는 돈은?
		
		// 문제2
		// 올영에서 꿀홍차가 8000원인데
		// 15% 세일! 그렇다면 가격은?
		int honey = 8000;
		double sale = 0.15;
		double total1 = honey - (honey * sale);
		double total2 = honey * (1 - sale);
		
		// 문제3-0
		// 1234를 10의 자리 이하 버림
		// 결과 : 1200
		
		// 문제3
		double v1 = 1000;
		double v2 = 794.0;
		System.out.println(v1 / v2); // 1.2594458438287153
		// v1 / v2를 소수점 3자리까지만 출력하시오
		// 오칙연산만 plz
		// 결과 : 1.259
		double v3 = v1 / v2 * 1000;
		int v4 = (int)v3;
		System.out.println(v4);
//		double v5 = v4 / 1000;
		double v5 = (double)v4 / 1000;
//		double v5 = (double)v4 * 0.001; //1.2590000000000001
		System.out.println(v5);
		
		// 문제4
		// 17000원이 있을 때
		// 5천원 몇장
		// 1천원 몇장
		int m1 = 17000;
		int m2 = 5000;
		int m3 = 1000;
		
		int m5000 = m1 / m2;
		// 1
		int 남은돈 = m1 - (m5000 * m2);
		// 2
		int 남은돈2 = m1 % m2;
		
		int m1000 = 남은돈 / m3;
		System.out.println("5000원: "+ m5000);
		System.out.println("1000원: "+ m1000);
		
		
		int s = 85;
		String grade = ( s > 90 ) ? "A" : "B" ;
		System.out.println("grade: "+ grade);
		
		String grade2 = s>90 ? "A" : (s>80 ? "B" : "C");
		
	}

}
