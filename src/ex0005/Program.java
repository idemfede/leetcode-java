package ex0005;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] nums1 = { 2, 0 };
		int m = 1;
		int[] nums2 = { 1 };
		int n = 1;

//		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//		int m = 3;
//		int[] nums2 = { 2, 5, 6 };
//		int n = 3;

		merge(nums1, m, nums2, n);

		System.out.println(Arrays.toString(nums1));
	}

//	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//	The number of elements initialized in nums1 and nums2 are m and n respectively. 
//	You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
//	Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//	Output: [1,2,2,3,5,6]
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		if (n == 0) {
			return;
		}

		if (m == 0) {
			for (int i = 0; i < nums2.length; i++) {
				nums1[i] = nums2[i];
			}
			return;
		}

		int i = 0;
		int j = 0;
		while (i < nums1.length) {

			boolean eof2 = j == n;
			if (eof2) {
				break;
			}

			boolean eof1 = i == m + j;

			if (!eof1) {
				if (nums1[i] > nums2[j]) {
					for (int x = nums1.length - 1; x > i; x--) {
						nums1[x] = nums1[x - 1];
					}
					nums1[i] = nums2[j];
					j++;
				}
			} else {
				nums1[i] = nums2[j];
				j++;
			}
			i++;

		}

	}

}
