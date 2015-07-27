import java.io.*;
import java.util.*;

class BFSAdjList{
	static void bfs(ArrayList<ArrayList<Integer>> graph, int v){
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[graph.size()];
		queue.offer(v);
		visited[v] = true;
		while(!queue.isEmpty()){
			int u = queue.poll();
			System.out.print((u+1) + " : ");
			for(Integer w : graph.get(u)){
				System.out.print((w+1) + " ");
				if(!visited[w]){
					queue.offer(w);
					visited[w] = true;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		int T, N, M, u, v, i;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(i = 0; i < T; i++){
			N = in.nextInt();
			M = in.nextInt();
			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(N);
			for(int k = 0; k < N; k++)  {
		        graph.add(new ArrayList<Integer>());
		    }
			for(int j = 0; j < M; j++){
				u = in.nextInt();
				v = in.nextInt();
				graph.get(u-1).add(v-1);
				graph.get(v-1).add(u-1);
			}
			bfs(graph, 0);
		}
	}
}