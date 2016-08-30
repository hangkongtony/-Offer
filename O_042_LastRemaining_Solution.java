package jizhiOffer;

import java.util.ArrayList;

public class O_042_LastRemaining_Solution {

	 public int LastRemaining_Solution(int n, int m) 
	 {
		 if(n<1||m<1)
			 return -1;
		 ArrayList<Integer> list = new ArrayList<Integer>(n);
		 for(int i =0;i<n;i++)
		 {
			 list.add(i);
		 }
		 int index = 0;
		 while(list.size()>1)
		 {
			 index = (index+m-1)%list.size();
			 list.remove(index);
			 ///index++;
		 }
		 return list.get(0);
	 }
	 
	public static void main(String[] args) {

	}

}
