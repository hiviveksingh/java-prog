package Leethcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Question 17 
public class MaxSumPairWithSameDigitSum {

	public static void main(String args[]) {

		int[] input = { 55, 23, 32, 46, 88 };
		System.out.println(" Max Sum " + MaxSumPairWithSameDigitSum.solve(input));

		int[] input1 = { 18, 19, 23, 15 };
		System.out.println(" Max Sum " + MaxSumPairWithSameDigitSum.solve(input1));
	}

	private static int solve(int arr[]) {

		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			int key = getDigitSum(arr[i]);
			if (map.containsKey(key)) {
				map.get(key).add(arr[i]);
			} else {
				List<Integer> value = new ArrayList<Integer>();
				value.add(arr[i]);
				map.put(key, value);
			}
		}
		System.out.print(" map==" + map);

		int max = 0;
		for (Integer key : map.keySet()) {
			int tempMax = 0;
			List<Integer> valueList = map.get(key);
			if (valueList.size() > 1) {
				for (Integer item : valueList) {
					tempMax += item;
				}
				if (max < tempMax) {
					max = tempMax;
				}
			}

		}
		
		return max;
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
