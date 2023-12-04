package Leethcode;

public class SingleNumber {
	/*
	 * 
	 * It's worth noting that this XOR solution is not a generic
	 * "find the non duplicate" function. It works only as long as you know each
	 * other number appears exactly twice (which is indeed what the question states,
	 * so it's totally valid here). But like, if the array was allowed to contain an
	 * arbitrary number of duplicates (ie. the same number appears 3 or 5 times),
	 * then this solution breaks down. This solution works if the duplicates always
	 * appear an even number of times (2x, 4x, 6x, etc.).
	 * And the time complexity is still O(N). Whereas a simple object/count solution
	 * is also O(N), and solves any number of duplicates. The big win with this
	 * solution is memory. You don't need to keep track of anything, which is cool
	 * 
	 */
	public static void main(String[] args) {
		int[] input = { 4, 1, 2, 1, 2 };
		System.out.println("output--" + SingleNumber.solve(input));

	}

	private static int solve(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(result);
			result = result ^ nums[i];
		}
		return result;
	}
}
