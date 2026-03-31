package forward;

import java.sql.Date;

public class EmpDTO {
//  - 사번, 이름, 직급, 연봉, 상사의 사번

	int empno;
	String ename;
	String job;
	int sal;
	Integer mgr;
	Date hiredate;
	Integer comm;
	int deptno;
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
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Integer getComm() {
		return comm;
	}
	public void setComm(Integer comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", mgr=" + mgr
				+ ", hiredate=" + hiredate + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	
	
}
