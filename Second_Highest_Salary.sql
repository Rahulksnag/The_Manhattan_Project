SELECT (
    SELECT salary
    FROM employee
    ORDER BY salary DESC
    LIMIT 1,1
) AS SecondHighestSalary;

select
    (select salary 
        from (
            select *, dense_rank() over (order by salary desc) as rnk
            from employee) ranking
        where rnk=2
    ) as SecondHighestSalary;
