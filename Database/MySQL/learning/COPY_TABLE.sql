use nba;
CREATE TABLE IF NOT EXISTS orders_archived AS
SELECT * FROM orders;
-- This is the subquery


-- A subquery example for inserting. Inserting the selected rows with given row condition into orders_archived
INSERT INTO orders_archived
SELECT*
FROM orders
WHERE order_date < '2019-01-01'