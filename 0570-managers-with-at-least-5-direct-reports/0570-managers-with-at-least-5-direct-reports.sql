# Write your MySQL query statement below
select name from employee where id in
(SELECT managerId FROM employee group by managerid having count(managerid)>=5);