public class Solution {
    public int findKthLargest(int[] nums, int k) {
        // error check
        if (nums.length == 0 || k == 0) {
            return 0;
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               if (o1.equals(o2)) {
                   return 0;
               }
               // minHeap: o1 < o2 ? -1 : 1
               // maxHeap: o1 > ? -1 : 1
               return o1 < o2 ? -1 : 1;
           }
        });
        
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                minHeap.offer(nums[i]);
            } else if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        
        return minHeap.peek();
    }
}