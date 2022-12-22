/*
Kahoot Quiz Review

- Aggregate functions review

Q1
NOTE: Aggregate functions ignore NULL values
ex: SELECT COUNT(item_id) FROM myTable
where all the item_id values are Null
-- will return 0
exception: SELECT COUNT(*) FROM myTable;
-- will not ignore null values
-- even if I had a record where all the values are Null

Q2
NOTE: ROUND is NOT an aggregate function because it only works on a single values
aggregate function = a function that combines the field values from multiple ROWS (not just multiple columns from the same record)

Q3
NOTE: MIN and MAX work on non-numeric columns because we can compare DATEs TIMEs VARCHAR etc.

Q4
SELECT
FROM
WHERE -- can I operate on mulitple records here? ex: MIN(IndepYear) no, where filters by one record at a time
GROUP BY
HAVING -- can I operate on multiple records here? ex: MIN(IndepYear) yes, having filters by a group of records at a time
ORDER BY
LIMIT;

Q5
SELECT MIN(grade) FROM studentgrades;
-- will return the smallest NON NULL value
-- aggregate functions ignore null

IMPORTANT ANNOUNCEMENT: SQL QUIZ is on TUESDAY, Jan 3
*/