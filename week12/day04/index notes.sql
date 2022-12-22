/*
What is are INDEXs? 


WHAT? is a pointer to data in a table
- like the index at the back of abook 
- we've heard the term index in Java when working with arrays


WHY?
- speeds up joins and searches bc mysql can go directly to the item 

WHEN?
- created for us when we have a primary key, foreign key, and unique key columns
- you would create an index for a column you search or join by often to increase search and join performance
   -- WARNING: degrades performance of INSERT/UPDATE/DELETE so do not index a column that gets updated often

HOW?
If you want to create your own
*/
CREATE INDEX customer_ix
  ON orders (customer);
  
SELECT customer
FROM orders
WHERE customer = 'Elmo Churchill'; -- this will now run faster bc we indexed this column