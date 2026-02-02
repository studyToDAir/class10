SELECT * FROM emp;

SELECT empno, ename, deptno FROM emp;

SELECT
	sal,
	ename,
	123,
	'문자eng123'
FROM emp;

SELECT deptno FROM emp;
SELECT DISTINCT deptno FROM emp;
SELECT DISTINCT job FROM emp;

SELECT ename, sal, sal*12+comm, comm FROM EMP;
SELECT ename, sal, sal*12+comm AS "ann sal", comm FROM EMP;
SELECT ename, sal, sal*12+comm AS annsal, comm FROM EMP;
SELECT ename, sal, sal*12+comm annsal, comm FROM EMP;
SELECT ename name FROM emp;
SELECT ename as name FROM emp;
SELECT ename as 이름 FROM emp;

SELECT * FROM emp 
ORDER BY sal;
SELECT * FROM emp 
ORDER BY sal asc;

SELECT * FROM emp 
ORDER BY sal desc;

SELECT * FROM emp 
ORDER BY empno DESC;

SELECT * FROM emp
ORDER BY deptno, sal, empno;

SELECT * FROM emp
ORDER BY deptno asc, sal desc, empno;

SELECT DISTINCT job FROM emp;

SELECT 
	empno AS employee_no, 
	ename employee_name 
FROM emp
ORDER BY deptno DESC, ename ASC;

SELECT * 
FROM emp
WHERE deptno = 30;

SELECT * FROM emp
WHERE deptno = 30 AND job = 'SALESMAN';

SELECT * FROM emp
WHERE empno = 7499 AND deptno = 30;

SELECT * FROM emp
WHERE mgr = 7839 AND deptno = 20;

SELECT * FROM emp
WHERE deptno = 30 OR job = 'CLERK';


-- 한줄 주석
/*
	범위 주석
 */
SELECT * FROM emp
WHERE
	/*(deptno = 30
	OR deptno = 20)
	AND*/ job = 'CLERK'
ORDER BY deptno;

SELECT * FROM emp
WHERE sal >= 3000;

SELECT * FROM emp
WHERE sal >= 2500 AND job = 'ANALYST'; 

SELECT * FROM emp
--WHERE sal != 3000;
WHERE sal <> 3000;

SELECT * FROM emp
WHERE NOT sal <= 3000;



--문제1
--급여가 1500 이상이고 3000 미만인 사원을 출력
SELECT * FROM emp
WHERE 1500 <= sal AND sal < 3000;

--문제2
--job이 CLERK 이거나 급여가 2000 초과 이면서 부서번호 10번인 사원 출력
SELECT * FROM emp
WHERE
	job = 'CLERK'
	OR sal > 2000
	AND deptno = 10;

SELECT * FROM emp
WHERE
	job = 'CLERK'
	OR (sal > 2000 AND deptno = 10);

SELECT * FROM emp
WHERE
	(job = 'CLERK' OR sal > 2000)
	AND deptno = 10;

--문제3
--deptno가 10 또는 20인 모든 사원
SELECT * FROM emp
WHERE
	deptno = 10
	OR deptno = 20;

--문제4
--부서번호가 20또는 30인 사원 중에서 급여가 2000~3000 사이(포함)인 사람의
--연봉이 작은 순으로 출력. 단, 연봉이 같은 경우 이름이 빠른 순으로 정렬하여 출력
SELECT * FROM emp
WHERE
	(deptno = 20 OR deptno = 30)
	AND (sal >= 2000 AND sal <= 3000)
ORDER BY sal ASC, ename;

SELECT * FROM emp
WHERE deptno IN (10, 20);

SELECT * FROM emp
WHERE deptno not IN (10, 20);

-- 2000 이상이고 3000 이하
-- between은 미만, 초과는 표현할 수 없다
SELECT * FROM emp
WHERE (sal BETWEEN 2000 AND 3000);

-- 2000 이상이고 3000 이하
-- 2000 >= sal and sal <= 3000
-- 2000 미만이거나 3000 초과
-- not (2000 >= sal and sal <= 3000)
-- 2000 < sal or sal > 3000
SELECT * FROM emp
WHERE (sal NOT BETWEEN 2000 AND 3000);

SELECT * FROM emp
WHERE (sal NOT BETWEEN 2000 AND 3000)
AND deptno = 30;

SELECT * FROM emp
WHERE ename LIKE 'S%';

-- N으로 끝나는 이름
SELECT * FROM emp
WHERE ename LIKE '%N';

