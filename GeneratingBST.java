package packageBST;

public class GeneratingBST {
	
	static int[] inorder;
	public void preorder(int[] preorder)
	{
		int n= preorder.length;
		inorder=new int[n];
		for(int i=0;i<n;i++)
		{
			inorder[i]=preorder[i];
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(inorder[i]>inorder[j])
					swap(i,j);
			}
		}
		
		Node root=makeTree(inorder,preorder);
		inOrder(root);
		System.out.println();
		preOrder(root);
		
	}
	
	
	static void swap(int i,int j)
	{
		int temp=inorder[i];
		inorder[i]=inorder[j];
		inorder[j]=temp;
	}
	
	
	static Node makeTree(int[] inorder,int[] preorder)
	{	
		int length=inorder.length;
		if(length==0) return null;
		int n=0;
		while(preorder[0]!=inorder[n])
		{
			n++;
		}
		int[] leftInorder=new int[n];
		int[] leftpreorder=new int[n];
		int[] rightinorder=new int[length-n-1];
		int[] rightpreorder=new int[length-n-1];
		Node root=null;
		
		root= new Node(preorder[0]);
		
		for(int i=0;i<n;i++)
		{
			leftInorder[i]=inorder[i];
			leftpreorder[i]=preorder[i+1];
		}
		
		for(int j=0,i=n+1;i<length;j++,i++)
		{
			rightinorder[j]=inorder[i];
			rightpreorder[j]=preorder[i];
		}
		
		root.left= makeTree(leftInorder,leftpreorder);
		root.right= makeTree(rightinorder, rightpreorder);
		
		
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

/*class Node
{
	Node left,right;
	int data;
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}*/
