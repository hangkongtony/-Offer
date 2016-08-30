package jizhiOffer;

import java.util.ArrayList;

public class O_027_GetLeastNumber {

	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(input==null||k<=0||input.length<k)
			return list;
		int start = 0;
		int end = input.length-1;
		int index = Partition(input,start,end);
		while(index!=k-1)
		{
			if(index>k-1)
			{
				end = index-1;
			}else
			{
				start= index+1;
			}
			index = Partition(input,start,end);
		}
		for(int i = 0;i<k;i++)
		{
			list.add(input[i]);
		}
		return list;
	}
	   
	private int Partition(int[] arr, int start, int end) {
		int small = start-1;
		for(int i = start;i<end;i++)
		{
			if(arr[i]<arr[end])
			{
				small++;
				if(arr[small]!=arr[i])
				{
					swap(arr,i,small);
				}
			}
		}
		small++;
		swap(arr,small,end);
		return small;
	}

	void swap(int[] arr,int index1,int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {4,5,1,6,2,7,3,8};
		ArrayList<Integer> list = new O_027_GetLeastNumber().GetLeastNumbers_Solution(arr, 8);
		for(int i:list)
		{
			System.out.print(i+" ");
		}
	}

}