SELECT * FROM emp
WHERE ename LIKE '_L%';

-- 이름이 다섯 글자인 사람
SELECT * FROM emp
WHERE ename LIKE '_____';

SELECT * FROM emp
WHERE ename LIKE '%AM%';

SELECT * FROM emp
WHERE ename NOT LIKE '%A%';

SELECT * FROM emp
WHERE ename LIKE '%A%S%';


SELECT comm FROM emp;

SELECT * FROM emp
WHERE comm = NULL;

SELECT * FROM emp
WHERE comm IS NULL;

SELECT * FROM emp
WHERE comm IS NOT NULL;


SELECT * FROM emp
WHERE ename LIKE '%A%' AND deptno IN (10,20);

SELECT * FROM EMP WHERE deptno = 10;	-- 3명
SELECT * FROM EMP WHERE deptno = 20;	-- 5명

SELECT * FROM EMP WHERE deptno = 10
union
SELECT * FROM EMP WHERE deptno = 20;

SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION 
SELECT sal, job, deptno, sal FROM emp WHERE deptno = 20;

SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION all
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10;

-- Q1
SELECT * FROM emp
WHERE ename LIKE '%S';
-- Q2
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE deptno = 30 AND job = 'SALESMAN';
-- Q3-1
SELECT empno, ename, job, sal, deptno FROM emp
WHERE deptno IN (20, 30) AND sal > 2000;
-- Q3-2
SELECT empno, ename, job, sal, deptno FROM emp
WHERE deptno = 20 AND sal > 2000
UNION ALL
SELECT empno, ename, job, sal, deptno FROM emp
WHERE deptno = 30 AND sal > 2000;
-- Q4
SELECT * FROM emp
WHERE NOT (sal >= 2000 AND sal <= 3000);
-- Q5
SELECT ename, empno, sal, deptno FROM emp
WHERE 
	ename LIKE '%E%'
	AND deptno = 30
	AND sal NOT BETWEEN 1000 AND 2000;
-- Q6




/* 함수 */
SELECT ename, upper(ename), lower(ename), initcap(ename)
FROM emp;

SELECT 1 FROM dual;
SELECT upper('aBc'), lower(123), upper( lower('aBc') ) FROM dual;

SELECT * FROM emp
WHERE lower(ename) LIKE lower('%aM%');

SELECT ename, length(ename) FROM emp;

SELECT * FROM emp
WHERE length(ename) = 5;

SELECT length('a'), length('한'), lengthb('a'), lengthb('한') FROM dual;

-- substr(대상, 시작하는 곳, 몇 개)
SELECT 
	job, 
	substr(job, 1, 2), 
	substr(job, 3, 3), 
	substr(job, 5)
FROM emp;
-- 사원 이름을 두번째부터 3글자만 출력
SELECT substr(ename, 2, 3) FROM emp;
SELECT substr(ename, 2, 3000) FROM emp; -- 마지막 숫자가 커도 끝까지만 출력
SELECT substr(ename, 20, 3) FROM emp; -- 실제 길이보다 시작이 크면 null

SELECT ename, substr(ename, -3, 2) FROM emp;
SELECT ename, substr(ename, -30, 2) FROM emp;

-- replace(대상, 바뀔 문자, 바꿀 문자)
-- "모든" 바뀔 문자를 바꿀 문자로 변경
SELECT 
	'a-b-c',
	replace('a-b-c', '-', ' '),
	replace('a-b-c', '-', ';'),
	replace('a-b-c', '-'),
	replace('a-b-c', '-', '')
FROM dual;

-- 사원 이름에 A를 모두 'abc'로 교체
SELECT ename, replace(ename, 'A', 'abc') FROM emp;

-- lpad, rpad
-- 모자르면 채우고
-- 넘치면 자른다
-- 즉, 두번째 값의 길이로 만들어준다
SELECT lpad(ename, 10, '#'), lpad(ename, 5, '#') FROM emp;



-- 문제1
--	ename에서 앞에 두 글자만 출력
--	substr, lpad, replace
--	WARD >> WA, SMITH >> SM
SELECT 
	ename, 
	substr(ename, 1, 2), 
	lpad(ename, 2, ' '),
	-- 원본에서 
	-- 3번째 부터 끝까지 문자를 
	-- 없애자
	replace(ename, substr(ename, 3), '' )
FROM emp;

