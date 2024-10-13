-- Домашка для повтора команд создания таблицы, изменения, добавления данных.

-- Создайте таблицу goods (id, title, quantity)
CREATE DATABASE goods;
use goods;

CREATE TABLE goods(
id INTEGER PRIMARY KEY AUTO_INCREMENT,
title VARCHAR (128),
quantity INTEGER
);

-- Добавьте несколько строк
INSERT INTO goods (title, quantity) VALUES ("Value 1", 3);
INSERT INTO goods (title, quantity) VALUES ("Value 2", 3);
INSERT INTO goods (title, quantity) VALUES ("Value 3", 3);


-- Добавьте поле price (integer) со значением по умолчанию 0
ALTER TABLE goods
ADD price integer DEFAULT 0;

-- Проверьте содержимое таблицы
SELECT
*
FROM goods;

-- Измените тип на numeric(8, 2)
ALTER TABLE goods
MODIFY COLUMN price numeric(8, 2); 

-- Измените тип обратно на integer
ALTER TABLE goods
MODIFY COLUMN price integer; 

-- Переименуйте поле на item_price
ALTER TABLE goods
CHANGE price item_price integer;

-- Удалите это поле
ALTER TABLE goods
DROP COLUMN item_price; 


