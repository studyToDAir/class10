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
SELECT * FROM emp;
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
	