-- 문제2
--	ename의 앞 두글자만 원본을 출력하고
--	나머지는 4개의 *로 표시
--	WARD >> WA****, SMITH >> SM**** 
SELECT
	substr(ename, 1, 2),
	rpad(substr(ename, 1, 2), 6, '*')
FROM emp;
-- 문제3
--	ename의 앞 두글자만 원본을 출력하고
--	나머지는 *로 출력
-- 	단, 전체 길이는 원래 이름의 길이만큼
--	WARD >> WA**, SMITH >> SM*** 

SELECT
	substr(ename, 1, 2),
	rpad(substr(ename, 1, 2), LENGTH(ename), '*')
FROM emp;
-- 문제 4
-- 앞 두글자만 *처리
SELECT
	ename,
	substr(ename, 3),
	lpad(substr(ename, 3), LENGTH(ename), '*')
FROM emp;
	
SELECT 'ab' || 'cd' || 'efg' FROM dual;
SELECT empno || ':' || ename FROM emp;

SELECT 
	'[' || '  _ _oracle_ _   ' || ']',
	'[' || trim('  _ _oracle_ _   ') || ']'
FROM dual;

SELECT
	round(14.46),
	round(14.46, 0),
	round(14.46, 1), -- 14.5
	round(14.46, -1)
FROM emp;

SELECT
	trunc(14.46),
	trunc(14.46, 0),
	trunc(14.46, 1),
	trunc(14.46, -1),
	trunc(-14.46)
FROM emp;

SELECT
	ceil(3.14),
	floor(3.14),
	ceil(-3.14),
	floor(-3.14),
	trunc(-3.14)
FROM emp;

SELECT
	mod(15, 6), mod(15, 0)
FROM dual;

SELECT 15/6, 15/0 FROM dual;

SELECT 
	mod(6, 3), 
	mod(7, 3), 
	mod(8, 3), 
	mod(9, 3)
FROM dual;

SELECT sysdate FROM dual;

SELECT to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') FROM dual;
SELECT empno FROM emp;
SELECT to_char(
         sysdate,
         'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"'
       )
FROM dual;

SELECT * FROM emp
WHERE hiredate > to_date('1981/06/01', 'yyyy/mm/dd');

SELECT 
	sal, comm, 
	nvl(comm, 0), 
	sal+nvl(comm, 0), 
	sal+comm,
	nvl(to_char(comm), 'N/A')
FROM emp;

SELECT job,sal,
	decode(job,						-- job이
			'MANAGER', sal*1.1,		-- 정확히 MANAGER라면
			'SALESMAN', sal*1.05,
			'ANALYST', sal,
			sal*1.03				-- 위 조건에 없다면
			) AS upsal
FROM emp;

SELECT job, sal,
	CASE job
		WHEN 'MANAGER' THEN sal*1.1
		WHEN 'SALESMAN' THEN sal*1.05
		WHEN 'ANALYST' THEN sal
		ELSE sal*1.03
	END upsal
FROM emp;

SELECT comm,
	CASE 
		WHEN comm IS NULL THEN '원래 없어요'
		WHEN comm = 0 THEN '수당 없음'
		WHEN comm > 0 THEN '수당: ' || comm
	END text
FROM emp;
	

SELECT ename, length(ename) FROM emp;

SELECT sum(comm) FROM emp;

SELECT sum(sal) FROM emp;
--SELECT sum(sal), sal FROM emp;
SELECT sum(1) FROM emp;

SELECT count(sal) FROM emp;
SELECT count(comm) FROM emp;
SELECT count(*) FROM emp;

SELECT count(*) FROM emp
WHERE deptno = 30;

SELECT max(sal) FROM emp;
SELECT min(sal) FROM emp;

SELECT 
	max(sal), min(sal), min(hiredate), min(comm),
	count(*), sum(sal)
FROM emp;

SELECT avg(sal) FROM emp;

-- 이름에 a가 들어가는 사람은 몇명?
-- 'a'
SELECT count(*) FROM emp
WHERE lower(ename) LIKE lower('%a%');

SELECT DISTINCT deptno FROM emp;

-----------------
-- group by
/*
 * 제약 1. select에는 group by에 적은 컬럼 명만 가능하다
 * 제약 2. select에 집계 함수는 가능하다
 */
SELECT deptno
FROM emp
GROUP BY deptno;

SELECT deptno, count(*), sum(sal)
FROM emp
GROUP BY deptno;

SELECT deptno, job
FROM emp
GROUP BY deptno, job;

SELECT deptno, job, count(*)
FROM emp
GROUP BY deptno, job;

