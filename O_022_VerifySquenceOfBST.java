package jizhiOffer;

public class O_022_VerifySquenceOfBST {

	   public static boolean VerifySquenceOfBST(int [] sequence) {
	        if(sequence == null||sequence.length==0)
	        	return false;
	        int rootVal = sequence[sequence.length-1];
	        int len  =sequence.length;
	        int i =0;
	        //left tree last index
	        for(;i<len-1;i++)
	        {
	        	if(sequence[i]>rootVal)
	        		break;
	        }
	        //copy left subTree
	        int[] leftTree = new int[i];
	        System.arraycopy(sequence, 0,leftTree, 0, i);
	        //arrayCopy(sequence, 0, leftTree, 0, i);
	        // judge right subTree
	        int j = i;
	        for(;j<len-1;j++)
	        {
	        	if(sequence[j]<rootVal)
	        		return false;
	        }
	        //copy right subTree
	        int[] rightTree = new int[len-i-1];
	        System.arraycopy(sequence, i,rightTree, 0, len-1-i);
	       // arrayCopy(sequence, i, rightTree, 0, len-i-1);
	        boolean leftValue = true;
	        if(i>0)
	        {
	        	leftValue = VerifySquenceOfBST(leftTree);
	        }
	        boolean rightValue = true;
	        if(i<len-1)
	        {
	        	rightValue = VerifySquenceOfBST(rightTree);
	        }
	        return leftValue&&rightValue;
	}
	   
	  public static void arrayCopy(int[] src,int srcPo,int[] des,int desPo,int length)
	  {
		  int j = 0;
		  for(int i = srcPo;i<srcPo+length;i++)
		  {
			  des[j++] = src[i];
		  }
	  }
	public static void main(String[] args) {
		int[] a = new int[]{4,8,6,12,16,14,10};
		System.out.println(VerifySquenceOfBST(a));
		int[] des = new int[4];
		arrayCopy(a, 1, des, 0, 4);
		for(int i:des)
		{
			System.out.print(i+" ");
		}
	}

}
