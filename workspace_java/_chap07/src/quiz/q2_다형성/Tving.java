package quiz.q2_다형성;

public class Tving {

	void login(OAuth oAuth, String id, String pw) {
		if( oAuth.login(id, pw) ) {
			System.out.println("Tving 메인 페이지로 이동 중...");
		} else {
			System.out.println("로그인 실패. 로그인 페이지로 이동 중...");
		}
	}
	
	void channel(int ch) {
		
	}
}
