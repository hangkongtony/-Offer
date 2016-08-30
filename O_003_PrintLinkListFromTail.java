package jizhiOffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;



public class O_003_PrintLinkListFromTail {

	static class Linklist
	{
		int val;
		Linklist next = null;
		public Linklist(int val, Linklist next) {
			super();
			this.val = val;
			this.next = next;
		}
		
	}
	
	public static void main(String[] args) {
		Linklist node4 = new Linklist(4, null);
		Linklist node3 = new Linklist(3, node4);
		Linklist node2 = new Linklist(2, node3);
		Linklist root = new Linklist(1, node2);
		
		//ReList(root);
		
		ArrayList<Integer> re = printFromTail(root);
		for(Integer i:re)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		printByStack(root);
	}

	public static  ArrayList<Integer> printFromTail(Linklist root)
	{
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		int count = 0;
		Linklist temp = root;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		
		temp = root;
		int[] arr = new int[count];
		int i = 0;
		while(temp!=null)
		{
			arr[i++] = temp.val;
			temp = temp.next;
		}
		for(i = count-1;i>=0;i--)
		{
			reverse.add(arr[i]);
		}
		return reverse;
	}

	
	//µÝ¹é ±¾ÖÊÊÇ¸öÕ»
	public static void ReList(Linklist root)
	{
		while(root!=null)
		{
			ReList(root.next);
			System.out.print(root.val+" ");
		}
	}
	
	public static void printByStack(Linklist root)
	{
		Stack<Integer> stack = new Stack<Integer>();
		while(root!=null)
		{
			stack.push(root.val);
			root = root.next;
		}
		while(!stack.isEmpty())
		{
			int i = stack.pop();
			System.out.print(i+" ");
		}
	}
}
