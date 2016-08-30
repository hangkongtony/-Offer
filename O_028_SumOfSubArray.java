package jizhiOffer;

public class O_028_SumOfSubArray {

    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length<=0)
        	return 0;
        int curSum = 0;
        int greatSum = 0x80000000;//the least number
        for(int i =0;i<array.length;i++)
        {
        	if(curSum<=0)
        		curSum = array[i];
        	else
        	{
        		curSum += array[i];
        	}
        	if(curSum>greatSum)
        		greatSum = curSum;
        }
        return greatSum;
    }
    
    public int FindGreatestSumOfSubArray1(int[] array) {
    	   if(array==null||array.length<=0)
           	return 0;
    	int[] arr = new int[array.length];
    	arr[0] = array[0];
    	for(int i =1;i<array.length;i++)
    	{
    		if(arr[i-1]<=0)
    			arr[i] = array[i];
    		else
    		{
    			arr[i] = arr[i-1]+array[i];
    		}
    	}
    	int maxIndex = 0;
    	for(int i = 1;i<arr.length;i++)
    	{
    		if(arr[i]>arr[maxIndex])
    			maxIndex = i;
    	}
    	return arr[maxIndex];
    }
	public static void main(String[] args) {
		System.out.print(0x80000000);
	}

}
