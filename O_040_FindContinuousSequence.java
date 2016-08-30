package jizhiOffer;

import java.util.ArrayList;

public class O_040_FindContinuousSequence {

	  public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) 
	  {
		 
		  ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer>>();
		  if(sum<=0)
			  return list;
		  int small = 1;
		  int big = 2;
		  int middle = (sum+1)/2;
		  int curSum = small+big;
		  while(small<middle)
		  {
			  if(curSum==sum)
			  {
				  ArrayList<Integer> conSequence = new ArrayList<Integer>();
				  for(int i = small;i<=big;i++)
				  {
					  conSequence.add(i);
				  }
				  list.add(conSequence);
			  }
			  
			  while(curSum>sum&&small<middle)
			  {
				  curSum-=small;
				  small++;
				  if(curSum==sum)
				  {
					  ArrayList<Integer> conSequence = new ArrayList<Integer>();
					  for(int i = small;i<=big;i++)
					  {
						  conSequence.add(i);
					  }
					  list.add(conSequence);
				  }
			  }
			  //curSum<sum;
			  big++;
			  curSum+=big;
		  }
		  return list;
	  }
	  
	public static void main(String[] args) {
		 ArrayList<ArrayList<Integer> > list = new O_040_FindContinuousSequence().FindContinuousSequence(100);
		 for(ArrayList<Integer> sequence:list)
		 {
			 for(int i:sequence)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
	}

}
