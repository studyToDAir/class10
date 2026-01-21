package quiz.quiz0.문제;

public class EmpExam_q5 {

	public static void main(String[] args) {

		Emp[] arrList = new Emp[140];
		arrList[0] = new Emp();
		arrList[1] = new Emp();
				
		Emp a = new Emp();
		Emp b = new Emp();
				
		Emp[] arrList2 = { new Emp(), new Emp() };
		
		Emp[] arrList3 = { a, b };
		
		
		arrList[0] = new Emp();
        arrList[0].empno = 7369;
        arrList[0].ename = "SMITH";
        arrList[0].job   = "CLERK";
        arrList[0].sal   = 800;
        arrList[0].mgr   = 7902;

        arrList[1] = new Emp();
        arrList[1].empno = 7499;
        arrList[1].ename = "ALLEN";
        arrList[1].job   = "SALESMAN";
        arrList[1].sal   = 1600;
        arrList[1].mgr   = 7698;

        arrList[2] = new Emp();
        arrList[2].empno = 7521;
        arrList[2].ename = "WARD";
        arrList[2].job   = "SALESMAN";
        arrList[2].sal   = 1250;
        arrList[2].mgr   = 7698;

        arrList[3] = new Emp();
        arrList[3].empno = 7566;
        arrList[3].ename = "JONES";
        arrList[3].job   = "MANAGER";
        arrList[3].sal   = 2975;
        arrList[3].mgr   = 7839;

        arrList[4] = new Emp();
        arrList[4].empno = 7654;
        arrList[4].ename = "MARTIN";
        arrList[4].job   = "SALESMAN";
        arrList[4].sal   = 1250;
        arrList[4].mgr   = 7698;

        arrList[5] = new Emp();
        arrList[5].empno = 7698;
        arrList[5].ename = "BLAKE";
        arrList[5].job   = "MANAGER";
        arrList[5].sal   = 2850;
        arrList[5].mgr   = 7839;

        arrList[6] = new Emp();
        arrList[6].empno = 7782;
        arrList[6].ename = "CLARK";
        arrList[6].job   = "MANAGER";
        arrList[6].sal   = 2450;
        arrList[6].mgr   = 7839;

        arrList[7] = new Emp();
        arrList[7].empno = 7788;
        arrList[7].ename = "SCOTT";
        arrList[7].job   = "ANALYST";
        arrList[7].sal   = 3000;
        arrList[7].mgr   = 7566;

        arrList[8] = new Emp();
        arrList[8].empno = 7839;
        arrList[8].ename = "KING";
        arrList[8].job   = "PRESIDENT";
        arrList[8].sal   = 5000;
        arrList[8].mgr   = 0;   // mgr 없음

        arrList[9] = new Emp();
        arrList[9].empno = 7844;
        arrList[9].ename = "TURNER";
        arrList[9].job   = "SALESMAN";
        arrList[9].sal   = 1500;
        arrList[9].mgr   = 7698;

        arrList[10] = new Emp();
        arrList[10].empno = 7876;
        arrList[10].ename = "ADAMS";
        arrList[10].job   = "CLERK";
        arrList[10].sal   = 1100;
        arrList[10].mgr   = 7788;

        arrList[11] = new Emp();
        arrList[11].empno = 7900;
        arrList[11].ename = "JAMES";
        arrList[11].job   = "CLERK";
        arrList[11].sal   = 950;
        arrList[11].mgr   = 7698;

        arrList[12] = new Emp();
        arrList[12].empno = 7902;
        arrList[12].ename = "FORD";
        arrList[12].job   = "ANALYST";
        arrList[12].sal   = 3000;
        arrList[12].mgr   = 7566;

        arrList[13] = new Emp();
        arrList[13].empno = 7934;
        arrList[13].ename = "MILLER";
        arrList[13].job   = "CLERK";
        arrList[13].sal   = 1300;
        arrList[13].mgr   = 7782;
        
        
        for(int i=0; i<arrList.length; i++) {
        	
//        	if(arrList[i] != null) {
//        		arrList[i].info();
//        	}
        	
	    	if(arrList[i] == null) {
	    		continue;
	    	}
	    	arrList[i].info();
        }
		
	}

}
