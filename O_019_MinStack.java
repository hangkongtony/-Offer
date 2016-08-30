package jizhiOffer;
import java.util.Stack;

public class O_019_MinStack {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
		public void push(int node) 
		{
			stack1.push(node);
			if(stack2.isEmpty())
			{
				stack2.push(node);
			}
			else
			{
				if(stack2.peek()<=node)
				{
					stack2.push(stack2.peek());
				}
				else
				{
					stack2.push(node);
				}
			}
	    }
	    
	    public void pop() {
	        while(!stack1.isEmpty())
	        {
	        	stack1.pop();
	        	stack2.pop();
	        }
	    }
	    
	    public int top() {
	    	if(!stack1.isEmpty())
	    	{
	    		 return stack1.peek();
	    	}
	       return -1;
	    }
	    
	    public int min() {
	    	if(!stack1.isEmpty())
	    	{
	    		 return stack2.peek();
	    	}
	       return -1;
	    }
	
	public static void main(String[] args) {
		O_019_MinStack demo = new O_019_MinStack();
		demo.push(4);
		demo.push(3);
		System.out.println(demo.min());
		demo.push(5);
		System.out.println(demo.min());
		demo.push(2);
		System.out.println(demo.min());
	}

}
