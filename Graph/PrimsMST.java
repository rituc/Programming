import java.util.*;

class PrimsMST{
	public static void main(String args[]){
		Scanner in  = new Scanner(System.in);
		int T, N, M, u, v, wt;
		T = in.nextInt();
		for(int t=0; t<T; t++){
			ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
			N = in.nextInt();
			M = in.nextInt();
			for(int k=0; k<N; k++){
				graph.add(new ArrayList<Edge>());
			}
			for(int i=0; i<M; i++){
				u = in.nextInt();
				v = in.nextInt();
				wt = in.nextInt();
				graph.get(u-1).add(new Edge(u-1, v-1, wt));
				graph.get(v-1).add(new Edge(v-1, u-1, wt));
			}	
			Iterator itr = edges.iterator();  
			while(itr.hasNext()){  
				Edge e = (Edge)itr.next();  
				System.out.println(e.u + " " + e.v + " " + e.wt);  
			} 
		}
	}
}

class Edge{
	int u;
	int v;
	int wt;

	Edge(int u, int v, int wt){
		this.u = u;
		this.v = v;
		this.wt = wt;
	}
}