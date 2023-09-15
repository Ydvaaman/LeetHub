# Write your MySQL query statement below
select e.name , eu.unique_id from employees as e left join employeeuni as eu on e.id = eu.id;
