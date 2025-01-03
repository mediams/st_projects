-- database
-- first database

create database learn;

use learn;

CREATE TABLE products (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(128),
    price INTEGER,
    discount DECIMAL(2 , 1 )
);

insert into products (title,price, discount) values ('bike',50000,0.9);
insert into products (title,price, discount) values ('skates',15000,0.1);
insert into products (title,price, discount) values ('skis',25000,null);
insert into products (title,price, discount) values ('board',30000,0.9);
insert into products (title,price, discount) values ('scooter',10000,0.8);

SELECT 
    *
FROM
    products
LIMIT 2;

use learn;

SELECT 
    title, price, discount, price
FROM
    products;

SELECT 
    *
FROM
    products;

SHOW TABLES;

SELECT 
    *
FROM
    products
WHERE
    price NOT BETWEEN 2000 AND 3000;


SELECT 
    *
FROM
    products
WHERE
    price BETWEEN 20000 AND 30000;

SELECT 
    *
FROM
    products
WHERE
    price BETWEEN 20000 AND 30000;


SELECT 
    *
FROM
    products
WHERE
    id IN (3 , 2, 5);

SELECT 
    *
FROM
    products
WHERE
    title IN ('skis' , 'bike', 'scooter');

SELECT 
    *
FROM
    products
WHERE
    title LIKE 'sk%';

use hr;
show tables;
SELECT 
    *
FROM
    jobs
LIMIT 2;

SELECT 
    *
FROM
    employees
WHERE
    department_id = 90;


SELECT 
    *
FROM
    employees
WHERE
    salary > 5000;

SELECT 
    *
FROM
    employees
WHERE
    first_name LIKE 'L%';


SELECT 
    *
FROM
    departments
WHERE
    location_id = 1700;


USE HR;

SELECT 
    *
FROM
    departments
WHERE
    location_id = 1700;


SELECT 
    *
FROM
    locations
WHERE
    country_id = 'DE';

SELECT 
    salary
FROM
    employees
WHERE
    first_name = 'Lex'
        AND last_name = 'De Haan';


SELECT 
    *
FROM
    employees
WHERE
    job_id = 'FI_ACCOUNT' AND salary < 8000;


SELECT 
    *
FROM
    employees
WHERE
    commission_pct IS NULL;


SELECT 
    first_name, last_name
FROM
    employees
WHERE
    department_id NOT IN (80 , 90, 110);

SELECT 
    *
FROM
    employees
WHERE
    salary != 5000;

-- 02-10-2024
USE learn;

SELECT 
    *
FROM
    products;

SELECT 
    title AS product_name, price AS product_price
FROM
    products;

SELECT 
    title product_name, price product_price
FROM
    products;

SELECT 
    title,
    price,
    price - 500 AS discount,
    price * 0.95 AS discount_price,
    price * 2 AS new_price
FROM
    products;

SELECT 
    title, price, discount, price * discount AS sale_price
FROM
    products;

SELECT 
    title,
    price,
    price * 0.9 AS price_with_discount_10,
    price * 0.8 AS price_with_discount_20,
    price * 0.7 AS price_with_discount_30
FROM
    products;

SELECT 
    title, 'sport' AS category, 0 AS rate
FROM
    products;

SELECT 60;
SELECT abs(-15);
SELECT POW (3,2);
SELECT ROUND (4.7);
SELECT SQRT (225);

SELECT 
title,
POW (price, 2) as price
FROM
products;

-- strings function
-- concat - обьеденяет несколько строк
SELECT 
CONCAT ('Hello', ' ', 'World') AS concat;

SELECT
CONCAT (title, ' ', price) AS title,
id,
CONCAT ('Hello', ' ', 'World') AS concat
FROM products;

-- concat_ws - 
-- соеденяет несколько колонок через разделитель

SELECT
CONCAT_WS (' ', title, id, price) AS description,
discount
FROM products;

-- LOWER, UPPER

SELECT
UPPER (title),
LOWER ('Hello') AS greetings
FROM products;

SELECT
LENGTH ('Hello');  

SELECT
trim('   Hello   '),
LEFT(' Hello', 3),
right('Hello', 2),
substring('Hello World', 7,5),
REPLACE('9-0-0-1','-',''),
LOCATE('l', 'Hello');

-- ORDER

SELECT
title,
price
FROM products
ORDER BY title DESC;

SELECT
*
FROM products
ORDER BY price DESC, title ASC;

insert into products (title,price, discount) values ('board',30000,0.9);

SELECT
*
FROM products;

SELECT DISTINCT
title,
price,
id
FROM products;

-- CASE
SELECT
    title,
    price,
    discount,
    CASE
		WHEN price > 30000 THEN 'High'
        WHEN price BETWEEN 20000 AND 30000 THEN 'Medium'
        ELSE 'Low'
    END AS price_category
FROM products;

SELECT
*
FROM products;

SELECT
    title,
    price,
    discount
    (CASE
        WHEN discount IS NULL THEN price
        ELSE price * (1 - discount)
    END) AS sale_price
FROM products;

USE airport;

SELECT
model_name,
CASE
	WHEN distance > 1000 AND distance <= 2500 THEN 'Short'
	WHEN distance > 2500 AND distance <= 6000 THEN 'Short'	
    WHEN distance > 6000 THEN 'Long'
    ELSE "Can't fly..."
END AS category
FROM airliners;

SELECT
    model_name,
    CASE
        WHEN distance BETWEEN 1000 AND 2500 THEN 'Short'
        WHEN distance BETWEEN 2501 AND 6000 THEN 'Medium'
        WHEN distance > 6000 THEN 'Long'
        ELSE "Can't fly..."
    END AS category
FROM airliners;


-- HomeWork 06-10-24
use hr;

SELECT
*
FROM employees WHERE department_id = 80 OR department_id = 110;

SELECT
*
FROM employees WHERE salary BETWEEN 5000 AND 7000;

SELECT
*
FROM countries WHERE country_name LIKE '%g%';

SELECT
*
FROM locations WHERE postal_code LIKE '99%' OR postal_code LIKE '%99';

SELECT
*
FROM employees WHERE manager_id IS NULL;

--

use airport;

select * from airliners;

SELECT
	side_number AS Number,
	production_year AS Age,
    CASE
        WHEN distance < 2000 THEN 'Old'
        WHEN distance BETWEEN 2000 AND 2010 THEN 'Mid'
        ELSE "New"
    END AS Class
FROM airliners WHERE distance <= 10000 ORDER BY AGE;


SELECT
id,
trip_id,
CASE
		WHEN service_class ='PremiumEconomy' THEN price * 0.80
        WHEN service_class ='Economy' THEN price * 0.85
        WHEN service_class ='Business' THEN price * 0.9
        ELSE price * 1
    END AS new_price
FROM tickets WHERE service_class IN ('Economy', 'PremiumEconomy', 'Business');

-- lesson three 09.10.2024

-- varchar(32) - (2,4,8,16,32,64,128,255) хранит строковые данные
-- integer; int - хранит целое число
-- numeric(8.2) - хранит числа с плавающей запятой

-- DML - data manipulation language (SELECT, INSERT, DELETE, UPDATE)
-- DDL - data definition language (CREATE, DROP, ALTER, TRUNCATE)

-- CREATE - команда для создания таблицы (TABLE) или базы данных (DATABASE)

CREATE DATABASE students;

USE students;

CREATE TABLE people (
	first_name varchar (32),
    last_name varchar (32),
    age integer
);

SELECT *
FROM people;

-- INSERT (INTO) - добавляет данные в таблицу

-- полный вариант добавления данных

INSERT INTO people(first_name, last_name, age) VALUES ('Alex', 'Alexeev', 35);
-- отличный порядок колонок от порядка при создании таблицы
INSERT INTO people(age, first_name, last_name) VALUES (25, 'Oleg', 'Olegov');

-- вариант без указания перечня полей для вставки
-- будет использован порядок полей, указанных при создании таблицы!!!
-- такой вариант может поломаться при добавлении колонок в таблицу
INSERT INTO people VALUES ('Egor', 'Egorov', 40);


