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
