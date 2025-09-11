package arraysProblems;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println(searchInsert(nums, target));
		// solving through binary search with o(log n)
	}

	public static int searchInsert(int a[], int target) {

		int left = 0;
		int right = a.length - 1; // 3

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (a[mid] == target) {
				return mid;
			} else if (a[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;

	}
}
