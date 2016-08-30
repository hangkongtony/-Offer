package jizhiOffer;

public class O_038_IsBalanced_Solution {

	
	public class TreeNode
	{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			super();
			this.val = val;
		}
	}
	
	public int TreeDepth(TreeNode pRoot)
    {
		if(pRoot==null)
			return 0;
		return Math.max(TreeDepth(pRoot.left), TreeDepth(pRoot.right))+1;
    }
	
	public boolean IsBalanced_Solution(TreeNode root) 
	{
			if(root == null)
				return true;
	        int leftDepth = TreeDepth(root.left);
	        int rightDepth = TreeDepth(root.right);
	        if(Math.abs(rightDepth-leftDepth)>1)
	        {
	        	return false;
	        }
	        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
	}
	   
	public boolean IsBalanced(TreeNode root ,int[] depth)
	{
		if(root==null)
		{
			depth[0] = 0;
			return true;
		}
		int[] left = new int[1];
		int[] right = new int[1];
		if(IsBalanced(root.left,left)&&IsBalanced(root.right, right))
		{
			int diff = left[0]-right[0];
			if(diff<=1&&diff>=-1)
			{
				depth[0] = 1 + left[0]>right[0]?left[0]:right[0];
				return true;
			}
		}
		return false;
	}
	
	public boolean IsBalanced_Solution2(TreeNode root) 
	{
		int[] depth = new int[1];
		return IsBalanced(root, depth);
	}
	

	public static void main(String[] args) {
		byte b1=1,b2=2,b3,b6;
		final byte b4=4,b5=6;
		b6=b4+b5;
		b3=(byte) (b1+b2);
		System.out.println(b3+b6);
	}

}
