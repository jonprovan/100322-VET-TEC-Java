/*
SQL Day 3

Review
- To grab data from a table I use a __________ command
SELECT    -- selects data
FROM      -- specifies which table to use/grab from
WHERE     -- filter 
ORDER BY  -- sort
LIMIT     -- if I want to only get back a certain number of results
*/

SELECT now(); -- I can run a SELECT query without any of the other clauses and it will still work
SELECT 'Teacher';
/*
JOIN -- used for combining columns from multiple tables in my result set


LEFT    -- pulls all the records from the left table regardless of if there is a matching right record
             -- fills in with null if there is no match
RIGHT   -- pulls all the records from the right table regardless of if there is a matching left record
INNER   -- pulls only the record from the LEFT table that have a matching right right and vise-versa
FULL OUTER  -- combines every left table record with every right table record
                 -- NOT available in MySQL
                 -- instead we will use a UNION 
                 -- to get a FULL OUTER JOIN we can combine the results of a LEFT JOIN and a RIGHT JOIN alter
                     using a UNION
                 
UNION   -- used for combining rows from multiple tables in my result set
              -- each table would need the same columns and column types to "stack" the results


*/

SELECT first_name, last_name, 'Student' as `role` -- use back ticks if the name is a keyword
FROM student
   UNION
SELECT first_name, last_name, 'Teacher' as `role`
FROM teacher
   ORDER BY last_name, first_name; -- Order by last_name, if there are duplicates, order by first_name within that set

SELECT student.first_name as `student name`, student.last_name, teacher.first_name, teacher.last_name
FROM student, teacher;

SELECT *
FROM student
   JOIN      -- default JOIN type is INNER
     college
   USING (college_code);

SELECT *
FROM student
   JOIN
     college
   ON student.college_code = college.college_code;
   
   
   
   
   
   
   
-- Are there any students who are teachers in the school?
-- (this might not work if we have duplicate names -- maybe add dob if you have that info)
SELECT student.first_name, student.last_name
FROM student
   JOIN          -- this is a INNER JOIN, so it will only return matches
     teacher
   ON student.first_name = teacher.first_name
         AND
	  student.last_name = teacher.last_name;
      
-- NOTE: I DO NOT need to join by the primary key
-- my join condition can be whatever I want
-- including multi-part join conditions
      