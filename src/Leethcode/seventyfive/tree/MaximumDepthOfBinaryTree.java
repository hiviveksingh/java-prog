package Leethcode.seventyfive.tree;

//Leetcode Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
//Youtube Link: https://www.youtube.com/watch?v=IAMk9ZSpvjQ
//**************** Java Solution ***********************

class MaximumDepthOfBinaryTree {
	
	public static void main(String[] args) {

		TreeNode<Integer> root = new TreeNode<Integer>(1);
		System.out.println("root --"+root);
		root.addLeft(2).getParent().addRight(3).addLeft(4).getParent().addRight(5).addRight(6).addLeft(7).addRight(8);
		
		System.out.println("max depth --"+maxDepth(root));
		
		System.out.println("root--"+root);

	}

	public static int maxDepth(TreeNode<Integer> root) {
        
        
        if(root == null){
            return 0;
        }
        else{
            int leftmax= maxDepth(root.left);
            int rightmax = maxDepth(root.right);
            return java.lang.Math.max(leftmax, rightmax) + 1;
        }
        
    }
}
