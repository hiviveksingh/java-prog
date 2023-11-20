package Leethcode;

import java.util.List;
import java.util.stream.IntStream;

public class ListArray {

	public static void main(String[] args) {
		ListArray.perform();

	}
 private static void  perform () {
	List<Integer> list = List.of(1, 2, 3, 4, 5);
	
	IntStream.range(1, 4)
	        .forEach(index ->
	                System.out.println(list.get(index) + ":" + index));
	
	System.out.println("Java 8 style ........");
	
	List<Integer> list1 = List.of(1, 2, 3, 4, 5);
	
	list1.forEach(index -> System.out.println(list1.get(index-1) + ":" + index));
 }

 
}