/*
SELECT * FROM emp
WHERE avg(sal) < sal;
*/

SELECT deptno, job 
FROM emp
WHERE deptno = 10
GROUP BY deptno, job;

SELECT deptno, job 
FROM emp
--WHERE deptno = 10
GROUP BY deptno, job
HAVING deptno = 10;

SELECT deptno, job, avg(sal)
FROM emp
GROUP BY deptno, job;

SELECT deptno, job, avg(sal)
FROM emp
GROUP BY deptno, job
HAVING avg(sal) > 2000;

-- job별로 3명 이상인 job과 count(*)를 표시
SELECT job, count(*) cnt
FROM emp
-- WHERE cnt >= 3;
-- WHERE count(*) >= 3;
WHERE sal > 1000
GROUP BY job
HAVING count(*) >= 3;



/*
SELECT job, sal AS num
FROM emp
WHERE num > 1;
*/

-- 실행 순서
/* 5 */ SELECT job, 1 AS num
/* 1 */ FROM emp
/* 2 */ WHERE sal > 1000
/* 3 */ GROUP BY job
/* 4 */ HAVING count(*) >= 3
/* 6 */ ORDER BY job DESC, num;


SELECT * FROM dept;
SELECT * FROM emp;

-- 모든 조합이 다 나온다
SELECT *
FROM emp, dept;

SELECT *
FROM emp, dept
ORDER BY empno;

-- emp에서 SMITH의 deptno만 출력
SELECT deptno FROM emp WHERE ename = 'SMITH';
-- dept에서 deptno가 20인 줄 모든 컬럼 출력
SELECT * FROM dept WHERE deptno = 20;

-- where로 필요한 것만 뽑는다
SELECT *
FROM emp, dept
WHERE emp.deptno = dept.deptno;

SELECT *
FROM emp e, dept d
--WHERE emp.deptno = d.deptno;
WHERE e.deptno = d.deptno;

SELECT scott1_0.emp.ename 
FROM scott1_0.emp;

--SELECT ename, * FROM emp;
SELECT ename, emp.* FROM emp;
-- scheme

-- ambiguously 애매하다
SELECT ename, deptno
FROM emp e, dept d
--WHERE emp.deptno = d.deptno;
WHERE e.deptno = d.deptno;

SELECT ename, e.deptno
FROM emp e, dept d
--WHERE emp.deptno = d.deptno;
WHERE e.deptno = d.deptno;

SELECT ename, e.deptno, e.*
FROM emp e, dept d
--WHERE emp.deptno = d.deptno;
WHERE e.deptno = d.deptno;

SELECT * FROM salgrade;

-- 800
SELECT sal FROM emp WHERE ename = 'SMITH';

SELECT ename, sal, grade, losal, hisal
FROM emp e, salgrade s
WHERE e.sal >= s.losal AND e.sal <= s.hisal;

--7902
SELECT mgr FROM emp WHERE ename = 'SMITH';
SELECT * FROM emp WHERE empno = 7902;

-- king은 mgr이 null이어서 결과에서 빠졌다
SELECT e1.empno, e1.ename, e1.mgr, 
	   e2.empno, e2.ename, e2.mgr
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;

SELECT *
FROM emp e NATURAL JOIN dept d;

SELECT deptno
FROM emp e NATURAL JOIN dept d;

SELECT deptno, e.empno, dname
FROM emp e JOIN dept d using(deptno);

SELECT d.deptno, d.*
FROM emp e JOIN dept d on(e.deptno = d.deptno)
WHERE sal <= 2000;

SELECT *
FROM emp e1 JOIN emp e2 on(e1.mgr = e2.empno);

SELECT *
FROM emp e1 LEFT OUTER JOIN emp e2 on(e1.mgr = e2.empno);

SELECT *
FROM emp e1 right OUTER JOIN emp e2 on(e1.mgr = e2.empno);

SELECT *
FROM emp e1 full OUTER JOIN emp e2 on(e1.mgr = e2.empno);

SELECT *
FROM emp e, dept d, salgrade s
WHERE e.deptno = d.deptno
AND e.sal >= s.losal
AND e.sal <= s.hisal
AND sal > 2000;

SELECT *
FROM emp e
	LEFT OUTER JOIN dept d on (e.deptno = d.deptno)
	LEFT OUTER join salgrade s ON (e.sal >= s.losal
									AND e.sal <= s.hisal);			

