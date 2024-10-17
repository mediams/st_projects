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
