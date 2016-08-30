package jizhiOffer;

public class O_044_ReverseSentence {

	  public String ReverseSentence(String str) {
		  if(str==null||str.length()<=0)
			  return str;
	        char[] arr = str.toCharArray();
	        ReverseString(arr, 0, arr.length-1);
	        int i =0;
	        while(i<arr.length&&arr[i]==' ')
	        	i++;
	        int j = arr.length-1;
	        while(j>=0&&arr[j]==' ')
	        	j--;
	        int step = i;
	        for(;i<=j&&step<=j;)
	        {
	        	while(step<j&&arr[step]!=' ')
	        		step++;
	        	if(step==j)
	        	{
	        		ReverseString(arr, i, step);
	        	}
	        	else{
	        		ReverseString(arr, i, step-1);
	        	}
	        	step++;
	        	i = step;
	        }
	        return new String(arr);
	    }
	  
	  public void ReverseString(char[] arr,int start,int end)
	  {
		  if(arr==null||arr.length<=1)
			  return ;
		  char temp;
		  for(int i = start;i<=(start+end)/2;i++)
		  {
			  temp = arr[i];
			  arr[i] = arr[end-i+start];
			  arr[end-i+start] = temp;
		  }
	  }
	public static void main(String[] args) {
		String str = new O_044_ReverseSentence().ReverseSentence("   ");
		System.out.println(str);
	}

}
