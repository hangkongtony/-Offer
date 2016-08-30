package jizhiOffer;

public class O_032_GetUglyNumber {

	  public int GetUglyNumber_Solution(int index) 
	  {
		  if(index<=0)
			  return 0;
		  
		  	int count = 0;
		  	int num = 0;
		  	while(count<index)
		  	{
		  		num++;
		  		if(isUglyNumber(num))
		  		{
		  			count++;
		  		}
		  	}
		  	return num;
	  }
	  
	  boolean isUglyNumber(int number)
	  {
		  boolean isUgly = false;
		  while(number%5==0)
		  {
			  number/=5;
		  }
		  while(number%3==0)
		  {
			  number/=3;
		  }
		  while(number%2==0)
		  {
			  number/=2;
		  }
		  if(number == 1)
			  isUgly = true;
		  return isUgly;
	  }
	  
	  public int GetUglyNumber_Solution2(int index) 
	  {
		  if(index<=0)
			  return 0;
		  int[] uglyArr = new int[index];
		  uglyArr[0] = 1;
		  int nextUglyIndex = 1;
		  
		  int IndexMulti2 = 0;
		  int IndexMulti3 = 0;
		  int IndexMulti5 = 0;
		  
		  while(nextUglyIndex<index)
		  {
			  int min = Min(uglyArr[IndexMulti2]*2,uglyArr[IndexMulti3]*3,uglyArr[IndexMulti5]*5);
			  uglyArr[nextUglyIndex] = min;
			  while(uglyArr[IndexMulti2]*2<=min)
				  IndexMulti2++;
			  while(uglyArr[IndexMulti3]*3<=min)
				  IndexMulti3++;
			  while(uglyArr[IndexMulti5]*5<=min)
				  IndexMulti5++;
			  nextUglyIndex++;
		  }
		  int ugly = uglyArr[index-1];
		  uglyArr = null;//let gc do it work
		  return ugly;
	  }
	private int Min(int i, int j, int k) {
		int min = (i<j)?i:j;
		min = (min<k)?min:k;
		return min;
	}

	public static void main(String[] args) {
//		int num = new O_032_GetUglyNumber().GetUglyNumber_Solution(1500);
//		System.out.println(num);
		
	}

}
