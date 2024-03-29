package Leethcode.seventyfive.db_bank;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		TwoSum twoSumSolu = new TwoSum();
		int[] output = twoSumSolu.solve1(new int[] { 1, 2, 3 }, 4);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	public int[] solve(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		int n = nums.length;

		// Build the hash table with map key as array item value and map value as array
		// index
		for (int i = 0; i < n; i++) {
			numMap.put(nums[i], i);
		}

		// Find the complement
		for (int i = 0; i < n; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement) && numMap.get(complement) != i) {
				return new int[] { i, numMap.get(complement) };
			}
		}

		return new int[] {}; // No solution found
	}

	public int[] solve1(int[] nums, int target) {

		// Find the complement
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
				for (int j = 0; j < nums.length; j++) {
					if(complement == nums[j])
						return new int[] { i, j };

			}

		}
		
//		IntStream.range(0, nums.length).forEach({ i ->
//				int complement = target - nums[i];
//				for (int j = 0; j < nums.length; j++) {
//					if(complement == nums[j]) {
//						Collectors.toCollection(collectionFactory)
//					}
//						
//
//			}
//					
//		});
		
		
		return new int[] {}; // No solution found
	}
}
