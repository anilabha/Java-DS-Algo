package BST;

class Node {
	Node left;
	Node right;
	int data;
}

class BST {

	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}
		if (val < node.data) {
			node.left = insert(node.left, val);
		} else if (val > node.data) {
			node.right = insert(node.right, val);
		}
		return node;
	}

	public Node delete(Node node, int val) {
		if (node == null) {
			System.out.println("tree is empty !");

			return null;
		}
		if (val < node.data) {
			node.left = delete(node.left, val);
		} else if (val > node.data) {
			node.right = delete(node.right, val);
		} else {
			if (node.left == null) {
				Node temp = node.right;
				return temp;
			} else if (node.right == null) {
				Node temp = node.left;
				return temp;
			}

			Node temp = MinVal(node.right);
			node.data = temp.data;
			node.right = delete(node.right, temp.data);
		}
		return node;

	}

	public void InOrder(Node node) {
		if (node == null) {
			return;
		}
		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);

	}

	public void PreOrder(Node node) {
		if (node == null) {
			System.out.println("tree is empty !");
			return;
		}
		System.out.print(node.data + " ");
		InOrder(node.left);
		InOrder(node.right);

	}

	public void PostOrder(Node node) {
		if (node == null) {
			System.out.println("tree is empty !");
			return;
		}
		InOrder(node.left);
		InOrder(node.right);
		System.out.print(node.data + " ");

	}

	public int MaxVal(Node node) {
		if (node == null) {
			System.out.println("tree is empty !");
			return -1;
		}
		while (node.right != null) {
			node = node.right;
		}
		return node.data;

	}

	public Node MinVal(Node node) {
		if (node == null) {
			System.out.println("tree is empty !");
			return null;
		}
		while (node.left != null) {
			node = node.left;
		}
		return node;

	}

}

public class BSTApp {

	public static void main(String[] args) {

		BST a = new BST();
		Node root = null;

		root = a.insert(root, 8);
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);
		a.delete(root, 14);
		a.InOrder(root);
		System.out.println();
		a.PreOrder(root);
		System.out.println();
		a.PostOrder(root);
		System.out.println();
		System.out.println("Max Val=" + a.MaxVal(root));
		System.out.println("Min Val=" + a.MinVal(root).data);

	}

}
