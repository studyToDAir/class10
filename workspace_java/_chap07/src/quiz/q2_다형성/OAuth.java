package quiz.q2_다형성;

import java.util.Scanner;

public class OAuth {

	String id;
	String pw;
	
	void join2(){
		Scanner scan = new Scanner(System.in);
		System.out.print("id 입력 :");
		this.id = scan.nextLine();
		System.out.print("pw 입력 :");
		this.pw = scan.nextLine();
	}
	
	boolean join(String id, String pw) {
		
		if( id == null || id.trim() == "" ) {
			return false;
		}
		
		if( this.id == null) {
			this.id = id;
		} else {
			if( !this.id.equals(id) ) {
				this.id = id;
			} else {
				return false;
			}
		}
		
		this.pw = pw;
		
		return true;
	}
	
	boolean loginCheck(String id, String pw) {
		return this.id.equals(id) && this.pw.equals(pw);
	}
	
	boolean login(String id, String pw) {
//		if( loginCheck(id, pw) ) {
//			return true;
//		} else {
//			return false;
//		}
		return loginCheck(id, pw);
	}
	
	
}
