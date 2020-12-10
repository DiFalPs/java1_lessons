-- это 1 задание с сотрудниками, правда я так понял, чтобы одновременно по всем отделам глянуть нужны временные таблицы (если правильно нагуглил)
SELECT 
    AVG(t1.salary) AS dept_avg_salary, t2.dept_no, t1.salary
FROM
    salaries t1
        LEFT JOIN
    dept_emp t2 ON (t2.emp_no = t1.emp_no)
WHERE
    dept_no IN ('d005') AND t1.salary > 1

-- это 2 задание с сотрудниками
SELECT 
    MAX(salary) AS emp_max_salary, emp_no
FROM
    salaries
WHERE
    emp_no IN (10001)

-- это 3 задание с сотрудниками
SELECT 
    MAX(salary) AS emp_max_salary, emp_no
FROM
    salaries
WHERE
    emp_no IN (10001);
DELETE FROM employees 
WHERE
    emp_no = 10001

-- это 4 задание с сотрудниками 
SELECT 
    dept_no, SUM(t1.emp_no) AS sum_emp_in_dept
FROM
    dept_emp t1
WHERE
    t1.dept_no IN ('d001' , 'd002',
        'd003',
        'd004',
        'd005',
        'd006',
        'd007',
        'd008',
        'd009')

