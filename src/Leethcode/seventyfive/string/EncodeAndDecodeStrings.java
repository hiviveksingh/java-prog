package Leethcode.seventyfive.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Leetcode Link: https://leetcode.com/problems/encode-and-decode-strings/
//Youtube Link: 

public class EncodeAndDecodeStrings {
	
	public static void main(String[] args) {

		List<String> list  = List.of("abc" , "dce");
		
		System.out.println("Encoded===" + encode(list) );
		System.out.println("Decoded==="+ decode(encode(list) ));

	}
	 

    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        
        if(strs.size()==0 ){
            return Character.toString((char)258);
        }
        String separate = Character.toString((char)257);
        
        System.out.println("separate===" + separate);
        
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s);
            sb.append(separate);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
        
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        
        if(s.equals(Character.toString((char)258))){
            return new ArrayList<String>();
        }
        
       String separate = Character.toString((char)257);
        
         return Arrays.asList(s.split(separate, -1));
    }
}


