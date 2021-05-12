package ex0454;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

//		int[] nums1 = { 1, 2 };
//		int[] nums2 = { -2, -1 };
//		int[] nums3 = { -1, 2 };
//		int[] nums4 = { 0, 2 };

		int[] nums1 = {};
		int[] nums2 = {};
		int[] nums3 = {};
		int[] nums4 = {};

		System.out.println(x.fourSumCount(nums1, nums2, nums3, nums4));
	}

	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

		Map<Integer, Integer> dict = new HashMap<>();

		int counter = 0;

		for (int i = 0; i < nums1.length; i++) {

			for (int j = 0; j < nums1.length; j++) {

				dict.put(nums1[i] + nums2[j], dict.getOrDefault(nums1[i] + nums2[j], 0) + 1);

			}
		}

		for (int i = 0; i < nums1.length; i++) {

			for (int j = 0; j < nums1.length; j++) {

				counter += dict.getOrDefault(-1 * (nums3[i] * nums4[j]), 0);

			}
		}

		return counter;

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
