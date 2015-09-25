import java.util.*;

class BSTNode{
	int key;
	BSTNode left;
	BSTNode right;
	//BSTNode parent;

	BSTNode(int item){
		key = item;
		left = null;
		right = null;
	}

	static void inorder(BSTNode root){
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);
	}

	static void preorder(BSTNode root, boolean printBracket){
		if(root == null)
			return;
		System.out.print(root.key + " ");
		if (printBracket){
			System.out.print(" (");
		}
		preorder(root.left, printBracket);
		if (printBracket){
			System.out.print(") ");
			System.out.print(" (");
		}
		preorder(root.right, printBracket);
		if (printBracket){
			System.out.print(") ");
		}
	}

	static BSTNode insertNode(BSTNode root, int item){
		if(root == null)
			return new BSTNode(item);
		if(item < root.key)
			root.left = insertNode(root.left, item);
		else if(item > root.key)
			root.right = insertNode(root.right, item);
		return root;
	}

	static BSTNode search(BSTNode root, int item){
		if(root == null || item == root.key)
			return root;
		if(item < root.key)
			search(root.left, item);
		else search(root.right, item);
		return root;
	}

	static BSTNode treeMinium(BSTNode root){
		if(root == null)
			return root;
		while(root.left != null){
			root = treeMinium(root.left);
		}
		return root;
	}

	static BSTNode treeMaximum(BSTNode root){
		if(root == null)
			return root;
		while(root.right != null){
			root = treeMaximum(root.right);
		}
		return root;
	}

	static BSTNode delete(BSTNode root, int item){
		if(root == null)
			return root;
		if(item < root.key)
			root.left = delete(root.left, item);
		else if(item > root.key)
			root.right = delete(root.right, item);
		else {
			if(root.left == null){
				BSTNode temp = root.right;
				return temp;
			}
			else if(root.right == null){
				BSTNode temp = root.left;
				return temp;
			}
		}
	}

	public static void main(String args[]){
		BSTNode root = null;
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		boolean printBracket = true;
		for(int i = 0; i < n; i++){
			root = insertNode(root, in.nextInt());
		}
		int seachElement = in.nextInt();
		System.out.println("Inorder:");
		inorder(root);
		System.out.println();

		System.out.println("Preorder:");
		preorder(root, printBracket);
		System.out.println();

		BSTNode searchedElement = search(root, seachElement);
		if(searchedElement != null)
			System.out.println("search element:" + " " + searchedElement);
		else System.out.println("Element not found in tree");
		System.out.println();

		BSTNode treeMinium = treeMinium(root);
		if(treeMinium != null)
			System.out.println("Tree minimum: " + " " + treeMinium.key);
		else  System.out.println("Tree is empty");
		System.out.println();

		BSTNode treeMaximum = treeMaximum(root);
		if(treeMaximum != null)
			System.out.println("Tree Maximum: " + " " + treeMaximum.key);
		else System.out.println("Tree is empty");
	}
}