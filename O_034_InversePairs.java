package jizhiOffer;

public class O_034_InversePairs {

	   public int InversePairs(int [] array) {
		   if(array==null||array.length<=0)
			   return 0;
		   int length = array.length;
		   int[] copy = new int[length];
		   for(int i = 0;i<length;i++)
		   {
			   copy[i] = array[i];
		   }
		   int count = InversePairsCore(array,copy,0,length-1);
		   return count;
	    }
	   
	private int InversePairsCore(int[] array, int[] copy, int start, int end) {
		if(start==end)
		{
			copy[end] = array[end];
			return 0;
		}
		int len = (end-start)/2;
		//使array的left and right 都有序
		int left = InversePairsCore(copy, array, start, start+len);
		int right = InversePairsCore(copy, array, start+len+1, end);
		
		int i = start+len;
		int j = end;
		int indexCopy = end;
		int count = 0;
		while(i>=start&&j>=start+len+1)
		{
			if(array[i]>array[j])
			{
				copy[indexCopy--] = array[i--];
				count += j-(start+len);
			}else
			{
				copy[indexCopy--] = array[j--];
			}
		}
		for(;i>=start;i--)
		{
			copy[indexCopy--] = array[i];
		}
		for(;j>=start+len+1;j--)
		{
			copy[indexCopy--] = array[j];
		}
		
		return left+right+count;
	}

	public static void main(String[] args) {
		int[] array = new int[]{7,5,6,4}; 
		int count = new O_034_InversePairs().InversePairs(array);
		System.out.println(count);
		
	}

}
