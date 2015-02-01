/**
 You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 * Created by yuchaozh on 15/1/30.
 */
public class ClimbingStairs
{
	// recursive
	// public int climbStairs(int n)
	// {
	//     if (n < 2)
	//         return n;
	//     return climbStairs(n - 1) + climbStairs(n - 2);
	// }

	//The easiest idea is a Fibonacci number.
	//f(n) = f(n-1) + f(n-2).
	//The nth stairs is from either n-1th the stair or the n-2th stair.
	public int climbStairs(int n)
	{
		if (n < 2)
			return n;
		int prev = 1;
		int prevprev = 1;
		int current = 0;

		for (int i = 1; i < n; i++)
		{
			current = prev + prevprev;
			prevprev = prev;
			prev = current;
		}
		return current;
	}
}
