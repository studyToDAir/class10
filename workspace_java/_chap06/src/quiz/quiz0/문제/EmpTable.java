package quiz.quiz0.문제;

import java.util.ArrayList;

public class EmpTable {

	// 1. ArrayList
	ArrayList<Emp> list = new ArrayList();
	ArrayList list2 = new ArrayList();
	// 2. 배열
	Emp[] arrList = new Emp[14];
	int lastIndex = 0;

	// 추가 메소드
	// Emp를 전달 받아서 저장한다
//	void join(int empno, String ename.....) {
	void join(Emp emp) {
		this.list.add(emp);
//		this.list2.add(emp);
//		emp.ename="aaa";

////		arrList[0] = emp;
//		if(lastIndex >= arrList.length) {
//			System.out.println("꽉찼어요");
//		} else {
////			arrList[lastIndex] = emp;
////			lastIndex++;
//
//			arrList[lastIndex++] = emp;
//		}

	}

	void print() {
		for (int i = 0; i < list.size(); i++) {
			Emp emp = list.get(i);
			emp.info();
		}
//		for(int i=0; i<list2.size(); i++) {
//			Emp emp = (Emp)list2.get(i);
//			emp.info();
//		}

//		for( Emp emp : list ) {
//			emp.info();
//		}

////		for( Emp emp : list2 ) {
//		for( Object emp : list2 ) {
//			((Emp)emp).info();
//		}
	}

	void whereSal() {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).sal >= 2000) {
				list.get(i).info();
			}
		}
	}

	void whereSal(int sal) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).sal >= sal) {
				list.get(i).info();
			}
		}
	}

	void whereMgr(int mgr) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).mgr == mgr) {
				list.get(i).info();
			}
		}
	}

	void whereMgrByEmpno(int empno) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).empno == empno) {

				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).mgr == list.get(i).mgr) {
						list.get(j).info();
						break;
					}
				}

				break;
			}
		}

		////////////////////////////
		int mgr = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).empno == empno) {
				mgr = list.get(i).mgr;
				break;
			}
		}

		if(mgr != -1) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).empno == mgr) {
					list.get(i).info();
				}
			}
		} else {
			System.out.println("사원 번호가 없습니다");
		}
	}
}



