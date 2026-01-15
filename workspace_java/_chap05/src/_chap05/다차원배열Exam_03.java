package _chap05;

import java.util.Scanner;

public class 다차원배열Exam_03 {

	public static void main(String[] args) {

		int a0 = 5;
		int a1 = 15;
		int a2 = 34;
		
		// int를 여러개 만들기
		int[] b0 = new int[3];
		// b의 첫번째 변수에 a0 넣기
		// 두번째 변수에 a1 넣기
		b0[0] = a0;
		b0[1] = a1;
		b0[2] = a2;
		
		int[] b1 = new int[3];
		b1[0] = a0+1;
		b1[1] = a1+1;
		b1[2] = a2+1;
		
		// b0과 b1을 배열로 만들기
		int[] [] c0 = new int[2][3];
		c0[0] = b0;
		c0[1] = b1;
		
		System.out.println("c0.length: "+ c0.length);
		System.out.println("b1의 길이: "+ c0[1].length);
		
		// b1이 10개짜리라도 c0[1]에서 잘 동작한다??
		
		
		int[][] c1 = new int[][] { {1,2,3},new int[]{4,5,6} };
		int[][] c2 = {
						{1,2,3},
						{4,5,6,7},
						null
					 };

		int[][] arr = new int[2][];
		// 가장 바깥 차원은 꼭 있어야 한다
		// heap에 공간은 만들어야 해서
		// 모두 null로 초기화
		//	  참조 공간만 만들고 실제 배열은 나중에 만들기
		// 가변(비정형) 배열
		// 공간을 연속으로 잡지 않아서 고성능에서는 불리할 수 있다
		
		
		System.out.println(c0);
		System.out.println(c0[0]);
		System.out.println(c0[0][0]);
		
		/////////////////////////////////////
		System.out.println("----------------");
		
		int k1 = 10;
		int k2 = k1;
		System.out.println("k2: "+ k2);
		k1 = 5;
		System.out.println("k2: "+ k2);
		
		
		int[] d1 = {1,2,3};
		// 얕은 복사( call by reference )
		// = 기호는 stack의 값(또는 주소)만 복사
		// 값을 변경하는 경우 원본도 바뀐다
		int[] d2 = d1;
		
		System.out.println("d2[0]:"+ d2[0]);
		d1[0] = 4;
		System.out.println("d2[0]:"+ d2[0]);

		System.out.println("d1[2]:"+ d1[2]);
		d2[2] = 40;
		System.out.println("d1[2]:"+ d1[2]);
		
		// 깊은 복사( call by value )
		int[] d3 = new int[d1.length];
		for(int i=0; i<d1.length; i++) {
			d3[i] = d1[i];
		}
		
		// 같이 해보자
		// 1. 1~5까지 배열에 반복문으로 넣기
//		int[] q1_1 = {1,2,3,4,5};
		int[] q1_1 = new int[5];
		q1_1[0] = 1;
		q1_1[1] = 2;
		for(int i=0; i<q1_1.length; i++) {
			q1_1[i] = i+1;
		}
		
		// q1_1 전부 출력
		for(int i=0; i<q1_1.length; i++) {
			System.out.println(q1_1[i]);
		}
		
		// 2. 11~15까지
		int[] q1_2 = new int[5];
		// 채우시오
		for(int i=0; i<q1_2.length; i++) {
			q1_2[i] = i+11;
		}
		
		// 3. 101~105까지
		int[] q1_3 = new int[5];
		// 채우시오
		for(int i=0; i<q1_3.length; i++) {
			q1_3[i] = i+101;
		}
		
		int[][] q1 = new int[3][5];
		q1[0] = q1_1;
		q1[1] = q1_2;
		q1[2] = q1_3;
		
		// 문제1
		// q1을 모두 출력하시오
		// 단, q1만 가지고(q1_1 같은거 쓰지 말고)
//		System.out.println(q1[0][0]);
//		System.out.println(q1[0][1]);
//
//		for(int j=0; j<q1[0].length; j++) {
//			System.out.println(q1[0][j]);
//		}
//		for(int j=0; j<q1[1].length; j++) {
//			System.out.println(q1[1][j]);
//		}
		
		for(int i=0; i<q1.length; i++) {
			for(int j=0; j<q1[i].length; j++) {
				System.out.println(q1[i][j]);
			}
		}
		
	}

}







