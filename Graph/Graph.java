import java.io.*;
import java.util.*;

class Graph{
	public static void main(String args[]){
		int T, N, M, u, v;
		for(int t=0; t<T; t++){
			N = in.nextInt();
			M = in.nextInt();
			ArrayList<ArrayList<Integer> graph = new ArrayList<ArrayList<Integer>>(N);
			for(int k=0; k<N; k++){
				graph.add(new ArrayList<Integer>());
			}
			for(int j=0; j<M; j++){
				u = in.nextInt();
				v = in.nextInt();
				graph.get(u-1).add(v-1);
				graph.get(v-1).add(u-1);
			}
			bfs(graph, 0);
		}
	}
}