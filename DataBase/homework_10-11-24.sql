-- Используйте бд hr;
USE hr;

-- 1)Вывести job_id тех сотрудников, которые зарабатывают больше своего менеджера
SELECT
e.job_id,
e2.first_name,
e2.last_name,
e.salary
FROM employees AS e
INNER JOIN employees AS e2
ON e.manager_id=e2.employee_id WHERE e.salary>e2.salary;

-- 2)Вывести имя, фамилию и город сотрудников, которые работают в Seattle или Toronto
SELECT
e.first_name,
e.last_name,
l.city
FROM
locations AS l
INNER JOIN departments AS d
ON l.location_id = d.location_id
INNER JOIN employees AS e
ON d.department_id = e.department_id WHERE l.city IN ("Seattle", "Toronto");

-- 3)Вывести имя, фамилию и зарплату тех сотрудников, которые работают в городах Oxford и San Francisco
SELECT
e.first_name,
e.last_name,
e.salary
FROM
locations AS l
INNER JOIN departments AS d
ON l.location_id = d.location_id
INNER JOIN employees AS e
ON d.department_id = e.department_id WHERE l.city IN ("Oxford", "San Francisco");

-- 4)Вывести имя, фамилию и город сотрудника
SELECT
e.first_name,
e.last_name,
l.city
FROM
locations AS l
INNER JOIN departments AS d
ON l.location_id = d.location_id
INNER JOIN employees AS e
ON e.department_id = d.department_id;

-- 5)Вывести города и соответствующие городам страны
SELECT
l.city,
c.country_name
FROM locations AS l
INNER JOIN countries AS c
ON l.country_id = c.country_id;

-- 6)Выведите названия департаментов, в которых менеджеры зарабатывают больше 10000
SELECT DISTINCT
d.department_name
FROM employees AS e
INNER JOIN employees AS e2
ON e.employee_id = e2.manager_id
INNER JOIN departments AS d
ON e.department_id = d.department_id WHERE e.salary>10000;