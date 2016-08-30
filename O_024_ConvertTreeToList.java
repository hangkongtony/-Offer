package jizhiOffer;

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class O_024_ConvertTreeToList {

	
	  public TreeNode Convert(TreeNode pRootOfTree) {
		  TreeNode lastNodeInList = null;
		  //对引用的理解要深刻
		  lastNodeInList = ConvertNode(pRootOfTree,lastNodeInList);
		  TreeNode headOfList = lastNodeInList;
		  while(headOfList!=null&&headOfList.left!=null)
		  {
			  headOfList = headOfList.left;
		  }
		  return headOfList;
	    }
	
	private TreeNode ConvertNode(TreeNode pRootOfTree, TreeNode lastNodeInList) {
		if(pRootOfTree == null)
			return null;
		TreeNode curr = pRootOfTree;
		if(curr.left!=null)
		{
			lastNodeInList = ConvertNode(curr.left, lastNodeInList);
		}
		curr.left = lastNodeInList;
		if(lastNodeInList!=null)
		{
			lastNodeInList.right = curr;
		}
		lastNodeInList = curr;
		if(curr.right!=null)
		{
			lastNodeInList =ConvertNode(curr.right, lastNodeInList);
		}
		return lastNodeInList;
	}

	public static void main(String[] args) {
		byte b1 = 1,b2 = 2,b3,b6;//栈中
		
		final byte b4 = 4,b5 = 5;//会被jvm优化，编译期常量，存在常量区
		/*
		 * 还有运行期常量 final int a = new Integer(1);
		 */
		b6 = b4+b5;
		//b3 = b1+b2;//计算时 byte short char 都转换成int
	}

}
