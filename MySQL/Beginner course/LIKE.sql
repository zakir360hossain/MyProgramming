SELECT*
FROM customers
WHERE last_name LIKE 'b%';
-- the last name starts with b. % = any letter after b. Case does not matter

SELECT*
FROM customers
WHERE last_name LIKE 'brush%';

SELECT*
FROM customers
WHERE last_name LIKE '%b%';
-- as long as has a b in the last name

SELECT*
FROM customers
WHERE last_name LIKE '%y';
-- last name ends with a y

SELECT 
    *
FROM
    customers
WHERE
    last_name LIKE '_y';
-- exactly 2 character long last name, the 2nd one has to be y. 1 underscore = one single character

SELECT*
FROM customers
WHERE last_name LIKE '_____y';

SELECT*
FROM customers
WHERE last_name LIKE 'b____y';

SELECT*
FROM customers 
WHERE address LIKE '%trail%' OR address LIKE '%avenue%';

SELECT*
FROM customers
WHERE phone LIKE '%9';