SELECT*
FROM customers
WHERE points > 3000;

SELECT*
FROM customers
WHERE state != 'VA';
-- in MYSQL != is same as <>. Both can be used

SELECT 
    *
FROM
    customers
WHERE
    birth_date > '1990-01-01';
-- MYSQL date format is YYYY-MM-DD














