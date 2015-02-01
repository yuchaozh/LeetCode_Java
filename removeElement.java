/**
 * Created by yuchaozh on 15/1/29.
 */
public class removeElement
{
	public static int removeElement(int[] A, int elem)
	{
		if (A == null || A.length == 0)
			return 0;

		//i: original array
		//j: final array
		int i = 0, j = 0;
		while (i < A.length)
		{
			if (A[i] != elem)
			{
				A[j] = A[i];
				j++;
			}
			i++;
		}
		for (int z = 0; z < A.length; z++)
			System.out.println(z + " : " + A[z]);
		return j;
	}

	public static void main(String[] args)
	{
		int[] arrays = new int[]{1,2,3,4,5,3,6,7};
		int rst = removeElement(arrays, 3);
		System.out.println("final length: " + rst);
	}
}
