/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 "((()))", "(()())", "(())()", "()(())", "()()()"

 * Created by yuchaozh on 15/1/30.
 */
public class GenerateParentheses
{
	public List<String> generateParenthesis(int n)
	{
		ArrayList<String> rst = new ArrayList<String>();
		if (n <= 0)
			return rst;
		getPair(rst, "", n, n);
		return rst;
	}

	public void getPair(ArrayList<String> rst, String s, int left, int right)
	{
		// error case
		if (left > right || left < 0 || right < 0)
			return;
		// correct case
		if (left == 0 && right == 0)
		{
			rst.add(s);
			return;
		}
		getPair(rst, s + "(", left - 1, right);
		getPair(rst, s + ")", left, right - 1);
	}
}
