package jizhiOffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class O_021_PrintTreeFromTop {

	 static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	  public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	      
	        ArrayList<Integer> set = new ArrayList<Integer>();
	        ArrayList<TreeNode> queue = new ArrayList<O_021_PrintTreeFromTop.TreeNode>();
	        if(root==null)
	        	return set;
	        queue.add(root);
	        int index = 1;
	        while(!queue.isEmpty())
	        {
	        	TreeNode node = queue.remove(0);
	        	set.add(node.val);
	        	index--;
	        	if(node.left!=null)
	        	{
	        		queue.add(index++, node.left);
	        	}
	        	if(node.right!=null)
	        	{
	        		queue.add(index++,node.right);
	        	}
	        }
	        return set;
	  }
	public static void main(String[] args) {
		   TreeNode root = new TreeNode(8);
	        TreeNode node1 = new TreeNode(6);
	        TreeNode node2 = new TreeNode(10);
	        TreeNode node3 = new TreeNode(5);
	        TreeNode node4 = new TreeNode(7);
	        TreeNode node5 = new TreeNode(9);
	        TreeNode node6 = new TreeNode(11);
	        
	        root.left = node1;
	        root.right = node2;
	        node1.left = node3;
	        node1.right = node4;
	        node2.left = node5;
	        node2.right = node6;
	        
	        ArrayList<Integer> list = PrintFromTopToBottom(root);
	        for(Integer i:list)
	        {
	        	System.out.print(i);
	        }
	}

}
