package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random r = new Random();
		boolean sorted = false;
		int val;
		int val2;
		int holder;
		int last = -100;
		int len = 0;
		while (!sorted) {
			display.updateDisplay();
			for (int i = 0; i < array.length; i++) {
				if (array[i] > last) {
					len++;
				}
				/*else {
					len = 0;
					i = 0;
				}
				*/
				if (len == array.length) {
					sorted = true;
				}
				last = array[i];
			}
			len = 0;
				val = r.nextInt(array.length);
				val2 = r.nextInt(array.length);
					holder = array[val2];
					array[val2] = array[val];
					array[val] = holder;
			}
		}	
}
