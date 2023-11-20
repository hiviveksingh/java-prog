package Leethcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSol {

	public static void main(String[] args) {

		TwoSumSol twoSumSolu = new TwoSumSol();
		int[] output = twoSumSolu.twoSum2(new int[] { 1, 2, 3 }, 3);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		int n = nums.length;

		// Build the hash table
		for (int i = 0; i < n; i++) {
			numMap.put(nums[i], i);
		}

		// Find the complement
		for (int i = 0; i < n; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement) //&& numMap.get(complement) != i
					) {
				return new int[] { i, numMap.get(complement) };
			}
		}

		return new int[] {}; // No solution found
	}
	
	public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
