package ex0205;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();
		System.out.println(m.isIsomorphic("badc", "baba"));

	}

	public boolean isIsomorphic(String s, String t) {

		if (!iso(s, t)) {
			return false;
		}

		return iso(t, s);
	}

	public boolean iso(String s, String t) {

		Map<Character, Character> dict = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (!dict.containsKey(s.charAt(i))) {
				dict.put(s.charAt(i), t.charAt(i));
			} else {
				if (dict.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			}

		}

		return true;

	}

}
