package Leethcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// question 19
public class MaxSumOfAPairsWithSameStartEndNumber {

	public static void main(String[] args) {

	int val  = 	MaxSumOfAPairsWithSameStartEndNumber.solve(new int[] { 10 , 10 , 123 , 15333 });	
	System.out.println(val);
	
	
	}

	private static int solve(int[] intArr) {
		Map<String, List<Integer>> output  = getMatchingStartEndNumbers(intArr);
		int maxSum = 0;
		for (String key : output.keySet()) {
			System.out.println("Key ::"+ key +"--value --"+output.get(key).size());
			List<Integer> valueList = output.get(key);
			
			if(valueList.size() > 1 ) {
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

	private static Map<String, List<Integer>> getMatchingStartEndNumbers(int[] intArr) {

		Map<String, List<Integer>> output = new HashMap<String, List<Integer>>();

		for (int i = 0; i < intArr.length; i++) {
			String numString = String.valueOf(intArr[i]);			
			String key = "" ;
			if(numString != null & numString.length() >= 2) {
				key = numString.charAt(0)+"-"  +numString.charAt(numString.length()-1);				
			}
			
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

	
}