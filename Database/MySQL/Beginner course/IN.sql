SELECT 
    *
FROM
    customers
WHERE
    state IN ('VA' , 'FL', 'GA');-- VA or FL or GA

SELECT*
FROM customers
WHERE state NOT IN('VA', 'FL', 'GA');

SELECT*
FROM products
WHERE quantity_in_stock IN(49, 38, 72);