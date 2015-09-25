class Node{
	int data;
	Node left;
	Node right;

	Node(int data){
		this.data = data;
		left = null;
		right = null;
	}

	static void printPostOrder(Node node){
		if(node == null)
			return null;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data);
	}

	static void printInorder(Node node){
		if(node == null)
			return
		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);
	}

	static void printPreorder(Node node){
		if(node == null)
			return
		System.out.println(node.data);
		printPreorder(node.left);
		printPreorder(node.data);
	}

	static int size(Node node){
		if(node == null){
			return 0;
		} else{
			return (size(node.left) + 1 +size(node.right));
		}

	}

	static int indenticalTrees(Node node1, Node node2){
		if(node1 == null && node2 == null){
			return 1;
		}else if(node1 != null && node2 !=null){
			return node1.data == node2.data && indenticalTrees(node1.left, node2.left)  && indenticalTrees(node1.right, node2.right)
		}
	}

	static int maxDepth(Node node){
		if(node == null)
			return 0;
		else{
			lDepth = maxDepth(node.left);
			rDepth = maxDepth(node.right);
			if(lDepth > rDepth){
				return (lDepth + 1);
			}else return (rDepth + 1);
		}
	}

	static void deleteTree(Node node){
		if(node == null){
			return;
		}
		deleteTree(node.left);
		deleteTree(node.right);
		System.out.println("Deleting node ", node.data);
	}

	static void mirror(Node node){
		if(node == null)
			return;
		Node temp;
		mirror(node.left);
		mirror(node.right);
		temp = mirror(node.left);
		node.left = node.right;
		node.right = temp;
	}

	public static void main(String args[]){
		Node root = new Node(1);
		Node root1 = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);

		System.out.println("Preorder");
		printPreorder(root);

		System.out.println("Inorder");
		printInorder(root);

		System.out.println("Postorder");
		printPostorder(root);

		System.out.println("Size of tree is : ", size(root));

		if(indenticalTrees(root, root1)){
			System.out.println("indenticalTrees");
		} else{
			System.out.println("Not indenticalTrees")
		}
		
		System.out.println("Max Depth : ", maxDepth(root));

		mirror(root);
		System.out.print("mirror tree", printInorder(root);

		deleteTree(root);
		root = null;
		System.out.println("Deleted tree");

	}
}