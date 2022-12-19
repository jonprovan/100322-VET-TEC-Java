-- is a one line comment
-- this is another one line comment

/*
	This is a multiline comment
    I can keep typing
    and none of this will get run as code
*/

/*
Terms to know:
- schema = definition of our database with all the descriptions of the tables and fields in the tables
*/

USE sakila; -- this tells MySQL to run all the following commands on the sakila database
             -- alternative: right click sakila and select "Set as Default Schema"
             
use sakila; -- not case sensitive, convention is to use capslock for the sql commands

DESCRIBE actor; -- actor is a table in my schema, I want to see all the information about

/*
   Data Types in MySQL:
   
   Numberic types
     - BIT(M) - M is the number of bits, M can be any value between 1 and 64
     - TINYINT - 8 bit integer          -- Java byte
     - SMALLINT - 16 bit integer        -- Java short
     - MEDIUMINT - 24 bit integer
     - INT - 32 bit integer             -- Java int  (in SQL you can also use INTEGER which is the same as INT they are synonyms)
     - BIGINT - 64 bit integer          -- Java long
   
     - FLOAT(M,D) - a floating point number where                   -- Java float
        M = Total number of digits (before + after the decimal)
        D = The number of decimal places 
     - DOUBLE(M,D)
     - DECIMAL(M,D)
       - For money, this is a bit more precise (avoid the rounding errors introduced by using float or double)
    
   String types
	- CHAR(M) - characters, M = the number of characters where the max is 255
    - VARCHAR(M) - character string of varying length up to M characters      -- Java string
    - TEXT - for storing up to 65,000 characters (use for storign entire articles or files etc.)
        -- There is also TINYTEXT, SMALLTEXT, MEDIUMTEXT, BIGTEXT
    - BLOB - Binary Large OBject - used for storing images and non-character based files
    - TINYBLOB - binary object but smaller size limit (ex: thumbnail images)
		-- There is also TINYBLOB, SMALLBLOB, MEDIUMBLOB, BIGBLOB
	- ENUM(...) ex: ENUM('Y', 'N') or ENUM('MON', 'TUE', 'WED', 'THU', 'FRI')
   
   Date/Time types
     - TIMESTAMP (YYYYMMDDHHMMSS)
     - DATE (YYYY-MM-DD)
     - TIME (HH:MM:SS)
     - DATETIME (YYYY-MM-DD HH:MM:SS)
     - YEAR
         2 digit and the values 70 through 69 correspond to 1970 to 2069
         4 digits allows me to enter the year of my choosing
         
   Other types
     - BOOLEAN (true/false) in MySQL you can also type BOOL and it means the same thing
/*

/* 
 Common SQL commands we will be using:
 CRUD - Create Read Update Delete
 
CREATE - Used to create a table
INSERT - Used to create a new entry/record in the table
SELECT - Used to read data from a table 
ALTER - Used to update the structure of a table
UPDATE - Used to update a record in the table
DROP - Used to delete an entire table 
DELETE - Used to delete records from the table
*/

SELECT * FROM sakila.actor; 
  -- SELECT is the sql command that reads data from the database
  -- * means "everything" specifically "all the columns"
  -- FROM clause specifies what table to read from 
  -- sakila is the name database/schema
  -- actor is the name of the table
  -- at the end of each query, you need a semicolon
  
SELECT first_name, last_name FROM actor;
  -- we can use a comma separated list for the columns we want returned
  
SELECT * FROM actor WHERE actor_id <= 20;
  -- WHERE filters for a specific condition specified
  
SELECT * FROM actor ORDER BY last_name;
  -- ORDER BY sorts my data by the column (or columns) specified
SELECT * FROM actor ORDER BY last_name DESC; -- rather than ASC which is the default
   -- I can specify if I want to sort in ascending or descending order

SELECT COUNT(last_name) AS count FROM actor WHERE last_name = "AKROYD"; -- COUNT is an aggregate function, AS is an alias for the column
  -- If I want to rename a column in the result set by giving the column an alias using AS (can also just use a name right after the column specified with the AS implied)


-- Kahoot Quiz Answers
/*
1. RDBMS = Relational Database Management System (MySQL)
2. SELECT = to read data from a database
3. Which is not a MysQL type TINYINT, SMALLINT, MEDIUMINT, LARGEINT? LARGEINT is NOT an SQL type it is called BIGINT
4. For storing financial data you should use? DECIMAL (to avoid rounding error caused by DOUBLE and FLOAT)

*/

SELECT last_name, COUNT(last_name) AS count FROM actor GROUP BY last_name ORDER BY count DESC;
-- GROUP BY will group the records together, useful for aggregate functions
    -- all columns in the select clause must be aggregate functions OR the column being grouped by
    
