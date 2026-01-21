package quiz.quiz0.문제;

public class EmpExam_q6 {

	public static void main(String[] args) {

		Emp e1 = new Emp();
        e1.empno = 7369;
        e1.ename = "SMITH";
        e1.job   = "CLERK";
        e1.sal   = 800;
        e1.mgr   = 7902;

        Emp e2 = new Emp();
        e2.empno = 7499;
        e2.ename = "ALLEN";
        e2.job   = "SALESMAN";
        e2.sal   = 1600;
        e2.mgr   = 7698;
		
        Emp e3 = new Emp();
        e3.empno = 7521;
        e3.ename = "WARD";
        e3.job   = "SALESMAN";
        e3.sal   = 1250;
        e3.mgr   = 7698;

        Emp e4 = new Emp();
        e4.empno = 7566;
        e4.ename = "JONES";
        e4.job   = "MANAGER";
        e4.sal   = 2975;
        e4.mgr   = 7839;

        Emp e5 = new Emp();
        e5.empno = 7654;
        e5.ename = "MARTIN";
        e5.job   = "SALESMAN";
        e5.sal   = 1250;
        e5.mgr   = 7698;

        Emp e6 = new Emp();
        e6.empno = 7698;
        e6.ename = "BLAKE";
        e6.job   = "MANAGER";
        e6.sal   = 2850;
        e6.mgr   = 7839;

        Emp e7 = new Emp();
        e7.empno = 7782;
        e7.ename = "CLARK";
        e7.job   = "MANAGER";
        e7.sal   = 2450;
        e7.mgr   = 7839;

        Emp e8 = new Emp();
        e8.empno = 7788;
        e8.ename = "SCOTT";
        e8.job   = "ANALYST";
        e8.sal   = 3000;
        e8.mgr   = 7566;

        Emp e9 = new Emp();
        e9.empno = 7839;
        e9.ename = "KING";
        e9.job   = "PRESIDENT";
        e9.sal   = 5000;
        e9.mgr   = 0;   // mgr 없음

        Emp e10 = new Emp();
        e10.empno = 7844;
        e10.ename = "TURNER";
        e10.job   = "SALESMAN";
        e10.sal   = 1500;
        e10.mgr   = 7698;

        Emp e11 = new Emp();
        e11.empno = 7876;
        e11.ename = "ADAMS";
        e11.job   = "CLERK";
        e11.sal   = 1100;
        e11.mgr   = 7788;

        Emp e12 = new Emp();
        e12.empno = 7900;
        e12.ename = "JAMES";
        e12.job   = "CLERK";
        e12.sal   = 950;
        e12.mgr   = 7698;

        Emp e13 = new Emp();
        e13.empno = 7902;
        e13.ename = "FORD";
        e13.job   = "ANALYST";
        e13.sal   = 3000;
        e13.mgr   = 7566;

        Emp e14 = new Emp();
        e14.empno = 7934;
        e14.ename = "MILLER";
        e14.job   = "CLERK";
        e14.sal   = 1300;
        e14.mgr   = 7782;
        
        EmpTable empTable = new EmpTable();
        empTable.join(e1);
        empTable.join(e2);
        empTable.join(e3);
        empTable.join(e4);
        empTable.join(e5);
        empTable.join(e6);
        empTable.join(e7);
        empTable.join(e8);
        empTable.join(e9);
        empTable.join(e10);
        empTable.join(e11);
        empTable.join(e12);
        empTable.join(e13);
        empTable.join(e14);
        
//        empTable.print();
//        empTable.whereSal(); // 기본 2000
        empTable.whereSal(3000);
        
        
//        System.out.println("e2.ename:"+ e2.ename);
	}

}
