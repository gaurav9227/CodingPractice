package BinaryTreePackage;

public class MainClass {
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root=bt.insert(bt.root, 20);
		bt.root=bt.insert(bt.root, 10);
		bt.root=bt.insert(bt.root, 4);
		bt.root=bt.insert(bt.root, 5);
		bt.root=bt.insert(bt.root, 15);
		bt.root=bt.insert(bt.root, 30);
		bt.root=bt.insert(bt.root, 25);
		bt.root=bt.insert(bt.root, 40);
		BinaryTree bt1 = new BinaryTree();
		bt1.root=bt1.insert(bt1.root, 20);
		bt1.root=bt1.insert(bt1.root, 10);
		bt1.root=bt1.insert(bt1.root, 4);
		bt1.root=bt1.insert(bt1.root, 5);
		bt1.root=bt1.insert(bt1.root, 15);
		bt1.root=bt1.insert(bt1.root, 30);
		bt1.root=bt1.insert(bt1.root, 25);
		bt1.root=bt1.insert(bt1.root, 40);
		bt1.print(bt1.root);
		/*int size = bt.size(bt.root);
		int maxDepth = bt.maxDepth(bt.root);
		int minValue = bt.minValue(bt.root);
		boolean hasPathSum = bt.hasPathSum(bt.root,39);
		System.out.println("size is:"+size);
		System.out.println("MaxDepth is:"+maxDepth);
		System.out.println("hasPathSum is:"+hasPathSum);
		int[] path = new int[1000];
		bt.printPaths(bt.root, path , 0);
		bt.dupleft(bt.root);
		bt.print(bt.root);*/
		boolean res = bt.checkStructure(bt.root, bt1.root);
		System.out.println("Structure same:"+res);
		/*boolean res1 = bt.isSibling(4,5, bt1.root);
		System.out.println("isSibling:"+res1);*/
		/*int level = bt.levelCounter(bt1.root,4,0);
		System.out.println("Level :"+level);*/
		bt.levelOrederPrint(bt.root);
		System.out.println();
		
		BinaryTree bt2 = new BinaryTree();
		bt2.root=bt2.insert(bt2.root, 20);
		bt2.root=bt2.insert(bt2.root, 10);
		bt2.root=bt2.insert(bt2.root, 25);
		bt2.root=bt2.insert(bt2.root, 30);
		bt2.root=bt2.insert(bt2.root, 40);
		Node result = bt.lca(bt.root, bt.lookup(bt.root,25), bt.lookup(bt.root,40));
		System.out.println("LCA is: "+result.data);
		int minDepth = bt.minDepth(bt2.root);			
		System.out.println("minDepth4: "+minDepth);
		
	}
}
