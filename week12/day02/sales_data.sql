insert into orders (order_id, customer, date_ordered) values (1, 'Westbrooke Trusslove', '2022-09-27');
insert into orders (order_id, customer, date_ordered) values (2, 'Spence Rackstraw', '2022-01-23');
insert into orders (order_id, customer, date_ordered) values (3, 'Efren Cronk', '2022-01-14');
insert into orders (order_id, customer, date_ordered) values (4, 'Laina Filyushkin', '2022-08-11');
insert into orders (order_id, customer, date_ordered) values (5, 'Roxine Cremer', '2022-04-30');
insert into orders (order_id, customer, date_ordered) values (6, 'Matt Paolino', '2022-04-03');
insert into orders (order_id, customer, date_ordered) values (7, 'Othilie Nuzzetti', '2022-05-23');
insert into orders (order_id, customer, date_ordered) values (8, 'Zita Hallet', '2022-05-19');
insert into orders (order_id, customer, date_ordered) values (9, 'Jo Layhe', '2022-11-09');
insert into orders (order_id, customer, date_ordered) values (10, 'Suzanna Wesson', '2022-06-09');
insert into orders (order_id, customer, date_ordered) values (11, 'Hamil Kubicka', '2022-10-16');
insert into orders (order_id, customer, date_ordered) values (12, 'Rodrigo Ateggart', '2022-03-17');
insert into orders (order_id, customer, date_ordered) values (13, 'Elmo Churchill', '2022-06-26');
insert into orders (order_id, customer, date_ordered) values (14, 'Kirstyn Andrusyak', '2022-09-20');
insert into orders (order_id, customer, date_ordered) values (15, 'Burt Russen', '2022-02-16');
insert into orders (order_id, customer, date_ordered) values (16, 'Cortie Bretton', '2022-12-11');
insert into orders (order_id, customer, date_ordered) values (17, 'Kermit Giacopelo', '2022-09-08');
insert into orders (order_id, customer, date_ordered) values (18, 'Chevalier Demelt', '2022-09-06');
insert into orders (order_id, customer, date_ordered) values (19, 'Christie Gogerty', '2022-06-12');
insert into orders (order_id, customer, date_ordered) values (20, 'Schuyler Lipmann', '2022-08-23');

-- ----------------------------------------------------------------------------------------------
-- inventory data
-- ----------------------------------------------------------------------------------------------
insert into inventory (item_id, item_name) values (1, 'Alize Gold Passion');
insert into inventory (item_id, item_name) values (2, 'Parsnip');
insert into inventory (item_id, item_name) values (3, 'Cleaner - Comet');
insert into inventory (item_id, item_name) values (4, 'Thyme - Fresh');
insert into inventory (item_id, item_name) values (5, 'Versatainer Nc - 9388');
insert into inventory (item_id, item_name) values (6, 'Mint - Fresh');
insert into inventory (item_id, item_name) values (7, 'Lettuce - Sea / Sea Asparagus');
insert into inventory (item_id, item_name) values (8, 'Compound - Passion Fruit');
insert into inventory (item_id, item_name) values (9, 'Bread - Pain Au Liat X12');
insert into inventory (item_id, item_name) values (10, 'Cheese - Cheddar With Claret');
insert into inventory (item_id, item_name) values (11, 'Appetizer - Spring Roll, Veg');
insert into inventory (item_id, item_name) values (12, 'Appetizer - Cheese Bites');
insert into inventory (item_id, item_name) values (13, 'Allspice - Jamaican');
insert into inventory (item_id, item_name) values (14, 'Potatoes - Purple, Organic');
insert into inventory (item_id, item_name) values (15, 'Canada Dry');
insert into inventory (item_id, item_name) values (16, 'Temperature Recording Station');
insert into inventory (item_id, item_name) values (17, 'Sauce - Oyster');
insert into inventory (item_id, item_name) values (18, 'Coriander - Seed');
insert into inventory (item_id, item_name) values (19, 'Bread - White, Unsliced');
insert into inventory (item_id, item_name) values (20, 'Pasta - Tortellini, Fresh');

-- ----------------------------------------------------------------------------------------------
-- items data
-- ----------------------------------------------------------------------------------------------

insert into items (item_id, order_id) values (11, 10);
insert into items (item_id, order_id) values (16, 16);
insert into items (item_id, order_id) values (4, 15);
insert into items (item_id, order_id) values (5, 9);
insert into items (item_id, order_id) values (10, 19);
insert into items (item_id, order_id) values (18, 7);
insert into items (item_id, order_id) values (15, 17);
insert into items (item_id, order_id) values (8, 3);
insert into items (item_id, order_id) values (8, 12);
insert into items (item_id, order_id) values (15, 1);
insert into items (item_id, order_id) values (16, 9);
insert into items (item_id, order_id) values (11, 2);
insert into items (item_id, order_id) values (3, 2);
insert into items (item_id, order_id) values (4, 20);
insert into items (item_id, order_id) values (13, 7);
insert into items (item_id, order_id) values (12, 2);
insert into items (item_id, order_id) values (4, 2);
insert into items (item_id, order_id) values (2, 2);
insert into items (item_id, order_id) values (14, 14);
insert into items (item_id, order_id) values (12, 3);