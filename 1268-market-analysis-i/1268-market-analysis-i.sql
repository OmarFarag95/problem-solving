/* Write your T-SQL query statement below */

--get intersection of user_id with buyer_id when order_date = 2019

SELECT 
    Users.user_id AS buyer_id, 
    Users.join_date, 
    COUNT(Orders.order_id) AS orders_in_2019
FROM Users
LEFT JOIN Orders
    ON Users.user_id = Orders.buyer_id
    AND YEAR(Orders.order_date) = 2019
GROUP BY Users.user_id, Users.join_date;

