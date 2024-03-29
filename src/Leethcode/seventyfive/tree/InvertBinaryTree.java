package Leethcode.seventyfive.tree;

//Leetcode Link: https://leetcode.com/problems/invert-binary-tree/
//Youtube Solution : https://youtu.be/yb2Y9h2YWio

//**************** Java Solution ***********************

class InvertBinaryTree {

	public static void main(String[] args) {

		TreeNode<Integer> root = new TreeNode<Integer>(1);
	
		root.addLeft(2).getParent().addRight(3).addLeft(4).getParent().addRight(5).addRight(6).addLeft(7);
		System.out.println("before Reverse --"+root +"\n");
		
		
		System.out.println("after Reverse --"+invertTree(root));

	}

	public static TreeNode<Integer> invertTree(TreeNode<Integer> root) {
        
        if (root == null || root.value == null){
            return null;
        }
       
        TreeNode<Integer> right = invertTree(root.getRight());
        TreeNode<Integer> left = invertTree(root.getLeft());
        
        root.left = right;
        root.right = left;
        
        return root;
        
    }
}
