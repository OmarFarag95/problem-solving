/* Write your T-SQL query statement below */

--number of cancelled requests FROM Trips table joined with Users to get banned status
-- divide by total count
--filter by request_at

/* Write your T-SQL query statement below */

-- total requests for unbanned users (inner join between Trips and Users) with filtering
-- number of cancelled trips within range, need join for unbanned users

WITH total_requests_unbanned AS(
    SELECT request_at, COUNT(Distinct id) AS TotalReq FROM Trips
    INNER JOIN Users AS clients
    ON Trips.client_id = clients.users_id
    INNER JOIN Users AS Drivers
    ON Trips.driver_id = Drivers.users_id
    WHERE clients.banned = 'No'
    AND drivers.banned = 'No'
    GROUP BY request_at  
),

Canceled_requests_unbanned AS(
    SELECT request_at, COUNT(Distinct id) AS CancelledReq FROM Trips
    INNER JOIN Users AS Clients
    ON Trips.client_id = Clients.users_id 
    INNER JOIN Users AS Drivers
    ON Trips.driver_id = Drivers.users_id
    WHERE clients.banned = 'No'
    AND drivers.banned = 'No'
    AND (Trips.status = 'cancelled_by_driver' OR Trips.status = 'cancelled_by_client')
    GROUP BY request_at  
)

SELECT t.request_at AS Day, ROUND(
    ISNULL(c.CancelledReq,0) * 1.0/t.TotalReq, 2) AS 'Cancellation Rate'
    FROM total_requests_unbanned t
    LEFT OUTER JOIN
    Canceled_requests_unbanned c
    ON t.request_at = c.request_at
    WHERE CAST(t.request_at AS Date) BETWEEN '2013-10-01' AND '2013-10-03'