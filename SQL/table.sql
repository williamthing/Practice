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

-- NEW TABLE
	 CREATE	TABLE	Class	(	
	 	 			dept	VARCHAR(6),	
	 	 			number	INTEGER,	
	 	 			title	VARCHAR(75),	
	 	 			PRIMARY	KEY	(dept,	number)	
);
	 CREATE	TABLE	Instructor	(	
	 	 			username	VARCHAR(8),	
	 	 			fname	VARCHAR(50),	
	 	 			lname	VARCHAR(50),	
	 	 			started_on	CHAR(10),	
	 	 			PRIMARY	KEY	(username)	
);
	 CREATE	TABLE	Teaches	(	
	 	 			username	VARCHAR(8),	
	 	 			dept	VARCHAR(6),	
	 	 			number	INTEGER,	
	 	 			PRIMARY	KEY	(username,	dept,	number),	
	 	 			FOREIGN	KEY	(username)	REFERENCES	Instructor(username),	
	 	 			FOREIGN	KEY	(dept,	number)	REFERENCES	Class(dept,	number)	
);

INSERT INTO Class VALUES ('ENG', 101, 'Into to English');
INSERT INTO Class VALUES ('MATH', 300, 'Into to Math');
INSERT INTO Class VALUES ('ECON', 200, 'Into to MC');
INSERT INTO Class VALUES ('MENG', 100, 'M & E');

INSERT INTO Instructor VALUES ('zahorjan', 'M', 'Zahorjan', '03/04/2010');
INSERT INTO Instructor VALUES ('levy', 'F', 'Levy', '02/04/2010');
INSERT INTO Instructor VALUES ('Jane', 'Jane', 'Lee', '01/04/2010');

INSERT INTO Teaches VALUES ('Jane', 'ECON', 200);
INSERT INTO Teaches VALUES ('zahorjan', 'MATH', 300);
INSERT INTO Teaches VALUES ('zahorjan', 'MENG', 100);
INSERT INTO Teaches VALUES ('levy', 'ENG', 101);
INSERT INTO Teaches VALUES ('levy', 'MENG', 100);



SELECT t1.dept, t1.number
FROM Teaches t1, Teaches t2, Instructor i1, Instructor i2
WHERE t1.username=i1.username 
AND t2.username=i2.username
AND i1.username='zahorjan' 
AND i2.username='levy' 
AND t1.dept=t2.dept 
AND t1.number=t2.number;

SELECT t.dept, t.number
FROM Teaches t
WHERE t.username NOT IN ('zahorjan', 'levy');



