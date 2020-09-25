package packageBST;

public class DeleteNode {
	
	public Node deleteNode(Node root,int val)
	{
		if(root==null) return null;
		if(root.data<val)
		{
			root.right= deleteNode(root.right, val);
		}
		else if(root.data>val)
		{
			root.left= deleteNode(root.left, val);
		}
		else
		{
			if (root.left==null && root.right==null)
			{
				return null;
			}
			else if(root.left==null)
			{
				root= root.right;
			}
			else if(root.right==null)
			{
				root= root.left;
			}
			else
			{
				root.data= min(root.right);
				deleteNode(root,root.data);
			}
			
			
		}
		
		
		return root;
	}
	
	
	static int min(Node root)
	{
		int data=root.data;
		while(root.left!=null)
		{
			data = root.left.data;
			root = root.left;
		}
		return data;
	}

}
