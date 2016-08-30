package jizhiOffer;

public class O_002_ReplaceSpace {

	public static void main(String[] args) {
		String newArr = replaceSpace(new StringBuffer("hello world"));
		System.out.println(newArr);
	}

	public static String replaceSpace(StringBuffer str)
	{
		String s = str.toString();
		char[] old = s.toCharArray();
		int spaceCount = spaceCount(s);
		int newLen = spaceCount*2 + s.length();
		char[] newArr = new char[newLen];
		int j = 0;
		for(int i =0;i<s.length();i++)
		{
			if(old[i] == ' ')
			{
				newArr[j++] = '%';
				newArr[j++] = '2';
				newArr[j++] = '0';
			}
			else
			{
				newArr[j++] = old[i];
			}
		}
		return new String(newArr);
	}
	
	private static int spaceCount(String s)
	{
		int count = 0;
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				count++;
		}
		return count;
	}
}
