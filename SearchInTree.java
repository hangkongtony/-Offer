package jizhiOffer;
import java.util.ArrayList;
import java.util.Iterator;


public class SearchInTree {

	static class Node
	{
		int val;
		Node left = null;
		Node right = null;
		public Node(int val) {
			super();
			this.val = val;
		}
	}
	
	public static void BFSearch(Node root,ArrayList<Integer> list)
	{
		if(root == null)
			return;
		list.add(root.val);
		//р╤вс╫з╣Ц
		if(root.left==null&&root.right==null)
		{
			Iterator<Integer> iterator = list.iterator();
			while(iterator.hasNext())
			{
				System.out.print(iterator.next()+" ");
			}
			System.out.println();
			//remove the last
			//list.remove(list.size()-1);
		}
		BFSearch(root.left, list);
		BFSearch(root.right, list);
		//list.remove(list.size()-1);
	}
	
	public static void WFSearch(Node root)
	{
		ArrayList<Node> deque = new ArrayList<SearchInTree.Node>();
		if(root == null)
			return;
		deque.add(root);
		while(!deque.isEmpty())
		{
			Node node = deque.remove(0);
			System.out.print(node.val+" ");
			if(node.left!=null)
			{
				deque.add(node.left);
			}
			if(node.right!=null)
			{
				deque.add(node.right);
			}
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(0);
		Node node3 = new Node(1);
		Node node4 = new Node(1);
		Node node5 = new Node(0);
		root.left = node1;
		root.right = node3;
		node1.left = node2;
		node3.left = node4;
		node3.right = node5;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		BFSearch(root, list);
		
		//ArrayList<Node> deque = new ArrayList<BFS.Node>();
 		WFSearch(root);
	}

}
