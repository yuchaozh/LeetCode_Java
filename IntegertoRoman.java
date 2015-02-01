/**
 * Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.
 * Created by yuchaozh on 15/1/30.
 */
public class IntegertoRoman
{
	public String intToRoman(int num)
	{
		// num is negative, return ""
		if (num < 0)
			return "";

		// from large to small
		// and the largest num is 3999
		int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

		int digit = 0;
		StringBuilder rst = new StringBuilder();
		while (num > 0)
		{
			int times = num / nums[digit];
			// deduct current part and re-calculate the num
			num -= nums[digit] * times;
			// times > 0, is important. if times < 1, then is 0, will move to next small digit
			for (; times > 0; times--)
			{
				rst.append(symbols[digit]);
			}
			digit++;
		}
		return rst.toString();
	}
}
