class DeleteNode{
	int data;
	DeleteNode next;

	DeleteNode(int data){
		this.data = data;
	}
	
	static void add(DeleteNode head, int data){
		DeleteNode end = new DeleteNode(data);
		while(head != null){
			head = head.next;
		}
		head.next = end;
	}

	static boolean DeleteNode(DeleteNode node){
		if(node==null || node.next==null)
			return false;
		node.data = node.next.data;
		node.next = node.next.next;
		return true;
	}

	public static void main(String args[]){
		DeleteNode head = null;
		Scanner in = new Scanner(System.in);
		int n, data;
		n = in.nextInt();

		for(int i=0; i<n; i++){
			data = in.nextInt();
			add(head, data);
		}
		del_data = in.nextInt();
		DeleteNode node = new DeleteNode(del_data);
		if(DeleteNode(node))
			System.out.println("data deleted")
		else
			System.out.println("No data deleted")	
	}
}