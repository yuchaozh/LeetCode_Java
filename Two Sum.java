public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1)
            return null;
        // <value, index> 
        // index is the position in array, begin from 0, so need to add 1 when return result
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            // check map contain target value as key
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) + 1, i + 1};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}