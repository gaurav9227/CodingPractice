package TraversalPackage;

import java.util.Stack;

public class DepthFirstSearch {

	Stack<Integer> s = new Stack<>();
	public int getOneChild(int[][] adj,int element,int[] visited) {
		int child =-1;
		for(int i=0;i<adj.length;i++)
			if(adj[element][i]==1 && visited[i]==0) {
				child=i;
				visited[i]=1;
				System.out.println(i);
				s.push(i);
				break;
			}
		return child;
	}
	public void DFS(int[][] adj,int source) {
		
		int[] visited =new int[adj.length];
		s.push(source);
		visited[source]=1;
		System.out.println(s.peek());
		while(!s.empty()) {
			int element = s.peek();
			int child = getOneChild(adj, element, visited);
			if(child==-1)
				s.pop();
			
			
		}
	}
}
