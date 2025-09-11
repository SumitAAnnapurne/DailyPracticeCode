package arraysProblems;

public class RemoveDuplicateFromSortedArray {
	
	public static void main(String[] args) {
		int a[] = {0,0,1,1,1,2,2,3,3,4};
		int n = a.length;
		System.out.println(removeDup(a, n));
	}
	
	public static int removeDup(int a[], int n) {
		int j = 1;
		for(int i=1; i<=n-1; i++) {
			if(a[i] != a[i-1]) {
				a[j] = a[i];
				j++;
			}
		}
		
		return j;
	}

}
