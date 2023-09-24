CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N = N-1;
  RETURN (
      select distinct salary from employee
       order by salary desc
       limit n,1

  );
END