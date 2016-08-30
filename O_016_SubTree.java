package jizhiOffer;

public class O_016_SubTree {


	static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	  public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		  boolean result  = false;
		  
		  if(root1!=null&&root2!=null)
		  {
			  if(root1.val==root2.val)
				  result = doseTree1HasTree2(root1,root2);
			  if(!result)
				  result = HasSubtree(root1.left, root2);
			  if(!result)
				  result = HasSubtree(root1.right, root2);
		  }
		  return result;
	    }
	private static boolean doseTree1HasTree2(TreeNode root1, TreeNode root2) {

		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return doseTree1HasTree2(root1.left, root2.left)
				&&doseTree1HasTree2(root1.right, root2.right);
	}

	public static void main(String[] args) {
		
	}

}
