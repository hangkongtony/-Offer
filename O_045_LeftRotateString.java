package jizhiOffer;

public class O_045_LeftRotateString {

	  public String LeftRotateString(String str,int n) 
	  {
		  if(str==null||str.length()<=0||n<=0)
			  return str;
		  int removelen = n%str.length();
		  if(removelen==0)
			  return str;
		  else
		  {
			  char[] arr = str.toCharArray();
			  ReverseString(arr, 0, removelen-1);
			  ReverseString(arr, removelen, arr.length-1);
			  ReverseString(arr, 0, arr.length-1);
			  return new String(arr);
		  }
	  }
	  
	  public void ReverseString(char[] arr,int start,int end)
	  {
		  if(arr==null||arr.length<=1)
			  return;
		  char temp;
		  for(int i = start;i<=(start+end)/2;i++)
		  {
			  temp = arr[i];
			  arr[i] = arr[end-i+start];
			  arr[end-i+start] = temp;
		  }
	  }
	public static void main(String[] args) {
		String str = new O_045_LeftRotateString().LeftRotateString("abcdefg", 2);
		System.out.println(str);
	}

}
