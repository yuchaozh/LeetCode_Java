/**
 * A peak element is an element that is greater than its neighbors.

 Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

 The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

 You may imagine that num[-1] = num[n] = -∞.

 For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

 click to show spoilers.

 Note:
 Your solution should be in logarithmic complexity.

 * Created by yuchaozh on 15/1/30.
 */
public class FindPeakElement
{
	// public int findPeakElement(int[] num)
	// {
	//     if (num == null || num.length == 0)
	//         return -1;

	//     int prev = num[0];
	//     for (int i = 1; i < num.length; i++)
	//     {
	//         if (prev > num[i])
	//             return i - 1;
	//         prev = num[i];
	//     }
	//     return num.length - 1;
	// }

	public int rst = -1;
	public int findPeakElement(int[] num)
	{
		if (num == null || num.length == 0)
			return -1;

		bs(0, num.length - 1, num);
		return rst;
	}

	public void bs(int start, int end, int[] num)
    {
        if (start > end || rst != -1){
            return;
        } else {
            int mid = start + (end - start)/2;
            
            // at the right edge
            if (mid == num.length - 1 && num[mid] > num[mid - 1]){
                rst = mid;
                return;
            }
            // at the left edge
            if (mid == 0 && num[mid] > num[mid + 1]){
                rst = mid;
                return;
            }
            // find it
            if (num[mid] > num[mid - 1] && num[mid] > num[mid + 1]){
                rst = mid;
                return;
            } 
            
            bs(start,mid - 1,num);
            bs(mid + 1,end,num);
        }
    }
}
