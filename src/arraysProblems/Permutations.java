package arraysProblems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(permute(nums));

		// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		permuteHelper(nums, 0, res);
		return res;
	}

	private static void permuteHelper(int[] nums, int i, List<List<Integer>> res) {
		if (i == nums.length) {
			List<Integer> permutation = new ArrayList<>();
			for (int num : nums)
				permutation.add(num);
			res.add(permutation);
			return;
		}

		for (int j = i; j < nums.length; j++) {
			swap(nums, i, j);
			permuteHelper(nums, i + 1, res);
			swap(nums, i, j); // backtrack
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}
