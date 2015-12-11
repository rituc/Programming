import java.util.*;

class RemoveDuplicateNode{
	int data;
	RemoveDuplicateNode next;

	RemoveDuplicateNode(int data){
		this.data = data;
	}

	static void add(RemoveDuplicateNode head ,int data){
		RemoveDuplicateNode end = new RemoveDuplicateNode(data);
		while(head!=null){
			head = head.next;
		}
		head.next = end;
	}

	static void deleteDuplicate(RemoveDuplicateNode head){
		HashSet <Integer> set = new HashSet<Integer>();
		RemoveDuplicateNode pre = null;
		while(head!=null){
			if(set.contains(head.data)){
				pre.next = head.next;
			} else{
				set.add(head.data)
				pre = head;
			}
			head = head.next;
		}
	}

	static void removeDuplicateNode(RemoveDuplicateNode head){
		if(head==null)
			return;
		RemoveDuplicateNode current = head;
		while(current!=null){
			RemoveDuplicateNode runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				} else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public static void main(string args[]){
		Scanner in = new Scanner(System.in);
		RemoveDuplicateNode head = null;
		int n;
		int data;
		for(int i=0; i<n; i++){
			data = in.nextInt();
			add(head, data);
		}
		removeDuplicateNode(head);
		deleteDuplicate(head);
	}
}