/*
Views = a SELECT statement that is stored in the database as a database object
      = virtual table
         - the table(s) in the FROM clause are called the "base" tables
         - 
      
      
BENEFITS
--------
- data security = if we only want to give our user or application access to part of a tables columns or rows
- design independence = limit exposing the actual structure of your data to the external application
or user so that you don't have "tight-coupling" if the design changes
     -- like in Java handing a copy instead of a reference, 
           but here we want to create a copy, redact some information, and then give it to the user
     -- like in Java we only give users access to our getters and setters not the data itself
- simplified queries = hide the fact that you have to do a bunch of joins

*/

-- HOW TO CREATE A VIEW
-- --------------------
CREATE VIEW customer_order_details
(full_name, date, item) -- aliases for the columns the below select returns so these are the column names of my virtual table
AS 
  SELECT customer, date_ordered, item_name
FROM
   orders o    
      INNER JOIN
   items it ON it.order_id = o.order_id 
      INNER JOIN
   inventory inv ON inv.item_id = it.item_id;

-- How to use a view
-- ------------------
SELECT  * 
FROM customer_order_details;

DROP VIEW customer_order_details;

/*
when can you use a virtual table in a INSERT/UPDATE/DELETE statement?
When you CREATE the view: (think of all these as adding a FINAL to the view so it cannot be used to insert/update/delete)
- if you used a DISTINCT clause in your SELECT, you CANNOT do insert/update/delete with the view
- if you used a aggregate function in your SELECT, you CANNOT  " " 
- if you used a GROUP BY or HAVING clause, you CANNOT do insert/update/delete
- can't have used the UNION operator

*/
