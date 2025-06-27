/* Write your T-SQL query statement below */

-- get user, category pairs
-- for each user, get pairs where cat1<cat2
-- filter by unique counts

WITH user_vs_category AS(
    SELECT user_id, category
    FROM ProductPurchases
    INNER JOIN ProductInfo
    ON ProductPurchases.product_id = ProductInfo.product_id
),

user_category_pairs AS(
    SELECT u1.user_id, u1.category AS category1, u2.category AS category2
    FROM user_vs_category u1
    INNER JOIN user_vs_category u2
    ON u1.user_id = u2.user_id
    WHERE u1.category < u2.category
)

SELECT category1, category2, COUNT(DISTINCT user_id) AS customer_count
FROM user_category_pairs
GROUP BY category1, category2
HAVING COUNT(DISTINCT user_id) >=3
ORDER BY customer_count DESC, category1 ASC, category2 ASC
