SELECT 
COUNT(DISTINCT student.idStudent) as students_per_group,
COUNT(marks.mark) as marks,
university.group.name
FROM student
INNER JOIN university.group ON student.id_group=university.group.idGroup
INNER JOIN marks ON marks.idStudent=student.idStudent
GROUP BY student.id_group;

