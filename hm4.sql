-- задание 1

CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `our_view` AS
    SELECT 
        AVG(`t1`.`salary`) AS `dept_avg_salary`,
        `t2`.`dept_no` AS `dept_no`,
        `t1`.`salary` AS `salary`
    FROM
        (`salaries` `t1`
        JOIN `dept_emp` `t2` ON ((`t2`.`emp_no` = `t1`.`emp_no`)))
    WHERE
        (`t2`.`dept_no` = 'd005')


-- задание 2

USE `employees`;
DROP function IF EXISTS `find_manager`;

USE `employees`;
DROP function IF EXISTS `employees`.`find_manager`;
;

DELIMITER $$
USE `employees`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `find_manager`(first_name varchar(255), last_name varchar(255)) RETURNS int
    DETERMINISTIC
BEGIN
RETURN 
(SELECT 
    e.emp_no
FROM
    dept_manager dm
        JOIN employees e ON dm.emp_no = e.emp_no
WHERE e.first_name = first_name
AND e.last_name = last_name);
END$$

DELIMITER ;
;


-- задание 3

