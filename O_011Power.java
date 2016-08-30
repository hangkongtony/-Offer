package jizhiOffer;

public class O_011Power {

    public double Power(double base, int exponent) {
        //´¦ÀíÒì³£ base == 0
    	if(base == 0&&exponent<=0)
    		return 1;
    	if(base == 0&&exponent>0)
    		return 0;
    	//exponent == 0 && base != 0
    	if(exponent == 0)
    		return 1;
    	//
    	int absEx = Math.abs(exponent);
    	double sum = 1;
    	for(int i = 0;i<absEx;i++)
    	{
    		sum *= base;
    	}
    	if(exponent<0)
    	{
    		sum = 1.0/sum;
    	}
    	return sum;
    }
    
    public double Power02(double base, long  exponent) {
    	//signed -> unsigned
    	long  num = exponent&0xffffffff;
    	if(exponent == 0)
    		return 1;
    	if(exponent == 1)
    		return base;
    	double result = Power02(base,exponent>>1);
    	result *=result;
    	if((exponent&1)==1)
    	{
    		result *= base;
    	}
    	return result;
    }
	public static void main(String[] args) {

	}

}
