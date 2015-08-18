/**
 * solution 1:
 * store all possible pair sums into a hash table.
 * add-O(n) runtime, find-O(1) runtime, O(n2) space
 * 1, 2, 3, 4, 5
 * for 1 possible value is 1+2, 1+3, 1+4, 1+5
 * for 2 possible value is 2+3, 2+4, 2+5
 * for 3 possible value is 3+4, 3+5
 * .....
 * so add is O(n) runtime and space is O(n2)
 */

/**
 * solution 2:
 * use sorted array.
 * use modified binary search for add, and use two points to find.
 * add-O(log n) runtime, find-(n) rumtime, O(n) space
 */

/**
 * solution 3:
 * use hashmap <value, counts>
 * add-O(1) runtime, find-O(n) runtime, O(n) space
 * make sure you are able to handle duplicates correctly.
 */

// solution 3:
public class TwoSum{

	// <value, counts>
	private HashMap<Integer, Integer> table = new HashMap<>();

	public void add(int input){
		int count = table.containsKey(input) ? table.get(input) : 0;
		table.put(input, count + 1)；
	}

	public boolean find(int val){
		for (Map.Entry<Integer, Integer> entry : table.entrySet()){
			int num = entry.getKey();
			int y = val - num;
			if (y == num){
				// for duplicates, ensure there are at least two individual numbers
				if (entry.getValue() >= 2) return true;
			} else if (table.containsKey(y)){
				return true;
			}
		}
		return false;
	}
}