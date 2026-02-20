package quiz.q1_override;

//public class LoginExam extends String {
public class LoginExam {

	public static void main(String[] args) {

		NaverLogin naver = new NaverLogin("abc", "1234");
//		naver.id = null;
		
		naver.login("abc", "12345");
	}

}
