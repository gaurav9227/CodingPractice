package TraversalPackage;

public class MainClass {

	public static void main(String[] args) {
		int[][] adj ={
				{0,1,0,0,1,1},
				{1,0,1,0,0,0},
				{0,1,0,1,0,0},
				{0,0,1,0,0,0},
				{1,0,0,0,0,0},
				{1,0,0,0,0,0}
				};
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.DFS(adj, 0);
	}
}
