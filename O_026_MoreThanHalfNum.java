package jizhiOffer;

public class O_026_MoreThanHalfNum {

	  public int MoreThanHalfNum_Solution(int [] array) {
		  //不合法反回0
	        if(array==null||array.length<=0)
	        	return 0;
	        
	        int middle = array.length>>1;
	        int start = 0;
	        int end = array.length-1;
	        int index = Partition(array,start,end);
	        while(index!=middle)
	        {
	        	if(index>middle)
	        	{
	        		end = index-1;
	        	}else
	        	{
	        		start = index+1;
	        	}
	        	index = Partition(array,start,end);
	        }
	        int value = array[index];
	        //不合法反回0
	        if(!checkMoreThanHalf(value,array))
	        	return 0;
	        return value;
	    }
	  private boolean checkMoreThanHalf(int value, int[] array) {
		  int count = 0;
		  for(int i =0;i<array.length;i++)
		  {
			  if(array[i]==value)
				  count++;
		  }
		  if(count*2>array.length)
			  return true;
		  else
			  return false;
	}
	//把数组分成两部分，左边小于array[end],右边大于aary[end]
	private int Partition(int[] array, int start, int end) 
	{
		int small = start-1;
		int temp = 0;
		for(int index =start;index<end;index++)
		{
			if(array[index]<array[end])
			{
				small++;
				if(small!=index)
				{
					swap(array, small, index);
				}
			}
		}
		small++;
		swap(array, small, end);
		return small;
	}
	
	void swap(int[] arr,int index1,int index2)
	{
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void main(String[] args) {

	}

}