-- вариант вставки значений не во все колонки

INSERT INTO people(first_name, age) VALUES ('Max', 20);
INSERT INTO people(first_name, last_name) VALUES ('Petr', 'Petrov');

-- множественная вставка данных
INSERT INTO people (first_name, last_name) VALUES  	('Petr', 'Maximov'),
													('Maxim', 'Egorov'),
													('Oleg', 'Petrov');

-- вариант с использованием команды SET
INSERT INTO people SET last_name = 'Alexeev', age = 30;


-- для отключения блокировки от изменнеия  и удалени\ данных
SET SQL_SAFE_UPDATES = 0;

-- DELETE построчно удаляет данные из таблицы (возможно восстановить удаленные данные)
-- команда группы DML, (восстановить чтобы никто не заметил не получится)
DELETE FROM people; -- удаляет все строки из таблицы (построчно, можно восстановить)

SELECT * FROM people
WHERE age = 22;

DELETE FROM people
WHERE age = 22;

DELETE FROM people
WHERE age = 35 AND last_name LIKE 'A%';

SELECT *
FROM people;

-- TRUNCATE - полностью очищает таблицу (включая счетчики), без возможности восстановить данные!!! , но работает очень быстро
-- команда группы DDL

TRUNCATE TABLE people; -- полностью очищает таблицу

-- UPDATE - команда группы DML, изменяет данные в таблице


SELECT *
FROM people
WHERE first_name IS NULL;

UPDATE people
SET first_name = 'Max'
WHERE first_name IS NULL;

UPDATE people
SET age = 0
WHERE age IS NULL;

UPDATE people
SET first_name = "Name"
WHERE first_name IS NULL;

UPDATE people
SET age = age + 1;

-- ALTER -- команда группы DDL, изменяет структуру таблицы

ALTER TABLE people
ADD rate integer;

SELECT
    first_name,
    rate,
    last_name
FROM people;

ALTER TABLE people
DROP COLUMN rate; -- удаление столбца из таблицы

ALTER TABLE people
ADD address varchar(16);

--

UPDATE people
SET address = 'Berlin, Bonn, Regensburg, Dusseldorf'
WHERE first_name = 'Maxim';
-- Error Code: 1406. Data too long for column 'address' at row 5

ALTER TABLE people
MODIFY COLUMN address varchar(64); -- изменяет тип колонки

ALTER TABLE people
MODIFY COLUMN address varchar(8);
-- Error Code: 1406. Data too long for column 'address' at row 5


ALTER TABLE people
CHANGE last_name surname varchar(64); -- изменяет имя колонки

SELECT *
FROM people;

ALTER TABLE people
RENAME COLUMN surname TO last_name; -- изменяет имя колонки

ALTER TABLE people
RENAME TO people_two; -- изменяет имя таблицы

SELECT *
FROM people_two;

ALTER TABLE people_two
RENAME TO people;

-- DROP команда группы DDL, удаляет таблицу или базу данных (целиком и без восстановления)
DROP TABLE people; -- удаление таблицы !!!

DROP DATABASE students; -- удаление базы данных !!!

-- summary
use goods;
SELECT * FROM other_goods2;

CREATE TABLE other_goods AS -- создание новой таблицы на основе результата выборки
SELECT
*
FROM goods;

CREATE TABLE young_people AS
SELECT *
FROM goods
WHERE id=1;

CREATE TABLE other_goods2 LIKE goods;

DROP TABLE other_goods;

CREATE VIEW v_other_people AS
SELECT *
FROM goods;

SELECT *
FROM v_other_people;

DELETE FROM people
WHERE age IS NULL;

SELECT *
FROM people
WHERE age > 32;

INSERT INTO other_people (first_name, last_name, age) VALUES ('Max', 'Maximov', 38); -- Запрос на вставку данных

INSERT INTO other_people (first_name, last_name, age) 
														SELECT first_name, last_name, age
														FROM people
														WHERE age > 32;

SELECT 
t1.first_name
FROM (SELECT * 
      FROM people
      WHERE age > 32) AS t1;

--
-- 16-10-2024
--

-- lesson four
-- Констрейны — ограничения для колонок в таблице

-- not null — Данное ограничение исключает возможность поместить null в колонку
-- unique — Данное ограничение исключает возможность поместить дублирующее значение в эту же колонку
-- check - Устанавливает значениеб которые можно установить в колонку
		-- age integer check(age>18)
        -- age integer check (age between 18 and 45)
        -- exists varchar(1) check (exists in ('Y','N'))
        
-- primary key (PK) (not null + unique) однозначно идентифицируетб - первичный ключ, комбинация двух констрейнов
-- aouto_increment - автоматически увелечение значение в поле с каждой новой записью 
-- default - устанавливается значение по умолчанию для колонки 

use learn;

drop table if exists students_new;

CREATE TABLE students (
	id integer primary key auto_increment, 
    name varchar (32) not null,
    surname varchar(32) not null,
    age integer check (age between 18 AND 60),
	email varchar(64) unique
);

INSERT INTO students ( name, surname, age, email) VALUES ('ALex', 'Alexeev', 30, 'hello@gmail.com'), ('Ivan', 'Ivanov', 20, 'ivan@gmail.com');

INSERT INTO students ( name, surname, age, email) VALUES ('ALex', 'Alexeev', 25, '2ho@gmail.com');

INSERT INTO students ( name, surname, age, email) VALUES
('Maxim', 'Maximov', 40, 'hello@hello.com');
-- Error Code: 1062. Duplicate entry 'hello@hello.com' for key 'students.email'

INSERT INTO students (name, surname, age, email) VALUES 
('Maxim', 'Maximov', 65, 'hello2@hello.com');
-- Error Code: 3819. Check constraint 'students_chk_1' is violated.

INSERT INTO students (name, age, email) VALUES 
('Maxim', 45, 'hello2@hello.com');
-- Error Code: 1364. Field 'surname' doesn't have a default value

INSERT INTO students (id, name, surname, age, email) VALUES 
(5, 'Maxim', 'Maximov', 30, 'hello3@hello.com');
-- Error Code: 1062. Duplicate entry '2' for key 'students.PRIMARY'

ALTER TABLE students
MODIFY COLUMN surname varchar(32) not null default '';

INSERT INTO students (name, age, email) VALUES 
('Maxim', 45, 'hello2@hello.com');
-- Error Code: 1364. Field 'surname' doesn't have a default value

INSERT INTO students (name, surname, age, email) VALUES 
('Maxim', null, 45, 'hello2@hello.com');
-- Error Code: 1048. Column 'surname' cannot be null

-- add field rate with defaul 0

ALTER TABLE students
ADD rate integer check (rate between 0 and 5) default 0;

INSERT INTO students (name, surname, age, email, rate) VALUES 
('Egor', 'Egorov', 30, 'hello6@hello.com', 7);
-- Error Code: 3819. Check constraint 'students_chk_2' is violated.

INSERT INTO students (name, surname, age, email, rate) VALUES 
('Petr', 'Petrov', 25, null, 3);

ALTER TABLE students
MODIFY COLUMN email varchar(64) unique not null;
-- Error Code: 1138. Invalid use of NULL value	0.031 sec

SET SQL_SAFE_UPDATES = 0;

UPDATE students
SET email = id
WHERE email IS NULL OR email = '';

DELETE FROM students
WHERE id = 9;

-- TRUNCATE — не только удаляет данные, но и сбрасывает все счетчики
-- приводит таблицу в состояние как после создания
-- Восстановить данные НЕЛЬЗЯ!!!
TRUNCATE TABLE students;

-- Вертикальное объединение таблиц
-- UNION, UNION ALL -- команда позволяет строки одной таблицы присоединить к строкам
-- другой таблицы, причем соответствие колонок идет попозиционно

CREATE TABLE students_from_berlin(
id integer primary key auto_increment,
name varchar(32) not null,
surname varchar(32) not null
);

