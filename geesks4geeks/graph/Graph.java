import java.util.*;

class Graph{
  private int V; //No of vertices
  private LinkedList<Integer> adj[];

  //Constructor
  Graph(int v){
    V = v;
    adj = new LinkedList[v];
    for(int i=0; i<v; i++){
      adj[i] = new LinkedList<Integer>();
    }
  }
  // Function to add edge
  void addEdge(int u, int v){
    adj[u].add(v);
  }

  void bfs(int s){
    boolean visited[] = new boolean();
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[s] = true;
    queue.add(s);
    while(queue.size() != 0){
      s = queue.poll();
      System.out.println(s+ " ");
      Iterator<Integer> i = adj[s].ListIterator();
      while(i.hasNext()){
        int n = i.next();
        if(!visited[n]){
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }


  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int M, N;
    System.out.println("Enter number of vertices: ");
    N = in.nextInt();
    Graph g = new Graph(N);
    System.out.println("Enter number of edges: ");
    M = in.nextInt();
    for(int j=0; j <M; j++){
      System.out.println("Enter edges:");
      int u = in.nextInt();
      int v = in.nextInt();
      g.addEdge(u,v);
    }
  }
}