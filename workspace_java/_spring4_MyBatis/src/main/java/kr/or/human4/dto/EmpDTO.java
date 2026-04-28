package kr.or.human4.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class EmpDTO {

	private int empno;
	private String ename;
	private String job;
	private int sal;
	private Integer mgr;
	private Date hiredate;
	private Integer comm;
	private int deptno;
	
	private int size = 10;
	private int page = 1;
	private int start = 0;
	private int end;
	
}