CREATE TABLE students_from_bonn(
id integer primary key auto_increment,
first_name varchar(32) not null,
last_name varchar(32) not null
);

INSERT INTO students_from_berlin(name, surname) VALUES
('Alex','Alexeev'),('Egor','Egorov');

INSERT INTO students_from_bonn(first_name ,last_name ) VALUES
('Max','Maximov'),('Oleg','Olegov');


-- При UNION, UNION ALL за структуру результата (выборки), а именно, имена колонок, порядок колонок, количество колонок отвечает первый SELECT

-- При UNION, UNION ALL очень важно, чтобы количество колонок в выборке было одинаковым в каждом SELECT!!!

SELECT id, name, surname, 0 AS rate FROM students_from_berlin
UNION ALL
SELECT id, first_name, last_name, rate FROM students_from_bonn;

ALTER TABLE students_from_bonn
ADD rate integer check (rate between 0 and 5) default 1;

SELECT CONCAT('br', '-', id) AS id, 0 AS rate, name, surname FROM students_from_berlin
UNION ALL
SELECT CONCAT('bn', '-', id), rate, first_name, last_name FROM students_from_bonn;

CREATE TABLE students_from_münchen(
id integer primary key auto_increment,
first_name varchar(32) not null,
last_name varchar(32) not null,
address varchar (32) not null
);

INSERT INTO students_from_münchen(first_name, last_name, address) VALUES
('Petr','Alexeev', 'street 01'),('Thomas','Egorov', 'ort 02');

SELECT id, first_name AS name, last_name AS surname, 0 AS rate, address, 'München' AS city FROM students_from_münchen
UNION ALL
SELECT id, name, surname, 0 AS rate, '', 'Berlin' AS city FROM students_from_berlin
UNION ALL
SELECT id, first_name, last_name, rate, 'UNDEFINED', 'Bohnn' AS city FROM students_from_bonn
ORDER BY id;

SELECT last_name FROM students_from_münchen
UNION ALL -- в результат попадает все, включая дубликаты
SELECT surname FROM students_from_berlin;

SELECT last_name FROM students_from_münchen
UNION -- в результат попадает все, кроме дубликатов
SELECT surname FROM students_from_berlin;


select * from students_from_berlin;
select * from students_from_bonn;
select * from students_from_münchen;


-- 
--
-- summary 

use learn;

SELECT  first_name, last_name, address FROM students_from_dusseldorf
UNION ALL
SELECT name, surname, '' FROM students_from_berlin
UNION ALL
SELECT first_name, last_name, '' FROM  students_from_bonn;

-- SUBSELECT 
-- SUBSELECT in FROM - результат работы одного запроса, является источником данных для другого запроса

SELECT
t1.first_name,
t1.last_name
FROM
	(SELECT  first_name, last_name, address FROM students_from_dusseldorf
	UNION ALL
	SELECT name, surname, '' FROM students_from_berlin
	UNION ALL
	SELECT first_name, last_name, '' FROM  students_from_bonn) AS t1
WHERE t1.first_name LIKE '%x'
ORDER BY t1.last_name;

SELECT
t1.first_name
FROM
	(SELECT
	first_name,
	last_name,
	address 
	FROM c
	WHERE address LIKE 'B%') AS t1;


SELECT
*
FROM c;

SELECT
*
FROM students_from_berlin;

-- SUBSELECT in WHERE - результат работы одного запроса - условие для другого

SELECT
*
FROM students_from_dusseldorf
WHERE first_name NOT IN (
						SELECT
						name
						FROM 
						students_from_berlin);
                        
                        
 CREATE DATABASE factory;
 USE factory;
 
-- employees : id int PK AI, surname v(128) not null, salary int 0;
 
-- administration : id int PK AI, surname v(128) not null, salary int 0;

-- staff : id int PK AI, surname v(128) not null;

CREATE TABLE employees(
id integer primary key auto_increment,
surname varchar(128) not null,
salary integer default 0
);

CREATE TABLE administration(
id integer primary key auto_increment,
surname varchar(128) not null,
salary integer default 0
);

CREATE TABLE staff(
id integer primary key auto_increment,
surname varchar(128) not null
);

INSERT INTO employees(surname, salary) VALUES ('Alexeev', 2000),('Maximov', 1000);

INSERT INTO administration(surname, salary) VALUES ('Sergeev', 9000),('Olegov', 10000);

INSERT INTO staff(surname) VALUES ('Petroff'),('Egorov');

-- print all personal from factory
-- id, surname, salary, category
-- category - worker, boss, staff

-- 1 | Sergeev | 9000 | Boss
-- 2 | Maximov |1000  | worker
-- ...

-- ORDER BY surname

SELECT id , surname , salary , 'worker' AS category FROM employees
UNION ALL
SELECT id , surname , salary , 'boss' FROM administration
UNION ALL
SELECT id , surname , 0 , 'staff' FROM staff
ORDER BY surname;

-- lesson 5 five

-- JOIN - горизоетальное обьеденение таблиц, к колонкам одной таблицы добавляютмся таблицы другой
-- INNER JION, LEFT JOIN, RIGHT JOIN

-- name | surname | age| passport | from | until |
-- Alex | Alexeev | 35 | 44444444 | 2024 | 2034  |

-- Table 1							Table2
-- name | surname | age|	 		passport | from | until |
-- Alex | Alexeev | 35 | 			44444444 | 2024 | 2034  |

USE learn;

CREATE TABLE person(
id integer primary key auto_increment,
name varchar(64) not null
);

INSERT INTO person(name) VALUE ("Max"),
								("Seva"),
                                ("Sveta"),
                                ("Lora");
                                
SELECT *
FROM person;

-- MAx - 25, Seva - 30, Sveta - 18, Lora - 21  
-- 1- 25     2-30       3 - 18      4 -21      

CREATE TABLE ages(
person_id integer,
age integer
);    

INSERT INTO ages (person_id, age) VALUES	(1,25),
											(2,30),
                                            (3,18),
                                            (4,21);
                                            
SELECT *
FROM ages;      

SELECT
t1.*, -- выбираем все поля из таблицы t1
t2.* -- выбираем все поля из таблицы t2
FROM person AS t1
INNER JOIN ages AS t2 -- команда присоединения колонок одной таблицы к колоекам другой таблицы 
ON t1.id = t2.person_id; -- условие сопоставления сироу одной таблицы к другой      


SELECT
t1.*, -- выбираем все поля из таблицы t1
t2.age -- выбираем все поля из таблицы t2
FROM person AS t1
INNER JOIN ages AS t2 -- команда присоединения колонок одной таблицы к колоекам другой таблицы 
ON t1.id = t2.person_id; -- условие сопоставления сироу одной таблицы к другой  
                               
-- INNER JOIN - Besonderheits     
INSERT INTO person(name) VALUE ("Alex"),
								("Frank");   
                                
                                
INSERT INTO ages (person_id, age) VALUES	(9,25),
											(12,30),
                                            (31,18),
                                            (44,21);    
                                            
-- INNER JOIN включает только тк строки, для которых ксть совпадения у обоих таблиц по условию указаннаму послк ключквого слова ON 


SELECT
t1.*,  
t2.age  
FROM person AS t1
INNER JOIN ages AS t2  
ON t1.id = t2.person_id;  

USE hr;

SELECT
first_name,
last_name,
department_id
FROM employees;

-- 

SELECT
t1.first_name,
t1.last_name,
t1.department_id,
t2.department_name
FROM employees AS t1
INNER JOIN departments AS t2
ON t1.department_id = t2.department_id;

SELECT
t1.first_name,
t1.last_name,
t2.job_title
FROM employees AS t1
INNER JOIN jobs AS t2
ON t1.job_id = t2.job_id;


SELECT
t1.first_name,
t1.last_name,
t2.department_name
FROM employees AS t1
INNER JOIN departments AS t2
ON t1.department_id = t2.department_id AND t2.department_name IN ("IT", "Treasury","IT Support");
-- WHERE t2.department_name IN ("IT", "Treasury","IT Support");
-- WHERE t2.department_name = "IT" OR t2.department_name = "Treasury" OR t2.department_name = "IT Support";


