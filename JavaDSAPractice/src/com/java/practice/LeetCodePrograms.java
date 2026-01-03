package com.java.practice;

import java.util.*;

public class LeetCodePrograms {
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target. Input: nums = [2,7,11,15],
	 * target = 9 Output: [0,1]
	 */

	public int[] twoSumProgramBruteForce(int[] input, int target) {
		int[] result = { -1, -1 };
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;

				}
			}
		}
		return result;

	}

	public int[] twoSumProgramOptimized(int[] input, int target) {
		int[] result = { -1, -1 };
		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			int complement = target - input[i];
			if (!hmap.containsKey(complement)) {
				hmap.put(input[i], i);
			} else {
				result[0] = i;
				result[1] = hmap.get(complement);
				return result;
			}

		}

		return result;

	}

	/*
	 * Given a string s, find the length of the longest substring without duplicate
	 * characters. Input: s = "abcabcbb" Output: 3
	 */
	// Concept used: Sliding window, i.e

	public int longestSubstringLength(String input) {
		HashSet<Character> hs = new HashSet<>();
		int maxLength = 0;
		int right = 0;
		int left = 0;
		int length = input.length();

		while (right < length) {
			char c = input.charAt(right);
			if (!hs.contains(c)) {
				hs.add(c);
				right += 1;
				maxLength = Math.max(maxLength, right - left);
			} else {
				hs.remove(c);
				left += 1;

			}

		}

		return maxLength;

	}

	/*
	 * Given a string s, find the the longest substring without duplicate
	 * characters. Input: s = "abcabcbb" Output: abc
	 */
	// Concept used: Sliding window, i.e

	public String longestSubstring(String input) {
		String result = "";
		HashSet<Character> hs = new HashSet<>();
		int right = 0;
		int left = 0;
		int length = input.length();
		int maxLength = 0;
		int startIndex = 0;

		while (right < length) {
			char c = input.charAt(right);
			if (!hs.contains(c)) {
				hs.add(c);
				right += 1;
				if (right - left > maxLength) {

					maxLength = right - left;
					startIndex = left;
				}

			} else {
				hs.remove(input.charAt(left));
				left += 1;

			}

		}
		result = input.substring(startIndex, startIndex + maxLength);

		return result;

	}

	/*
	 * Given an integer x, return true if x is a palindrome, and false otherwise.
	 * Input: x = 121 Output: true
	 */

	public boolean checkPalindrome(int input) {
		boolean result = false;
		int originalNumber = input;
		int reversedNumber = 0;

		while (input > 0) {
			int digit = input % 10;
			reversedNumber = reversedNumber * 10 + digit;
			input = input / 10;

		}
		if (originalNumber == reversedNumber) {

			result = true;
		}

		return result;
	}

	/*
	 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
	 * and M.
	 * 
	 * Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 Given a roman numeral,
	 * convert it to an integer. Input: s = "LVIII" Output: 58
	 */

	public int convertRomanToInteger(String input) throws Exception {
		if (!input.matches("[IVXLCDM]+")) {
			throw new IllegalArgumentException("Invalid Roman numeral");
		}
		int result = 0;
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			int value = hm.get(c);
			if (i < input.length() - 1 && value < hm.get(input.charAt(i + 1))) {
				result = result - value;

			} else {
				result = result + value;
			}

		}

		return result;

	}

	/*
	 * Write a function to find the longest common prefix string amongst an array of
	 * strings.
	 * 
	 * If there is no common prefix, return an empty string "". Input: strs =
	 * ["flower","flow","flight"] Output: "fl"
	 */

	public String longestCommonPrefix(String[] input) {
		String prefix = input[0];

		for (int i = 0; i < input.length; i++) {
			while (!(input[i].indexOf(prefix) == 0)) {
				prefix = prefix.substring(0, prefix.length() - 1);

			}

		}
		if(prefix.isEmpty()) {
			return "";
		}

		return prefix;

	}

}
