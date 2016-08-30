package jizhiOffer;



public class O_035_FindFirstCommonNode {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2)
	  {
		  ListNode common = null;
		  if(pHead1==null||pHead2==null)
		  {
			  return common;
		  }
		 
		  int len1 = getListLength(pHead1);
		  int len2 = getListLength(pHead2);
		  if(len1>len2)
		  {
			  int step = len1-len2;
			  for(int i = 0;i<step;i++)
			  {
				  pHead1 = pHead1.next;
			  }
		  }
		  if(len1<len2)
		  {
			  int step = len2-len1;
			  for(int i = 0;i<step;i++)
			  {
				  pHead2 = pHead2.next;
			  }
		  }
		  while(pHead1!=pHead2)
		  {
			  pHead1=pHead1.next;
			  pHead2=pHead2.next;
		  }
		  // not have common node
		  if(pHead1==null)
		  {
			  return common;
		  }
		  common = pHead1;
		  return common;
		  
	  }
	  
	  int getListLength(ListNode list)
	  {
		  if(list == null)
			  return 0;
		  int len  = 0;
		  while(list!=null)
		  {
			  len++;
			  list = list.next;
		  }
		  return len;
	  }
	public static void main(String[] args) {

	}

}
