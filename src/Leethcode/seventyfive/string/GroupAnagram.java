package Leethcode.seventyfive.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Leetcode Link: https://leetcode.com/problems/group-anagrams/
// Youtube Solution: https://www.youtube.com/watch?v=dEMcIpBOHpg




class GroupAnagram {
	
	public static void main(String[] args) {

		System.out.println(  solveIt(new String[]{""}) );

	}
	
    public static List<List<String>> solveIt(String[] strs) {
        
        if(strs.length == 0){
            return new ArrayList();
        }
        
        Map<String, List<String>> ansMap = new HashMap<>();
        
        int[] count = new int[26];
        
        for(String s:strs){
            Arrays.fill(count, 0);
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder("");
            
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!ansMap.containsKey(key)){
                ansMap.put(key,new ArrayList());
                
            }
            ansMap.get(key).add(s);
            
        }
        
        return new ArrayList(ansMap.values());
        
    }
}
