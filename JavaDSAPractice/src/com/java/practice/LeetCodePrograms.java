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

}
