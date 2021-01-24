SELECT*
FROM customers
ORDER BY first_name;

SELECT*
FROM customers
ORDER BY first_name DESC; 
-- In descending order

-- sort by multiple columns
SELECT*
FROM customers
ORDER BY state DESC, first_name;

-- We do not need to select all the columns. With can select column A and still order column B in a table
SELECT first_name, last_name
FROM customers
ORDER BY state; 
-- We did not select state, but we can still sort it. It will not print the state however, but will sort it

SELECT 
    first_name, last_name, state
FROM
    customers
ORDER BY 1 , 2 DESC , 3; 
-- Order by firts_name, last_name in descending, and state. The numbers corresponds to selected columns orderly

SELECT*, quantity*unit_price AS total_price
FROM order_items
WHERE order_id = 2
ORDER BY total_price DESC;

