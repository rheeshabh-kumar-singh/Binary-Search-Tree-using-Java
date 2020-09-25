package packageBST;

public class GeneratingBST {
	
	static int[] inorder;
	public void preorder(int[] postorder)
	{
		int n= postorder.length;
		inorder=new int[n];
		for(int i=0;i<n;i++)
		{
			inorder[i]=postorder[i];
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(inorder[i]>inorder[j])
					swap(i,j);
			}
		}
		
	}
	
	
	static void swap(int i,int j)
	{
		int temp=inorder[i];
		inorder[i]=inorder[j];
		inorder[j]=temp;
	}
	
}
