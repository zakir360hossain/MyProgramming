SELECT 
    *
FROM
    order_items oi
        JOIN
    sql_inventory.products AS p ON oi.product_id = p.product_id