-- чысто на собеседовании
-- SELF JOIN ( SELF - это не кооманда, это подход) -- Имспользуем INNER JOIN 
SELECT
t1.first_name,
t1.last_name,
t2.first_name AS name_manager,
t2.last_name AS surname_manager
FROM employees AS t1
INNER JOIN employees AS t2
ON t1.manager_id = t2.employee_id;


SELECT
*
FROM departments;
                                
SELECT *
FROM jobs;

SELECT *
FROM employees;   

DESCRIBE employees; -- Das ist sehr interesant


-- summary lesson;
--

USE hr;

SELECT
t1.*,
t2.*
FROM employees AS t1
INNER JOIN employees AS t2
ON t1.manager_id = t2.employee_id AND t1.salary>t2.salary;


SELECT
t1.country_name,
t2.region_name
FROM countries AS t1
INNER JOIN regions AS t2
ON t1.region_id = t2.region_id;


SELECT
t1.city,
t1.state_province,
t2.country_name
FROM locations AS t1
INNER JOIN countries AS t2
ON t1.country_id = t2.country_id;

SELECT
l.city,
l.state_province,
c.country_name,
r.region_name
FROM locations AS l
INNER JOIN countries AS c
ON l.country_id = c.country_id
INNER JOIN regions AS r
ON c.region_id = r.region_id;


SELECT
t1.first_name,
t1.last_name,
t3.city
FROM employees AS t1
INNER JOIN departments AS t2
ON t1.department_id = t2.department_id
INNER JOIN locations AS t3
ON t2.location_id = t3.location_id AND t3.city IN('Seattle','Toronto');


-- ClassWork 30-10-2024 Lesson 6
--

-- LEFT JOIN, RIGHT JOIN, SELF JOIN  (not a command)
-- При левом соединение за основу берутся все строки левой таблицы, далее присоедняются колонки 
-- из правой таблицы, для тех строк, для которых есть совпадение в правой таблице, в присоединяемых 
-- колонках будет значение из правой таблицы, а для тех строк левой таблицы, для которых совпадений нет в присоединяемых колонках будет null

USE learn;

SELECT
p.name,
a.age
FROM person AS p
INNER JOIN ages AS a
ON p.id = a.person_id;


SELECT
p.name,
a.age
FROM person AS p -- person left table
LEFT JOIN ages AS a -- ages right table
ON p.id = a.person_id;

-- В отличие от внутреннего соединения, здесь принципиально какая таблица левая, какая правая
-- за основу здесь берется левая таблица!!! 
-- При внутреннем соединении - все равно где какая таблица

-- Task 1 : Вывести всx персон, для которых не задан возраст(person, ages)
-- все для которых - задано, заполнено, существует и тд 
-- практически всегда это INNER JOIN - все для которых - не задано, не заполнено, не найдено, нет - практически всегда LEFT JOIN

SELECT
p.name,
a.age
FROM person AS p  
LEFT JOIN ages AS a  
ON p.id = a.person_id -- // AND a.age IS null // Здесь условие `a.age IS null` добавляется непосредственно в ON-клаузу JOIN.
WHERE a.age IS null;
-- WHERE - сначала все присоединяем, а потом уже фильтруем те строки для которых в присоединяемых колонкаx
-- значение null - для этой задачи это корректно!!!

-- все для которых - задано, заполнено, существует и тд - практически всегда это INNER JOIN 
-- все для которых - не задано, не заполнено, не найдено, нет - практически всегда LEFT JOIN
-- если в результируещем запросе нам не нужны колонки из второй таблицы, то такие задачи можно
-- решить через подзапрос!!!!

-- Task 1-1 : Вывести всех персон, для которых не задан возраст(person, ages) - решение через подзапрос


SELECT
person_id
FROM ages;
-- diese beide

SELECT
id,
name
FROM person 
WHERE id NOT IN (1,2,3,4,9,12,44);
 -- ↑↓↓↓↓
 -- ist gleich↓
SELECT
id,
name
FROM person 
WHERE id NOT IN (
				SELECT
				person_id
				FROM ages
);

USE hr;

-- Task 2 : Необходимо вывести названия департаментов, в которых никто не работает

SELECT
department_name,
department_id
FROM departments 
WHERE department_id NOT IN (
				SELECT
				department_id
				FROM employees
); -- FALSH

SELECT
department_name
FROM departments
WHERE department_id NOT IN (
							SELECT
							department_id
							FROM employees
							WHERE department_id IS NOT NULL); -- correct

SELECT
employee_id,
department_id
FROM employees;

SELECT
d.department_name
-- e.department_id
FROM departments AS d
LEFT JOIN employees AS e
ON d.department_id = e.department_id  WHERE e.department_id IS NULL;

USE learn;

-- RIGHT JOIN
-- При правом соединении за основу берутся все строки правой таблицы, далее присоедняются колонки 
-- из левой таблицы, для тех строк, для которых есть совпадение в левой таблице, в присоединяемых 
-- колонках будет значение из левой таблицы, а для тех строк правой таблицы, для которых совпадений нет 
-- в присоединяемых колонках будет null

SELECT
p.id, 
p.name,
a.age
FROM person AS p
RIGHT JOIN ages AS a -- за основу берутся строки правой таблицы!!! в левом - основа левая таблица!
ON p.id = a.person_id;

SELECT
p.id, 
p.name,
a.age
FROM ages  AS a
LEFT JOIN person AS p -- за основу берутся строки left таблицы!!! в right - основа левая таблица!
ON p.id = a.person_id;

-- FULL JOIN - LEFT JOIN + UNION ALL + RIGHT JOIN
-- shop

USE shop;

-- Task 2 : print name for All sellers and name their boss

SELECT
s1.SNAME AS seller_Name,
s2.SNAME AS boss_Name
FROM sellers AS s1
LEFT JOIN sellers AS s2
ON s1.BOSS_ID = s2.SELL_ID;

SELECT 
t1.SNAME AS name1,
t2.SNAME AS name_of_boss
FROM sellers AS t1
LEFT JOIN sellers AS t2
ON t1.BOSS_ID = t1.SELL_ID;
--

-- Task 3 : print all customers and their orders id
SELECT
c.CNAME,
o.ORDER_ID
FROM customers AS c
LEFT JOIN orders AS o
ON c.CUST_ID = o.CUST_ID;


-- Task 4: print client name, order amount for clients with order amount more than 1000
SELECT
c.CNAME,
o.ORDER_ID,
o.AMT
FROM customers AS c
INNER JOIN orders AS o
ON c.CUST_ID = o.CUST_ID AND o.AMT > 1000; -- besser
-- ON c.CUST_ID = o.CUST_ID WHERE o.AMT > 1000; -- schlechter


-- summary 
-- 

use shop;

-- Task 1 : print all sellers(id, name) and their orders(id, date)
SELECT
s.SELL_ID,
s.SNAME,
o.ORDER_ID,
o.ODATE
FROM sellers AS s
LEFT JOIN orders AS o
ON s.SELL_ID = o.SELL_ID;

-- Task 2 : print customers name with orders and add to result sellers name
-- add conditional sellers and customers from different cities
SELECT
c.CNAME,
o.ORDER_ID,
s.SNAME
FROM customers AS c
INNER JOIN orders AS o
ON c.CUST_ID = o.CUST_ID
INNER JOIN sellers AS s
ON o.SELL_ID = s.SELL_ID AND c.CITY <> s.CITY;



-- Task 3 : print customers name without any orders 
SELECT
c.CNAME,
o.ORDER_ID
FROM customers AS c
LEFT JOIN orders AS o
ON c.CUST_ID = o.CUST_ID WHERE o.ORDER_ID IS NULL;

SELECT
CNAME
FROM customers
WHERE CUST_ID NOT IN (
							SELECT
							CUST_ID
							FROM orders
							WHERE ORDER_ID IS NOT NULL);    
                            
