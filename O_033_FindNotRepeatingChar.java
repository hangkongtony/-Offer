package jizhiOffer;

public class O_033_FindNotRepeatingChar {

	 public int FirstNotRepeatingChar(String str) 
	 {
		 if(str==null||str.length()<=0)
			 return -1;
		 int[] charCount = new int[256];
		 char[] arr = str.toCharArray();
		 for(char ch :arr)
		 {
			 //以其ascII码值作为下标
			 charCount[ch]++;
		 }
		 int i;
		 for( i = 0;i<arr.length;i++)
		 {
			 if(charCount[arr[i]]==1)
				 break;
		 }
		 if(i==arr.length)
			 return -1;
		 return i;
	 }
	 
	 public int FirstNotRepeatingChar2(String str) 
	 {
		 if(str==null||str.length()<=0)
			 return -1;
		 char[] arr = str.toCharArray();
		 int len = arr.length;
		 int index = 0;
		 for(;index<len;index++)
		 {
			 int j;
			 for( j= 0;j<len;j++)
			 {
				 if(index!=j&&arr[index]==arr[j])
					 break;
			 }
			 if(j==len)
				 return index;
		 }
		 return -1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
