package Leethcode.seventyfive.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Leetcode Link: https://leetcode.com/problems/group-anagrams/
// Youtube Solution: https://www.youtube.com/watch?v=dEMcIpBOHpg
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
class GroupAnagram {

	public static void main(String[] args) {

		System.out.println(solveIt(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));

	}

	public static Map<String, List<String>> solveIt(String[] strs) {

		Map<String, List<String>> ansMap = new HashMap<>();
		
		int[] count = new int[26];

		for (String str : strs) {
			Arrays.fill(count, 0);
			
			for (char ch : str.toCharArray()) {
				System.out.println("-char-" + (ch));
				System.out.println("--" + (ch - 'a'));
				count[ch - 'a']++;
			}
			
			StringBuilder sb = new StringBuilder("");
			for (int i = 0 ; i < 26 ; i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			String key = sb.toString();
			if (!ansMap.containsKey(key)) {
				ansMap.put(key, new ArrayList<String>());

			}
			ansMap.get(key).add(str);

		}

		return ansMap;

	}
}
