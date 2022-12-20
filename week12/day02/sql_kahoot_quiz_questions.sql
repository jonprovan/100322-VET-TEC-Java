-- Kahoot Quiz Review

/*
1. To update a record in a table, use ________.
-- to alter the table structure itself, use ALTER
-- updating a record within a table, use UPDATE
ex:
UPDATE student
SET major = "Web Development"
WHERE first_name = "Spider" AND last_name = "Man";

2. to make a column required use:
NOT NULL
ex:
CREATE TABLE student (
  first_name VARCHAR(40) NOT NULL
)

3. The MySQL logo is a dolphin (the squirrel of the sea)

4. SQL = Standard Query Language
(used to be called Standard English Query Language)

5. To create a relationship between tables, we need a
        foreign key constraint
Ex: 
ALTER TABLE student
ADD CONSTRAINT student_fk_college -- name your constraint using the type of constraint what tables its between
  FOREIGN KEY (college_code) REFERENCES college (college_code);





*/