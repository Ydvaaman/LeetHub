select sell_date, count(distinct product) as num_sold,
GROUP_CONCAT(DISTINCT product) products
FROM activities
GROUP BY sell_date
ORDER BY sell_date;