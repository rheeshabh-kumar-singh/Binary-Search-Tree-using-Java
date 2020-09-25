package packageBST;

public class SearchNode {
	
	public Node search(Node root, int val)
	{
		if(root==null) return null;
		Node node=null;
		if(root.data<val)
		{
			node= search(root.right, val);
		}
		else if(root.data>val)
		{
			node= search(root.left, val);
		}
		
		return node;
		
	}

}
