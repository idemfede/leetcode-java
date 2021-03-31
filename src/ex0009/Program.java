package ex0009;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8 };
		System.out.println(validMountainArray(nums));

	}

//	Given an array of integers arr, return true if and only if it is a valid mountain array.
//
//			Recall that arr is a mountain array if and only if:
//
//			arr.length >= 3
//			There exists some i with 0 < i < arr.length - 1 such that:
//			arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//			arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

	public static boolean validMountainArray(int[] arr) {
		if (arr.length < 3) {
			return false;
		}

		boolean shouldIncrease = true;
		int j = 0;

		while (j < arr.length - 1) {

			if (shouldIncrease) {

				if (!(arr[j + 1] > arr[j])) {

					if (j == 0 || arr[j + 1] == arr[j]) {
						return false;
					}

					shouldIncrease = false;
				}

			} else {
				if (arr[j + 1] < arr[j]) {
				} else {
					return false;
				}
			}
			j++;

		}

		return !shouldIncrease;
	}

}
