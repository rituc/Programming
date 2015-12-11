class PartitionLinkedList{
	int data;
	PartitionLinkedList next;

	PartitionLinkedList(int data){
		this.data = data;
	}

	static void add(PartitionLinkedList head, int data){
		PartitionLinkedList end = new PartitionLinkedList(data);
		while(head!=null){
			head = head.next;
		}
		head.next = end;
	}

	static PartitionLinkedList partition(PartitionLinkedList node, int partitionData){
		PartitionLinkedList head = node;
		PartitionLinkedList tail = node;
		while(node!=null){
			if(node.data<partitionData){
				node.next = head;
				head = node;
			}else{
				tail.next = node;
				tail = node;
			}
			node= node.next;
		}
		tail.next = null;
		return head;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n, data, partitionData;
		PartitionLinkedList newList = null;
		n = in.nextInt();

		for(int i=0; i<n; i++){
			data = in.nextInt();
			add(head, data);
		}
		partitionData = in.nextInt();
		newList = partition(head, partitionData)
	}

}