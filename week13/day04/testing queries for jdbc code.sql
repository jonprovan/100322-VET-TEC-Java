SELECT * FROM inventory;

SELECT * FROM inventory WHERE item_id = 1;

SELECT * FROM inventory WHERE item_id = 100;

SELECT * FROM `inventory` WHERE item_name LIKE `%bread`; SELECT * FROM employees; -- %";

INSERT INTO inventory (item_name)
VALUES ("toothpaste"); -- from our Java code we will get back a result set with just this new record

DELETE FROM inventory
WHERE item_id = 1; -- from our Java code we will not get back a result set from this statement

-- To get this to work in restrict mode
-- I need to go do something with the foreign keys in the items table


-- INSERT INTO old_inventory (item_id, item_name) -- say I had a table with the old inventory saved
-- VALUES (11, ... );

UPDATE items SET item_id = NULL WHERE item_id = 11;

DELETE FROM inventory WHERE item_id = 11; -- foreign key constraint exception

-- if I am not on RESTRICT mode 
DELETE FROM inventory WHERE item_id = 16;