-- 퀴즈
-- 각 부서별로
-- 가장 높은 급여, 
-- 가장 낮은 급여,
-- 가장 높은 급여와 낮은 급여의 차액,
-- 부서 번호
-- HINT : 결과는 총 3줄
SELECT deptno, max(sal), min(sal), max(sal) - min(sal)
FROM emp
GROUP BY deptno;

-- 226p. 1~4번까지 문제 풀기
-- Q1
-- 정렬이 이상해서 똑같지 않음
SELECT emp.deptno, dept.dname, empno, ename, sal
FROM emp, dept
WHERE 
	emp.deptno = dept.deptno
	AND sal > 2000
ORDER BY emp.deptno, job;

SELECT emp.deptno, dept.dname, empno, ename, sal
FROM emp
	LEFT OUTER JOIN dept ON emp.deptno = dept.deptno
WHERE sal > 2000
ORDER BY emp.deptno, job;

-- Q2
SELECT e.deptno, dname, floor( avg(sal) ) avg_sal, max(sal) max_sal, min(sal) min_sal, count(*) cnt
FROM emp e, dept d
WHERE e.deptno = d.deptno
GROUP BY e.deptno, dname;

-- Q3
SELECT deptno, dname, empno, ename, job, sal
FROM dept d
	LEFT OUTER JOIN emp e USING (deptno)
ORDER BY deptno, ename;

SELECT deptno FROM emp
GROUP BY deptno;
SELECT * FROM dept;

-- Q4
SELECT d.deptno, d.dname, 나.empno, 나.ename
	, 나.mgr, 나.sal, 나.deptno deptno_1, s.losal, s.hisal, s.grade,
상사.empno mgr_empno, 상사.ename mgr_ename
FROM dept d
	LEFT OUTER JOIN emp 나 ON (나.deptno = d.deptno)
	LEFT OUTER JOIN emp 상사 ON (나.mgr = 상사.empno)
	LEFT OUTER JOIN salgrade s 
		ON (나.sal >= s.losal AND 나.sal <= s.hisal)
ORDER BY d.deptno, 나.empno;


-----------------
-- 서브쿼리
-----------------

SELECT *
FROM emp
-- WHERE sal > 2975;
WHERE sal > (SELECT SAL 
			   FROM emp
			  WHERE ename = 'JONES');

SELECT *
FROM EMP e 
WHERE hiredate < 	(SELECT hiredate
					 FROM EMP
					 WHERE ename = 'SCOTT');

SELECT * FROM emp
WHERE sal > (SELECT avg(sal) FROM emp);


SELECT max(sal) FROM emp
GROUP BY deptno;

SELECT * FROM emp
WHERE sal IN (2850, 3000, 5000);

SELECT * FROM emp
WHERE sal IN (SELECT max(sal) FROM emp
			  GROUP BY deptno);

SELECT *
FROM (	SELECT * 
		FROM  emp 
		WHERE deptno = 10) e10, dept d
WHERE e10.deptno = d.deptno;
	

SELECT *
FROM (	SELECT deptno, ename 
		FROM  emp 
		WHERE deptno = 10) e10, dept d
WHERE e10.deptno = d.deptno;

SELECT job, count(*)
FROM emp
--WHERE count(*) >= 3
GROUP BY job
HAVING count(*) >= 3;

-- cnt는 select에서 동작하고
-- where는 그 전에 실행된다
SELECT job, count(*) cnt
FROM emp
WHERE cnt >= 3
GROUP BY job;

SELECT * 
FROM (
	SELECT job, count(*) cnt
	FROM emp
	GROUP BY job
)
WHERE cnt >= 3;

SELECT rownum, e.*
FROM emp e;

SELECT rownum, e.*
FROM emp e
ORDER BY sal;

-- 깜짝퀴즈
-- 연봉 오름차순으로 정렬된 채로 줄 번호 적용

SELECT rownum, e.*
FROM (
	SELECT * FROM EMP
	ORDER BY sal
) e
WHERE rownum = 6; -- rownum 자체가 의미가 있다

SELECT rownum rnum, e.*
FROM (
	SELECT * FROM EMP
	ORDER BY sal
) e
WHERE rnum = 6;


SELECT *
FROM (
	SELECT rownum rnum, e.*
	FROM (
		SELECT * FROM EMP
		ORDER BY sal
	) e
)
WHERE rnum = 6;

SELECT *
FROM (
	SELECT rownum rnum, e.*
	FROM (
		SELECT * FROM EMP
		ORDER BY sal
	) e
)
WHERE rnum >= 6 AND rnum <= 10;

