import java.util.*;

class Node{
	int data;
	Node node;

	Node(int data){
		this.data = data;
	}

	static void appendNode(int data){
		Node end = new Node(data);
		Node n = this;
		while(n!=null){
			n = n.next;
		}
		n.next = end;
	}

	static void printNode(Node n){
		if(n==null){
			System.out.println("Empty LinkedList");
		}
		while(n!=null){
			System.out.print(n.data);
			n = n.next;
		}
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n;
		int data;
		n = in.nextInt();
		for(int i=0; i<n; i++){
			data = in.nextInt();
			appendNode(data);
		}
	}
}