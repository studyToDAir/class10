package emp;

public class EmpDTO {
//  - 사번, 이름, 직급, 연봉, 상사의 사번

	int empno;
	String ename;
	String job;
	int sal;
	int mgr;
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", mgr=" + mgr + "]";
	}
	
	
}
