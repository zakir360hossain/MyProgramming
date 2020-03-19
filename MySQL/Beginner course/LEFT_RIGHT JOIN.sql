-- Outer join (left and right)
SELECT 
    c.customer_id,
    c.first_name,
    o.order_id
FROM
    customers c
        LEFT OUTER JOIN
    orders o ON c.customer_id = o.customer_id
    -- Left will return all orders from customers whether the above condition is true or not
    -- Outer keyword is option for both Left and Right.
ORDER BY c.customer_id;

SELECT 
    c.customer_id,
    c.first_name,
    o.order_id
FROM
    customers c
        RIGHT JOIN
    orders o ON c.customer_id = o.customer_id
    -- Right will return all orders from orders whether the above condition is true or not. To see all the customers, swap the tables.
ORDER BY c.customer_id;

-- Outer Join with multiple tables
SELECT 
    c.customer_id, c.first_name, o.order_id, sh.name
FROM
    customers c
        LEFT JOIN
    orders o ON c.customer_id = o.customer_id
        LEFT JOIN
    shippers sh ON o.shipper_id = sh.shipper_id
ORDER BY c.customer_id