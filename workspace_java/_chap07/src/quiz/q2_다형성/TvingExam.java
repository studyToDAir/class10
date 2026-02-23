package quiz.q2_다형성;

public class TvingExam {

	public static void main(String[] args) {

		// new OAuth
		NaverOAuth naver = new NaverOAuth();
		// 회원 가입하고
//		naver.join("a", "1");
		naver.join2();
		
		Tving tving = new Tving();
		tving.login(naver, "a", "12");
		
	}

}
