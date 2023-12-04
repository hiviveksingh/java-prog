package Leethcode;

public class BinaryGap {
	public static void main(String[] args) {

		
		System.out.println("Output--"+ BinaryGap.solve(22));		
		
		System.out.println("Output--"+ BinaryGap.solve(8));
		System.out.println("Output--"+ BinaryGap.solve(5));

	}

	private static int solve(int number) {
		
		String binaryReprt = Integer.toBinaryString(number); // O(n) space
		System.out.println(number+ " input binaryRepresentation--"+ binaryReprt);
		int longestDistance = 0;
		int indexOne = binaryReprt.indexOf('1');
		for (int i = 1; i < binaryReprt.length(); i++) { // O(n) time
			if (binaryReprt.charAt(i) == '1') {
				longestDistance = Math.max(longestDistance, i - indexOne); // greedy
				indexOne = i; // update the index of the most recently seen '1'
			}
		}

		return longestDistance;
	}
}
