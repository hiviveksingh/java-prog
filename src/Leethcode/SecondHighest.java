package Leethcode;

public class SecondHighest {

	/*
	 
	 
	 
	 
	 SELECT 
*
FROM
 (
    SELECT 
      SecondHighestSalary as "SecondHighestSalary"
      FROM (  SELECT  Row_number() over (order by salary desc) as rn, e.SALARY as SecondHighestSalary  from Employee e )
    where rn =2 ;
) 
/*
//SELECT Row_number() over (order by salary desc) as rn, e.*  from Employee;

//SELECt * from  from (SELECT roww_num() over (order by salary desc) as rn, e.*  from Employee);
//SELECT *, Rank() over (ORDER BY Name ASC) AS rank_example FROM Z2;
//SELECT *, Dense_rank() over (ORDER BY Name ASC) AS dense_rank_example FROM Z2;
 * 
 * 
	 *
	 */
}
