package jizhiOffer;

public class O_007_FobinacciTest {

	  public static int Fibonacci(int n) {
		  int a = 0;
		  int b = 1;
		  int c = 0;
		  if(n==0)
			  return 0;
		  if(n==1)
			  return 1;
		  else
		  {
			  for(int i =2;i<=n;i++)
			  {
				  c = a + b;
				  a = b;
				  b = c;
			  }
		  }
		  return c;
	    }
	public static void main(String[] args) {

	}

}
