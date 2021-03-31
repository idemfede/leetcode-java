package ex0003;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] nums = { -10000, -9999, -7, -5, 0, 0, 10000 };

		System.out.println(Arrays.toString(findNumbers(nums)));
	}

	public static int[] findNumbers(int[] nums) {

		int[] negativePowers = new int[nums.length];
		int[] positivePowers = new int[nums.length];
		int[] ret = new int[nums.length];

		int firstPositiveOrZero = 0;

		// buscar el cero
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				negativePowers[i] = nums[i] * nums[i];
				firstPositiveOrZero = i + 1;
			} else {
				positivePowers[i] = nums[i] * nums[i];
			}
		}

		if (firstPositiveOrZero == 0) {
			return positivePowers;
		}

		if (firstPositiveOrZero == nums.length) {
			for (int i = 0; i < nums.length; i++) {
				ret[i] = negativePowers[nums.length - 1 - i];
			}
			return ret;
		}

		int i = firstPositiveOrZero;
		int j = firstPositiveOrZero - 1;
		int k = 0;
		while (k < nums.length) {
			if (i >= nums.length) {
				ret[k++] = negativePowers[j];
				j--;
				continue;
			}

			if (j < 0) {
				ret[k++] = positivePowers[i];
				i++;
				continue;
			}

			if (positivePowers[i] > negativePowers[j]) {
				ret[k++] = negativePowers[j];
				j--;
			} else {
				ret[k++] = positivePowers[i];
				i++;
			}
		}

		return ret;

	}

}
