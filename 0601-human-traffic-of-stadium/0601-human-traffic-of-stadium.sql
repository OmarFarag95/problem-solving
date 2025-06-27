/* Write your T-SQL query statement below */

WITH days_100 AS
(
    SELECT *, id - ROW_NUMBER() OVER(ORDER BY visit_date) AS grp
    FROM Stadium
    WHERE People >=100
),

selected_days AS(
    SELECT grp
    FROM days_100
    GROUP BY grp
    HAVING COUNT(*) >= 3
)

SELECT days_100.id, days_100.visit_date, days_100.people
FROM selected_days
INNER JOIN days_100
ON days_100.grp = selected_days.grp