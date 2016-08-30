package jizhiOffer;

public class O_012_ReOrderArray {

	   public void reOrderArray(int [] array) {
		   if(array==null||array.length==0)
	            return;
	        int left = 0;
	        int right = array.length-1;
	        int temp;
	        while(left<right)
	        {
	        	if(left<right&&(array[left]&1)==1)
	                left++;
	            if(left<right&&(array[right]&1)==0)
	                right--;
	            if(left<right)
	            {
	            	temp = array[left];
	                array[left] = array[right];
	                array[right] = temp;
	            }
	        }
	    }
	   
	   //不改变相对顺序
	   public void reOrderArray02(int [] array) 
	   {
		   if(array==null|array.length==0)
			   return;
		   int count = 0;
		   int i ;
		   for( i  = 0;i<array.length;i++)
		   {
			   //奇数个数
			   if(array[i]%2==1)
				   count++;
		   }
		  int temp;
		  for( i = 0;i<count;i++)
		  {
			  //偶数
			  if((array[i]&1)==0)
			  {
				  temp = array[i];
				  for(int j = i+1;j<array.length;j++)
				  {
					  array[j-1]=array[j];
				  }
				  i--;
				  array[array.length-1] = temp;
			  }
		  }
	   }
	public static void main(String[] args) {

	}

}
