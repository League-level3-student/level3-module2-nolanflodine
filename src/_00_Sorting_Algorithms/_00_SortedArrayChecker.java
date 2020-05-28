package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] ints) {
		boolean sorted = true;
		int val = -2;
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
			System.out.println(val);
			if(ints[i]<val) {
				 sorted = false;
			}
			val = ints[i];
		}
		return sorted;
	}

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] dub) {
		boolean sorted = true;
		double val = -2;
		for (int i = 0; i < dub.length; i++) {
			if(dub[i]<val) {
				sorted = false;
			}
			val = dub[i];
		}
		return sorted;
	}

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	public static boolean charArraySorted(char[] chars) {
		boolean sorted = true;
		char val = ' ';
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]<val) {
				sorted = false;
			}
			val = chars[i];
		}
		return sorted;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	public static boolean stringArraySorted(String[] str) {
		boolean sorted = true;
		char val = ' ';
		for (int i = 0; i < str.length; i++) {
			if(str[i].charAt(0)<val) {
				sorted = false;
			}
			val = str[i].charAt(0);
		}
		return sorted;
	}
}
