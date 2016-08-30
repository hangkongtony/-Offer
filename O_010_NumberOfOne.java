package jizhiOffer;

public class O_010_NumberOfOne {

	public static int  NumberOf1(int n) {
        int count = 0;
        int and = 1;
        while(and!=0)
        {
        	if((n&and)!=0)
        	{
        		count++;
        	}
        	and = and<<1;
        }
        return count;
    }
	public static void main(String[] args) {
		int count = NumberOf1(10);
		System.out.println(count);
	}

}
