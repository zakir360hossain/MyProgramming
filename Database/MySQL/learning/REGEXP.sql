SELECT*
FROM customers
WHERE last_name REGEXP 'field'; 
-- same as 'where last_name LIKE '%field%'

SELECT*
FROM customers
WHERE last_name REGEXP '^field'; 
-- last name begins with 'field'

SELECT*
FROM customers
WHERE last_name REGEXP 'field$'; 
-- last name ends with 'field'

SELECT*
FROM customers
WHERE last_name REGEXP 'field|mac'; 
-- has 'field' or 'mac' in the last name

SELECT*
FROM customers
WHERE last_name REGEXP '^field|mac|rose'; 
-- has 'field' at the beginning of last name, or has 'mac' or 'rose' in the last name

SELECT*
FROM customers
WHERE last_name REGEXP '[gim]e'; 
-- return if last name has these (ge, ie, me)

SELECT 
    *
FROM
    customers
WHERE
    last_name REGEXP '[a-h]e'; 
-- return if last name has these (ae, be, ce..., he)