/* Write your T-SQL query statement below */

-- get last 3 tests
-- compare stricty increasing
-- aggregate
WITH last_scores AS (
    SELECT employee_id,rating, rn
    FROM (
        SELECT employee_id, rating, review_date,
               ROW_NUMBER() OVER (PARTITION BY employee_id ORDER BY review_date DESC) AS rn
        FROM performance_reviews
    ) AS SQ
    WHERE rn <= 3
),

pivoted_scores AS(
    SELECT employee_id,
    MAX(CASE WHEN rn = 1 THEN rating END) AS score1,
    MAX(CASE WHEN rn = 2 THEN rating END) AS score2,
    MAX(CASE WHEN rn = 3 THEN rating END) AS score3
    
    FROM last_scores
    GROUP BY employee_id
),

improving_employees AS (
    SELECT employee_id, (score1 - score3) AS improvement_score
    FROM pivoted_scores
    WHERE score1 > score2 AND score2 > score3
)

SELECT improving_employees.employee_id, name, improvement_score
FROM improving_employees
INNER JOIN employees
ON improving_employees.employee_id = employees.employee_id
ORDER BY improvement_score DESC, name ASC