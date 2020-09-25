package packageBST;

public class DeleteNode {
	
	public Node deleteNode(Node root,int val)
	{
		if(root==null) return null;
		if(root.data<val)
		{
			root= deleteNode(root.left, val);
		}
		else if(root.data>val)
		{
			root= deleteNode(root.right, val);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			
		}
		
		return root;
	}

}
