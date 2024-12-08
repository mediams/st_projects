CREATE TABLE goods (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(30),
quantity INT NOT NULL CHECK (quantity>0),
instock CHAR (1) NOT NULL CHECK (instock IN ('Y', 'N'))
);

insert into goods (id, title, quantity, instock) values (1, 'Велосипед', 2, 'Y');
insert into goods (id, title, quantity, instock) values (2, 'Скейт', 4, 'Y');
insert into goods (id, title, quantity, instock) values (3, 'Самокат', 2, 'Y');
insert into goods (id, title, quantity, instock) values (4, 'Сноуборд', 7, 'N');
insert into goods (id, title, quantity, instock) values (5, 'Санки', 1, 'Y');
insert into goods (id, title, quantity, instock) values (6, 'Коньки', 3, 'N');
insert into goods (id, title, quantity, instock) values (7, 'Ролики', 5, 'Y');
insert into goods (title, quantity, instock) values ('Шлем', 8, 'Y');
insert into goods (title, quantity, instock) values ('Футбольный мяч', 2, 'N');
insert into goods (title, quantity, instock) values ('перчатки', 5, 'Y');

CREATE TABLE goods_2 (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(30),
quantity INT NOT NULL CHECK (quantity>0),
price INT NOT NULL,
in_stock CHAR (1) NOT NULL CHECK(in_stock IN('Y','N'))
);

insert into goods_2 (id, title, quantity, price, in_stock) values (1, 'Тюбинг', 5, 1000, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (2, 'Санки', 2, 1500, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (3, 'Снегокат', 2, 900, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (4, 'Сноуборд', 7, 700, 'N');
insert into goods_2 (id, title, quantity, price, in_stock) values (5, 'Клюшка', 8, 300, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (6, 'Коньки', 3, 350, 'N');
insert into goods_2 (id, title, quantity, price, in_stock) values (7, 'Форма', 9, 450, 'Y');
insert into goods_2 ( title, quantity, price, in_stock) values ( 'Гантели', 9, 450, 'Y');
insert into goods_2 (  title, quantity, price, in_stock) values ( 'Форма', 9, 450, 'Y');
insert into goods_2 ( title, quantity, price, in_stock) values ( 'Боксерские перчатки', 9, 450, 'Y');

SELECT title FROM goods
UNION ALL
SELECT title FROM goods_2;

SELECT title FROM goods
UNION
SELECT title FROM goods_2;

SELECT
t1.id, t1.title, t1.quantity, 
t2.price, t2.in_stock AS instock
FROM goods AS t1
INNER JOIN goods_2 AS t2
ON t1.title = t2.title;



-- Homework 27-10-2024
--

DROP DATABASE goods;

CREATE DATABASE goods;
USE goods;
CREATE TABLE goods (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(30),
quantity INT NOT NULL CHECK (quantity>0),
instock CHAR (1) NOT NULL CHECK (instock IN ('Y', 'N'))
);

insert into goods (id, title, quantity, instock) values (1, 'Велосипед', 2, 'Y');
insert into goods (id, title, quantity, instock) values (2, 'Скейт', 4, 'Y');
insert into goods (id, title, quantity, instock) values (3, 'Самокат', 2, 'Y');
insert into goods (id, title, quantity, instock) values (4, 'Сноуборд', 7, 'N');
insert into goods (id, title, quantity, instock) values (5, 'Санки', 1, 'Y');
insert into goods (id, title, quantity, instock) values (6, 'Коньки', 3, 'N');
insert into goods (id, title, quantity, instock) values (7, 'Ролики', 5, 'Y');
insert into goods (title, quantity, instock) values ('Шлем', 8, 'Y');
insert into goods (title, quantity, instock) values ('Футбольный мяч', 2, 'N');
insert into goods (title, quantity, instock) values ('перчатки', 5, 'Y');

CREATE TABLE goods_2 (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(30),
quantity INT NOT NULL CHECK (quantity>0),
price INT NOT NULL,
in_stock CHAR (1) NOT NULL CHECK(in_stock IN('Y','N'))
);

insert into goods_2 (id, title, quantity, price, in_stock) values (1, 'Тюбинг', 5, 1000, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (2, 'Санки', 2, 1500, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (3, 'Снегокат', 2, 900, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (4, 'Сноуборд', 7, 700, 'N');
insert into goods_2 (id, title, quantity, price, in_stock) values (5, 'Клюшка', 8, 300, 'Y');
insert into goods_2 (id, title, quantity, price, in_stock) values (6, 'Коньки', 3, 350, 'N');
insert into goods_2 (id, title, quantity, price, in_stock) values (7, 'Форма', 9, 450, 'Y');
insert into goods_2 ( title, quantity, price, in_stock) values ( 'Гантели', 9, 450, 'Y');
insert into goods_2 (  title, quantity, price, in_stock) values ( 'Форма', 9, 450, 'Y');
insert into goods_2 ( title, quantity, price, in_stock) values ( 'Боксерские перчатки', 9, 450, 'Y');

SELECT title FROM goods
UNION ALL
SELECT title FROM goods_2;

SELECT title FROM goods
UNION
SELECT title FROM goods_2;

SELECT
t1.id, t1.title, t1.quantity, 
t2.price, t2.in_stock AS instock
FROM goods AS t1
INNER JOIN goods_2 AS t2
ON t1.title = t2.title;

SELECT * FROM goods;
SELECT * FROM goods_2;
SELECT * FROM goods_2;