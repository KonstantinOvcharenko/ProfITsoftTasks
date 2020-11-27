SELECT idTeacher, 
teacher.first_name, 
teacher.last_name, 
course.course_title,
COUNT(course.idCourse) as students
FROM teacher 
INNER JOIN course ON course.idCourse=teacher.idTeacher 
INNER JOIN marks ON marks.idCourse=course.idCourse
INNER JOIN student ON student.idStudent=marks.idStudent
GROUP BY course.idCourse
HAVING COUNT(course.idCourse)>2000;