WITH e10 AS (
	SELECT * FROM emp WHERE deptno = 10
)
SELECT ENAME FROM e10;


SELECT 
	sal, 
	ename,
	(SELECT 
		grade
	 FROM salgrade
	 WHERE e.sal BETWEEN losal AND hisal) grade
FROM emp e;


-- 문제1
-- comm이 null인 사원을 급여 내름차순으로 정렬
SELECT * FROM emp
WHERE comm is NULL
ORDER BY sal DESC;
-- 문제2
-- 급여 등급 별 사원 수를 등급 오름차순으로 정렬
-- 출력 : 등급, 몇명
SELECT s.grade, count(*)
FROM emp e
	LEFT OUTER JOIN salgrade s 
	ON (e.sal >= s.losal AND e.sal <= s.hisal)
GROUP BY s.grade
ORDER BY s.grade ASC;

-- 문제3
-- 출력: 이름, 급여, 급여 등급, 부서 이름
-- 급여 등급 3 이상, 급여 등급 내림 차순, 
-- 급여 등급이 같은 경우 급여 내림 차순
SELECT ename, sal, grade, dname
FROM emp e
	LEFT OUTER JOIN dept d ON (e.deptno = d.deptno)
	LEFT OUTER JOIN salgrade s on(e.sal >= s.losal AND e.sal <= s.hisal)
WHERE s.grade >= 3
ORDER BY s.grade DESC, e.sal DESC;
	
-- 문제4
-- 부서명이 SALES인 사원 중
-- 급여 등급이 2 또는 3인 사원 급여를 내림차순으로 정렬
SELECT *
FROM emp e
	LEFT OUTER JOIN dept d USING (deptno)
	LEFT OUTER JOIN salgrade s on(e.sal >= s.losal AND e.sal <= s.hisal)
WHERE 
  (s.grade = 2 OR s.grade = 3)
--  s.grade IN (2, 3)
--  s.grade >= 2 AND s.grade <=3
  AND dname = 'SALES'
ORDER BY sal DESC;

-- 249p Q1~Q4
-- Q1
SELECT *
FROM EMP e, dept d
WHERE e.deptno = d.deptno
AND job = (
	SELECT job
	FROM emp
	WHERE ename = 'ALLEN'
)
ORDER BY sal DESC, ename;

-- Q2
SELECT 
	empno,
	ename,
	(SELECT dname 
		FROM dept d 
		WHERE e.deptno = d.deptno) dname,
	hiredate,
	(SELECT loc
		FROM dept d 
		WHERE e.deptno = d.deptno) dname,
	sal,
	(SELECT grade
	FROM SALGRADE s
	WHERE e.sal BETWEEN s.losal AND s.hisal) grade
FROM emp e
WHERE sal > (SELECT avg(sal) FROM emp)
ORDER BY sal DESC, empno desc;

-- Q3
SELECT * FROM emp
WHERE deptno = 10
AND job not IN ( 
	SELECT job FROM emp WHERE deptno = 30
);

-- Q4
SELECT empno, ename, sal, grade
FROM emp e
	LEFT OUTER JOIN salgrade s on(e.sal >= s.losal AND e.sal <= s.hisal)
WHERE sal > (
	SELECT max(sal) FROM emp WHERE job = 'SALESMAN'
)
-- WHERE sal > ALL ( SELECT sal FROM emp WHERE job = 'SALESMAN' )
ORDER BY empno;


-----------------------
-- 12장
-----------------------
desc emp; -- dbeaver에서 안된다(근데 원래 되야함)
SELECT * FROM emp;

CREATE TABLE emp_ddl (
	empno number(4),
	ename varchar2(10),
	job varchar2(9),
	mgr number(4),
	hiredate DATE,
	sal number(7,2),
	comm number(7,2),
	deptno number(2)
);
SELECT * FROM emp_ddl;

CREATE TABLE dept_ddl
AS SELECT * FROM dept;

SELECT * FROM dept_ddl;

CREATE TABLE emp_ddl_30
AS SELECT * FROM emp WHERE deptno = 30;
SELECT * FROM emp_ddl_30;

CREATE TABLE empdept_ddl
AS
SELECT empno, ename, job job2, d.deptno, dname
FROM emp e, dept d
WHERE 1 <> 1;

SELECT * FROM empdept_ddl;

CREATE TABLE emp_alter
AS SELECT * FROM emp;

SELECT * FROM emp_alter;

