-- William Thing
-- 5/5/2015

-- How to find names and locations of Parks that have 3 or more attractions
-- that require at least age 18 or up.

-- Schema of Tables
-- Park(pid, pname, location)
-- Attraction(aid, aname, rid)
-- Require(rid, height_required, age_limit)
-- Has(aid, pid)

SELECT p.pname AS "Park Name", p.location AS "Park Location"
FROM Park p
WHERE p.id NOT IN 
	(SELECT x.id
	FROM Park x, Attraction a, Require r, Has h
	WHERE a.rid = r.rid AND r.age_limit < 18 AND a.aid = h.aid AND h.pid = x.pid
	GROUP BY x.id)
GROUP BY p.id, p.name, p.location
HAVING COUNT(*) >= 3
