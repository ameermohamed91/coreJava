package in.Ameer.Assignment2;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		Assignment_02_01(); // Array_duplicates
		Assignment_02_01();
	}

	public static void Assignment_02_01() { // Array_duplicates
		Scanner sc = new Scanner(System.in);
		int[] Base_Array;

		System.out.println("Enter the size of the Array:");
		int arr_size = sc.nextInt();
		if (arr_size > 0) {
			Base_Array = new int[arr_size];
			System.out.println("Enter the values to the Array:");
			for (int i = 0; i < arr_size; i++) {
				int arr_val = sc.nextInt();
				Base_Array[i] = arr_val;
			}
			int count = 0;
			for (int i = 0; i < arr_size; i++) {
				int val = Base_Array[i];
				for (int j = i + 1; j < arr_size; j++) {
					if (val == Base_Array[j]) {
						System.out.println("Duplicate Element:" + val);
						count++;
					}
				}
			}
			System.out.println("There are " + count + " duplicate elements.");

		} else {
			System.out.println("Enter the size of the Array greater than 0");
		}

		sc.close();
	}

	
}

class QuickSort {

	public int getPivotIndex(int array[], int low, int high) {

		int pivot = array[high];
		int i = (low - 1);

		// compare elements
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}

		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return (i + 1);
	}

	public void quickSort(int array[], int low, int high) {
		if (low < high) {

			// Step1 to find pivot
			int pivot_index = getPivotIndex(array, low, high);

			// Step2 Loop to left pivot
			quickSort(array, low, pivot_index - 1);

			// Step2 Loop to right pivot
			quickSort(array, pivot_index + 1, high);
		}
	}
}
