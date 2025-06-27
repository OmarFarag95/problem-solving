/* Write your T-SQL query statement below */

SELECT id
FROM(
    SELECT id,temperature,recordDate ,
    LAG(temperature, 1) OVER(ORDER by recordDate) AS prevTemp,
    LAG(recordDate, 1) OVER(ORDER by recordDate) AS prevDate
    FROM Weather
) AS SQ
WHERE temperature > prevTemp AND recordDate between prevDate AND DATEADD(day,1, prevDate)