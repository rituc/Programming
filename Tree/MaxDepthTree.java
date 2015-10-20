import java.util.*;

class MaxDepthTree{
	int data;
	MaxDepthTree left;
	MaxDepthTree right;

	MaxDepthTree(item){
		data = item;
		left = null;
		right = null
	}

	/*static void insertNode(int root, item){
		if(root == null)
			return new MaxDepthTree(root);
		else 
		}
	}*/

	static int toFindMaxDepth(MaxDepthTree node){
		if(node == null){
			return 0;
		} else {
			maxDeptheft = MaxDepthTree(node.left)
			maxDepthRight = MaxDepthTree(node.right)
			return max(maxDeptheft, maxDepthRight) + 1
		}
	}

	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		in

	}
}