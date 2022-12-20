-- Create a sales database
-- CREATE DATABASE sales;

-- USE sales;



-- Create tables
CREATE TABLE orders -- if you want to name it order which is a keyword use backticks `order`
(
   order_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   customer VARCHAR(20) NOT NULL,
   date_ordered DATE NOT NULL
);

CREATE TABLE inventory 
(
   item_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   item_name VARCHAR(50) NOT NULL
);

CREATE TABLE items
(
  item_id INT UNSIGNED,
  order_id INT UNSIGNED,
  CONSTRAINT fk_item_order
     FOREIGN KEY (order_id) REFERENCES orders (order_id),
  CONSTRAINT fk_items_inventory
     FOREIGN KEY (item_id) REFERENCES inventory (item_id)
);




