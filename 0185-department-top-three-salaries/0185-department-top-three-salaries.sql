/* Write your T-SQL query statement below */
-- group by departmentId and rank saray -> get top 3 ids, then join
WITH top_salaries AS(
    SELECT name, departmentId, salary
    FROM
    (
        SELECT name, departmentId, salary, DENSE_RANK() OVER(PARTITION BY departmentID ORDER BY salary DESC) AS rnk
        FROM Employee
    ) AS SQ
    WHERE rnk <=3
)

SELECT Department.name AS Department, top_salaries.name AS Employee, top_salaries.Salary AS Salary
FROM top_salaries 
INNER JOIN Department
ON top_salaries.departmentId = Department.id


