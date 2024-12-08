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