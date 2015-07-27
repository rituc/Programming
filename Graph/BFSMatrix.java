import java.io.*;
import java.util.*;

class BFSMatrix{

	static void bfs(int A[][], int v, int size){
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[size];
		queue.offer(v);
		visited[v] = true;
		while(!queue.isEmpty()){
			int u = queue.poll();
			System.out.print(u+1);
			for(int w = 0; w < size; w++){
				if(!visited[w] && A[u][w] == 1){
					queue.offer(w);
					visited[w] = true;
				}
			}
		}
	}

	public static void main(String args[]){
		int T, N, M, X, Y;
		int i, j, t, e; 
		Scanner in  = new Scanner(System.in);
		T = in.nextInt();
		for(t = 0; t < T; t++){
			N = in.nextInt();
			int A[][] = new int[N][N];
			for(i = 0; i < N; i++){
				for (j = 0; j < N; j++){
					A[i][j] = 0;	
				}
			}
			M = in.nextInt();
			for(e = 0; e < M; e++){
				X = in.nextInt();
				Y = in.nextInt();
				A[X-1][Y-1] = 1;
				A[Y-1][X-1] = 1;
			}
			bfs(A, 0, N);
		}
	}
}