
-- In default, join is inner join
SELECT 
    order_id, o.customer_id, first_name, last_name
FROM
    orders o
        INNER JOIN
    customers c ON o.customer_id = c.customer_id;
    -- can put alias, by convention, abbreviation is good. AND NEED to use the alias througout
    

SELECT 
    *
FROM
    order_items oi
        JOIN
    products p ON oi.product_id = p.product_id;
    
-- Self Join - Join tables from the same database
SELECT 
    *
FROM
    customers c
        JOIN
    order_statuses os;

-- Join multiple tables
SELECT 
    o.order_id,
    o.order_date,
    c.first_name,
    c.last_name,
    os.name
FROM
    orders o
        JOIN
    customers c ON o.customer_id = c.customer_id
        JOIN
    order_statuses os ON o.status = os.order_status_id;


-- Compound join conditions
SELECT 
    *
FROM
    order_items oi
        JOIN
    order_item_notes oin ON oi.order_id = oin.order_Id
        AND oi.product_id = oin.product_id;


-- Implicit Join Syntax (not recommended because this may lead to cross joint)
SELECT 
    *
FROM
    orders o,
    customers c
WHERE
    o.customer_id = c.customer_id;


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






