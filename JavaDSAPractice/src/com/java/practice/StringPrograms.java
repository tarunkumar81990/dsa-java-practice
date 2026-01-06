package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringPrograms {

	// Reverse a string without using StringBuilder.reverse()

	public String reverseStringWithoutBuidler(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);

		}

		return reverse;

	}

	public String reverseStringWithBuidler(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}
		StringBuilder builder = new StringBuilder(input);
		builder.reverse();

		return builder.toString();

	}

	// Check if two strings are anagrams

	public boolean checkAnagram(String input1, String input2) {
		boolean result = false;
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		for (Character ch : input1.toCharArray()) {
			hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);

		}

		for (Character ch : input2.toCharArray()) {
			hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);

		}

		if (hm1.equals(hm2)) {
			result = true;
		}

		return result;

	}

	// Find frequency of the letters in a string
	public void frequencyOfLetters(String input) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (Character ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	// Find the first non-repeating character in a string

	public void firstNonRepeatingChar(String input) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (Character ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

	// Implement basic string expansion (e.g.a2b4c5-> "aabcccccaaa")

	public void StringExpansion(String input) {
		StringBuilder builder = new StringBuilder();
		String letters = "";
		String count = "";
		for (char ch : input.toCharArray()) {

			if (Character.isLetter(ch)) {
				if (!count.isEmpty()) {
					int c = Integer.parseInt(count);
					for (int i = 0; i < c; i++) {
						builder.append(letters);

					}
					letters = "";
					count = "";

				}
				letters += ch;
			} else {
				count += ch;
			}

		}
		int c = Integer.parseInt(count);
		for (int i = 0; i < c; i++) {
			builder.append(letters);

		}
		System.out.println(builder.toString());

	}

	public void splitDigitLetters(String input) {

		// String input = "India100world20test30";
		StringBuilder builder = new StringBuilder();
		char[] charInput = input.toCharArray();
		String word = "";
		String number = "";
		for (char ch : charInput) {

			if (Character.isLetter(ch)) {

				if (!number.isEmpty()) {
					System.out.println(word + " = " + number);
					number = "";
					word = "";

				}
				word += ch;

			}
			if (Character.isDigit(ch)) {

				number += ch;
			}

		}

		if (!number.isEmpty() && !word.isEmpty()) {
			System.out.println(word + " = " + number);

		}

	}
	
	// input= abcd&abcd*abcd
		// output= dcba&dcba*dcba

		public void reverseWithSpecial(String input) {

			char[] charInput = input.toCharArray();
			StringBuilder reversedWord = new StringBuilder();
			String reversed = "";
			for (char ch : charInput) {
				if (Character.isLetter(ch)) {
					reversedWord.append(ch);
				} else {
					if (!reversedWord.isEmpty()) {
						reversedWord.reverse();
						reversed = reversed + reversedWord+ch;
						reversedWord.setLength(0);

					}

				}
			}
			
			if (!reversedWord.isEmpty()) {
				reversedWord.reverse();
				reversed = reversed + reversedWord;

			}
			System.out.println(reversed);
			/*
			 * write a program to get count of anagrams from an array input=
			 * {"eat","tea","ate","team","mate","test"} output= eat=3 team=2 test=1
			 */
		}
			public void getCountOfAnagrams(String[] input) {
				int i = 0;
				for (String word : input) {
					char[] letters = word.toCharArray();
					Arrays.sort(letters);
					String newWord = new String(letters);
					input[i] = newWord;
					i += 1;

				}
				System.out.println(Arrays.toString(input));

				HashMap<String, Integer> map = new HashMap<>();

				for (String word : input) {

					map.put(word, map.getOrDefault(word, 0) + 1);
				}

				for (Map.Entry<String, Integer> entry : map.entrySet()) {

					System.out.println(entry.getKey() + "  " + entry.getValue());
				}

			}

	/*
	 * input = India100world20test30 output= India=100 world=20 test=30
	 */

}
