/**
 Given an array of integers, every element appears three times except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 * Created by yuchaozh on 15/1/30.
 */
public class SingleNumberII
{
	public int singleNumber(int[] A)
	{
		// null or A[] is empty
		if (A == null || A.length == 0)
			return -1;

		int[] bits = new int[32];
		int rst = 0;
		for (int i = 0; i < 32; i++)
		{
			for (int j = 0; j < A.length; j++)
			{
				bits[i] += A[j] >> i & 1;
			}
			rst |= bits[i] % 3 << i;
		}
		return rst;
	}
}
