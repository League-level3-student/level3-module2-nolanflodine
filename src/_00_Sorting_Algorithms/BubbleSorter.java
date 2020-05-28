package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int holder;
		int val = -2;
		for(int j = 0; j<array.length; j++) {
		for (int i = 0; i < array.length; i++) {
			if(i<array.length-1) {
			if(array[i]>array[i+1]) {
				holder = array[i];
				array[i] = array[i+1];
				array[i+1] = holder;
				display.updateDisplay();
				}
			}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
