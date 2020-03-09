USE sql_store;

-- this is to select all rows
-- (select 1, 2, 3, 4, etc., will fetch those rows)
SELECT * 
FROM customers
WHERE customer_id = 1 -- (optional clause to filter)
ORDER BY first_name; -- (sorting)

-- Fetching data with specific columns (with applying arithemic and giving name to new column)
SELECT last_name, 
first_name, points, 
(points + 10) * 50 AS 'discount_factor'
FROM customers;

-- selecting column by removing by excluding duplicates
SELECT DISTINCT
    state
FROM
    customers;
    
    
-- For the product table
SELECT * FROM products;
SELECT name, 
unit_price, 
unit_price*1.1 AS 'New Price'
FROM products;

USE sql_inventory;
SELECT *
FROM products
