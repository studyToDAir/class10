package quiz.quiz0.문제;

public class Emp {
//  - 사번, 이름, 직급, 연봉, 상사의 사번

	int empno;
	String ename;
	String job;
	int sal;
	int mgr;

	// 모든 정보 출력
	void info() {
		System.out.println("empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", mgr=" + mgr);
	}
}
