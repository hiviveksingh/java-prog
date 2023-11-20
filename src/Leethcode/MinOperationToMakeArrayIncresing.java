package Leethcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinOperationToMakeArrayIncresing {

	public static void main(String[] args) {

		System.out.println("OPs---" + MinOperationToMakeArrayIncresing.perform(new int[] { 1, 5, 2, 4, 1 }));

		System.out.println("OPs---" + MinOperationToMakeArrayIncresing.perform(new int[] { 1, 3, 2 }));

		System.out.println("OPs---" + MinOperationToMakeArrayIncresing.perform1(new int[] { 1, 3, 2 }));

	}

	private static int perform(int[] nums) {

		int ops = 0;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] <= nums[i - 1]) {

				ops += (nums[i - 1] - nums[i]) + 1;
				nums[i] = nums[i - 1] + 1;

			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		return ops;
	}

	private static int perform1(int[] nums) {

		List<Integer> list = IntStream.of(nums)// Arrays.stream(nums)
										.boxed()
										.collect(Collectors.toCollection(ArrayList::new));

		list.forEach(s -> System.out.println(s));

		int ops = 0;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] <= nums[i - 1]) {

				ops += (nums[i - 1] - nums[i]) + 1;
				nums[i] = nums[i - 1] + 1;

			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		return ops;
	}
}