import java.util.*;

class KthLastNode{
	int data;
	KthLastNode next;

	KthLastNode(int data){
		this.data = data;
	}
	static void add(KthLastNode head, data){
		KthLastNode node = new KthLastNode(data);
		while(head != null){
			head = head.next;
		}
		head = node
	}
	static KthLastNode finfkthLastNode(head, int k){
		if(head == null)
			return null;
		KthLastNode runner = head;
		for(int i=0; i<k-1, i++){
			if(runner == null)
				return null;
			runner = runner.next;
		}
		if(runner == null)
			return null;
		while(runner.next!=null){
			runner = runner.next;
			head = head.next;
		}
		return head;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		KthLastNode head = null;
		KthLastNode kthLastNode = null;
		int n, data, k;
		n = in.nextInt();
		k = in.nextInt();
		for(int i=0; i<n; i++){
			data = in.nextInt();
			add(head, data);
		}
		kthLastNode = finfkthLastNode(head, k);
		System.out.println(kthLastNode.data);
	}
}