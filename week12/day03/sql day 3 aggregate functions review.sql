/*
Aggregate functions 
-- also called column functions perform a calculation on the values in a set of rows

COUNT(expression)   -- The number of non-null values in the expression (expression can be string, date, number etc)
MAX(expression)     -- finds the largest (ignores nulls) expression can be string, date, number
MIN(expression)     -- finds the smalles (ignores nulls) expression can be string, date, number
SUM(expression)     -- expression has to be a number
AVG(expression)     -- expression has to be a number

NOTE: ALL aggregate functions ignore NULL except COUNT(*)

NOTE: We can specify COUNT(DISTINCT colName) -- not count duplicates
	     default is  COUNT(ALL colName)

*/

-- -------------------------------------------------------------------------
-- Side note 1:
-- other functions we've used
-- (note: concat() is not aggregate 
-- 		  round() is not aggregate
--        lpad() is not aggregate)

-- ------------------------------------------------------------------------
-- Side note 2: What does MIN() and MAX() return if all the values are NULL? 
SELECT name, IndepYear FROM country WHERE IndepYear IS NULL;

SELECT name, min(IndepYear) 
FROM country 
WHERE IndepYear IS NULL; -- min and max ignore null (if all are null, the aggregate function returns null)





-- ==============================================================================
-- ===============================================================================
-- Example 1: Find the earliest and latest independence years of all the countries
SELECT MIN(indepyear) AS `Earliest Indep Year`, MAX(indepyear) `Latest Indep Year` 
FROM country;
















-- ==============================================================================
-- ===============================================================================
-- ---------------------------------------------------------------------------
-- Example 2: Find the name of the country with the earliest independence year

-- Guess #1:
SELECT name, MIN(indepyear) 
FROM country 
WHERE IndepYear = MIN(indepyear); -- we cannot use an aggregate function in a where clause


-- Guess #2: 
SELECT name, MIN(IndepYear), IndepYear
FROM country
GROUP BY name
HAVING IndepYear = MIN(IndepYear);  -- we CAN use an aggregate function in a having clause
-- GROUP BY name does not work because it 
-- does not allow us to access IndepYear bc it is not one of the following

-- When using GROUP BY, SELECT clause can only contain:
		--      --> column used for grouping
		--      --> aggregate function
		--      --> expressions that result in a constant
		--      --> columns that are FUNCTIONALLY DEPENDENT on a column usesd for grouping
-- Definition of FUNCTIONALLY DEPENDENT
-- For a non-grouping column to be FUNCTIONALLY DEPENDENT on the grouping column, 
	-- the grouping column MUST be a PRIMARY KEY    or    UNIQUE and not allow NULL values

-- Guess #3:
SELECT name, MIN(IndepYear), IndepYear
FROM country 
GROUP BY code                      
HAVING IndepYear = MIN(IndepYear);


-- Guess #4: Use a subquery
SELECT name, IndepYear
FROM country 
WHERE IndepYear = (SELECT MIN(IndepYear) FROM country);

SELECT name, IndepYear
FROM country
WHERE IndepYear = (SELECT MAX(IndepYear) FROM country);

-- Just for learning purposes, let's use a join with our subquery result as one of the join tables


SELECT country.name, other.IndepYear
FROM country
  JOIN
     (SELECT MIN(IndepYear) as IndepYear FROM country) other
   USING (IndepYear);




-- ==============================================================================
-- ===============================================================================
-- ---------------------------------------------------------------------------
-- Example 3: Count up the number of items each customer has ordered

SELECT customer, COUNT(item_name) as `count`
FROM orders
        JOIN
	 items USING (order_id)
        JOIN -- this is an INNER
     inventory USING (item_id)
GROUP BY customer
ORDER BY `count` DESC; -- LIMIT 1; -- would give us just the customer who ordered the most

-- Let's use a feature that MySQL has (this is not standard SQL but is useful)
SELECT customer, COUNT(item_name) as `count`
FROM orders
        JOIN
	 items USING (order_id)
        JOIN -- this is an INNER
     inventory USING (item_id)
GROUP BY customer WITH ROLLUP;

-- Let's use WITH ROLLUP while grouping by more than one column

SELECT 
  IF(GROUPING(customer) = 1, 'Grand totals', customer), -- GROUPING(expression) = 1 if this is a grouping summary row, else it returns 0
  IF(GROUPING(item_name) = 1, 'Total Items Count',  item_name),
  COUNT(*) as `items count`
FROM
    orders
      JOIN
	items USING (order_id)
	   JOIN
	inventory USING (item_id)
GROUP BY customer, item_name WITH ROLLUP;

-- One more example of using IF

SELECT 
   if(customer IS NULL, 'NO ONE', customer), 
   if(date_ordered IS NULL, 'NEVER' , date_ordered), 
   IF(item_name IS NULL, 'nothing here', item_name)
FROM
   orders o    
      LEFT JOIN
   items it ON it.order_id = o.order_id 
      LEFT JOIN
   inventory inv ON inv.item_id = it.item_id;


/*
Review of GROUP BY

order of the clauses in the query:
SELECT
FROM
WHERE
GROUP BY
HAVING
ORDER BY
LIMIT

*/