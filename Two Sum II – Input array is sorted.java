
// version 1: two pointers
// O(n) runtime, O(1) space
public class Solution{
	public int[] twoSum(int[] numbers, int target){
		int left = 0;
		int right = numbers.length - 1;
		while (left < right){
			int sum = numbers[left] + numbers[right];
			if (sum < target){
				left++;
			} else if (sum > target){
				right--;
			} else {
				return new int[]{left + 1, right + 1};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}


// version2: binary search
public class Solution{
	public int[] towSum(int[] numbers, int target){
		for (int i = 0; i < numbers.length; i++){
			int indexOfTarget = bsearch(numbers, target - numbers[i], i + 1);
			if (indexOfTarget != -1){
				return new int[]{i + 1, indexOfTarget + 1};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static int bsearch(int[] numbers, int target, int start){
		int begin = start;
		int end = numbers.length - 1;
		while (begin < end){
			int middle = (begin + end) / 2;
			if (numbers[middle] < target){
				begin = middle + 1;
			} else {
				end = middle;
			}
		}
		if (begin == rihgt && numbers[begin] == target) ? begin : -1;
	}
}