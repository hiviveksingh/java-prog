package Leethcode.seventyfive.string;

//LeetCode Link: https://leetcode.com/problems/longest-repeating-character-replacement/
// Youtube Link: https://youtu.be/FYyWsqFjkZk

class LongestRepeatingCharacterReplacement {
	public static void main(String[] args) {

		System.out.println(  solveIt("", 2) );

	}
	
    public static int solveIt(String s, int k) {
        
        int[] occurance = new int[26];
        int left = 0;
        int ans = 0;
        int maxOccurance = 0;
        
        for(int right = 0; right < s.length(); right++){
            maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right) - 'A']);
            if(right - left + 1 - maxOccurance > k){
                
                occurance[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right-left + 1);
        }
        
        return ans;
        
        
    }
}
