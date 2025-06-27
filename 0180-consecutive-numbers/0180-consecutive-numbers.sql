/* Write your T-SQL query statement below */

--find previous/next elements and compare

--SELECT DISTINCT num AS ConsecutiveNums
--FROM(
--    SELECT *,
--        LAG(id,1) OVER(PARTITION BY num ORDER BY id) AS prev1,
--        LAG(id,2) OVER(PARTITION BY num ORDER BY id) AS prev2
--        FROM Logs
--) AS SQ
--WHERE id=prev1+1 AND prev1=prev2+1


WITH GROUPED AS
(
    SELECT num, COUNT(*) AS grp
    FROM
    (
        SELECT id,num, id - ROW_NUMBER() OVER(PARTITION BY num ORDER BY id) AS grp
        FROM Logs
    ) AS SQ
    GROUP BY num,grp
    HAVING COUNT(*) >=3
)

SELECT DISTINCT num AS ConsecutiveNums FROM GROUPED