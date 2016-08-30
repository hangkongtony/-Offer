package jizhiOffer;

import java.util.Arrays;
import java.util.Comparator;

public class O_031_PrintMinNumberofArray {

	   public String PrintMinNumber(int [] numbers) {
		   	if(numbers == null||numbers.length<=0)
		   		return "";
		   	StringBuilder builder = new StringBuilder();
		   	String[] arr = new String[numbers.length];
		   	int index = 0;
		   	for(int i:numbers)
		   	{
		   		arr[index++] = i+"";
		   	}
//		   	Arrays.sort(arr, new Comparator<String>() {
//
//				@Override
//				public int compare(String o1, String o2) {
//					return (o1+o2).compareTo(o2+o1);
//				}
//			});
		   	
		   	mySort(arr, new myComparator<String>() {
				
				@Override
				public int compare(String o1, String o2) {
					return (o1+o2).compareTo(o2+o1);
				}
			});
		   	for(String str:arr)
		   	{
		   		builder.append(str);
		   	}
		   	return builder.toString();
	    }
	   
	   void mySort(String[] arr ,myComparator<String> myComparator)
	   {
		   String temp;
		   for(int i =arr.length-1;i>=0;i--)
		   {
			   for(int j = 0;j<i;j++)
			   {
				   //arr[j]>arr[j+1]
				   if(myComparator.compare(arr[j], arr[j+1])>0)
				   {
					   temp = arr[j];
					   arr[j] = arr[j+1];
					   arr[j+1] = temp;
				   }
			   }
		   }
	   }
	   
	   interface myComparator<T>
	   {
		   /**
		    * 
		    * @param o1
		    * @param o2
		    * @return 1:o1>o2
		    */
		   int compare(T o1,T o2);
	   }
	public static void main(String[] args) {
		int[] num = {1,3,2,5,3};
		String str = new O_031_PrintMinNumberofArray().PrintMinNumber(num);
		System.out.println(str);
	}

}
