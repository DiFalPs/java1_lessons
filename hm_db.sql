
mysql> show database;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'database' at line 1
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| countries          |
| employees          |
| geodata            |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
7 rows in set (0.01 sec)

mysql> drop database employees
    -> drop database employees;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'drop database employees' at line 2
mysql> drop database employees;
Query OK, 8 rows affected (2.06 sec)

mysql> exit
Bye

C:\Users\DiFalP\Desktop\for dump>"C:\Program Files\MySQL\MySQL Server 8.0\bin\mysql.exe" -uroot -p
Enter password: ************
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 14
Server version: 8.0.22 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE SCHEMA `employees` ;
Query OK, 1 row affected (0.09 sec)

mysql> exit
Bye

C:\Users\DiFalP\Desktop\for dump>"C:\Program Files\MySQL\MySQL Server 8.0\bin\mysql.exe" -uroot -p employees < EMP_DUMP.sql
Enter password: ************

C:\Users\DiFalP\Desktop\for dump>


-- Создание пользователя

C:\Users\DiFalP>"C:\Program Files\MySQL\MySQL Server 8.0\bin\mysql.exe" -uroot -p
Enter password: ************
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 18
Server version: 8.0.22 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> create user 'second_amdin'@'localhost' identified by 'Torikegroik2';
Query OK, 0 rows affected (0.10 sec)

mysql> GRANT all privileges ON *.* TO 'second_amdin'@'localhost';
Query OK, 0 rows affected (0.07 sec)

mysql> exit
Bye

C:\Users\DiFalP>"C:\Program Files\MySQL\MySQL Server 8.0\bin\mysql.exe" -u second_amdin -p
Enter password: ************
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 21
Server version: 8.0.22 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databeses
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'databeses' at line 1
mysql>