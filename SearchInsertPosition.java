/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0

 * Created by yuchaozh on 15/1/30.
 */
public class SearchInsertPosition
{
	public int searchInsert(int[] A, int target)
	{
		// begin from 0 so A.length - 1
		return binarySearch(0, A.length - 1, A, target);
	}

	public int binarySearch(int start, int end, int[]A, int target)
	{
		// condition, start = [mid + 1] and end = [mid - 1], so it will auto expand
		if (start > end)
			return start;
		else
		{
			// get mid. [(start + end) / 2] is wrong
			int mid = start + (end - start) / 2;
			if (target == A[mid])
				return mid;
			else if (target > A[mid])
				return binarySearch(mid + 1, end, A, target);
			else
				return binarySearch(start, mid - 1, A, target);
		}
	}
}
