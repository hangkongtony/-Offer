package jizhiOffer;

public class O_006_MinOfRotateArray {

	 public int minNumberInRotateArray(int [] array) {
		 //异常处理
		    if(array == null||array.length<=0)
		    {
		    	return 0;
		    }
		    //旋转次数为0
		    if(array[0]<array[array.length-1])
		    {
		    	return array[0];
		    }
		    int left  = 0;
		    int right = array.length -1;
		    int mid;
		    while(left<right-1)
		    {
		    	mid = (left+right)/2;
		    	/*
		    	 * 如果left right mid 下标所指的数相等，只能顺序查找
		    	 */
		    	if(array[left]==array[right]&&array[right]==array[mid])
		    	{
		    		int min = array[left];
		    		for(int i =left+1;i<=right;i++)
		    		{
		    			if(min>array[i])
		    			{
		    				min = array[i];
		    			}
		    		}
		    		return min;
		    	}
		    	if(array[mid]>=array[left])
		    	{
		    		left = mid;
		    	}else if(array[mid]<=array[right])
		    	{
		    		right = mid;
		    	}
		    }
		    return array[right];
	    }
	public static void main(String[] args) {
		O_006_MinOfRotateArray demo = new O_006_MinOfRotateArray();
		int[] arr = {3,4,5,1,2};
		int min = demo.minNumberInRotateArray(arr);
		System.out.println(min);
	}

}
