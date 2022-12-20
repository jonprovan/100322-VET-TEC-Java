-- Goal: Create our Student and College tables we designed yesterday
-- Step1: We created a new database (schema = the design/description of the database)
CREATE DATABASE student; 

-- Step2: Set the student database as our default schema (double click in SCHEMAS panel also works)
USE student;


-- Step3: Define tables in our database
-- Notation:
   -- CREATE command
   -- giving it a table name of student
   -- specifing fields/columns in a comma separated list
   -- each field/column needs a name and a type
       -- we can also specify modifiers like 
           -- NOT NULL = each record created MUST provide a value 
           -- AUTO_INCREMENT = MySQL will generate this value for use
           -- DEFAULT = we can provide a default value
           -- etc.
CREATE TABLE student
(
   student_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   first_name VARCHAR(20) NOT NULL,
   last_name VARCHAR(40) NOT NULL,
   major VARCHAR(100)
);

-- Step 4: Query the table to see what data we have
SELECT * FROM student; -- Should be empty right now, expecting 0 rows returned

-- Step 5: We can add records to our table using INSERT INTO table_name VALUES comma-separated-list
INSERT INTO student (first_name, last_name) -- specify columns, or you must use ALL the columns in the order it was defined
VALUES 
('Tony', "Stark"),  -- for varchar you can use single or double quote
("Spider", "Man"), 
("Miles", "Morales");

DROP TABLE student; -- this will delete the table

DELETE FROM student
WHERE student_id <= 3; -- this will delete a record(s)

-- Step 6: We can update the records in our table using UPDATE table_name SET col = new_value WHERE condition
UPDATE student
SET major = "Web Development"
WHERE first_name = "Spider" AND last_name = "Man"; -- this will not work in safe mode, MUST use primary key

-- If you are in safe mode, run a select statement to see what the student_id is
SELECT student_id 
FROM student
WHERE first_name = "Spider" AND last_name = "Man";
-- Then run the below update
UPDATE student
SET major = "Web Development"
WHERE student_id = 5;
-- To view the change, run a select
SELECT *
FROM student
WHERE first_name = "Spider" AND last_name = "Man";





-- Goal: Create a college table
CREATE TABLE college
(
   college_code INT UNSIGNED ZEROFILL, -- INT(M) will use M digits, ZEROFILL will on the left to be M digits
   college_name VARCHAR(30) NOT NULL, -- this makes it required
   state CHAR(2) -- for just state abbreviations we only need 2 characters
); -- to run just this line, use the lightning bolt with a cursor

-- WHOOPS, we didnt specify a primary key
ALTER TABLE college
ADD PRIMARY KEY (college_code);

-- Let's see what's in our table
SELECT * FROM college;

-- Let's add some records to our college table
INSERT INTO college (college_code, college_name, state) -- optional list of columns
VALUES
(012345,	"MCU",	"CA");

-- Now we should have data in our table
SELECT * FROM college;

-- Now let's connect our tables with a relationship
-- using a foreign key

-- step 1: add a college column to student
ALTER TABLE student
ADD COLUMN college INT UNSIGNED ZEROFILL; -- match the type of the college_code column we created in college table

ALTER TABLE student
RENAME COLUMN college TO college_code;

-- step 2: specify it to be the foreign key
ALTER TABLE student
ADD CONSTRAINT student_fk_college -- name your constraint using the type of constraint what tables its between
  FOREIGN KEY (college_code) REFERENCES college (college_code); 
  --           ------------                      -------------
  --         name of col in student              name of col in college (specifically the primary key)
  
  
-- GOAL: Insert and Delete from the college and student table now that they are related by a constraint
-- Let's look at what we have right now
SELECT * FROM student;
SELECT * FROM college;

-- Create a new student and have him attend a college
INSERT INTO student (first_name, last_name, major, college_code)
VALUES ('Bruce', 'Banner', 'Nuclear Physics', 12345); -- The college_code MUST exist in the college table

-- Now our row has been added successfully
-- We can create a result set with a combination of columns
-- We can use built in functions to change/combine/modify the returned values
-- ex: CONCAT does string concatenation
--     LPAD Left Pad the string with (string_value, desired_total_length, character_to_pad_with)
SELECT CONCAT(first_name, ' ', last_name) AS name, 
    major, LPAD(college_code, 6, 0) AS college 
FROM student WHERE first_name = 'Bruce';


-- Delete from the college table
DELETE FROM college
WHERE college_code = 12345; -- cannot delete if there is a student that is referencing this record

-- solution: delete or update that student before deleting this school
UPDATE student
SET college_code = NULL
WHERE student_id IN (9, 11); -- IN lets us match mutliple values without 
-- WHERE student_id = 9 OR student_id = 11;

-- Check if it worked
SELECT * FROM student;

-- Try again delete from college
DELETE FROM college
WHERE college_code = 12345;

-- DEFINITION OF A JOIN
-- a join allows us to combine data from two tables, such that records are combined from each table
-- based on a condition we give it
-- For a LEFT JOIN
    -- NOTE: If there is no matching row from the other table, it fills the columns with nulls
-- Goal: Run a simple LEFT JOIN
SELECT * 
FROM 
  student LEFT JOIN college
    USING(college_code); -- This is how I specify the join column if they are named the same
    
-- update a record to assign a college to a student
UPDATE STUDENT 
SET college_code = 012345
WHERE student_id IN (5, 9, 22,430, 239 ); -- this is a list NOT a range

-- instead of using IN, if we want a range use BETWEEN or logical operators
SELECT student_name
FROM student
WHERE student_id BETWEEN 5 AND 9; -- or WHERE student_id >= 5 AND student_id <= 9


SELECT * 
FROM 
  student LEFT JOIN college
    USING(college_code);

 SELECT * 
FROM 
  student INNER JOIN college
    USING(college_code);   
    
SELECT * 
FROM 
  student RIGHT JOIN college
USING(college_code);

SELECT *
FROM college LEFT JOIN student
USING (college_code);

INSERT INTO college
VALUES (012346, 'Stanford', 'CA');
