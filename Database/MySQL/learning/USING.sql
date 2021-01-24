use sql_store;
SELECT
    o.order_id, c.first_name, sh.name
FROM
    orders o
        JOIN
    customers c USING (customer_id)
     -- This is same as 'ON o.customer_id = c.customer_id
        LEFT JOIN
    shippers sh USING (shipper_id)
    
