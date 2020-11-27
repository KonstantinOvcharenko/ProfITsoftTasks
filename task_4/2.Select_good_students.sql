SELECT 
student.idStudent, 
student.first_name,
student.last_name,
AVG(marks.mark) as average_mark,
course_title as course_name
FROM student
INNER JOIN marks ON student.idStudent=marks.idStudent
INNER JOIN course ON course.idCourse=marks.idCourse 
GROUP BY marks.idStudent, course_title
HAVING AVG(marks.mark)>4 AND course_title='Programming'
ORDER BY student.first_name, student.last_name;