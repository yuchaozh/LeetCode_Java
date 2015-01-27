/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Thoughts
 * The key to solve this problem is bit manipulation. XOR will return 1 only on two different bits.
 * So if two numbers are the same, XOR will return 0. Finally only one number left.
 *
 * Created by yuchaozh on 15/1/26.
 */
public class SingleNumber
{
	public int singleNumber(int[] A)
	{
		if (A == null || A.length == 0)
		{
			return -1;
		}
		int rst = 0;
		for (int i = 0; i < A.length; i++)
		{
			rst ^= A[i];
		}
		return rst;
	}
}
