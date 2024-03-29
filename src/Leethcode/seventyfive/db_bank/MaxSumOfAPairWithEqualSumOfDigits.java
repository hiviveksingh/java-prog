package Leethcode.seventyfive.db_bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// question 18
public class MaxSumOfAPairWithEqualSumOfDigits {

	public static void main(String[] args) {

	int val  = 	MaxSumOfAPairWithEqualSumOfDigits.solve(new int[] { 18, 43, 36, 13, 7 });	
	System.out.println(val);
	
	val  = 	MaxSumOfAPairWithEqualSumOfDigits.solve(new int[] { 10,12,19,14 });	
	System.out.println(val);
	
	}

	private static int solve(int[] intArr) {
		Map<Integer, List<Integer>> output  = getEqualSumNUmbers(intArr);
		int maxSum = 0;
		for (Integer key : output.keySet()) {
			System.out.println("Key ::"+ key +"--value --"+output.get(key).size());
			List<Integer> valueList = output.get(key);
			
			if(valueList.size() >1 ) {
				int machedSum = 0;
				for (Integer item : valueList) {
					machedSum += item;
				}
				if(maxSum < machedSum)
					maxSum = machedSum ;
			
			}
		}
		return maxSum;
	}

	private static Map<Integer, List<Integer>> getEqualSumNUmbers(int[] intArr) {

		Map<Integer, List<Integer>> output = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < intArr.length; i++) {
			int key = Integer.valueOf(getDigitSum(intArr[i]));

			if (output.containsKey(key)) {
				output.get(key).add(intArr[i]);

			} else {
				List<Integer> value = new ArrayList<Integer>();
				value.add(intArr[i]);
				output.put(key, value);

			}
		}
		
		return output;
	}

	private static int getDigitSum(int number) {

		int sum = -1;

		for (sum = 0; number != 0; number = number / 10) {
			// finds the last digit and add it to the variable sum
			sum = sum + number % 10;
		}

		return sum;

	}
}