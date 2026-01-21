package quiz.quiz0.문제.q8;

import java.util.Scanner;

public class UpDownExam {

	public static void main(String[] args) {

		// 1~10까지
		int answer = (int)(Math.random() * 10) + 1;

		int count = 0;
		while(true) {
			System.out.println("숫자 입력하세요(1~10)");
			Scanner scan = new Scanner(System.in, "utf-8");
			int player = scan.nextInt();
			
			count++;
			
			if(player == answer) {
				System.out.println("정답입니다");
				System.out.println(count +"번 만에 맞춤");
				break;
			} else if(player < answer) {
				System.out.println("UP!!");
			} else {
				System.out.println("DOWN!!");
			}
		}
		
	}

}
