package packageBST;
import java.util.Scanner;

public class BinarySearchTree {

	static Scanner sc= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root=createBST();
		inOrder(root);
		System.out.println();
		preOrder(root);
		

	}

	static Node createBST()
	{
		sc= new Scanner(System.in);
		Node root=null;
		System.out.println("Enter node:");
		int data= sc.nextInt();
		if (data== -1) return null;
		root= new Node(data);
		
		Node nextNode= createBST();
		
		if(nextNode == null) 
			{
				root.right=null;
				root.right=null;
			}
		else if((nextNode.data)>=(root.data))
			{
				root.right=nextNode;
			}
		else
			{
				root.left=nextNode;
			}
		return root;
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
	Node left=null,right=null;
	int data;
	Node(int data)
	{
		this.data=data;
	}
}
