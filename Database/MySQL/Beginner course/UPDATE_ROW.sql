UPDATE customers 
SET 
    first_name = 'Zakir',
    last_name = 'Mendel'
WHERE
    customer_id = 2;
    -- Use IN (customer_id IN (1, 2, 3...)) to update multiple rows). Don't need where when updating all rows.

