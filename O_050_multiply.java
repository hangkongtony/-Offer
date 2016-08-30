package jizhiOffer;

public class O_050_multiply {

	  public int[] multiply1(int[] A) 
	  {
		  if(A==null||A.length<=0)
			  return null;
		  int[] B = new int[A.length];
		  for(int i =0;i<B.length;i++)
		  {
			  B[i] = 1;
			  for(int j =0;j<A.length;j++)
			  {
				  if(j!=i)
				  {
					  B[i] *= A[j];
				  }
			  }
		  }
		  return B;
	  }
	  
	  public int[] multiply(int[] A) 
	  {
		  if(A==null||A.length<=0)
			  return null;
		  int len = A.length;
		  int[] B = new int[len];
		  B[0] =1;
		  for(int i =1;i<len;i++)
		  {
			  B[i] = B[i-1]*A[i-1];
		  }
		  int temp = 1;
		  for(int i = len-2;i>=0;i--)
		  {
			  temp *=A[i+1];
			  B[i] *= temp;
		  }
		  return B;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
