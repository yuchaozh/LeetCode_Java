/** 
 * solution 1
 * O(n2) runtime, O(1) space
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2)
            return null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

/**
 * solution 2
 * O(n) runtime, O(n) space
 */
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

/**
 * solution 2
 * O(n) runtime, O(n) space
 **/
 public class Solution {
     // key:number, value:index
     public int[] twoSum(int[] nums, int target) {
         // error check
         if (nums.length < 2) 
            return null;
            
         HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
         for (int i = 0; i < nums.length; i++) {
             // find it
             // check key exists in hashmap, use map.containsKey(key)
             if (maps.containsKey(target - nums[i])) {
                 // be careful for the order of result, the num find in hashtable should in the first place
                 // because we will always find target at the second num, the first num is already put into the hashtable
                 // get value from hashmap, use map.get(key)
                 return new int[] {maps.get(target - nums[i]), i + 1};
             } 
             // put key, value to map, use map.put(key, value)
             maps.put(nums[i], i + 1);
         }
         throw new IllegalArgumentException("No two sum solution");
     }
 }

