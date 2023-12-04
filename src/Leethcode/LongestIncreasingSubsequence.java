package Leethcode;

import java.util.ArrayList;
import java.util.List;


//Given an integer array nums, return the length of the longest strictly increasing subsequence
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {

		System.out.println(solve(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));

		System.out.println(solve(new int[] { 0, 1, 0, 3, 2, 3 }));

		System.out.println(solve(new int[] { 7, 7, 7, 7, 7, 7 }));

	}

	private static int solve(int[] intArray) {

		return lengthOfLIS(intArray);
	}

	static int lengthOfLIS(int[] intArry) {

		ArrayList<Integer> intList = new ArrayList<>();

		for (int num : intArry) {

			int size = intList.size();

			if (size == 0 || size > 0 && num > intList.get(size - 1)) {
				intList.add(num);
			} else {
				int insertIndex = bs(intList, num);
				intList.set(insertIndex, num);
			}
		}

		return intList.size();
	}

	static int bs(List<Integer> list, int target) {
		int lo = 0;
		int hi = list.size() - 1;

		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (list.get(mid) < target) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		System.out.println(lo +"-bs-"+list);
		return lo;
	}

}
