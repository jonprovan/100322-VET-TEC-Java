-- Normalization
-- is capitalization considered in "unique record" requirement

SELECT * FROM orders
WHERE customer = "elmo churchill"; -- matches Elmo Churchill

SELECT * FROM orders
WHERE customer = "elmo# churchill"; -- doesn't match Elmo Churchill

SELECT * FROM orders
WHERE customer LIKE "Elmo churchill"; -- LIKE ignores capitalization

INSERT INTO orders (customer, date_ordered)
VALUES ("Elmo# Churchill", "2022-12-22");    -- special characters and spaces ARE taken into account when matching strings

INSERT INTO orders (customer, date_ordered)
VALUES ("elmo churchill", now());

INSERT INTO orders (customer, date_ordered)
VALUES ("elmochurchill", now()); -- special characters and spaces ARE taken into account when matching strings