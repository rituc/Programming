class Huffman{
	int data;
	int frequency;
	Huffman left;
	Huffman right;

	Huffman(int data, int frequency){
		this.data = data;
		this.frequency = frequency;
		this.left = null;
		this.right = null;
	}

	static Huffman addNode(Huffman root, Huffman new_node){
		if(root==null){
			root = new_node;
		}
		Huffman temp = new Huffman(data, frequency);
		if(root.frequency > new_node.frequency){
			temp = root;
			root = new_node;
			if(root.left == null){
				root.left = temp;
			}else if(root.right == null){
				
			}
			
			root = new_node;
		}
		return root;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n, data, frequency;
		n = in.nextInt();
		Huffman root = null
		for(int i=0; i<n; i++){
			data = in.nextInt();
			frequency = in.nextInt();
			Huffman new_node = new Huffman(data, frequency);
			root = addNode(root, new_node)
		}
	}
}