-- Task 4 : print seller name, boss name,   difference between boss comm and sel comm  
-- include sellers without boss
    
SELECT
s1.SNAME AS sellers,
s2.SNAME AS Boss,
s2.COMM - s1.COMM  AS difference
FROM sellers AS s1
left JOIN sellers AS s2
ON s1.BOSS_ID = s2.SELL_ID;

-- lesson seven
--

CREATE DATABASE uni;
USE uni;

-- students (id - pk ai, name string 128 not null, age int)

CREATE TABLE students (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (128) NOT NULL,
age INTEGER
);

-- teacher (id - pk ai, name string 128 not null, age int)

CREATE TABLE teacher (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (128) NOT NULL,
age INTEGER
);

-- competencies (id - pk ai, title string 128 not null, age int)

CREATE TABLE competencies (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
title VARCHAR (128) NOT NULL
);

-- teachers2competencies (id - pk ai, teacher_id int, competencies_id)

CREATE TABLE teachers2competencies (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
teacher_id INTEGER,
competencies_id INTEGER
);

-- courses (id - pk ai,teacher_id, title string 128 not null, headman_id int)

CREATE TABLE courses (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
teacher_id INTEGER,
title VARCHAR (128) NOT NULL,
headman_id INTEGER
);

-- students2courses (id - pk ai, student_id, course_id)
CREATE TABLE students2courses (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
student_id INTEGER,
course_id INTEGER
);

ALTER TABLE teacher RENAME TO teachers;

-- Task 1 : Вывести имена студенов и названия курсов, которые они проходят

SELECT
s.name,
c.title
FROM students AS s
INNER JOIN students2courses AS sc
ON s.id = sc.course_id
INNER JOIN courses AS c
-- ON sc.id=s.id;
   ON c.id = sc.course_id;
   

SELECT
t.name,
c.title
FROM teachers AS t
LEFT JOIN teachers2competencies AS tc
-- ON t.id = tc.competencies_id
   ON t.id = tc.teacher_id
LEFT JOIN competencies AS c
ON c.id = tc.competencies_id;


-- Task 3 :  Вывести преподавателя без компетенций

SELECT
t1.name,
t2.teacher_id
FROM teachers t1
LEFT JOIN teachers2competencies AS t2
ON t1.id = t2.teacher_id
WHERE t2.teacher_id IS NULL;




SELECT
t.name,
c.title
FROM teachers AS t
LEFT JOIN teachers2competencies AS tc
ON t.id = tc.teacher_id
LEFT JOIN competencies AS c
ON c.id = tc.competencies_id WHERE c.title IS NULL;

SELECT
name
FROM teachers
WHERE id NOT IN (
				SELECT
				teacher_id
				FROM teachers2competencies);
 -- -------------------------------------------------------     
 -- Task 4 :  Вывести студентов которые не проходят ни один курс
 
SELECT
t1.name,
t2.course_id
FROM students t1
LEFT JOIN students2courses AS t2
ON t1.id = t2.course_id
WHERE t2.course_id IS NULL;


SELECT
name
FROM students
WHERE id NOT IN (
				SELECT
				course_id
				FROM students2courses);
 
  -- Task 5 : Вывести курсы, которые не посещает ни один студент

SELECT
c1.title,
t2.course_id
FROM courses c1
LEFT JOIN students2courses AS t2
ON c1.id = t2.course_id
WHERE t2.course_id IS NULL;

SELECT
title
FROM courses
WHERE id NOT IN (
				SELECT
				course_id
				FROM students2courses);


-- summary lesson

-- millis , 1 Jan 1970 03-00
-- Date - пример формата данного типа 2024.10.27
-- Time - хранит только время 21:05
-- DateTime - хранит дaту и время вместe date+time
-- Timestamp - формат хранения даты и времени в миллисекундах
-- Year - хранит только год (обрезанный int)
-- Функции для получения текущей даты :


SELECT curdate(); -- only date                			2024-11-11
SELECT now(); -- date + time when script run (request) 	2024-11-11 13:53:37
SELECT sysdate(); -- - date + time when function run	2024-11-11 13:53:45

-- Конвертация строки в дату :
SELECT str_to_date("2024-10-27 21:15:20", "%Y-%m-%d %H:%i:%s");	-- 2024-10-27 21:15:20
SELECT str_to_date("2024-10-27 21:15:20", "%Y-%m-%d");			-- 2024-10-27
SELECT str_to_date("27-10-2024 21:15:20", "%d-%m-%Y");			-- 2024-10-27

SELECT extract(hour from "2024-10-27 21:15:20");
SELECT extract(month from "2024-10-27 21:15:20");
SELECT extract(year from "2024-10-27 21:15:20");
SELECT extract(day from "2024-10-27");
SELECT extract(hour_minute from " 024-10-27 21:15:20");


-- hour, month, year, day, minute, second, year_month, day_second, hour_minute
-- date_add, date_sub - Функции для прибавления и вычитания чего-то из даты SELECT date_add("2024-10-27 21:15:20", interval 5 day); -- add 5 days to date
SELECT date_add("2024-10-27 21:15:20", interval -5 day); -- substract 5 days from date
SELECT date_add("2024-10-27 21:15:20", interval -5 day); -- substract 5 days from date
SELECT date_sub("2024-10-27 21:15:20", interval 5 day); -- substract 5 days from date
SELECT date_add("2024-10-27 21:15:20", interval 5 month); -- add 5 months to date

use shop;

select * from orders;

SELECT
MONTH(odate),
odate
FROM orders;

select
*
from orders
WHERE MONTH(odate) = 3;

SELECT 
*
FROM orders
WHERE odate BETWEEN '2022-04-10' AND '2022-05-10';

SELECT
odate,
WEEKDAY (odate), -- starts from 0 ( Monday - 0, Tuesday - 1 etc)
DAYOFWEEK(odate) -- sterts from Sunday ( Sunday - 1, Monday - 2 etc)
FROM orders;

select
*
from orders
WHERE WEEKDAY(odate) = 3;

SELECT
c.CNAME
FROM customers AS c
INNER JOIN orders AS o
ON c.CUST_ID = o.CUST_ID AND WEEKDAY(odate) = 1;


-- lesson eight

-- sum(column_name) - суммирует все значения в колонке
-- avg(column_name) - вычисляет среднее значение по колонке
-- max(column name) - находит максимальное значение в этой колонке 
-- min(column_name) - находит минимальное значение в этой колонке

-- count(column_name) - подсчитывает все not null значения в этой колонке
-- count(*) - подсчитает все строки в выборке

use hr;

SELECT
*
FROM employees;

SELECT
SUM(salary)
FROM employees;

SELECT
AVG(salary)
FROM employees;

SELECT
MAX(salary),
MIN(salary)
FROM employees;

SELECT
COUNT(department_id) as count_of_employees -- count all not NULL values
FROM employees;

SELECT
COUNT(*) as count_of_employees -- count all not NULL values
FROM employees;

-- incorrect
SELECT
-- first_name
SUM(salary)
FROM employees;

-- Task 1 : Вывести имя и фамилию сотрудника с максимальной зарплатой
SELECT
first_name,
last_name,
salary
FROM employees
WHERE salary = (
				SELECT MAX(salary) AS min_salary
                FROM employees);

-- Task 2 : Найти сотрудников,у которых зарплата меньше средней зарплаты по компании
SELECT 
first_name, 
last_name
FROM employees
WHERE salary < (
				SELECT AVG(salary) AS max_salary
                FROM employees
);

SELECT
first_name,
last_name,
salary
FROM employees
WHERE salary = (
				SELECT MIN(salary) AS min_salary
                FROM employees);

--
-- ------------------------------------------------------------- Вывести департаменты в которых никто не работает
-- ------------------------------------------------------------- Подсчитать департаменты количество в которых никто не работает
SELECT
-- e.first_name AS name,
-- d.department_name
COUNT(*)
FROM departments AS d
LEFT JOIN employees AS e
ON d.department_id = e.department_id
WHERE e.first_name IS NULL;

