/* Write your T-SQL query statement below */

WITH user_categor_pair AS
(
    SELECT DISTINCT user_id,ProductPurchases.product_id, ProductInfo.category
    FROM ProductPurchases
    INNER JOIN ProductInfo
    ON ProductPurchases.product_id = ProductInfo.product_id
),

Category_pairs AS
(
    SELECT  p1.user_id, p1.product_id AS product1_id , p1.category AS product1_category , p2.product_id AS product2_id , p2.category AS product2_category 
    FROM user_categor_pair p1
    INNER JOIN user_categor_pair p2
    ON p1.user_id = p2.user_id
    WHERE p1.product_id < p2.product_id
),

Qualied_products AS

(
    SELECT product1_id, product2_id, COUNT(*) AS customer_count 
    FROM Category_pairs
    GROUP BY product1_id, product2_id
    HAVING COUNT(*)>=3
)

SELECT DISTINCT Qualied_products.product1_id, Qualied_products.product2_id, Category_pairs.product1_category, Category_pairs.product2_category, customer_count
FROM Qualied_products
INNER JOIN Category_pairs
ON Qualied_products.product1_id = Category_pairs.product1_id AND Qualied_products.product2_id = Category_pairs.product2_id
ORDER BY customer_count DESC, product1_id ASC, product2_id ASC