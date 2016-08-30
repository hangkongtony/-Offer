package jizhiOffer;

public class O_048_StringToInt {

	//输入是否合法
	boolean isValid = true;
	
	 public int StrToInt(String str) 
	 {
		 boolean isNegative = false;
		 long sum = 0;
		 int begin = 0;
		 if(str!=null&&str!="")
		 {
			 //判断正负
			 char ch = str.charAt(begin);
			 if(ch=='+'||ch=='-')
			 {
				 begin = 1;
				 if(ch=='-')
				 {
					 isNegative = true;
				 }
			 }
			 sum = strToIntCore(str,begin,isNegative); 
			 return (int)sum;
		 }
		 else
		 {
			 isValid = false;
			 return (int)sum;
		 }
	 }
	 
	private long strToIntCore(String str, int begin, boolean isNegative) {
		long sum = 0;
		int flag = isNegative?-1:1;
		int index = begin;
		while(index<str.length())
		{
			char num = str.charAt(index);
			if(num>='0'&&num<='9')
			{
				sum = 10*sum +(num-'0');
				//越界
				if(sum>Integer.MAX_VALUE)
				{
					sum = 0;
					isValid = false;
					break;
				}
			}
			else
			{
				//输入非数字
				sum = 0;
				isValid = false;
				break;
			}
			index++;
		}
		sum *= flag;
		return sum;
	}

	public static void main(String[] args) {
		String str = " ";
		int num = new O_048_StringToInt().StrToInt(str);
		System.out.println(num);
	}

}