SELECT
-- e.first_name AS name,
-- d.department_name
COUNT(*) AS department_cnt
FROM departments
WHERE department_id NOT IN (
							SELECT
							department_id
							FROM employees
							WHERE department_id IS NOT NULL);
-- e.first_name AS name,
-- d.department_name
SELECT
e.first_name AS name,
d.department_name
-- COUNT(*)
FROM employees AS e
LEFT JOIN departments AS d
ON d.department_id = e.department_id
WHERE e.department_id = 60 AND salary > (
				SELECT AVG(salary)
                FROM employees
);

-- Task 4 : Найти количество сотрудников из департамента с ид 60 и зарплатой больше чем средняя
-- запрлата по компании

SELECT
COUNT(*) AS count_of_employees
FROM employees
WHERE department_id = 60 AND salary > (SELECT
										AVG(salary)
										FROM employees);

-- DISTINCT - отбор только уникальных значений

SELECT
COUNT(DISTINCT department_id) AS count_of_dpt
FROM employees;

SELECT
COUNT(department_id),
COUNT(*),
COUNT(DISTINCT department_id)
FROM employees;

SELECT
department_id,
SUM(salary)
FROM employees
GROUP BY department_id;

-- Работа группировки : Сначала записи в таблице группируютя в кучки по признаку поля , которе 
-- указано после слов GROUP BY, а потом к каждой кучке применяется агрегатная функция

-- Task 5 : Посчитать количество сотрудников в каждом департаменте
-- C:\Program Files\ffmpeg-master-latest-win64-gpl\bin
-- USER PATH C:\path\to\ffmpeg\bin
SELECT
    department_id,
    COUNT(*) AS employee_count
FROM employees
GROUP BY department_id;

-- Task 6 : Найти департамент с максимальным количеством сотрудников
SELECT
    department_id,
    max(column name) AS employee_count
FROM employees
GROUP BY department_id;

SELECT 
department_id, 
employee_count
FROM employees
WHERE (
    SELECT department_id, 
    COUNT(*) AS employee_count
    FROM employees
    GROUP BY department_id
);

SELECT
department_id, 
COUNT(*) AS cnt 
FROM employees
GROUP BY department_id;

SELECT
MAX(t1.cnt)
FROM (
		SELECT
		department_id,
		COUNT(*) AS cnt
		FROM employees
		GROUP BY department_id) AS t1;
        
SELECT
t2. department_id,
t2.cnt
FROM (
		SELECT
		department_id,
		COUNT(*) AS cnt
		FROM employees
		GROUP BY department_id) AS t2
		WHERE t2.cnt = (
						SELECT
						MAX(t1.cnt)
						FROM (
								SELECT
								department_id,
								COUNT(*) AS cnt
								FROM employees
								GROUP BY department_id) AS t1);



-- summary - агрегатная функция нужна для вычисления какого либо значения по колонке
-- count, sum, min, max, avg
-- count , count (*)
-- count (*) - все строки включая null
-- count (column) - все значения в колонке , кроме null
use hr;

SELECT
COUNT(department_id),
COUNT(*),
COUNT(DISTINCT department_id)
FROM employees;


SELECT
SUM(salary)
FROM employees;

SELECT
SUM(salary),
department_id
FROM employees
GROUP BY department_id;

use shop;

-- Task 1: определить среднюю стоимость покупок 
-- определить среднюю стоимость покупок в марте
SELECT
AVG(AMT)
FROM orders
WHERE MONTH(odate) = 3;

-- Task 2 : определить какие покупки были совершены во вторник

SELECT *
FROM orders
WHERE DAYOFWEEK(ODATE) = 3;

-- Task 3: Определить сколько было совершено покупок в каждый месяц 
-- отсортировать результат по возрастанию количества покупок

SELECT 
MONTH(ODATE) AS month, 
COUNT(*) AS purchase_count
FROM orders
GROUP BY MONTH(ODATE)
ORDER BY purchase_count ASC;

-- Task 4: Определить в какой месяц было совершено максимальное количество покупок,
-- вывести номер месяца и количество покупок

SELECT 
MONTH(ODATE) AS month, 
COUNT(*) AS purchase_count
FROM orders
GROUP BY MONTH(ODATE)
ORDER BY purchase_count DESC;

CREATE VIEW tmp AS
SELECT 
COUNT(*) AS cnt,
MONTH(odate) as m
FROM orders
GROUP BY MONTH(odate);


SELECT *
FROM tmp
WHERE cnt = (SELECT MAX(cnt) FROM tmp);


-- lesson 20-11-2024

use hr;

SELECT
department_id,
SUM(salary)
FROM employees
GROUP BY department_id;

-- print departments with sum salary > 50000

-- having - оператор условия, который применяется на агрегированные данные 
-- когда нужно применить фильтр на то, что получилось в результате работы 
-- какой то агрегатной функции к каким-то группам

SELECT
department_id,
SUM(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) > 50000;
-- 1) Сгруппировали по кучкам 2) внутри каждой кучки посчитали сумму
-- 3) к посчитанной сумме применили фильтр и оставили только те записи
-- где сумма больше чем 50000


-- Task 2 : Вывести название департамента , в которых работает больше 10 человек
SELECT
d.department_name,
COUNT(e.employee_id) AS employee_id
FROM employees AS e
INNER JOIN departments AS d
ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name
HAVING COUNT(e.employee_id) > 10;

-- Task 2 : Вывести название департамента , в которых работает больше 10 человек

SELECT
department_name
FROM departments
WHERE department_id IN (SELECT
							department_id
							FROM employees
							GROUP BY department_id
							HAVING COUNT(*) > 10);

SELECT
t1.department_name,
t2.cnt
FROM departments t1
INNER JOIN (
			SELECT
			department_id,
			COUNT(*) AS cnt
			FROM employees
			GROUP BY department_id
			HAVING COUNT(*) > 10) AS t2
ON t1.department_id = t2.department_id;

-- Task 3 : Необходимо вывести названия отделов, с количеством сотрудников
-- больше среднего
SELECT
d.department_name,
COUNT(e.employee_id) AS employee_id
FROM employees AS e
INNER JOIN departments AS d
ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name
HAVING COUNT(e.employee_id) > (SELECT
MAX(empl_count) AS max_empl_cnt
FROM (
		SELECT
		COUNT(e.employee_id) AS empl_count
		FROM employees AS e
		INNER JOIN departments AS d
		ON d.department_id = e.department_id
		GROUP BY d.department_id
		)AS max );

-- AVG 
SELECT
AVG(empl_count) AS avg_empl_cnt
FROM (
		SELECT
		COUNT(e.employee_id) AS empl_count
		FROM employees AS e
		INNER JOIN departments AS d
		ON d.department_id = e.department_id
		GROUP BY d.department_id
		)AS avg;
        

     
-- COUNT empl
SELECT
COUNT(e.employee_id) AS empl_count
FROM employees AS e
INNER JOIN departments AS d
ON d.department_id = e.department_id
GROUP BY d.department_id;


-- AVG
SELECT
d.department_name,
COUNT(e.employee_id) AS employee_cnt
FROM employees AS e
INNER JOIN departments AS d
ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name
HAVING COUNT(e.employee_id) > (
								SELECT
								AVG(e2.employee_id) AS employee_avg
								FROM employees AS e2
								INNER JOIN departments AS d2
								ON d2.department_id = e2.department_id
								GROUP BY d2.department_id
								);
                                
   -- MAX 
SELECT
MAX(empl_count) AS max_empl_cnt
FROM (
		SELECT
		COUNT(e.employee_id) AS empl_count
		FROM employees AS e
		INNER JOIN departments AS d
		ON d.department_id = e.department_id
		GROUP BY d.department_id
		)AS avg;                             
                                
