package ex0448;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}

//	Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
//	some elements appear twice and others appear once.
//
//	Find all the elements of [1, n] inclusive that do not appear in this array.
//
//	Could you do it without extra space and in O(n) runtime? You may assume 
//			the returned list does not count as extra space.

//	Input:
//		[4,3,2,7,8,2,3,1]
//
//		Output:
//		[5,6]
	public static List<Integer> findDisappearedNumbers(int[] nums) {

		int[] ret = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ret[nums[i] - 1] = 1;
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < ret.length; i++) {

			if (ret[i] == 0) {
				list.add(i + 1);
			}

		}

		return list;

	}
}
