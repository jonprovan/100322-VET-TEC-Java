SELECT * FROM sakila.payment;
-- How many different customers has each staff served?
SELECT staff_id, count(customer_id) AS customer_count
FROM payment
GROUP BY staff_id;

SELECT * FROM payment LIMIT 1; -- limits the number of rows I get back
SELECT * FROM payment WHERE staff_id = 1;
SELECT staff_id, count(*) FROM payment group by staff_id;

-- How many different customers have made a payment?
SELECT COUNT(DISTINCT customer_id) FROM payment;

-- How many different customers has each staff served?
SELECT staff_id, COUNT(DISTINCT customer_id) FROM payment GROUP BY staff_id;

-- Who are the most frequent customers?
SELECT payment_id, customer_id FROM payment;
SELECT count(payment_id), customer_id FROM payment GROUP BY customer_id;
SELECT count(payment_id) count, customer_id FROM payment GROUP BY customer_id ORDER BY count DESC;
SELECT count(payment_id) count, customer_id FROM payment GROUP BY customer_id ORDER BY count DESC LIMIT 1;
SELECT count(payment_id) count, customer_id FROM payment GROUP BY customer_id ORDER BY count DESC 

-- HAVING is like the where clause, but we use it with GROUP BY to filter the results of the aggregate function


-- What is the highest and lowest amount paid for a rental?
SELECT MAX(amount) max, MIN(amount) min FROM payment WHERE amount  != 0;
-- <> is the NOT-equal-to logical operator, also can use != for NOT-EQUAL-TO like we are used to
/* logical operators:
  < less than
  <= less than or equal to
  > greather than
  >= greater than or eqal to
  =  equal to
  <> is not equal to
  != is  not equal to
  */