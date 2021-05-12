package ex0349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();

		int[] nums1 = { 0, 1, 1 };
		int[] nums2 = { 0, 1, 2 };

		int[] ret = m.intersection(nums1, nums2);

		System.out.println(Arrays.toString(ret));

	}

	public int[] intersection(int[] nums1, int[] nums2) {

		List<Integer> r = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0, j = 0;

		while (i < nums1.length && j < nums2.length) {
			while (j < nums2.length && i < nums1.length && nums1[i] < nums2[j]) {
				i++;
			}
			while (j < nums2.length && i < nums1.length && nums2[j] < nums1[i]) {
				j++;
			}

			if (j < nums2.length && i < nums1.length) {

				int num1 = nums1[i];
				int num2 = nums2[j];

				if (num1 == num2) {
					while (i < nums1.length && num1 == nums1[i]) {
						i++;
					}

					while (j < nums2.length && num2 == nums2[j]) {
						j++;
					}

					r.add(num1);
				}
			}

		}

		int[] array = new int[r.size()];
		for (int k = 0; k < r.size(); k++)
			array[k] = r.get(k);

		return array;

	}

}
