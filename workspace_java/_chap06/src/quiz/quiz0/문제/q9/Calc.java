package quiz.quiz0.문제.q9;

import java.util.ArrayList;

public class Calc {

//	double result = 0;
	
	ArrayList<String> log = new ArrayList();
	
	double calc(int x, String op, int y) {
		
//		if(op != null) {
//			if(op.equals("+")) {
//				
//			}
//		}
//		
//		if(op != null && op.equals("+")) {
//
//		}
		
		double result = 0;
		
		if("+".equals(op)) {
			result = x + y;
		} else if("-".equals(op)) {
			result = x - y;
		} else if("*".equals(op)) {
			result = x * y;
		} else if("/".equals(op)) {
			if(y != 0) {
				result = (double)x / y;
			} else {
				System.out.println("0으로 나눌 수 없습니다");
			}
		} else if("%".equals(op)) {
			if(y != 0) {
				result = (double)x % y;
			} else {
				System.out.println("0으로 나눌 수 없습니다");
			}
		}
		
		String log = x + op + y +"="+ result;
		this.log.add(log);
		
		return result;
	}
	
	void viewLog() {
		for(int i=0; i<this.log.size(); i++) {
			System.out.println(this.log.get(i));
		}
	}

}
