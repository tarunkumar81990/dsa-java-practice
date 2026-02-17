package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSAConcepts {

// Linear Search

	/*
	 * Linear search is a simple searching technique where each element in a list or
	 * array is checked one by one in sequence until: The target element is found,
	 * or The list ends (element not found).
	 */
	/*
	 * Time Complexity Best case: O(1) (found at first position) Worst case: O(n)
	 * (found at last or not present)
	 */

	// Q: Search the target element in an array and return element, otherwise return
	// -1

	public int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int num : arr) {
			if (num == target) {
				return num;
			}
		}

		return -1;

	}

	// Q: Find the minimum number in an array

	public int findMinimumNumber(int[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array is Empty");
		}
		int min = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}

		return min;
	}

	// Q: Search the target element in 2D array and return element, otherwise return
	// -1;

	public int search2DArray(int[][] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j <= arr[i].length; i++) {
				if (arr[i][j] == target) {
					return arr[i][j];
				}
			}

		}

		return -1;
	}

	// Q: find all the even digit numbers in array

	public List<Integer> findEvenDigit(int[] arr) {
		List<Integer> evenDigit = new ArrayList<>();

		for (int num : arr) {
			int i = 0;
			while (num > 0) {
				num = num / 10;
				i += 1;
			}
			if (i / 2 == 0) {
				evenDigit.add(num);
			}
		}
		return evenDigit;
	}

	/*
	 * Binary Search
	 * 
	 * Binary Search is a searching technique used to find a specific element in a
	 * sorted collection efficiently. Instead of checking elements one by one like
	 * linear search, binary search reduces the search space by half in every step,
	 * making it much faster for large datasets.
	 * 
	 * The algorithm works by comparing the target value with the middle element of
	 * the array. If the middle element matches the target, the search is complete.
	 * If the target is smaller, the algorithm continues searching in the left half
	 * of the array. If the target is larger, it searches in the right half. This
	 * process continues until the element is found or the search space becomes
	 * empty.
	 */
	/*
	 * Time Complexity: O(log n)
	 * 
	 * Space Complexity: O(1) (iterative version)
	 */
	// Q: Find the number in sorted array using binary search
	public int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}
	

	
	// Q: Find the number in sorted array using binary search(OrderAgnostic)
	public int binarySearchOrderAgnostic(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAscending=arr[start]<arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if(isAscending) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				} else {
					return mid;
				}
				
			}else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else if (target < arr[mid]) {
					start = mid + 1;
				} else {
					return mid;
				}
				
				
			}
			

		}

		return -1;

	}
}
