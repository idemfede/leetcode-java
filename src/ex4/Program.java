package ex4;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 };

		duplicateZeros(nums);

		System.out.println(Arrays.toString(nums));
	}

//	Given a fixed length array arr of integers, duplicate each occurrence of zero, 
//	shifting the remaining elements to the right.
//	Note that elements beyond the length of the original array are not written.
//	Do the above modifications to the input array in place, do not return anything from your function.
//
//	Input: [1,0,2,3,0,4,5,0]
//	Output: null
//	Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//	1 <= arr.length <= 10000
//	 0 <= arr[i] <= 9

	public static void duplicateZeros(int[] arr) {

		int index = 0;
		while (index < arr.length) {
			if (arr[index] == 0) {

				for (int j = arr.length - 1; j > index; j--) {
					arr[j] = arr[j - 1];

				}

				index++;
			}
			index++;

		}

	}

}
