package _chap04;

public class SwitchExam_02 {

	public static void main(String[] args) {

		int num = 1;
		if (num == 1) {
			System.out.println("1입니다");
		} else if (num == 2) {
			System.out.println("2입니다");
		} else {
			System.out.println("1 또는 2가 아닙니다");
		}

		// 그대~로 switch로 변환

		// 사용 가능 : byte, char, short, int , String
		// 사용 불가능 : boolean, long, float, double
		switch (num) {
		case 1:
			System.out.println("1입니다");
//				break;
//		case 1: // case 값은 모두 달라야 한다
		case 2:
			System.out.println("2입니다");
//				break;
		default:
			System.out.println("1 또는 2가 아닙니다");
//				break;
		}

		int month = 1;
		switch (month) {

			case 1:
			case 2:
			case 12:
				System.out.println("겨울");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
				
			case 6:
				System.out.println("여름");
				break;
			case 7:
				System.out.println("여름");
				break;
			case 8:
				System.out.println("여름");
				break;
			case 9:
				System.out.println("가을");
				break;
			case 10:
				System.out.println("가을");
				break;
			case 11:
				System.out.println("가을");
				break;
		}

	}

}
