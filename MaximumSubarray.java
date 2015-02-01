/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 the contiguous subarray [4,−1,2,1] has the largest sum = 6.

 click to show more practice.

 More practice:
 If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 We can think this problem as this: if the previous sum are +, which is then useful for the current element, or if it is -, why not start the sub array from current element? We can use an int to store the max sum we have got, just scan the whole array, the result is easily found.

 * Created by yuchaozh on 15/1/28.
 */
public class MaximumSubarray
{
	public int maxSubArray(int[] A)
	{
		int result = Integer.MIN_VALUE;
		int tmp = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++)
		{
			// if the previous result is >= 0, then it is useful for current one
			// else start a new iteration, althought start a new iteration, the previous
			// sum number is used by max
			// there is no situition that 2, -3, 4. we will start from 4 for maximum sum, not 2.
			result = result >= 0 ? (result + A[i]) : A[i];
			tmp = Math.max(result, tmp);
		}
		return tmp;
	}
}
