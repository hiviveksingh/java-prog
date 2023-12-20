package Leethcode.seventyfive.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println(solveIt("pwwkew"));

	}

	private static Map<Integer,Set<Character>>   solveIt(String s) {
	   
	    Map<Integer,Set<Character>> map = new HashMap<Integer,Set<Character>>();
	    
	    char[] charArray = s.toCharArray();
	   
	    for (int i = 0; i < charArray.length; i++) {
			
			
			Set<Character> set = new LinkedHashSet <>();
			map.put(i, set);
			
			for (int k = i; k < charArray.length; k++) {
				char ch = charArray[k];
				if (!set.contains(ch)) {
					set.add(ch);
				}else {
					break;
				}
			 }
			
		}
	  
	    return map;
	}

	//  leetversion
	public int lengthOfLongestSubstring(String s) {
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
