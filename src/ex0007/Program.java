package ex0007;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 3, 5, 5, 6, 6, 7, 8, 9, 9 };

		System.out.println(removeDuplicates(nums));

		System.out.println(Arrays.toString(nums));
	}

//	Input: nums = [0,0,1,1,1,2,2,3,3,4]
//			Output: 5, nums = [0,1,2,3,4]
//	Given a sorted array nums, remove the duplicates in-place such that each element appears
//	only once and returns the new length.
//	Do not allocate extra space for another array, you must do this
//	by modifying the input array in-place with O(1) extra memory.

	public static int removeDuplicates(int[] nums) {

		if (nums.length == 1) {
			return 1;
		}

		int i = 0;
		int j = 1;

		while (j < nums.length) {
			while (nums[i] == nums[j]) {

				if (j == nums.length - 1) {
					return ++i;
				}
				j++;

			}

			nums[++i] = nums[j++];
		}

		return ++i;

	}

}
