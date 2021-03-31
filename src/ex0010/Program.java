package ex0010;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 1 };
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

//	Given an array nums, write a function to move all 0's to the end of it while 
//	maintaining the relative order of the non-zero elements.
//	Input: [1,0,3,0,12]
//	Output: [1,3,12,0,0]
	public static void moveZeroes(int[] nums) {

		int zeroes = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroes++;
				continue;
			}

			if (nums[i] != 0 && zeroes > 0) {
				nums[i - zeroes] = nums[i];
				nums[i] = 0;
			}

		}

	}

}
