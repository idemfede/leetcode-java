package ex0136;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();

	}

	public int singleNumber(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor ^= nums[i];
		}

		return xor;
	}

}
