/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

 */

public class Solution 
{
    // two loop
    // O(n^2)
    // public int maxArea(int[] height) 
    // {
    //     int rst = 0;
    //     if (height == null || height.length < 2)
    //         return rst;
        
    //     for (int i = 1; i < height.length; i++)
    //     {
    //         for (int j = 0; j < i; j++)
    //         {
    //             int tmp = Math.abs((i - j) * Math.min(height[i], height[j]));
    //             rst = Math.max(rst, tmp);
    //         }
    //     }
    //     return rst;
    // }
    
    // one loop
    // O(n)
    public int maxArea(int[] height)
    {
        int rst = 0;
        if (height == null || height.length < 2)
            return rst;
        int left = 0;
        int right = height.length - 1;
        while (left < right)
        {
            int tmp = Math.abs((left - right) * Math.min(height[left], height[right]));
            //rst = Math.max(rst, tmp);
            if (tmp > rst)
                rst = tmp;
            // if left is shorter, the whole container is depend on the shoter one, that is left one.
            // if right move forward, the scope becomes small, and the height does not change. the result becomes smaller.
            // so need to move left and try to find heigher one.
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return rst;
    }
}