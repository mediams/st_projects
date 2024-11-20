-- используйте базу данных shop
USE shop;

-- 1) Выведите минимальный рейтинг покупателя среди сделавших заказ в мае 2022 года.
-- Вывести : minrating
SELECT
MIN(c.RATING) AS minrating
FROM customers AS c
INNER JOIN orders AS o
ON c.CUST_ID = o.CUST_ID
WHERE MONTH(o.ODATE) = 5 AND YEAR(o.ODATE) = 2022;


-- 2)Выведите продавцов, которые оформили заказ на наибольшую сумму в период с марта по май 2022 года.
-- Вывести : sellid, amt
SELECT
s.SELL_ID AS sellid,
MAX(o.AMT) AS amt
FROM sellers AS s
INNER JOIN orders AS o
ON s.SELL_ID = o.SELL_ID
WHERE MONTH(o.ODATE) BETWEEN 3 AND 5 AND YEAR (o.ODATE) = 2022
GROUP BY o.SELL_ID;