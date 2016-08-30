package jizhiOffer;

public class O_039_FindNumsAppearOnce {

	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	   public void FindNumsAppearOnce(int[] array,int num1[] , int num2[])
	   {
	        if(array==null||array.length<=2)
	        	return ;
	        int resultExclusiveOr  = 0;
	        for(int i = 0;i<array.length;i++)
	        {
	        	resultExclusiveOr ^=array[i];
	        }
	        int numOfRightOne = NumOfRightOne(resultExclusiveOr);
	        for(int i =0;i<array.length;i++)
	        {
	        	if((array[i]&numOfRightOne)==1)
	        	{
	        		num1[0] ^= array[i];
	        	}else
	        	{
	        		num2[0] ^= array[i];
	        	}
	        }
	      
	   }
	   

	private int NumOfRightOne(int resultExclusiveOr) {
		int num = 1;
		while((num&resultExclusiveOr)!=1&&num<=Integer.MAX_VALUE)
		{
			num = num<<1;
		}
		return num;
	}

	public static void main(String[] args) 
	{
		int[] array = new int[]{2,4,3,6,3,2,5,5};
		int[] num1 = new int[]{0};
		int[] num2 = new int[]{0};
		new O_039_FindNumsAppearOnce().FindNumsAppearOnce(array, num1, num2);
		System.out.println(num1[0]+" "+num2[0]);
	}

}
