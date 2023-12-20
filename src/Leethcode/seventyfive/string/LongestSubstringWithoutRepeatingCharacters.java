package Leethcode.seventyfive.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
	
		System.out.println(solveIt("pwwkew"));

	}

	private static int solveIt(String s) {
	    int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    
	    return max;
	}
}
