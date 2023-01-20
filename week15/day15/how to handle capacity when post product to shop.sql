SELECT * FROM shop.shop_stock;

-- My front end wants to store a product in shop number 1

-- Option 1: Before I send the post request,
-- send a get request that /warehouse/current/capacity -> controller -> service ->
select count(*)
from product join shop_stock using (product_id) join shop using (shop_id)
where shop_id = ?;
-- if this is less than the max capacity, then send the POST
-- if not give the user an error message

-- Option 2: sent the POST 
-- check on the backend in your service class
select count(*)
from product join shop_stock using (product_id) join shop using (shop_id)
where shop_id = 1;
-- service layer finds the capacity is alreayd full so it doesn't do the repo.save
-- instead throw a custom exception
-- catch it in your global exception handler
-- generate a http response object, where i decide what the code and body say 