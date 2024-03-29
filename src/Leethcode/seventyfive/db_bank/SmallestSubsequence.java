package Leethcode.seventyfive.db_bank;

import java.util.Stack;

public class SmallestSubsequence {

	public static void main(String[] args) {
		// Input: s = "leet", k = 3, searchChar = "e", repetition = 1 Output: "eet"
		// Input: s = "bb", k = 2, searchChar = "b", repetition = 2 Output: "bb"
		// System.out.println(" Output...." +
		// SmallestSubsequence.getSmallestSubsequence("leet", 3, 'e', 1));
		//Input: s = "leetcode", k = 4, letter = "e", repetition = 2 		Output: "ecde"
		System.out.println(" Output...." + SmallestSubsequence.getSmallestSubsequence("leetcode", 4, 'e', 2));

	}

	public static String getSmallestSubsequence(String str, int lengthOutput, char searchChar, int repition) {
		
		int n_searchChars = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == searchChar)
				n_searchChars++;
		if (n_searchChars < repition) {
			System.out.println("Bad input: char not found for repition  "); System.exit(0);;
		}

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			
			while (!stack.isEmpty() && stack.peek() > currentChar 
					&& (str.length() - i + stack.size() > lengthOutput)// enough char left to make output length
					&& (stack.peek() != searchChar || n_searchChars > repition)) {
				
				char poppedChar = stack.pop() ;
				if (poppedChar == searchChar)
					repition++;
			}

			if (stack.size() < lengthOutput) { //stack size is less than 
				if (currentChar == searchChar) {
					stack.push(currentChar);
					repition--;
				} else if (lengthOutput - stack.size() > repition) {//open space for other char in stack
					stack.push(currentChar);
				}
			}

			if (currentChar == searchChar)
				n_searchChars--;
		}

		StringBuilder sb = new StringBuilder(stack.size());
		for (Character c : stack)
			sb.append(c);
		return sb.toString();
	}

	
}