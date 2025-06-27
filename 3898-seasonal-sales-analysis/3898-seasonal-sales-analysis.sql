/* Write your T-SQL query statement below */
WITH seasons AS(
    SELECT *, 
    CASE
        WHEN Month(sale_date) IN (12, 1, 2) THEN 'Winter'
        WHEN Month(sale_date) IN (3, 4, 5) THEN 'Spring'
        WHEN Month(sale_date) IN (6, 7, 8) THEN 'Summer'
        WHEN Month(sale_date) IN (9, 10, 11) THEN 'Fall'
    END AS season
    FROM sales
),

aggregated_values AS(
    SELECT season, category, SUM(quantity) AS total_quantity, SUM(quantity * price * 1.0) AS total_revenue
    FROM seasons
    INNER JOIN products
    ON seasons.product_id = products.product_id
    GROUP BY Category, Season
)

SELECT season, category, total_quantity, total_revenue
FROM
(
    SELECT *, RANK() OVER(PARTITION BY Season ORDER BY total_quantity DESC, total_revenue DESC) AS rnk
    FROM aggregated_values
) AS SQ
WHERE rnk =1 
