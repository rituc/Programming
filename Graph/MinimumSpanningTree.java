import java.io.*;
import java.util.*;

class MinimumSpanningTree{

	public static void main(String args[]){
		int T;
		int u, v, wt;
		Scanner in = new Scanner(System.in);
		T = in.nextInt();
		for(int t = 0; t < T; t++){
			int N, M;
			ArrayList<Edge> edges = new ArrayList<Edge>();
			N = in.nextInt();
			M = in.nextInt();
			for(int i = 0; i < M; i++){
				u = in.nextInt();
				v = in.nextInt();
				wt = in.nextInt();
				Edge e = new Edge(u, v, wt);
				edges.add(e);
			}
			Collections.sort(edges);
			Iterator itr = edges.iterator();  
			while(itr.hasNext()){  
				Edge e = (Edge)itr.next();  
				System.out.println(e.u + " " + e.v + " " + e.wt);  
			} 
		}
	}
}

class Edge implements Comparable{
	public int u;
	public int v;
	public int wt;

	public Edge(int _u, int _v, int _wt) {
		u = _u;
		v = _v;
		wt = _wt;
	}
	@Override
	public int compareTo(Object obj){  
		Edge e = (Edge)obj;  
		if(wt == e.wt)  
			return 0;  
		else if(wt > e.wt)  
			return 1;  
		else  
			return -1;  
	}  
}