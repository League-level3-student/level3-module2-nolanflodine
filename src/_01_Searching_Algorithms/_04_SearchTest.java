package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[]words1 = {"hello", "hi", "bye"};
		String value = "hello";
		String[]words2 = {"hello", "hi", "bye"};
		String value2 = "hi";
		String[]words3 = {"hello", "hi", "bye"};
		String value3 = "bill";
		assertEquals(_00_LinearSearch.linearSearch(words1, value), 0);
		assertEquals(_00_LinearSearch.linearSearch(words2, value2), 1);
		assertEquals(_00_LinearSearch.linearSearch(words3, value3), -1);

	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[]array1 = {0,1,2,4};
		int start1 = 0;
		int end1 = 3;
		int value1 = 0;
		int[]array2 = {1,5,9};
		int start2 = 0;
		int end2 = 3;
		int value2 = 5;
		int[]array3 = {10,20,30,40,50};
		int start3 = 0;
		int end3 = 4;
		int value3 = 7;
		assertEquals(_01_BinarySearch.binarySearch(array1, start1, end1, value1), 0);
		assertEquals(_01_BinarySearch.binarySearch(array2, start2, end2, value2), 1);
		assertEquals(_01_BinarySearch.binarySearch(array3, start3, end3, value3), -1);

		}
	
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[]array1 = {0,1,2,3};
		int value1 = 0;
		int[]array2 = {1,5,9};
		int value2 = 5;
		int[]array3 = {10,20,30,40,50};
		int value3 = 7;
		assertEquals(_02_InterpolationSearch.interpolationSearch(array1, value1),0);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array2, value2),1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array3, value3),-1);

	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[]array1 = {0,1,2,3};
		int value1 = 0;
		int[]array2 = {1,5,9};
		int value2 = 5;
		int[]array3 = {10,20,30,40,50};
		int value3 = 7;
		assertEquals(_03_ExponentialSearch.exponentialSearch(array1, value1),0);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array2, value2),1);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array3, value3),-1);

	}
}
