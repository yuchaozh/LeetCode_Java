/**
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
 */

public class Solution 
{
    // matrix: row, col
    public void rotate(int[][] matrix) 
    {
        int n = matrix[0].length;
        for (int layer = 0; layer < n / 2; layer++)
        {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++)
            {
                // movement (0 ~ n)
                int offset = i - first;
                // top: the fisrt row and i col
                int top = matrix[first][i];
                //left->top
                // top: as previous
                // left:
                // col: always as layer (first)
                // row: last - offset
                matrix[first][i] = matrix[last - offset][first];
                //bottom->left
                // left: as previous
                // bottom:
                // row: always as layer (last)
                // col: from end to begin, so last - offset
                matrix[last - offset][first] = matrix[last][last - offset];
                //right->bottom
                // bottom: as previous
                // right:
                // row: as i
                // col: always last one of layer (last)
                matrix[last][last - offset] = matrix[i][last];
                //top->right
                // right: as previous
                matrix[i][last] = top;
            }
        }
    }
}