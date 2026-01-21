package quiz.quiz0.문제.q7;

public class Fan {

	// 전원 상태를 저장하는 곳
	boolean power;

	void on() {
		System.out.println("전원 켭니다");
		this.power = true;
	}
	
	void off() {
		System.out.println("전원 끕니다");
		this.power = false;
	}
	
	void slow() {
//		if(this.power == true)
		if(this.power) {
			System.out.println("약풍입니다");
		} else {
			System.out.println("전원을 켜주세요");
		}
	}
	void fast() {
		if(this.power) {
			System.out.println("강풍입니다");
		} else {
			System.out.println("전원을 켜주세요");
		}
	}
	
}
