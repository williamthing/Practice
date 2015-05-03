-- Using Microsoft Azure Cloud for querying
-- Using 

-- Creating Table for query practice

-- Employees
CREATE TABLE Employee(eid int, fname varchar(20), lname varchar(20), rank char);

-- Office: name of the office that employees work in along with manager(s) that manage
-- them.
CREATE TABLE Office(eid int, officename varchar(10), manager varchar(20));

-- Manager: manager of offices, they are also employees
CREATE TABLE Manager();

-- Tables
CREATE	TABLE	Population	(	
		rank	INTEGER,	
		country	VARCHAR(30)	PRIMARY	KEY,	
		population	INTEGER,
		percentage	FLOAT	 	
);
	 CREATE	TABLE	GDP	(	
		rank	INTEGER,	
		country	VARCHAR(30)	PRIMARY	KEY,	
		gdp	INTEGER	 	
);
	 CREATE	TABLE	Airport	(	
		code	VARCHAR(30)	PRIMARY	KEY,	
		name	VARCHAR(30),	
		country	VARCHAR(30)	
);

INSERT INTO Population VALUES (1, 'Taiwan', 2000, 10);
INSERT INTO Population VALUES (2, 'Brazil', 1000, 5);
INSERT INTO Population VALUES (3, 'Korea', 3000, 30);
INSERT INTO Population VALUES(4, 'India', 5000, 5);
INSERT INTO Population VALUES(5, 'USA', 5000, 5);
INSERT INTO Population VALUES(6, 'Japan', 5000, 5);
INSERT INTO Population VALUES(7, 'Mexico', 5000, 5);
INSERT INTO Population VALUES(8, 'Chile', 5000, 1);
INSERT INTO Population VALUES(9, 'England', 5000, 5);
INSERT INTO Population VALUES(10, 'Italy', 5000, 5);
INSERT INTO Population VALUES(11, 'China', 5000, 5);

INSERT INTO Airport VALUES('SEA', 'a1', 'China');
INSERT INTO Airport VALUES('AIR', 'a2', 'USA');
INSERT INTO Airport VALUES('HELLO', 'a3', 'Taiwan');

INSERT INTO GDP VALUES(1, 'Taiwan', 10000);
INSERT INTO GDP VALUES(1, 'Chile', 10000);
INSERT INTO GDP VALUES(1, 'William', 10000);
INSERT INTO GDP VALUES(1, 'Jane', 10000);
INSERT INTO GDP VALUES(1, 'USA', 10000);
INSERT INTO GDP VALUES(1, 'Brazil', 10000);
INSERT INTO GDP VALUES(1, 'China', 10000);
INSERT INTO GDP VALUES(1, 'Korea', 10000);
INSERT INTO GDP VALUES(1, 'India', 10000);


-- Select total population
SELECT SUM(population) AS 'TOTAL Population'
from Population

-- Count
SELECT country, COUNT(*)
FROM Airport
GROUP BY country
ORDER BY COUNT(*) DESC
LIMIT 10;

-- Cool
SELECT p.country, g.gdp/p.population as 'GDP Per Capita'
FROM Population p, GDP g
WHERE p.country=g.country
ORDER BY g.gdp/p.population DESC
LIMIT 10;


