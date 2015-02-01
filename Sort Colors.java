/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

click to show follow up.

Follow up:
A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

Could you come up with an one-pass algorithm using only constant space?
 */

public class Solution 
{
    // public void sortColors(int[] A) 
    // {
    //     if (A == null || A.length == 0)
    //         return;
        
    //     // use three variable to record counts of each color
    //     int redCounter = 0;
    //     int blueCounter = 0;
    //     int whiteCounter = 0;
        
    //     for (int i = 0; i < A.length; i++)
    //     {
    //         if (A[i] == 0)
    //             redCounter++;
    //         else if (A[i] == 1)
    //             whiteCounter++;
    //         else
    //             blueCounter++;
    //     }
        
    //     // re-build the array
    //     int cursor = 0;
    //     for (; cursor < redCounter; cursor++)
    //     {
    //         A[cursor] = 0;
    //     }
    //     for (; cursor < whiteCounter + redCounter; cursor++)
    //     {
    //         A[cursor] = 1;
    //     }
    //     for (; cursor < blueCounter + whiteCounter + redCounter; cursor++)
    //     {
    //         A[cursor] = 2;
    //     }
    // }
    
    public void swap(int[] A, int i, int j)
    {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    public void sortColors(int[] A)
    {
        int red = 0;
        int blue = A.length - 1;
        int i = 0;
        while (i <= blue)
        {
            // if red, move forward
            if (A[i] == 0)
            {
                swap(A, i, red);
                red++;
                i++;
            }
            // if blue, move backward
            else if (A[i] == 2)
            {
                swap(A, i, blue);
                blue--;
                // do not i++ here
            }
            // if white, keep stay in same place
            else
                i++;
        }
    }
}