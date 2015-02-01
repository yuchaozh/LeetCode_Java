/**
 * Created by yuchaozh on 15/1/30.
 */
public class MajorityElement
{
	public int majorityElement(int[] num)
	{
		// sort array
		Arrays.sort(num);
		// pick the middle one
		return num[num.length / 2];
	}
}
