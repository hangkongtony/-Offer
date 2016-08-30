package jizhiOffer;

import java.util.Arrays;

public class O_043_isContinuous {

	  public boolean isContinuous(int [] numbers) {
		  if(numbers.length!=5)
			  return false;
		  quickSort(numbers, 0, numbers.length-1);
		  int numOfZero = 0;
		  int numOfBlock = 0;
		  for(int i = 0;i<numbers.length;i++)
		  {
			  if(numbers[i]==0)
				  numOfZero++;
		  }
		  int smallIndex = numOfZero;
		  int bigIndex = smallIndex+1;
		  
		  while(bigIndex<numbers.length)
		  {
			  if(numbers[bigIndex]==numbers[smallIndex])
				  return false;
			  numOfBlock += numbers[bigIndex]-numbers[smallIndex]-1;
			  smallIndex++;
			  bigIndex++;
		  }
		  return numOfZero<numOfBlock?false:true;
	    }
	  
	  void quickSort(int[] arr ,int start,int end)
	  {
		  if(arr==null)
			  return;
		  if(start==end)
			  return;
		  int index = Partition(arr, start, end);
		  if(index>start)
		  {
			  quickSort(arr, start, index-1);
		  }
		  if(index<end)
		  {
			  quickSort(arr, index+1, end);
		  }
	  }
	  
	  int Partition(int[] arr,int start,int end)
	  {
		  if(arr==null)
			  return -1;
		  int small = start-1;
		  int last = arr[end];
		  int temp = 0;
		  while(start<end)
		  {
			  if(arr[start]<last)
			  {
				  small++;
				  if(small!=start)
				  {
					  temp = arr[small];
					  arr[small] = arr[start];
					  arr[start] = temp;
				  }
			  }
			  start++;
		  }
		  small++;
		  temp = arr[small];
		  arr[small] = arr[end];
		  arr[end] = temp;
		  return small;
	  }
	public static void main(String[] args) {
		int[] arr = {2,32,215,55,313,1,54};
		new O_043_isContinuous().quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
