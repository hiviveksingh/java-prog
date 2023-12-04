package Leethcode;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] inputArr = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(OddOccurrencesInArray.getNumberAllPairs(inputArr));
		
		 Map<Integer, Integer> itemCountMap = OddOccurrencesInArray.getNumberAllPairs(inputArr) ; 
		for ( Map.Entry<Integer, Integer> keyValue : itemCountMap.entrySet()) {
			if(keyValue.getValue() % 2 > 0 )
				System.out.println(" Item "+ keyValue.getKey()+ " repeat count "+keyValue.getValue());
		}
	}

	private static Map<Integer, Integer> getNumberAllPairs(int[] intArr) {

		Map<Integer, Integer> output = new HashMap<Integer, Integer>();

		for (int i = 0; i < intArr.length; i++) {
			int key = intArr[i];

			if (output.containsKey(key)) {
				int count = output.get(key) + 1;
				output.put(Integer.valueOf(key), Integer.valueOf(count));
			} else {
				output.put(Integer.valueOf(key), Integer.valueOf(1));

			}
		}

		return output;
	}
}
