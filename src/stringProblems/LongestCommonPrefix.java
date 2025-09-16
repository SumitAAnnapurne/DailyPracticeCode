package stringProblems;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String str[] = { "flower", "flow", "floder" };
		// int n = str.length;
		System.out.println(longestCommonPrefix(str));

	}

	public static String longestCommonPrefix(String[] s) {

		String pref = s[0]; // flower
		int prefLen = pref.length(); // 6

		for (int i = 1; i < s.length; i++) {
			String s1 = s[i]; // flow 
			while (prefLen > s1.length() || 
					!pref.equals(s1.substring(0, prefLen))) {
				prefLen--;
				if (prefLen == 0) {
					return "";
				}

				pref = pref.substring(0, prefLen);

			}

		}
		return pref;

	}

}
