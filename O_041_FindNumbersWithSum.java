package jizhiOffer;

import java.util.ArrayList;

public class O_041_FindNumbersWithSum {

	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(array==null||array.length<=1)
			return list;
		int left = 0;
		int right = array.length-1;
		while(left<right)
		{
			if(array[left]+array[right]==sum)
			{
				list.add(array[left]);
				list.add(array[right]);
				return list;
			}
			else if(array[left]+array[right]>sum)
			{
				right--;
			}
			else if(array[left]+array[right]<sum)
			{
				left++;
			}
		}
		return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
