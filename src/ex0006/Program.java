package ex0006;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int val = 2;

		System.out.println(removeElement(nums, val));

		System.out.println(Arrays.toString(nums));
	}

// Given an array nums and a value val, remove all instances of that value in-place and return the new length.
// Do not allocate extra space for another array, you must do this by modifying the input 
//	array in-place with O(1) extra memory.
// The order of elements can be changed. It doesn't matter what you leave beyond the new length.

	public static int removeElement(int[] nums, int val) {

		int i = 0;
		int j = nums.length - 1;

		while (i <= j) {

			while (nums[i] == val) {

				if (j == i) {
					return j;
				}
				if (nums[j] != val) {
					nums[i] = nums[j];
				}
				j--;
			}
			i++;
		}

		return i;

	}

}
