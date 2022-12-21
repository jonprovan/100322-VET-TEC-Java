/*
One more JOIN topic: self-join

*/

/*
employees
-------------------------------------------------------------------------
employee_id |  first_name  | last_name  | job               | manager_id
-------------------------------------------------------------------------
1234             Boots	       Patel      Bug Patrol             987
987              Erica          Hicks     Litter box cleaner      NULL

*/

CREATE TABLE employees
(
   employee_id  INT,
   first_name   VARCHAR(20),
   last_name    VARCHAR(20),
   job          VARCHAR(20),
   manager_id   INT
);

INSERT INTO employees
VALUES
(1234       ,      'Boots'	   ,    'Patel'  ,    'Bug Patrol'       ,      987),
(987        ,      'Erica'       ,  'Hicks'   ,  'Litter box cleaner'  ,    NULL);

INSERT INTO employees
VALUES
(2233       ,     'Pinky'       ,    'Patel'       ,   'Seat warmer'   ,    NULL );


ALTER TABLE employees 
ADD CONSTRAINT pk_employees
    PRIMARY KEY (employee_id);
     
UPDATE employees
SET manager_id = 2233
WHERE employee_id = 987; -- safe update this NEEDS to be a primary key

SELECT e1.first_name as employee_name, e2.first_name as manager_name
FROM
   employees e1
      LEFT JOIN
   employees e2
      ON e1.manager_id = e2.employee_id;