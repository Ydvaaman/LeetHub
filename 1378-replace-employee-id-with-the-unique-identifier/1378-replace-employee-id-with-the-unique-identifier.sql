# Write your MySQL query statement below
SELECT e.name , eu.unique_id FROM employees AS e LEFT JOIN employeeuni AS eu ON e.id = eu.id;

/* step 1--> I have taken the employees as an left table for the left join
   step 2--> why i have taken the employees as an left table because if we see to the
             output we can see that unique_id have NULL.
*/
