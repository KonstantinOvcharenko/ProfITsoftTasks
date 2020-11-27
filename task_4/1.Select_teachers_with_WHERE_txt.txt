SELECT idTeacher, 
teacher.first_name, 
teacher.last_name, 
course.course_title,
COUNT(course.idCourse) as students
FROM teacher, course, student, marks
WHERE course.idCourse=teacher.idTeacher 
AND marks.idCourse=course.idCourse 
AND student.idStudent=marks.idStudent
GROUP BY course.idCourse
HAVING COUNT(course.idCourse)>2000;