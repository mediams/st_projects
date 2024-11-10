-- Используйте бд uni
USE uni;

-- 1) Найти компетенции , которых нет ни у одного преподавателя.
SELECT
c.title
FROM competencies AS c
LEFT JOIN teachers2competencies AS t2c
ON c.id = t2c.competencies_id WHERE t2c.teacher_id IS NULL;

-- 2)Вывести название курса и имя старосты
SELECT
c.title,
s.name
FROM courses AS c
LEFT JOIN students AS s
ON c.headman_id = s.id;

-- 3)Вывести имя студента и имена старост, которые есть на курсах, которые он проходит
SELECT
s.name,
s2.name AS "старостa",
c.title
FROM students AS s
LEFT JOIN students2courses AS s2c
ON s.id = s2c.student_id 
INNER JOIN courses AS c
ON c.id = s2c.course_id
LEFT JOIN students AS s2
ON c.headman_id = s2.id;