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