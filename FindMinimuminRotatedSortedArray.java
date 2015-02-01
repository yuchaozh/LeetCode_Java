/**
 Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.

 You may assume no duplicate exists in the array.

 * Created by yuchaozh on 15/1/30.
 */
public class FindMinimuminRotatedSortedArray
{
	public int rst = 0;
	public int findMin(int[] num)
	{
		// if num = null and num is empty
		if (num == null || num.length == 0)
			return Integer.MIN_VALUE;
		rst = num[0];
		findIt(0, num.length - 1, num);
		return rst;
	}

	public void findIt(int start, int end, int[] num)
	{
		if (start > end)
			return;
		int mid = start + (end - start) / 2;
		//right part is ordered, left part is un-ordered
		if (num[mid] < num[end])
		{
			//get right part min
			rst = Math.min(rst, num[mid]);
			// search left part
			findIt(start, mid - 1, num);
		}
		// (num[start] <= num[mid]), equal belong to left part
		else  // left part is ordered, right part is un-ordered
		{
			//get left part min
			rst = Math.min(rst, num[start]);
			// search right part
			findIt(mid + 1, end, num);
		}

		// if (num[start] <= num[mid])
		// {
		//     rst = Math.min(rst, num[start]);
		//     // search right part
		//     findIt(mid + 1, end, num);
		// }
		// else
		// {
		//     //get right part min
		//     rst = Math.min(rst, num[mid]);
		//     // search left part
		//     findIt(start, mid - 1, num);
		// }
	}
}
