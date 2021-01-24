-- How to instert, update, and delete data?

-- Inserting single row into a table
INSERT INTO customers
VALUES (DEFAULT, 'John', 'Smith', '1990-01-01', NULL, '317 Shetland Dr', 'Exton', 'PA', 208);


-- Inserting multiple rows into a table
-- For whatever column you want to insert data, put them in the parenthesis, such as 'name' in this case.
insert into shippers (name)
values ('Shippers1'), ('Shippers2'), ('Shippers3');

-- Insert data into multiple tables
insert into orders (customer_id, order_date, status)
values (1, '2019-01-02', 1);

insert into order_items
values 
	(last_insert_id(), 1, 1, 2.95),
    (last_insert_id(), 2, 1, 3.95)


