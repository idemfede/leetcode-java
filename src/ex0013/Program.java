package ex0013;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2 };
		System.out.println(thirdMax(nums));
	}

//	Given integer array nums, return the third maximum number in this array. 
//	If the third maximum does not exist, return the maximum number.
	public static int thirdMax(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return nums[0] > nums[1] ? nums[0] : nums[1];
		}

		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		int c = Integer.MIN_VALUE;
		int cant = 0;
		boolean hasMin = false;

		for (int x : nums) {

			if (x == Integer.MIN_VALUE) {
				hasMin = true;
				continue;
			}

			if (x == a || x == b || x == c) {
				continue;
			} else {
				cant++;
			}

			if (x > a) {
				c = b;
				b = a;
				a = x;
				continue;
			}

			if (x > b) {
				c = b;
				b = x;
				continue;
			}

			if (x > c) {
				c = x;
				continue;
			}
		}

		cant = hasMin ? cant + 1 : cant;

		return cant >= 3 ? c : a;

	}
}
