-- Using Microsoft Azure Cloud for querying
-- Using 

-- Creating Table for query practice

-- Employees
CREATE TABLE Employee(eid int, fname varchar(20), lname varchar(20), rank char);

-- Office: name of the office that employees work in along with manager(s) that manage
-- them.
CREATE TABLE Office(eid int, officename varchar(10), manager varchar(20));

-- Manager: manager of offices, they are also employees
CREATE TABLE Manager()
