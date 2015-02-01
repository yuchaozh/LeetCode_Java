/**
 * Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 * Created by yuchaozh on 15/1/28.
 */
public class RomantoInteger
{
	// 4:IV, 9:IX, 40:XL, 90:XC, 400:CD, 900:CM,
	// 1:I, 10:X, 100:C, 1000:M
	public int romanToInt(String s)
	{
		// s == null, input is null
		// s.length() == 0, input is "", and is better then s.equals("")
		if (s == null || s.length() == 0)
			return 0;

		// create hashmap
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = map.get(s.charAt(s.length() - 1));
		// backward traverse the string
		// here i = s.length() -2, already get the last one and compare the left one with the current one
		for (int i = s.length() - 2; i >= 0; i--)
		{
			// >= then plus XX = 10 + 10 = 20
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
				result += map.get(s.charAt(i));
			else  // < then -, CM
				result -= map.get(s.charAt(i));
		}
		return result;
	}
}
