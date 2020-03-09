SELECT 
    *
FROM
    customers
WHERE
    NOT (birth_date > '1990-01-01'
        OR (points > 1000 AND state = 'VA'));

SELECT*
FROM order_items
WHERE order_id = 6 AND unit_price*quantity > 30;