package packageBST;
import java.util.Scanner;

public class BinarySearchTree {

	static Scanner sc= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root=createBSTfromArray();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		System.out.println();
		
		int[] preorder=new int[] {5,4,3,2,1,6,8,7};
		
		GeneratingBST gbst= new GeneratingBST();
		gbst.preorder(preorder);
		
		

	}

	static Node createBSTnodeByNode()
	{
		Node root=null;
		sc= new Scanner(System.in);
		System.out.println("enter node data: ");
		int data=sc.nextInt();
		while(data>0)
		{
			root = insert(root,data);
			System.out.println("enter node data: ");
			data=sc.nextInt();
		}
		return root;
	}
	
	static Node createBSTfromArray()
	{
		Node root=null;
		int[] nodes=new int[] {5,4,6,8,3,2,1,7};
		for (int i = 0; i < nodes.length; i++) {
			root=insert(root,nodes[i]);
		}
		return root;
	}
	
	
	static Node newNode(int val)
	{
		Node a = new Node(val);
		a.left=null;
		a.right=null;
		return a;
	}
	
	static Node insert(Node node, int val)
	{
		if(node==null) return newNode(val);
		
		if(node.data<val)
		{
			node.right = insert(node.right, val);
		}
		else if(node.data>val)
		{
			node.left = insert(node.left, val);
		}
		
		return node;
	}
	
	
	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}
	
	static void preOrder(Node root)
	{
		if(root!=null)
		{	
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	static void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data);
		}
	}
	
}


class Node
{
	Node left,right;
	int data;
	Node(int data)
	{
		this.data=data;
	}
}
