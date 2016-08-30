package jizhiOffer;

public class O_014_ReverseList {

	static class MyList
	{
		int val;
		MyList next = null;
		public MyList(int val) {
			super();
			this.val = val;
		}
	}

	public static MyList reverseList1(MyList root)
	{
		if(root == null)
			return null;
		MyList reversehead = null;
		MyList pre = null;
		MyList next = null;
		MyList cur = root;
		while(cur!=null)
		{
			next = cur.next;
			if(next == null)
				reversehead = cur;
			cur.next = pre;
			pre = cur;
			cur = next; 
		}
		return reversehead;
	}
	
	public static void main(String[] args) {
		MyList node4 = new MyList(4);
		MyList node3 = new MyList(3);
		MyList node2 = new MyList(2);
		MyList node1 = new MyList(1);
		MyList root = new MyList(0);
		root.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		root = reverseList1(root);
		while(root!=null)
		{
			System.out.print(root.val+" ");
			root = root.next;
		}
	}
}
