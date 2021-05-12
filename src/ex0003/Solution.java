package ex0003;

public class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		System.out.println(x.lengthOfLongestSubstring(""));

	}

	public int lengthOfLongestSubstring(String s) {

		if (s.length() == 0) {
			return 0;
		}

		int[] dict = new int[128];

		int res = 0;
		int left = 0;
		int right = 0;

		while (right < s.length()) {
			char r = s.charAt(right);
			dict[r]++;

			while (dict[r] > 1) {
				char l = s.charAt(left);
				dict[l]--;
				left++;
			}

			res = Math.max(res, right - left);

			right++;
		}

		return res + 1;

	}
}
