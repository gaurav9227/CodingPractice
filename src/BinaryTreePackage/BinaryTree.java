package BinaryTreePackage;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public Node root;
	public BinaryTree() {
		root = null;
	}
	
	public Node lookup(Node root,int data) {
		if(root == null)
			return null;
		if(root.getData() == data) 
			return root;
		
		if(data <= root.getData())
			return lookup(root.getLeft(),data);
		
		else
			return lookup(root.getRight(),data);
			
	}
	
	public Node insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		if(data <= root.data)
			root.left = insert(root.getLeft(),data);
		
		else
			root.right = insert(root.getRight(),data);
		
		return root;
	}
	
	public void print(Node root1) {
		if(root1 == null)
		return;
		
		print(root1.left);
		System.out.println(root1.data);
		print(root1.right);
		
	}
	
	public int size(Node root1) {
		if(root1==null)
			return 0;
		else
			return 1+size(root1.left)+size(root1.right);
		
	}
	
	public int maxDepth(Node root1) {
		if(root1 == null)
			return 0;
		
		else
			return 1 + Integer.max(maxDepth(root1.left),maxDepth(root1.right));
	}
	
	public int minDepth(Node root1) {
		if(root1 == null)
			return 0;
		if(root1.left == null && root1.right == null)
			return 1;
		
		if(root1.left != null && root1.right != null)
			return 1 + Integer.min(minDepth(root1.left),minDepth(root1.right));
		else
			return 1 + Integer.max(minDepth(root1.left), minDepth(root1.right));
	}
	
	public int minValue(Node root1) {
		if(root1.left == null)
			return root1.data;
		else
			return minValue(root1.left);
	}
	
	public boolean hasPathSum(int sum) { 
		 return( hasPathSum(root, sum) ); 
		}

		boolean hasPathSum(Node node, int sum) { 
		  // return true if we run out of tree and sum==0 
			if(node==null)
				return false;
		  sum = sum - node.data;
		  
		  if (node.left == null && node.right == null) { 
			  
		    return(sum == 0); 
		  } 

		    
		    return(hasPathSum(node.left, sum) || hasPathSum(node.right, sum)); 
		   
		} 
		
	public  boolean pathSum(int data,Node root1) {
		if(root1.left==null && root1.right==null) {
			return data==0;
		}
		
		else if(root1.left == null)
			return pathSum(data-root1.data,root1.right);
		else if(root1.right == null)
			return pathSum(data-root1.data,root1.left);
		return (pathSum(data-root1.data,root1.left) || pathSum(data-root1.data,root1.right));
	}
	
	public void printPaths(Node root1,int[] path, int len) {
		if(root1 == null)
			return;
		
		if(root1.left == null && root1.right == null){
			path[len] = root1.data;
			len++;
			printArray(path,len);
		}
		else {
			path[len] = root1.data;
			len++;
			printPaths(root1.left, path, len);
			printPaths(root1.right, path, len);
		}
	}
	public void printArray(int[] path, int len) {
		for(int i=0;i<len;i++)
			System.out.print(path[i]+"--->");
		System.out.println();
		
	}
	
	public void dupleft(Node root1) {
		if(root1==null) return;
		
		if(root1.left == null)
			root1.left = new Node(root1.data);
		else {
			dupleft(root1.left);
			dupleft(root1.right);
		}
			
	}
	public boolean checkStructure(Node r1,Node r2) {
		if(r1 == null && r2 == null)
			return true;
		
		else if(r1 != null && r2 != null)
		return checkStructure(r1.left,r2.left) && checkStructure(r1.right,r2.right);
		else
			return false;
		
	}
	
	public boolean isSibling(int n1, int n2 , Node root1) {
		if(root1==null||root.left==null||root.right==null)
			return false;
		if((root1.left.data==n1 && root1.right.data==n2)
				||(root1.left.data==n2 && root1.right.data==n1))
			return true;
		else {
			return isSibling(n1, n2, root1.left) || isSibling(n1, n2, root1.right);
		}
	}
	
	public int levelCounter(Node root1, int val, int counter) {
		if(root1 == null)
			return 0;
		
		counter++;
		
		if(val==root1.data)
			return counter;
		else
			return Integer.max(levelCounter(root1.left, val, counter)
					,levelCounter(root1.right, val, counter));
	}
	
	public void levelOrederPrint(Node root1) {
	ArrayDeque<Node> q = new ArrayDeque<Node>();
	
	if(root1 == null)
		return;

	q.addLast(root1);
	while(!q.isEmpty()) {
		Node node = q.removeFirst();
		System.out.print(node.data+",");
		if(node.left != null)
			q.addLast(node.left);
		if(node.right != null)
			q.addLast(node.right);		
	}	
    }
	
	public Node lca(Node root1,Node l,Node r) {
		if(root1 == null)
			return null;
		
		if(root1.data==l.data || root1.data==r.data)
			return root1;
		
		Node lres=lca(root1.left,l,r);
		Node rres=lca(root1.right,l,r);
		
		if(lres!=null && rres!=null)
			return root1;
		
		return lres!=null?lres:rres;
		
	}
	
	public void levelOrderRecursive(Node root1) {
		int height = maxDepth(root1);
		
		for(int i=1;i<=height;i++) {
			levelPrint(root1,i);
			System.out.println();
		}
	}
	public void levelPrint(Node root1,int level) {
		if(root1 == null)
			return;
		if(level==1)
			System.out.print(root1.data+"--");
		else {
			levelPrint(root1.left,level-1);
			levelPrint(root1.right,level-1);
		}
	}
}
