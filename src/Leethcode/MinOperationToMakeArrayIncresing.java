package Leethcode;

public class MinOperationToMakeArrayIncresing {

	public static void main(String[] args) {

		System.out.println("==OPs---" + MinOperationToMakeArrayIncresing.perform(new int[] { 1, 5, 2, 4, 2  }));

	}

	private static int perform(int[] nums) {

		int ops = 0;

		for (int i = 1; i < nums.length; i++) {

			System.out.print("---nums-------- "+nums[i]);
			
			if (nums[i] <= nums[i - 1]) {

				ops += (nums[i - 1] - nums[i]) + 1;
				
				System.out.print("----in if------- "+ops);
				
				nums[i] = nums[i - 1] + 1;

			}
		}

		System.out.println( " ---******--");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println( " ---******--");
		
		return ops;
	}
}