SELECT
d.department_name,
COUNT(e.employee_id) AS employee_cnt
FROM employees AS e
INNER JOIN departments AS d
ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name
HAVING COUNT(e.employee_id) > (
								SELECT 
                                MAX(sub.employee_cnt)
								FROM (
									SELECT
									COUNT(e2.employee_id) AS employee_cnt
									FROM employees AS e2
									INNER JOIN departments AS d2
									ON d2.department_id = e2.department_id
									GROUP BY d2.department_id
								) AS sub
);

-- MAX
SELECT
department_name
FROM departments
WHERE department_id IN (SELECT
						department_id
						FROM employees
						GROUP BY department_id
						HAVING MAX(department_id) = (SELECT
											AVG(t1.cnt)
											FROM (SELECT
													department_id,
													MAX(department_id) AS cnt
													FROM employees
													GROUP BY department_id) AS t1) );
												
-- AVG
SELECT
department_name
FROM departments
WHERE department_id IN (SELECT
						department_id
						FROM employees
						GROUP BY department_id
						HAVING COUNT(*) > (SELECT
											AVG(t1.cnt)
											FROM (SELECT
													department_id,
													COUNT(*) AS cnt
													FROM employees
													GROUP BY department_id) AS t1) );
                                                    
SELECT
department_id,
MAX(department_id) AS cnt
FROM employees
GROUP BY department_id;
                                                    
                                                    
                                                    
SELECT
d.department_name,
COUNT(e.employee_id) AS employee_count
FROM employees AS e
INNER JOIN departments AS d
ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name
HAVING COUNT(e.employee_id) > (
    SELECT MAX(empl_count)
    FROM (
        SELECT
            COUNT(e2.employee_id) AS empl_count
        FROM employees AS e2
        INNER JOIN departments AS d2
        ON d2.department_id = e2.department_id
        GROUP BY d2.department_id
    ) AS subquery
);

-- -------------------------------------------------------------------------------
-- -------------------------------------------------------------------------------
-- 25-11-2024

-- SELECT
-- fields
-- FROM table
-- JOIN table
-- ON fields
-- WHERE feild
-- GROUP BY field
-- HAVING agr(field)
-- ORDER field

CREATE DATABASE interview;

use interview;

Create table If Not Exists Sales (sale_id int, product_id int, year int, quantity int, price int);
Create table If Not Exists Product (product_id int, product_name varchar(10));
Truncate table Sales;
insert into Sales (sale_id, product_id, year, quantity, price) values ('1', '100', '2008', '10', '5000');
insert into Sales (sale_id, product_id, year, quantity, price) values ('2', '100', '2009', '12', '5000');
insert into Sales (sale_id, product_id, year, quantity, price) values ('7', '200', '2011', '15', '9000');
Truncate table Product;
insert into Product (product_id, product_name) values ('100', 'Nokia');
insert into Product (product_id, product_name) values ('200', 'Apple');
insert into Product (product_id, product_name) values ('300', 'Samsung');


SELECT
p.product_name,
s.year,
s.price
FROM product AS p
INNER JOIN sales AS s
ON p.product_id= s.product_id;

-- Task2 Вывести количество всего проданного товара по product_id
SELECT
product_id,
SUM(sale_id)
FROM sales
GROUP BY product_id;

-- Taks 3 : Вывести количество всего проданного товара по product_id в каждый год
SELECT
product_id,
year,
SUM(sale_id)
FROM sales
GROUP BY product_id, year;

CREATE DATABASE interviewNEW;

use interviewNEW;

DROP TABLE IF EXISTS Sales;
DROP TABLE IF EXISTS Product;

Create table If Not Exists Sales (sale_id int, product_id int, user_id int, quantity int);
Create table If Not Exists Product (product_id int, price int);

insert into Sales (sale_id, product_id, user_id, quantity) values ('1', '1', '101', '10');
insert into Sales (sale_id, product_id, user_id, quantity) values ('2', '2', '101', '1');
insert into Sales (sale_id, product_id, user_id, quantity) values ('3', '3', '102', '3');
insert into Sales (sale_id, product_id, user_id, quantity) values ('4', '3', '102', '2');
insert into Sales (sale_id, product_id, user_id, quantity) values ('5', '2', '103', '3');

insert into Product (product_id, price) values ('1', '10');
insert into Product (product_id, price) values ('2', '25');
insert into Product (product_id, price) values ('3', '15');

-- Task 4 : Вывести данные о том, какой пользователь(user_id) сколько в целом потратил
-- отсортировать по убыванию потраченного и возрастанию айди пользователя

SELECT
s.user_id,
SUM(p.price) AS total_price
FROM sales AS s
INNER JOIN product AS p
ON s.product_id = p.product_id
GROUP BY s.user_id
ORDER BY s.user_id ASC, total_price DESC;


-- ---------------------------------------------------------------------------------------
-- ---------------------------------------------------------------------------------------
-- lesson 27-11-2024

-- Relationship types
-- One-to-One (1:1)

CREATE DATABASE relationship;

USE relationship;

CREATE TABLE person(#
id INT,
name varchar (255)
);

-- Если добавить ограничение уникальности на колонку, по которой будет 
-- находиться соответствие между таблицами, то это будет отношение One-to-One

CREATE TABLE passport( 
num varchar(16),
person_id int unique  -- One-to-One
);

INSERT INTO person (id, name) VALUES(1, 'Alex'),(2,'Oleg');
INSERT INTO passport (num, person_id) VALUES ('55555',1),('77777', 2);

-- Таблица паспортов и таблица персон находятся теперь в отношении (1:1)

SELECT
p1.id,
p1.name,
p2.num
FROM person AS p1
INNER JOIN passport AS p2
ON p1.id=p2.person_id;

-- Таблица паспортов и таблица персон находятся теперь в отношении (1:1)

-- One-to-Many (1:M)
-- Для одной строки одной таблицы, может соответствовать несколько строк из другой
-- таблице

CREATE TABLE student (
id integer,
name varchar(64)
);

CREATE TABLE order_course(
order_id integer,
title varchar(64),
student_id integer
);

INSERT INTO student(id, name) VALUES (1,'Alex'),(2, 'Maxim');
INSERT INTO order_course(order_id, title, student_id) VALUES
													(1,'Java',2),(2, 'JS',2),(3,'SQL',1);

SELECT * FROM student;
SELECT * FROM order_course;

SELECT
t1.id AS student_id,
t1.name,
t2.order_id AS course_id,
t2.title AS course_title
FROM student AS t1
LEFT JOIN order_course AS t2
ON t1.id = t2.student_id;

-- Таблица студентов и таблица курсов находятся во взаимоотношении (1:M)

-- Many-to-Many (M:M) - Для одной строки из первой таблицы, может соответствовать
-- несколько строк из второй таблицы и наоброт, для любой строки второй таблицы,
-- может соответствовать несколько строк из первой таблицы

CREATE TABLE customer(
id integer,
name varchar(64)
);

CREATE TABLE shop(
id integer,
title varchar(64),
address varchar(64)
);

INSERT INTO customer(id, name) VALUES (1,'Alex'),(2,'Max'),(3,'Oleg');
INSERT INTO shop(id, title, address) VALUES (1,'Amazon','Berlin'),(2,'Wallmart','Ontario');

CREATE TABLE shop2customer(
customer_id integer,
shop_id integer
);
-- Alex - Amazon; Max - Amazon, Wallmart; Oleg - Wallmart
-- Amazon - Alex,Max;  Wallmart - Oleg, Max
INSERT INTO shop2customer(customer_id, shop_id) VALUES (1,1),(2,1),(2,2),(3,2);

SELECT * FROM customer;
SELECT * FROM shop;
SELECT * FROM shop2customer;

SELECT
t1.id AS customer_id,
t1.name AS customer_name,
t3.id AS shop_id,
t3.title AS shop_title,
t3.address AS shop_address
FROM customer AS t1
LEFT JOIN shop2Customer AS t2
ON t1.id = t2.customer_id
LEFT JOIN shop AS t3
ON t3.id = t2.shop_id
WHERE t1.id = 2;

