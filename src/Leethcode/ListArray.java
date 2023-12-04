package Leethcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListArray {

	public static void main(String[] args) {
		loopWithIndex();

	}

	private static void loopWithIndex() {
		
		
		
		System.out.println("Java 8 style ........");
		List<Integer> list = List.of(5, 10, 15, 20, 25);
		
		System.out.print("Just values :  ");
		list.forEach(item -> System.out.print(item +"\n "));
		
		System.out.println("value with idx ");
		
		
		 String[] namesArray   = {"Afrim", "Bashkim", "Besim", "Lulzim", "Durim", "Shpetim"};
		 IntStream.range(0, namesArray.length).forEach(index -> System.out.println(index + "--"+ namesArray[index]));
		 
		 
		 List<String> namesList  = List.of("Afrim", "Bashkim", "Besim", "Lulzim", "Durim", "Shpetim");
		 IntStream.range(0, namesList.size()).forEach( index -> System.out.println(index + "--"+ namesList.get(index)));
		 
		 
		 int[] numArr = new int[] {5, 10, 15, 20, 25};
		 
		 list = IntStream.of(numArr)// Arrays.stream(nums)
											.boxed()
											.collect(Collectors.toCollection(ArrayList::new));

		 list.forEach(s -> System.out.println(s));

		 list = List.of(1,2,3,4);
		 
		 System.out.print("JTest ----:  ");
		 
		 List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
		 for (Integer item : sourceList) {
			 System.out.println("sourceList value  ----:  "+item);	
		}
		  Integer[] targetArray = sourceList.toArray(new Integer[0]);
		  System.out.print("JTest End -lenth---:  "+targetArray.length);
		 

}
	
}