package Leethcode.seventyfive.tree;

public class TreeNode<T> {

	T value;
	TreeNode<T> parent;
	TreeNode<T> left;

	TreeNode<T> right;

	public TreeNode() {
		this.value = null;
		this.left = null;
		this.parent = null;
	}

	public TreeNode(T data) {
		this.value = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}

	public TreeNode(T data, TreeNode<T> parent) {
		this.value = data;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}

	public TreeNode(T data, TreeNode<T> parent, TreeNode<T> left, TreeNode<T> right) {
		this.value = data;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

	public TreeNode<T> addLeft(T leftValue) {
		TreeNode<T> newNode = new TreeNode<T>(leftValue);
		newNode.parent = this;
		this.left = newNode;
		return newNode;
	}

	public TreeNode<T> addRight(T rightValue) {

		TreeNode<T> newNode = new TreeNode<T>(rightValue);
		newNode.parent = this;
		this.right = newNode;
		return newNode;

	}

	public TreeNode<T> getParent() {
		return parent;
	}

	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		@SuppressWarnings("rawtypes")
		TreeNode other = (TreeNode) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;

	}

	private String indentedString(TreeNode<T> tree, String indent) {
		if (tree == null) {
			return "";
		}
		return indentedString(tree.right, indent + "  ") + indent + tree.value + "\n"
				+ indentedString(tree.left, indent + "  ");
	}

	@Override
	public String toString() {
		return "\n "+indentedString(this, "");
	}

	public String toString1() {

		StringBuilder sb = new StringBuilder("TreeNode [value=" + value + ", parent=");
		if (parent == null) {
			sb.append("null");
		} else {
			sb.append(parent.getValue());
		}
		sb.append(", left=");
		if (left == null) {
			sb.append("null");
		} else {
			sb.append(left.getValue());
		}

		sb.append(", right=");

		if (right == null) {
			sb.append("null");
		} else {
			sb.append(right.getValue());
		}

		sb.append("]");

		return sb.toString();
	}

}