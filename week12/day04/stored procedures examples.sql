/*
Stored Procedures Examples

4 types of stored programs your database can have
1. stored procedure - can be calld from an application that has access to the database
(so far our queries have been stored outside of our database on our computer or in the future in our java code)
2. functions - can be called from our queries just like the built-in functions concat() etc.
3. Triggers - is executed in response to an INSERT, UPDATE, or DELETE
4. Events - is excuted at a scheduled time

*/

-- how to create a stored procedure
/*
Method 1: in Schemas panel, right click Stored Procedure, select Create Stored Procedure
          write your query inside the BEGIN and END statement and voila that's it!
*/

-- how to call your stored procedure
-- CALL get_customers();






USE `sales`;
DROP procedure IF EXISTS `sales`.`get_customer_order_info`;

DELIMITER $$
USE `sales`$$
CREATE PROCEDURE `get_customer_order_info`()
BEGIN

  -- I can declare variables
  DECLARE first_customer VARCHAR(20);
  DECLARE my_variable VARCHAR(20); -- declares a variable
  SET my_variable = 'Hello!'; -- assigns the value to a variable
  
  
  SELECT customer
  INTO first_customer -- assigns the value to a variable
  FROM orders
  ORDER BY customer ASC
  LIMIT 1;
  
  
  SELECT customer, date_ordered, item_name
FROM
   orders o    
      INNER JOIN
   items it ON it.order_id = o.order_id 
      INNER JOIN
   inventory inv ON inv.item_id = it.item_id
WHERE customer = first_customer;
END$$

DELIMITER ;

 -- change delimiter from // to ;
CALL get_customer_order_info();

-- can I use INTO outside of a stored procedure 
-- and what happens if I store more than one value in to a variable

SET @myvalue = 10;

SELECT @myvalue;

SELECT customer
  INTO @myvalue -- assigns the value to a variable
  FROM orders
  ORDER BY customer ASC
  LIMIT 1; -- if I forget to limit by one, this will not work, INTO expects only 1 value




