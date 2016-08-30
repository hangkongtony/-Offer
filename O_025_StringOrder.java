package jizhiOffer;

import java.util.ArrayList;
import java.util.Collections;

public class O_025_StringOrder {

	  public ArrayList<String> Permutation(String str) {
		  ArrayList<String> list = new ArrayList<String>();
	       if(str==null||str.length()<=0)
	    	   return list;
	       char[] arr = str.toCharArray();
	       list = permutation(arr,list,0,arr.length-1);
	       Collections.sort(list);
	       return list;
	    }
	  
	private ArrayList<String> permutation(char[] arr, ArrayList<String> list, int begin, int end) {
		//½áÊøÌõ¼þ
		if(begin==end)
		{
			if(!list.contains(String.valueOf(arr)))
			{
				list.add(new String(arr));
			}
		}
		else
		{
			for(int i = begin;i<=end;i++)
			{
				if(i==begin||arr[begin]!=arr[i])
				{
					swap(arr,begin,i);
					permutation(arr, list, begin+1, end);
					swap(arr,begin,i);
				}
			}
		}
		return list;
	}

	private void swap(char[] arr, int begin, int i) {
		char temp ;
		temp = arr[begin];
		arr[begin] = arr[i];
		arr[i] = temp;
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new O_025_StringOrder().Permutation("abc");
		for(String str:list)
		{
			System.out.print(str+" ");
		}
	}

}