ALTER TABLE emp_alter
ADD hp varchar2(20);
SELECT * FROM emp_alter;

ALTER TABLE emp_alter
RENAME COLUMN hp TO tel;
SELECT * FROM emp_alter;

ALTER TABLE emp_alter
MODIFY empno number(5);
-- 크기는 늘어나는 경우만 가능. 줄어들지 못함
-- 다른 타입으로 변경할 경우 모든 값이 null일 때만 가능하다

ALTER TABLE emp_alter
DROP COLUMN tel;
SELECT * FROM emp_alter;

RENAME emp_alter TO emp_rename;
SELECT * FROM emp_rename;

TRUNCATE TABLE emp_rename;

DROP TABLE emp_rename;

-----------------------
-- 10장
-----------------------
CREATE TABLE dept_temp
AS SELECT * FROM dept;

SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, dname, loc)
VALUES (50, 'DATABASE', 'SEOUL');
SELECT * FROM dept_temp;

INSERT INTO dept_temp
VALUES (60, 'Network', 'BUSAL');
SELECT * FROM dept_temp;

INSERT INTO dept_temp
VALUES (70, 'WEB', null);
SELECT * FROM dept_temp;

-- ''도 null 취급
INSERT INTO dept_temp
VALUES (80, 'MOBILE', '');
SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, loc)
VALUES (90, 'INCHEON');
SELECT * FROM dept_temp;

CREATE TABLE emp_temp
AS SELECT * FROM emp WHERE 1 <> 1;
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (9999, '홍길동', '2026/01/27');
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (7051, '최민수', to_date('2026-01-27', 'yyyy-mm-dd') );
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (3111, '심청이', sysdate);
SELECT * FROM emp_temp;

INSERT INTO emp_temp 
select * FROM emp WHERE deptno = 10;

SELECT * FROM emp_temp;

INSERT ALL 
INTO emp_temp (empno, ename, hiredate)
	VALUES (3112, '심청이2', sysdate)
INTO emp_temp (empno, ename, hiredate)
	VALUES (3113, '심청이3', sysdate)
SELECT * FROM dual;

SELECT * FROM emp_temp;

------------
-- update --
------------
CREATE TABLE dept_temp2
AS SELECT * FROM dept;
SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET loc = 'SEOUL';
SELECT * FROM dept_temp2;

ROLLBACK;
SELECT * FROM dept_temp2;

-- update, delete 실행 하기 전에
-- where를 무조건 검증해보기!!
SELECT * FROM dept_temp2
WHERE deptno = 40;

UPDATE dept_temp2
SET dname = 'DATABASE', loc = 'SEOUL'
WHERE deptno = 40;
SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET dname = (SELECT dname
			 FROM dept
			 WHERE deptno = 40),
	loc = (SELECT loc
			 FROM dept
			 WHERE deptno = 40)
WHERE deptno = 40;
SELECT * FROM dept_temp2;

CREATE TABLE emp_tmp
AS SELECT * FROM emp;
SELECT * FROM emp_tmp;

SELECT ename, sal, sal * 1.08 FROM emp_tmp
WHERE sal < 1000;

UPDATE EMP_TMP
SET sal = sal * 1.08
WHERE sal < 1000;

SELECT * FROM emp_tmp
WHERE ename IN ('SMITH','JAMES');

CREATE TABLE emp_temp2
AS SELECT * FROM emp;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';
SELECT * FROM emp_temp2;

DELETE FROM emp_temp2;
SELECT * FROM emp_temp2;

ROLLBACK;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';
SELECT * FROM emp_temp2;

COMMIT;

SELECT * FROM emp_temp2;
ROLLBACK;
SELECT * FROM emp_temp2;


-----------------------------
-- 13장
--------------

SELECT * FROM dict;
SELECT * FROM user_tables;

-----------
-- index --
-----------
CREATE INDEX idx_emp_sal
ON emp (sal asc);

SELECT * FROM user_indexes;
SELECT * FROM user_ind_columns;

SELECT /*+ index(e idx_emp_sal) */ -- 강제 hint
	ename, sal
FROM emp e
WHERE sal = 3000;

CREATE VIEW vw_emp20
AS (SELECT empno, ename, job, deptno
	FROM EMP
	WHERE deptno = 20);

SELECT * FROM vw_emp20;

SELECT * FROM vw_emp20
WHERE job = 'CLERK';

CREATE TABLE dept_seq
AS SELECT * FROM dept WHERE 1 != 1;
SELECT * FROM dept_seq;

