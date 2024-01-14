package Leethcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//Given an integer array nums, return the length of the longest strictly increasing subsequence
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {

	//	System.out.println(solve(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
		
		System.out.println("solved value :: "+solve(new int[] { 10, 9, 3, 5, 2, 7, 101, 18 }));  //-[2, 5, 7, 101]
		System.out.println("solved value :: "+lengthOfLISDP(new int[] { 10, 9, 3, 5, 2, 7, 101, 18 }));  //-[2, 5, 7, 101]//Dynamic programming
 
		//System.out.println(solve(new int[] { 0, 1, 0, 3, 2, 3 }));

		//System.out.println(solve(new int[] { 7, 7, 7, 7, 7, 7 }));

	}
	private static int solve(int[] intArray) {

		return lengthOfLISBest(intArray);
	}

	public static  int  lengthOfLISDP(int[] nums) {
        
        int [] Lis = new int[nums.length];
        Arrays.fill(Lis, 1);
        int max=1;
        
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
            	
                if(nums[i] > nums[j]){
                    Lis[i] = Math.max(Lis[i], 1+Lis[j]);
                    max = Math.max(max, Lis[i]);
                }
                
            }
        }
        
        return max;
        
    }
	static int lengthOfLISBest(int[] intArry) {
		
		Integer[] LHSCountByIndex = new Integer [intArry.length];	
	
		for (int i = 0; i < intArry.length; i++) {
			LHSCountByIndex[i]= 0;
		}

		for (int i = intArry.length - 1; i >= 0; i--) {
			
		//	System.out.println("  For I " + intArry[i]);
		//	System.out.println("  Value of J ");
			
			for (int j = i + 1; j < intArry.length; j++) {
			
			//	System.out.print(" " + intArry[j]);
				
				if(intArry[i] < intArry[j]) {
					
				//	System.out.println( "   "+LHSCountByIndex[i]+" i index value j " + LHSCountByIndex[j]);
					
					LHSCountByIndex[i] =  Math.max( LHSCountByIndex[i], 1 + LHSCountByIndex[i])	;
					
				}
			}
			
		//	System.out.println(LHSCountByIndex);
		}
		
		for (int i = 0; i < LHSCountByIndex.length; i++) {
			System.out.println( " final  " + LHSCountByIndex[i]);
		}

		return  Collections.max(Arrays.asList(LHSCountByIndex));
	}
	
	
	
	
	static int lengthOfLIS(int[] intArry) {

		ArrayList<Integer> intList = new ArrayList<>();

		for (int num : intArry) {

			int size = intList.size();

			if (size == 0 || size > 0 && num > intList.get(size - 1)) {
				intList.add(num);
			} else {
				int insertIndex = bs(intList, num);
				intList.set(insertIndex, num);
			}
		}

		return intList.size();
	}

	static int bs(List<Integer> list, int target) {
		int lo = 0;
		int hi = list.size() - 1;

		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (list.get(mid) < target) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		System.out.println(lo +"-bs-"+list);
		return lo;
	}
	
	


}
