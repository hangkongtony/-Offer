package jizhiOffer;
import java.util.Stack;

public class O_017_MirrorTree {

	static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	    
	//递归方式
	   public  void Mirror(TreeNode root) {
	        if(root==null)
	        	return;
	        Mirror(root.left);
	        Mirror(root.right);
	        TreeNode temp;
	        temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	    }
	   
	 //非递归方式
	   public void Mirror2(TreeNode root)
	   {
		   if(root == null)
			   return;
		   Stack<TreeNode> stack = new Stack<O_017_MirrorTree.TreeNode>();
		   stack.push(root);
		   while(!stack.isEmpty())
		   {
			   TreeNode node = stack.pop();
			   TreeNode temp;
			   temp = node.left;
			   node.left = node.right;
			   node.right = temp;
			   if(node.left!=null)
				   stack.push(node.left);
			   if(node.right!=null)
				   stack.push(node.right);
		   }
	   }
	   
	   //前序遍历 根左右
	   public void preOrder(TreeNode root)
	   {
		   Stack<TreeNode> stack = new Stack<O_017_MirrorTree.TreeNode>();
		  while(root!=null||!stack.isEmpty())
		  {
			  while(root!=null)
			  {
				  System.out.print(root.val);
				  stack.push(root);
				  root = root.left;
			  }
			  while(!stack.isEmpty())
			  {
				  root = stack.pop();
				  root = root.right;
			  }
		  }
	   }
	   
	   
	public static void main(String[] args) {

	}

}
