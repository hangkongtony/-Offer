package jizhiOffer;

public class O_036_GetNumberOfK {

	
	  public int GetNumberOfK(int [] array , int k) {
	      if(array==null||array.length==0)
	    	  return 0;
	      int first = getFirstIndexOfK(array, k, 0, array.length-1);
	      int last = getLastIndexOfK(array, k, 0, array.length-1);
	      System.out.println(first);
	      System.out.println(last);
	      if(first>-1&&last>-1)
	    	  return last-first+1;
	      return 0;
	    }
	  
	  int getFirstIndexOfK(int[] array,int k,int start,int end)
	  {
		  //not have k
		  if(start>end)
		  {
			  return -1;
		  }
		  int mid = (start+end)/2;
		  // equal k
		  if(array[mid]==k)
		  {
			  //the first index of k
			  if((mid-1>=start&&array[mid-1]!=k)||mid==start)
				  return mid;
			  //not the first index of k
			  return getFirstIndexOfK(array, k, start, mid-1);
		  }
		  //greater than k
		  else if(array[mid]>k)
		  {
			  return getFirstIndexOfK(array, k, start, mid-1);
		  }
		  //less than k
		  else
		  {
			  return getFirstIndexOfK(array, k, mid+1, end);
		  }
	  }
	  
	  int getLastIndexOfK(int[] array,int k,int start,int end)
	  {
		  //not have k
		  if(start>end)
		  {
			  return -1;
		  }
		  int mid = (start+end)/2;
		  // equal k
		  if(array[mid]==k)
		  {
			  //the last index of k
			  if((mid+1<=end&&array[mid+1]!=k)||mid==end)
				  return mid;
			  //not the last index of k
			  return getLastIndexOfK(array, k, mid+1, end);
		  }
		  //greater than k
		  else if(array[mid]>k)
		  {
			  return getLastIndexOfK(array, k, start, mid-1);
		  }
		  //less than k
		  else
		  {
			  return getLastIndexOfK(array, k, mid+1, end);
		  }
	  }
	  
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,3,3,3,4,5};
		int count = new O_036_GetNumberOfK().GetNumberOfK(array, 3);
		System.out.println(count);
	}

}
