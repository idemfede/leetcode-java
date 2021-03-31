package ex0008;

public class Program {

	public static void main(String[] args) {

		int[] nums = { -20, 8, -6, -14, 0, -19, 14, 4 };
		System.out.println(checkIfExist(nums));

	}

//	Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
//	More formally check if there exists two indices i and j such that :
//	i != j
//	0 <= i, j < arr.length
//	arr[i] == 2 * arr[j]
	public static boolean checkIfExist(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] * 2 == arr[j] || arr[j] * 2 == arr[i]) {
					return true;
				}
			}

		}

		return false;
	}

}
