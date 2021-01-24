SELECT 
    c.first_name, p.name
FROM
    customers c
        CROSS JOIN
    products p
ORDER BY c.first_name;




select
sh.name, p.name
from shippers sh
cross join products p
order by sh.name;

-- Using implicit syntax
select
sh.name, p.name
from shippers sh, products p
order by sh.name;