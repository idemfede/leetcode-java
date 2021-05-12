package ex0217;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();

	}

	public boolean containsDuplicate(int[] nums) {

		Set<Integer> data = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			data.add(nums[i]);
		}

		return nums.length != data.size();
	}

}
