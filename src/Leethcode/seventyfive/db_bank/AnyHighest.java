package Leethcode.seventyfive.db_bank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnyHighest {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>( List.of(2,5,3,9,6));
		geHighest(list , 2);

	}

	private static void geHighest(List<Integer> unsorted, int i) {
		// Collections.sort(list);
		 
		 List<Integer> sorted = unsorted.stream()
                //.sorted()
				 .sorted(Comparator.reverseOrder())
                 .collect(Collectors.toList());
		 
		System.out.println("stream sort--"+sorted.get(i-1));
		
		unsorted.sort(null);
		
		System.out.println("simple sort--"+unsorted.get(i-1));
		
		//.sorted(Comparator.reverseOrder())
		unsorted.sort(Comparator.reverseOrder() );//Comparator reverseOrder
	
		System.out.println("reverse sort--"+unsorted.get(i-1));
		
		unsorted.sort(Comparator.naturalOrder()); ////Comparator naturalOrder
		
		System.out.println("naturalOrder sort--"+unsorted.get(i-1));
		
		
		unsorted.sort( (Integer t1, Integer t2) -> t2.compareTo(t1) );// lambda Comparator 
		
		System.out.println("lambda sort--"+unsorted.get(i-1));
		
		unsorted.sort( Comparator.comparing(new Integer(1) ::equals));// lambda Comparator 
		
	}

	/*
	 
	 
	 SELECT temp.salary  as "SecondHighestSalary"  FROM (
          SELECT  e.salary ,   rownum rn from Employee e  order by e.salary desc
    ) temp where temp.rn = 2
    
    
    
	 
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
