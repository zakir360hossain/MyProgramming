use sampledb;
CREATE TABLE if not exists employee (
first_name VARCHAR(100),
last_name VARCHAR(100),
company_name VARCHAR(300),
address VARCHAR(300),
city VARCHAR(100),
state VARCHAR(30),
phone Varchar(20),
email varchar(100)
);

/*
 This was needed for loading files:
    1. SET GLOBAL local_infile=1;
    2. mysql> quit
    3. mysql --local-infile=1 -u root -p

And then this query was ran through the command line to load the data:
    LOAD DATA LOCAL INFILE '/Users/Zakir/Downloads/employee.csv' INTO TABLE sampledb.employee
    FIELDS TERMINATED BY ','
    LINES TERMINATED BY '\n'
    IGNORE 1 LINES
    (first_name, last_name, company_name, address, city, state, phone, email)
 */

select *
from employee;