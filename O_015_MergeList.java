package jizhiOffer;

public class O_015_MergeList {

	static class ListNode
	{
		int val;
		ListNode next = null;
		public ListNode(int val) {
			super();
			this.val = val;
		}
	}
	 
	public ListNode Merge(ListNode list1,ListNode list2) 
	{
		if(list1==null)
			return list2;
		else if(list2 == null)
			return list1;
		ListNode mergeHead;
		if(list1.val<list2.val)
		{
			mergeHead = list1;
			mergeHead.next = Merge(list1.next,list2);
		}
		else
		{
			mergeHead = list2;
			mergeHead.next = Merge(list1,list2.next);
		}
		return mergeHead;
	}
	
	public static void main(String[] args) {
	}

}
