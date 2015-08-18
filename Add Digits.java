/** find the largest num which can be divided by 9
 *  use the original num - the small largest num to find out the position
 *  say, the original num is 14, so the smaller largest num is 9, 14 - 9 = 5.
 *  the position is the add digit.
 **/
public class Solution {
    public int addDigits(int num) {
        // if num < 10, just output the num
        if (num < 10) {
            return num;
        }
        // else
        return num - 9 * ((num - 1) / 9);
    }
}