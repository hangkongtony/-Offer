
public class FindinDoubleArray001 {

	public static void main(String[] args) {
		int[][] arr = new int[][]
		                 		{
		                 			{1,2,8,9},
		                 			{2,4,9,12},
		                 			{4,7,10,13},
		                 			{6,8,11,15}
		                 		};
		
		boolean found = Find(arr, 7);
		int[][] a = null;
		System.out.println(found);
		System.out.println(Find(a, 0));
	}
		
		/**
		 * 由于题目条件的成立，所以使得这道题可以使用对角线的方法完成，可以从右上角的元素考虑，
		 * 如果目标查找元素小于右上角的元素，那么不可能在右上角元素所在的列，如果目标大于剩余列
		 * 的右上角的元素，那么不可能在该右上角元素所在的行。
		 * @param array
		 * @param target
		 * @return
		 */
	public static boolean Find(int [][] array,int target) {
		boolean found = false;
		outer:while(array!=null)
		{
			int rowLen = array.length;
			int columnLen = array[0].length;
			int row = 0;
			int column = columnLen -1;
			while(array!=null&&row<rowLen&&column>=0)
			{
				if(array[row][column] == target)
				{
					found = true;
					break outer;
				}else if(array[row][column] > target)
				{
					column--;
				}else
				{
					row++;
				}
			}
		}
		return found;
	}
}
