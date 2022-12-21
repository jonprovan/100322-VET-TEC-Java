-- Sales Queries
-- Topic: JOIN with multiple tables

-- Let's see all our data from each table individually
SELECT * FROM orders;
SELECT * FROM inventory;
SELECT * FROM items ORDER BY order_id;


-- Let's see all our data combined using a join
-- All our customers and what they ordered
SELECT customer, date_ordered, item_name
FROM
   orders o    -- if you give the table an alias, you can no longer refer to it by it's name
      INNER JOIN
   items it ON it.order_id = o.order_id -- can also use USING(order_id)
      INNER JOIN
   inventory inv ON inv.item_id = it.item_id;
   
   
   
   
   
   
-- these orders don't make sense, there is no items in their order   
-- why is this happening?
-- let's figure it out...
SELECT customer, date_ordered, item_name
FROM
   orders o    
      LEFT JOIN
   items it ON it.order_id = o.order_id 
      LEFT JOIN
   inventory inv ON inv.item_id = it.item_id
WHERE item_name IS NULL;


-- Count up how many orders don't make sense
SELECT COUNT(*)   -- aggregate functions IGNORES NULL VALUES! exception to the rule is COUNT(*)
FROM
   orders o    
      LEFT JOIN
   items it ON it.order_id = o.order_id 
      LEFT JOIN
   inventory inv ON inv.item_id = it.item_id
WHERE item_name IS NULL;
   

-- ------------------------------------------------------------------
-- what items have not been purchased
SELECT item_name
FROM
   orders o    -- if you give the table an alias, you can no longer refer to it by it's name
      LEFT JOIN
   items it ON it.order_id = o.order_id -- can also use USING(order_id)
      RIGHT JOIN
   inventory inv ON inv.item_id = it.item_id
WHERE customer IS NULL;  -- could also use WHERE customer = NULL
  
  
  
-- -----------------------------------------------------------------
-- Which customers have never ordered

-- Option 1: Use a subquery
SELECT customer
FROM orders
WHERE order_id NOT IN 
     (SELECT DISTINCT order_id FROM items); -- This is a subquery!
                                            
-- Option 2: Use a join
SELECT customer, item_id
FROM orders
   LEFT JOIN
	 items ON orders.order_id = items.order_id -- to see the nulls at the top use ORDER BY item_id;
WHERE                                          -- null is like Ace in a Deck of Cards, it is considered the LOWEST value not largest
  item_id IS NULL; -- mysql does not like = NULL notation
  
  
  
  
  
  
  
  
  
  
  
  