SELECT
t3.id AS shop_id,
t3.title AS shop_title,
t3.address AS shop_address,
t1.id AS customer_id,
t1.name AS customer_name
FROM shop AS t3
LEFT JOIN shop2Customer AS t2
ON t3.id = t2.shop_id
LEFT JOIN customer AS t1
ON t1.id = t2.customer_id
WHERE t3.id = 1;

-- PRIMARY KEY, FOREIGN KEY

-- PRIMARY KEY (unique  + not null)
-- Первычный ключ может быть натуральный или искусственный (id)

-- искусственный (id integer primary key)
-- натуральный (passport_number varchar(64) pimary key)

CREATE TABLE person_correct(
id integer primary key,
name varchar(255)
);

-- FOREIGN KEY - значение в колонке , которая является внешним ключем одной таблицы
-- это значение из колонки , которая является первичным ключем в другой таблице

DROP TABLE passport_correct;

CREATE TABLE passport_correct(
id integer primary key,
num varchar(16),
person_id integer unique,
FOREIGN KEY (person_id) REFERENCES person_correct (id) ON DELETE CASCADE
);

-- текущая таблица - (passport_correct) - 1
-- таблица (person_correct) - 2
-- FOREIGN KEY (имя_колонки из 1) REFERENCES таблицу 2  (имя колонки первичного ключа из 2)

INSERT INTO person_correct(id, name) VALUES(1,'Alexx'),(2,'Oleg');
-- Error Code: 1062. Duplicate entry '1' for key 'person_correct.PRIMARY'

INSERT INTO passport_correct(id, num, person_id) VALUES (1,'5555555',1);

INSERT INTO passport_correct(id, num, person_id) VALUES (2,'4444444',2);
-- Error Code: 1452. Cannot add or update a child row:
-- a foreign key constraint fails (`relationship`.`passport_correct`,
-- CONSTRAINT `passport_correct_ibfk_1` FOREIGN KEY (`person_id`) REFERENCES `person_correct` (`id`))


SELECT * FROM person_correct;
SELECT * FROM passport_correct;

DELETE FROM person_correct WHERE id = 1;
-- Error Code: 1451. Cannot delete or update a parent row:
-- a foreign key constraint fails (`relationship`.`passport_correct`,
-- CONSTRAINT `passport_correct_ibfk_1` FOREIGN KEY (`person_id`) REFERENCES `person_correct` (`id`))

-- ON DELETE CASCADE - добавление к внешнему ключу, которое говорит о том, что если запись с первичным
-- ключем будет удалена , то удаляются и все записи из таблиц, которые ссылались на этот первичный ключ

-- AFTER ADD ON DELETE CASCADE

DELETE FROM person_correct WHERE id = 1;

CREATE TABLE customer(
id integer primary key,
name varchar(64)
);

CREATE TABLE shop(
id integer primary key,
title varchar(64),
address varchar(64)
);

CREATE TABLE shop2customer(
customer_id integer,
shop_id integer,
FOREIGN KEY (customer_id) REFERENCES customer (id),
FOREIGN KEY (shop_id) REFERENCES shop (id)
);


-- Вполне достаточно , что бы СКЛ таблица находилась в третьей нормальной форме
-- 1NF, 2NF, 3NF


-- name | surname | phone
-- Alex | Alexeev | 6665,7778
-- Oleg | Olegov. | 6664, 7774, 4444

-- fio 		 | age | rate
-- Alex Alexeev | 30. | 5
-- Oleg Olegov. | 23  | 2

-- 1NF - говорит о том, что в колонках таблицы, не должно быть составных значений
-- или набора значений ( не должно быть массивов, строк через запятую)-- 
-- fio -> first_name,last_name; address -> country, city, street, building

-- name | surname | age | rate
-- Alex | Alexeev | 30. | 5
-- Oleg | Olegov. | 23  | 2

-- name | surname | phone
-- Alex | Alexeev | 6665
-- Alex | Alexeev | 7778
-- Oleg | Olegov. | 6664
-- Oleg | Olegov. | 7774
-- Oleg | Olegov. | 4444

-- name | surname | id
-- Alex | Alexeev | 1
-- Oleg | Olegov. | 2

-- phone | person_id
-- 6665  | 1
-- 7778. | 1
-- 6664. | 2
-- 7774. | 2
-- 4444. | 2



-- 2NF -> 1NF  + Primary key - данная нормальная форма говорит о том, что таблица
-- должна соответствовать первой нормальной форме и иметь первичный ключ

-- name | surname | id(PK)
-- Alex | Alexeev | 1
-- Oleg | Olegov. | 2

-- phone(PK)   | person_id
-- 6665  		| 1
-- 7778. 		| 1
-- 6664. 		| 2
-- 7774. 		| 2
-- 4444. 		| 2


-- 3NF -> 2 NF + (id (PK) | name | course_id | course_title | course_description) 
-- > не должно быть зависимостей между неключевыми полями ->
-- >(id (PK) | name | course_id ), (course_id(PK) | course_title | course_description)

-- /*
-- Students:
-- id (PK) | name | course_id | course_title | course_description
-- 1		| Alex | 3		   | Java		  | Java prof course
-- 2	    | Oleg | 4 		   | SQL	      | SQL for beginners

-- Students:
-- id (PK) | name | course_id 
-- 1		| Alex | 3		   
-- 2	    | Oleg | 4 		   

-- Courses:
-- course_id(PK) | course_title | course_description
-- 3		       | Java		 | Java prof course
-- 4 		       | SQL	     | SQL for beginners
-- */

use hr;
select * from employees;



select * from departments;


-- /*
-- Buyer 
-- id | name | surname 


-- Address 
-- id | city | street | building | buyer_id

-- */

-- Task : 

-- User : 

-- name surname | birth date | phone number | cell_operator | zodiac sign | city | country |

-- 1NF :
-- name | surname | birth date | phone number | cell_operator | zodiac sign | city | country |

-- 2NF :
-- id(PK) | name | surname | birth date | phone number | cell_operator | zodiac sign | city | country |

-- 3NF : 

-- id(PK) | name | surname | birth date | phone_number | location_id


-- Phones :
-- phone_number(PK) | cell_operator 

-- Locations :
-- id (PK) | city | country_id|
-- 1		Berlin 	Germany


-- Countries : 
-- country(PK) | 

-- Zodiacs : 
-- zodiac_sign(PK) | start_date | end_date 




-- Спроектировать службу заказа такси :

-- Driver
-- Car
-- Client
-- Order
-- Operator
-- Service class
-- Feedback


CREATE DATABASE taxi;
use taxi;

CREATE TABLE cars(
plate integer primary key,
model varchar(32),
class varchar(32)
);

CREATE TABLE drivers (
id integer primary key auto_increment,
name varchar(32),
surname varchar(32),
car_id integer,
FOREIGN KEY (car_id) REFERENCES cars (plate)
);

CREATE TABLE clients (
id integer primary key auto_increment,
name varchar(32),
surname varchar(32),
rate integer
);


CREATE TABLE operators (
id integer primary key auto_increment,
name varchar(32),
surname varchar(32),
alias varchar(16)
);

CREATE TABLE service_classes (
type varchar(16) primary key, 
descr varchar(64)
);

drop table orders;
drop table feedbacks;

CREATE TABLE orders (
id integer primary key auto_increment,
start varchar(255),
finish varchar(255),
state varchar(255),
payment_method varchar(255),
amount integer,
driver_id integer,
operator_id integer,
service_type varchar(16),
client_id integer,
FOREIGN KEY (driver_id) REFERENCES drivers (id),
FOREIGN KEY (operator_id) REFERENCES operators (id),
FOREIGN KEY (service_type) REFERENCES service_classes (type),
FOREIGN KEY (client_id) REFERENCES clients (id)
);

CREATE TABLE feedbacks (
id integer primary key auto_increment,
feedback varchar(255),
order_id integer unique,
FOREIGN KEY (order_id) REFERENCES orders (id)
);