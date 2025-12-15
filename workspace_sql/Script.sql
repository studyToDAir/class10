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