CREATE SEQUENCE seq_dept;

SELECT * FROM user_sequences;

-- 다음 값
SELECT seq_dept.nextval FROM dual;
SELECT seq_dept.nextval FROM dual;

-- 현재 값
-- 생성 후에 nextval 한번은 실행하고나서
-- currval 사용 가능
SELECT seq_dept.currval FROM dual;

CREATE SEQUENCE seq_dept_10
START WITH 10
INCREMENT BY 10;

SELECT seq_dept_10.currval FROM dual;

SELECT seq_dept_10.nextval FROM dual;
SELECT seq_dept_10.nextval FROM dual;

SELECT seq_dept_10.currval FROM dual;


INSERT INTO dept_seq (deptno, dname, loc)
VALUES (seq_dept_10.nextval, 'database', 'seoul');
SELECT * FROM dept_seq;

INSERT INTO dept_seq (deptno, dname, loc)
VALUES (seq_dept_10.nextval, 'database2', 'seoul2');
SELECT * FROM dept_seq;

SELECT * FROM emp

--------------
-- 제약 조건
--------------

-- 방법1
-- primary key를 두개 이상 줄 수 없다
CREATE TABLE table_pk (
	login_id varchar2(20) PRIMARY KEY,
	login_pw varchar2(20) NOT NULL,
	tel varchar2(20)
);
SELECT * FROM table_pk;

-- pk를 지정하면 index 자동 생성
SELECT * FROM user_indexes;

INSERT INTO table_pk
VALUES ('id1', 'pw1', null);

-- id 중복
INSERT INTO table_pk
VALUES ('id1', 'pw1', null);

-- not null에 null 추가
INSERT INTO table_pk
VALUES ('id2', null, null);

INSERT INTO table_pk (login_id)
VALUES ('id3');

INSERT INTO table_pk (login_id)
VALUES (null);

SELECT * FROM table_pk;
-- pk나 not null을 null로 변경
UPDATE table_pk
SET login_id = null
WHERE login_id = 'id1';

INSERT INTO table_pk
VALUES ('id2', 'pw2', null);
SELECT * FROM table_pk;

-- pk를 중복되는 값으로 변경
UPDATE table_pk
SET login_id = 'id1'
WHERE login_id = 'id2';

-- 방법2
-- pk 하나 이상 지정 가능
CREATE TABLE table_pk2 (
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20),
	PRIMARY KEY (login_id, login_pw)
);
-- 방법3
CREATE TABLE table_pk3 (
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20)
);
-- 두개 이상 가능
ALTER TABLE table_pk3
ADD PRIMARY key(login_id, login_pw);

-- 하나만 가능
ALTER TABLE table_pk3
MODIFY login_id PRIMARY KEY;

-- foreign key
CREATE TABLE dept_fk(
	deptno number(2) PRIMARY KEY,
	dname varchar2(14),
	loc varchar2(13)
);
-- 지정방식1
CREATE TABLE emp_fk(
	empno number(4) PRIMARY KEY,
	ename varchar2(10),
	deptno number(2) REFERENCES dept_fk(deptno)
);
-- null 됨(항상 됨)
INSERT INTO emp_fk
VALUES (1, '이름1', null);

-- 없는 값 안됨
INSERT INTO emp_fk
VALUES (2, '이름2', 1);

INSERT INTO dept_fk
VALUES (10, '부서', '위치');
SELECT * FROM dept_fk;

INSERT INTO emp_fk
VALUES (2, '이름2', 10);

INSERT INTO emp_fk
VALUES (3, '이름3', 10);
SELECT * FROM emp_fk;

-- 없는 값으로 update 안됨
UPDATE emp_fk
SET deptno = 20
WHERE deptno = 10;

-- 처다보고 있는 원본 값 삭제 안됨
DELETE dept_fk
WHERE deptno = 10;

DROP TABLE dept_fk;

UPDATE dept_fk
SET deptno = 20
WHERE deptno = 10;

TRUNCATE table dept_fk;


DELETE emp_fk
WHERE deptno=10;

UPDATE dept_fk
SET deptno = 20
WHERE deptno = 10;


-- 지정방식 2
create table emp (
	empno number(4),
	deptno number(2),
	ename varchar2(10),
	foreign key (deptno)  references dept(deptno)
)
-- 지정방식 3
create table emp (
	empno number(4),
	deptno number(2),
	ename varchar2(10)
)

alter table emp
add foreign key (deptno)  references dept(deptno)
