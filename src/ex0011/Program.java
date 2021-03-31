package ex0011;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] nums = { 17, 18, 5, 4, 6, 1 };
		System.out.println(Arrays.toString(replaceElements(nums)));

	}

	// Given an array arr, replace every element in that array with the greatest
	// element
//	among the elements to its right, and replace the last element with -1.
//	After doing so, return the array.
//	Input: arr = [17,18,5,4,6,1]
//			Output: [18,6,6,6,1,-1]
	public static int[] replaceElements(int[] arr) {

		int currentMax = -1;
		int[] res = new int[arr.length];
		for (int j = arr.length - 1; j > -1; j--) {
			System.out.println(j);
			res[j] = currentMax;
			if (arr[j] > currentMax) {
				currentMax = arr[j];
			}
		}
		return res;

	}

}
