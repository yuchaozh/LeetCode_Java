/**
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 *
 * Created by yuchaozh on 15/1/27.
 */
public class ExcelSheetColumnNumber
{
	// BA -> 2*26 + 1 -> 53
	// AAA -> 26*26 + 26 + 1
	public int titleToNumber(String s)
	{
		if (s.equals(""))
			return 0;
		int result = 0;
		for (int i = 0; i < s.length() - 1; i++)
		{
			// xishu, zhishu
			result = result +  (s.charAt(i) - 'A' + 1) * (int)(Math.pow(26, s.length() - i - 1));
		}
		// the last digit
		result = result + s.charAt(s.length() - 1) - 'A' + 1;
		return result;
	}

}
