/**
 * Created by yuchaozh on 10/11/15.
 */

public class ValidatePalindrome
{
	public boolean isPalindrome (String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			while (start < end && !Character.isLetterOrDigit(s.charAt(start))) start++;
			while (end > start && !Character.isLetterOrDigit(s.charAt(end))) end--;
			if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
				return false;
			start++;
			end--;
		}
		return true;
	}
}
