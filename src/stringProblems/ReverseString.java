package stringProblems;

public class ReverseString {

	public static void main(String[] args) {
		String s = "annapurne sumit shivli ng";
		// Convert the string to a character array for in-place manipulation.
		char[] c = s.toCharArray();
		int n = s.length();

		// Call the method that reverses the words and print the result.
		System.out.print(reverseWords(c, n));
	}

	public static char[] reverseWords(char s[], int n) {
		// Step 1: Reverse the entire string.
		// This will change "annapurne sumit..." to "gn ilvihs timus enrupanna".
		reverse(s, 0, n - 1);

		// Step 2: Reverse each individual word.
		int start = 0;
		for (int end = 0; end < n; end++) {
			// Find the end of a word (identified by a space or the end of the string).
			if (s[end] == ' ') {
				// Reverse the word from 'start' to 'end - 1'.
				reverse(s, start, end - 1);
				// Move the start index to the beginning of the next word.
				start = end + 1;
			}
		}
		// Step 3: Reverse the last word, as it won't be followed by a space.
		reverse(s, start, n - 1);

		return s;
	}

	public static void reverse(char c[], int left, int right) {
		while (left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;
		}
	}
}
