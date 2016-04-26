package BinaryTreePackage;

public class Node {

	public Node left, right;
	public int data;

	public Node(int _data) {
		left = right = null;
		data = _data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	
}
