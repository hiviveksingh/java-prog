package Leethcode.seventyfive.tree;

//LeetCode Link: https://leetcode.com/problems/binary-tree-maximum-path-sum/

//Youtube Link: https://youtu.be/6wv9yMSenvQ

class BinaryTreeMaximumPathSum {

	public static void main(String[] args) {

		TreeNode<Integer> root = new TreeNode<Integer>(-10);
		root.addLeft(9).getParent().addRight(20).addLeft(15).getParent().addRight(17);

		System.out.println("root--" + root);
		//System.out.println("maxGain-->" + maxGain(root));
		System.out.println("\n maxPathSum-->" + maxPathSum(root));
		
		// -10  9 20 15 17

	}

	static int maxSum = Integer.MIN_VALUE; // Max sum in all sum node

	public static int maxGain(TreeNode<Integer> node) {// Max sum in one node (parent + one left or right child

		if (node == null) {
			return 0;
		}
		System.out.println(" --------executing node  ->  "+node.value);


		int leftGain = Math.max(maxGain(node.left), 0);
		int rightGain = Math.max(maxGain(node.right), 0);
		
		System.out.println(node.value +" -node-leftGain->  "+leftGain);
		System.out.println(node.value +" -node --rightGain->  "+rightGain);
		
		int priceNewPath = node.value + leftGain + rightGain;

		maxSum = Math.max(maxSum, priceNewPath);

		int maxgain =  node.value + Math.max(leftGain, rightGain);
		
		System.out.println(node.value +" node maxgain ->  "+maxgain +"  --total "+maxSum);
		
		return maxgain;

	}

	public static int maxPathSum(TreeNode<Integer> root) {

		maxGain(root);
		return maxSum;

	}
}
