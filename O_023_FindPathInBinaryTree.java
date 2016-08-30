package jizhiOffer;

import java.util.ArrayList;

public class O_023_FindPathInBinaryTree {

	static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public  ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		
		int currentNum = 0;
		ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		if(root==null)
			return pathList;

		return findPath(pathList,path,currentNum,root,target);
        
    }
    
    
	private ArrayList<ArrayList<Integer>> findPath(ArrayList<ArrayList<Integer>> pathList, ArrayList<Integer> path,
			int currentNum, TreeNode root, int target) {
		
		currentNum+=root.val;
		path.add(root.val);
		//if root is leafNode
		boolean isLeaf = root.left==null&&root.right==null;
		if(isLeaf&&target==currentNum)
		{
			ArrayList<Integer> newPath = new ArrayList<Integer>();
			for(int i :path)
			{
				newPath.add(i);
			}
			pathList.add(newPath);
		}
		else
		{
			if(root.left!=null)
			{
				findPath(pathList, path, currentNum, root.left, target);
			}
			if(root.right!=null)
			{
				findPath(pathList, path, currentNum, root.right, target);
			}
		}
		
		//在返回父节点只之前，需要删除当前节点
		int i =path.remove(path.size()-1);
		//currentNum-=i; no necessary
		return pathList;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
