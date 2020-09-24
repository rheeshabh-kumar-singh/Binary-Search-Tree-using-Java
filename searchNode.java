package packageBST;

public class searchNode {
	
	public Node search(Node root, int val)
	{
		Node node=null;
		if(root.data<val)
		{
			node= search(root.left, val);
		}
		else if(root.data>val)
		{
			node= search(root.right, val);
		}
		
		return node;
		
	}

}
