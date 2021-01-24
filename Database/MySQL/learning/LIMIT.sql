-- LIMIT clause should always come at the end
SELECT*
FROM customers
LIMIT 3;
 -- if the number is greater than rows available, it will still return how many ever rows there are

-- Skip record
SELECT 
    *
FROM
    customers
LIMIT 6 , 3; 
-- Skip the first 6 and then pick 3 rows (6 is excluded)

-- select the 3 employees with the most points
SELECT*
FROM customers
ORDER BY points DESC
LIMIT 3