public class Permutations 
{
    public static ArrayList<ArrayList<Integer>> permute(int[] num) 
    {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if (num == null || num.length < 1)
            return rst;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        permutation(rst, list, num);
        return rst;
    }
    
    public static void permutation(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> list, int[] num)
    {
        if (list.size() == num.length)
        {
            rst.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = 0; i < num.length; i++)
        {
            if (list.contains(num[i]))
                continue;
            list.add(num[i]);
            permutation(rst, list, num);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args)
    {
        int[] num = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> rst = permute(num);
        for (ArrayList i : rst)
        {
            System.out.println("~~~ArrayList: ");
            for (int j = 0; j < i.size(); j++)
            {
                System.out.print(i.get(j));
            }
        }
    }
}