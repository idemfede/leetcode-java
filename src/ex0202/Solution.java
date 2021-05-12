package ex0202;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();

		System.out.println(m.isHappy(19));

	}

	public boolean isHappy(int n) {

		if (n == 1) {
			return true;
		}

		return loop(n, new HashSet<>());

	}

	public boolean loop(int n, Set<Integer> set) {
		if (n == 1) {
			return true;
		}

		if (set.contains(n)) {
			return false;
		}

		set.add(n);

		return loop(sumOfSquares(n), set);
	}

	private int sumOfSquares(int n) {

		int result = 0;

		while (n != 0) {

			result += ((n % 10) * (n % 10));

			n /= 10;
		}

		return result;
	}

}
