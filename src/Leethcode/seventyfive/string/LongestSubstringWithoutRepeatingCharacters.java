package Leethcode.seventyfive.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

//LeetCode Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Youtube Explaination: https://youtu.be/RMQ-gRQAY0o

class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println(solveIt("pwwkew"));

	}

	private static Map<Integer, Set<Character>> solveIt2(String s) {

		Map<Integer, Set<Character>> map = new HashMap<Integer, Set<Character>>();

		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			Set<Character> set = new LinkedHashSet<>();
			map.put(i, set);

			for (int k = i; k < charArray.length; k++) {
				char ch = charArray[k];
				if (!set.contains(ch)) {
					set.add(ch);
				} else {
					break;// repition so break the loop
				}
			}

		}

		return map;
	}

	// leetversion

	public static int solveIt(String str) {

		if (str == null || str.length() == 0) {
			return 0;
		}

		if (str.length() == 1) {
			return 1;
		}

		int left = 0;
		int ans = 0;

		HashSet<Character> set = new HashSet<>();

		for (int right = 0; right < str.length(); right++) {

			char c = str.charAt(right);
			System.out.println(" char .." + c);
			while (set.contains(c)) {
				System.out.println(" remove .." + str.charAt(left));
				set.remove(str.charAt(left));
				left++;
			}
			set.add(c);
			ans = Math.max(ans, right - left + 1);

		}

		return ans;
	}
}

// test