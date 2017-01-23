package rmuti.ecp;

import java.util.*;

public class ArrayOperation {

	private int arr[] = new int[10];
	private int arr2[] = new int[10];

	// Constructor Save data to arrays
	public ArrayOperation() {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
		}
	}

	// Method SumArrays
	public int sumArrays() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Method find MaxArrays
	public int maxArrays() {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	// Method copyArray
	public int[] copyArray(int star, int end) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i >= star && i <= end) {
				arr2[j++] = arr[i];
			}
		}
		return arr2;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
}
