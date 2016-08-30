package jizhiOffer;

public class O_013_NumerFromTail {
	
	static  class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	    
	}
    public static  ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null||k<=0)
    		return null;
    	ListNode index1 = head;
    	ListNode index2 = head;
    	for(int i = 1;i<k;i++)
    	{
    		index1 = index1.next;
    		if(index1==null)
    			return null;
    	}
    	while(index1.next!=null)
    	{
    		index1 = index1.next;
    		index2 = index2.next;
    	}
		return index2;
    	
    }
	public static void main(String[] args) {
		
	}
}
