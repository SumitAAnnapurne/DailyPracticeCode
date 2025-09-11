package arraysProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(a, target)));

	}

	public static int[] twoSum(int a[], int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			int complement = target - a[i];
			
			if(map.containsKey(complement)) {
				return new int [] {map.get(complement) , i};
			}
			else {
				map.put(a[i], i);
			}
		}

		return new int[] {};

	}

}
