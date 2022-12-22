/*
SELECT with WHERE value LIKE examples

*/

SELECT customer
FROM orders
WHERE customer LIKE 'Elmo Churchill'; -- not case sensitive

SELECT customer
FROM orders
WHERE customer LIKE 'E%'; -- % matches any number of characters

SELECT customer
FROM orders
WHERE customer LIKE '%th%';

SELECT customer
FROM orders
WHERE customer LIKE '%E%E%';

SELECT customer
FROM orders
WHERE customer LIKE '_E%'; -- _ matches exactly one character

SELECT customer
FROM orders
WHERE customer LIKE '%E_';

-- LIKE and its wildcards help us FILTER
-- to format the returned value, for example only grab one character,
--    use the built-in String functions like SUBSTRING() or LEFT(customer, 1) 

