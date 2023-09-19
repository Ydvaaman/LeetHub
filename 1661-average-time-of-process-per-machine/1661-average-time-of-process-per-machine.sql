# Write your MySQL query statement below
SELECT a1.machine_id,ROUND(AVG(a2.timestamp-a1.timestamp),3) AS processing_time
FROM activity AS a1 JOIN activity AS a2 ON 
a1.machine_id = a2.machine_id AND a1.process_id = a2.process_id
WHERE a1.activity_type = 'start' AND a2.activity_type = 'end'
GROUP BY a1.machine_id;