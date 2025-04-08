package session_04;

import java.util.Arrays;

public class ArrayMethodsEx {

	public static void main(String[] args) {
		
		//1.Filling Arrays
		int[] arr = new int[5];
		/**
		 * syntax
		 * fill(arraName, fill-value);
		 */
		Arrays.fill(arr, 1); //Fills the entire array with 1
		
		System.out.println("----Filling Single value for enitre array----");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----Filling the value from certain given index----");
		
		/**
		 * syntax:
		 * fill(arrayName, sourceIndex, destinationIndex, value-to-be-fill)
		 */
		Arrays.fill(arr, 1, 4, 2); //Fills elements from index 1 to 3 with 2
		
		System.out.println(Arrays.toString(arr));
		
		//2.Sorting
		int[] numbers = {8,5,2,4,7};
		
		System.out.println("----Sorting an array elements----");
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		/**
		 * After sorting only can do the binary search
		 */
		
		//3.Binary Search
		System.out.println("----Binary Search----");
		
		int index = Arrays.binarySearch(numbers, 5);
		System.out.println(index);
		
		//4.Copying Arrays
		System.out.println("----Copying Arrays----");
		
		int[] original = {1, 2, 3, 4};
		System.out.println("Original arrays: "+Arrays.toString(original));
		
		int[] copy = Arrays.copyOf(original, original.length); //create copy of the array
		System.out.println("Copying original elements: "+Arrays.toString(copy));
		
		//4.1. Copying Arrays using range
		int[] copyRange = Arrays.copyOfRange(original, 1, 3);
		System.out.println("Copying Original elements using range: "+Arrays.toString(copyRange));
		
		
		//5.Comparing Arrays
		int[] arr1 = {5, 6, 7};
		int[] arr2 = {5, 6, 7, 8};
		System.out.println("----Comparing two Array elements----");
		
		boolean cmpr = Arrays.equals(arr1, arr2);
		System.out.println("After comaparing: "+cmpr);
		
		
		//6.Cloning Arrays
		int[] arr3 = {9,8,7,6};
		int[] clone = arr3.clone();
		System.out.println("After Cloning: "+Arrays.toString(clone));
		
		
		//7.Length of an Array
		int[] arr4 = {25, 36, 45, 78, 66};
		System.out.println("Array length: "+arr4.length);
		
		
	}
}
