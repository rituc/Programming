import java.util.*;

class CircularLinkedList{
	int data;
	CircularLinkedList next;

	CircularLinkedList(int data){
		this.data = data;
		this.next = null;
	}

	static CircularLinkedList add(CircularLinkedList head, int data){
		if(head==null){
			CircularLinkedList node = new CircularLinkedList(data);
			head = node;
		}
		else {
			CircularLinkedList node1 = head;
			CircularLinkedList node = new CircularLinkedList(data);
			while(node1.next != null){
				node1 = node1.next;
			}
			node1.next = node;
		}
		return head;
	}

	static void printList(CircularLinkedList head){
		if(head == null)
			return;
		while(head!=null){
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	static boolean detectCycle(CircularLinkedList head){
		if(head == null)
			return false;
		CircularLinkedList slow = head;
		CircularLinkedList fast = head;
		while(fast!=null && fast.next!=null){
			System.out.print(fast.data);
			System.out.print(slow.data);
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n, data;
		CircularLinkedList head = null;
		n = in.nextInt();
		for(int i=0; i<n; i++){
			data = in.nextInt();
			head = add(head, data);
		}
		//printList(head);
		if(detectCycle(head))
			System.out.println("Cycle found");
		else
			System.out.println("no Cycle found");
	}
}