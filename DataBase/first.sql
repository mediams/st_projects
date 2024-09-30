-- database
-- first database

create database learn;

use learn;

create table products(
id integer primary key auto_increment,
title varchar(128),
price integer,
discount decimal(2,1)
);

insert into products (title,price, discount) values ('bike',50000,0.9);
insert into products (title,price, discount) values ('skates',15000,0.1);
insert into products (title,price, discount) values ('skis',25000,null);
insert into products (title,price, discount) values ('board',30000,0.9);
insert into products (title,price, discount) values ('scooter',10000,0.8);

select
*
FROM products
LIMIT 2;

use learn;

SELECT
title,
price,
discount,
price
FROM products;

SELECT * FROM products;

SHOW TABLES;

select * from products where price not between 2000 and 3000;


SELECT
* 
FROM products
WHERE price BETWEEN 20000 AND 30000;

SELECT
*
FROM products 
WHERE price BETWEEN 20000 AND 30000;


SELECT
*
FROM products
WHERE id IN (3, 2, 5);

SELECT
*
FROM products
WHERE title IN ("skis", "bike", "scooter");

SELECT
*
FROM products
WHERE title LIKE 'sk%';

use hr;
show tables;
select * from jobs limit 2;

select * from employees WHERE department_id = 90;


SELECT * FROM
employees
WHERE salary > 5000;

SELECT
*
FROM employees
WHERE first_name LIKE 'L%';


SELECT 
* 
FROM departments
WHERE location_id = 1700;


USE HR;

SELECT 
* 
FROM departments
WHERE location_id = 1700;


SELECT 
* 
FROM locations
WHERE country_id = 'DE';

SELECT
salary
FROM employees
WHERE first_name = 'Lex' AND last_name = 'De Haan';


SELECT
*
FROM employees
WHERE job_id = 'FI_ACCOUNT' AND salary <8000;


SELECT
*
FROM employees
WHERE commission_pct IS NULL;


SELECT
first_name,
last_name
FROM employees
WHERE department_id NOT IN (80, 90, 110);

SELECT *
FROM employees
WHERE salary != 5000;
