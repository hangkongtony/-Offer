package jizhiOffer;
import java.util.Stack;

public class O_020_PopOrder {

	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      boolean result = true;
	      if(pushA==null||popA==null||pushA.length!=popA.length||pushA.length==0)
	    	  return false;
	      Stack<Integer> stack = new Stack<Integer>();
	      int j = 0;
	      for(int i = 0;i<popA.length;i++)
	      {
	    	 if(!stack.isEmpty())
	    	 {
	    		 if(popA[i]==stack.peek())
	    		 {
	    			 stack.pop();
	    			 continue;
	    		 }
	    	 }
	    	  if(j>=pushA.length)
    		  {
    			  result = false;
    			  return result;
    		  }
	    	  while(popA[i]!=pushA[j])
	    	  {
	    		  stack.push(pushA[j++]);
	    		  if(j>=pushA.length)
	    		  {
	    			  result = false;
	    			  return result;
	    		  }
	    	  }
	    	  j++;
	      }
	      return result;
    }
	public static void main(String[] args) {

	}

}
