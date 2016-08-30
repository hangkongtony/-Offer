package jizhiOffer;

import java.util.HashMap;
import java.util.Map;

public class O_049_duplicate {

	 // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
	static int index = 0;
    public boolean duplicate1(int numbers[],int length,int [] duplication) {
    	for(int i = 0;i<length;i++)
    	{
    		//hashtable
    		if(duplication[numbers[i]]!=0)
    		{
    			index = numbers[i];
    			return true;
    		}
    		else
    		{
    			duplication[numbers[i]] = numbers[i]; 
    		}
    	}
    	return false;
    }
    
    public boolean duplicate2(int numbers[],int length,int [] duplication) {
    	if(numbers==null||length<=0)
    		return false;
    	for(int i =0;i<length;i++)
    	{
    		if(numbers[i]<0||numbers[i]>=length)
    			return false;
    	}
    	for(int i =0;i<length;i++)
    	{
    		while(numbers[i]!=i)
    		{
    			if(numbers[i]==numbers[numbers[i]])
    			{
    				duplication[0] = numbers[i];
    				return true;
    			}
    			int temp = numbers[i];
    			numbers[i] = numbers[numbers[i]];
    			numbers[numbers[i]] = temp;
    		}
    	}
    	return false;
    }
    
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers==null||length<=0)
    		return false;
    	for(int i =0;i<length;i++)
    	{
    		if(numbers[i]<0||numbers[i]>=length)
    			return false;
    	}
    	Map<Integer ,Integer> map = new HashMap<Integer, Integer>();
    	for(int i =0;i<length;i++)
    	{
    		if(map.containsKey(numbers[i]))
    		{
    			duplication[0] = numbers[i];
    			return true;
    		}
    		else
    		{
    			map.put(numbers[i], 1);
    		}
    	}
    	return false;
    }
	public static void main(String[] args) {
		int length = 8;
		int[] numbers = {2,1,3,2,5,4,3,7};
		int[] duplication = new int[1];
		System.out.println(duplication[0]);
		new O_049_duplicate().duplicate(numbers, length, duplication);
		System.out.println(duplication[0]);
	}

}
