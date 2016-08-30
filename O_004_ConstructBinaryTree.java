package jizhiOffer;

public class O_004_ConstructBinaryTree {

	static class TreeNode
	{
		int data;
		TreeNode left,right;
		public TreeNode(int data) {
			super();
			this.data = data;
		}
		
	}
	
	public static TreeNode constructBinaryTree(int[] preOrder,int[] inOrder)
	{
		return constructCore(preOrder, 0,preOrder.length-1 , inOrder, 0, inOrder.length-1);
	}
	

    private static TreeNode constructCore(int[] pre,int startPreOrder, int endPreOrder, int[] in,int startInOrder, int endInOrder) {
        //根据前序遍历找到根节点的值
        int rootValue = pre[startPreOrder];
        TreeNode rootNode = new TreeNode(rootValue);
        rootNode.left = null;
        rootNode.right = null;
        
        //只有一个结点，那么该节点就是根节点，直接返回
        if(startPreOrder == endPreOrder){
            if(startInOrder == endInOrder && pre[startPreOrder] == in[startInOrder]){
                return rootNode;
            }
        }
        
        //根据中序遍历的结果找到根节点
        int rootOfInOrder = startInOrder;
        while(rootOfInOrder <= endInOrder && in[rootOfInOrder] != rootValue){
            rootOfInOrder++;
        }
        
        //异常处理
        if(rootOfInOrder == endInOrder && in[rootOfInOrder] != rootValue){
            return null;
        }
        
        //计算左子树的长度
        int leftSubTreeLen = rootOfInOrder - startInOrder;
        //根据左子树的长度计算前序遍历结果中左子树的最后一个结点的下标
        int leftIndexOfPreOrderEnd = startPreOrder + leftSubTreeLen;
        //重建左子树
        if(leftSubTreeLen > 0){
            rootNode.left = constructCore(pre, startPreOrder + 1, leftIndexOfPreOrderEnd, in, startInOrder, rootOfInOrder - 1);
        }
        //重建右子树
        if(leftSubTreeLen < endPreOrder - startPreOrder){
            rootNode.right = constructCore(pre, leftIndexOfPreOrderEnd + 1, endPreOrder, in, rootOfInOrder + 1, endInOrder);
        }
        return rootNode;
    }
	
	
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = constructBinaryTree(pre, in);
		
		if(root!=null)
		{
			preOrder(root);
		}
	}

	public static void preOrder(TreeNode root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		String s = new String();
	}
}
