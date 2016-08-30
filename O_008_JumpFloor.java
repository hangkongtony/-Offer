package jizhiOffer;

public class O_008_JumpFloor {

	 public int JumpFloor(int target) {
		 	if(target == 1)
		 		return 1;
		 	if(target == 2)
		 		return 2;
		 	else
		 	{
		 		return JumpFloor(target-1)+JumpFloor(target-2);
		 	}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
