-- SQL Test Review
/* Problem 1:

- Foreign key
= used to associate one table to another 
(does not need to reference the primary key of another table
but usually that is what we will do)
- Primary key 
  = unique identifier that uniquely identifies each row
- Secondary Key (fake ans)
- Candidate Key
= a potential primary key, it is unique for every record
- Alternate Key
*/

/* Problem 2: What type of join is used to return rows where there is at least one match between the tables?


- inner join = only returns rows that have a match
- left join = shows all rows from the left table regardless of if there is a match from the right
   (if there is no match, those columns populate with null)
- right join = shows all rows from the right table regardless of if there is a match from the left
   (if there is no match, those columns populate with null)
- outer join = (this is the full outer join we talked about) aka cartesian product all the left
   records are matched with all the right records
*/

/* Problem 3: Which aggregate function is used to get the total number of rows?

- COUNT = counts the number of records
- SUM = sums the values in the records
- LIMIT = limits the number of records returned (so the first however many) we can also use an offset
- NUMBER (fake)
*/
-- example :
SELECT * FROM inventory LIMIT 5 OFFSET 5;
-- SELECT * FROM inventory OFFSET 5; cannot use just offset
-- SELECT * FROM inventory LIMIT * OFFSET 5; cannot use * anywhere else but in the SELECT clause
SELECT * FROM inventory LIMIT 5, 5; -- the first number is how many to ignore, the second is how many to grab

/* Problem 4: Outer join results will contain NULL values where a corresponding row is not found by the join predicate.
true
*/

/* Problem 5: What order do the clauses in a Query need to be in
SELECT -- what cols we want
FROM -- what tables we want them from
WHERE -- filter on the individual records
GROUP BY -- groups the records that share a common  value in the given column
HAVING -- filters on the groups
ORDER BY -- sorts
LIMIT -- limits the number of results returned

*/

/* Problem 6: Find only customers who have JA anywhere in their last name.

WHERE last_name LIKE '%JA%'

-- We need to use LIKE bc = matches the characters exactly and doesn't understand wildcards

% = matches any number of characters (or no characters)
_ = matches exactly one character

*/

SELECT * FROM inventory WHERE inventory.item_name LIKE "__i%"; -- we can use multiple _ to match the nth letter
-- if you are starting to do more complex matching, use REGEX

/* Problem 7: The constraint that defines the unique identifier for a row is __________.
primary key = defines a unique identifier
unique = restricts what values can be added to that column to one that has not been used yet
not null = restricts what value can be added to the column to not be null
foreign key = references a record in another table, does not have to be unique
*/

/* Problem 8: The __________ constraint allows a record to reference a record in another table.
foreign key

*/

/* Problem 9: To achieve 1st normal form, your tables cannot have:

1NF = no repeating groups and each row must be unique aka have primary key
(no repeating roups = limits what a column 
(ex: description inside a cell would NOT violate 1NF bc we cannot break this into smaller useful parts)
(ex: list of items "apples, bananas, eggs" would violate 1NF bc we are storing a list in single cell 
      making searching difficul)
2NF = must satisfy 1NF and have no partial dependencies 
(all non-key columns must depend on the entire key -- this is only violated when there is a composite key)
3NF = must satisfy 1NF, 2NF, and have no transitive dependencies
(all non-key columns must depend on the primary key and nothing but the primary key
 so if A->B->C this is a transitive dependency)

[ ] Composite keys
[ ] Transitive dependencies
[ ] Functional dependencies
[x] Repeating groups
*/

/* Problem 10: The achieve 2nd normal form, your tables cannot have:

[] Composite keys
[x] Repeating groups
[] Transitive dependencies
[x] Functional dependencies
*/

/* Problem 11: To achieve 3rd normal form, your tables cannot have:

Group of answer choices

[x] Repeating groups
[x] Functional dependencies
[] Primary keys
[] Composite keys
[x] Transitive dependencies

*/

/* Problem 12: Given a table called Customer, which query will find only customers who have a last name beginning with 'Z'?

Group of answer choices

select * from customer where last_name > 'Z' -- matches 
select * from customer where last_name IN ('Z') -- matches any one of the strings in the list, so will only match 'z' exactly
select * from customer where last_name LIKE 'Z%' -- matches any string that starts with z and ends with any number of other characters
select * from customer where last_name LIKE '%Z%' -- matches anywhere in the string
select * from customer where last_name = 'Z' -- matches exactly the characters in the string 'z'


*/

select * from inventory where item_name > 'E'; 
-- alphabetical order is used, so in a dictionary what would come after the string 'E'

select * from inventory where item_name IN ('Parsnip', 'Thyme - Fresh'); -- similar to the = operator, but matches any one of the items in the list


/* The __________ divides the results of a query into of rows, typically to perform aggregations on each group.

Group of answer choices

[x] Group by

Order by

None of these

Partition by
*/ 

/* Problem 14 Given a Customer table and Order table that references Customer, which of the following will find only customers who have placed an order? (Select all that apply)

Group of answer choices

select * from customer c left join orders o on o.cust_id = c.cust_id;

[x] select * from customer c inner join orders o on o.cust_id = c.cust_id; -- only results with matches

select * from customer c right join orders o on o.cust_id = c.cust_id;

select * from customer c full outer join orders o on o.cust_id = c.cust_id;

*/

/* Problem 15: 

select * from customer c inner join orders o on o.cust_id = c.cust_id where o.order_id is null;

[x] select * from orders o right join customer c on o.cust_id = c.cust_id where o.order_id is null;

[x] select * from customer c left join orders o on o.cust_id = c.cust_id where o.order_id is null;

select * from customer c full outer join orders o on o.cust_id = c.cust_id where o.order_id is null;

*/

/* Problem 16: select * from customer c inner join orders o on o.cust_id = c.cust_id where o.order_id is null;

INSERT  -- is used for making new records
CREATE  -- is used for making tables etc.

*/

INSERT INTO inventory (item_name) -- we do NOT need the column list if we are providing all the column values but then we will need to follow the order of the create definition 
VALUES ('EGGS');

select * FROM INVENTORY where ITEM_NAME = 'EGGS';
