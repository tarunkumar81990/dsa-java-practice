package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringPrograms {

	// Reverse a string without using StringBuilder

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

	// Reverse a string using StringBuilder
	public String reverseStringWithBuidler(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}
		StringBuilder builder = new StringBuilder(input);
		builder.reverse();

		return builder.toString();

	}

	// Check if two strings are anagrams way 1

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

	// Check if two strings are anagrams way 2
	public boolean checkAnagramWay2(String input1, String input2) {
		boolean result = false;

		char[] arrInput1 = input1.toCharArray();
		char[] arrInput2 = input2.toCharArray();
		Arrays.sort(arrInput1);
		Arrays.sort(arrInput2);

		if (Arrays.equals(arrInput1, arrInput2)) {
			result = true;
		}

		return result;

	}

	// Find frequency of the letters in a string way1
	public void frequencyOfLetters(String input) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (Character ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	// Find frequency of the letters in a string way2
	public void frequencyOfLettersWay2(String input) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (Character ch : input.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	// Find frequency of the letters in a string way3
	public void frequencyOfLettersWay3(String input) {

		int[] arr = new int[256];
		HashSet<Character> set = new HashSet<>();
		for (char ch : input.toCharArray()) {
			arr[ch] += 1;
			set.add(ch);
		}

		for (char ch : set) {
			System.out.println(ch + " : " + (arr[ch]));
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

	// Find the first non-repeating character in a string way2

	public void firstNonRepeatingCharWay2(String input) {

		char[] arr = new char[256];
		for (char ch : input.toCharArray()) {
			arr[ch] += 1;
		}

		for (char ch : input.toCharArray()) {
			if (arr[ch] == 1) {
				System.out.print(ch);
				return;
			}
		}
		System.out.print("There is no non repeating character");

	}

	// Implement basic string expansion (e.g.a2b4c5-> "aabcccccaaa")

	public void stringExpansion(String input) {
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

	// Implement basic string expansion (e.g.a2b4c5-> "aabcccccaaa") way2

	public static void stringExpansionWay2(String input) {
		String temp = "";
		String number = "";
		String result = "";

		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {
				temp = temp + ch;
			} else {
				if (!temp.isEmpty()) {
					number = number + ch;
				}
				int digit = Integer.parseInt(number);
				for (int i = 0; i < digit; i++) {
					result = result + temp;
				}
				temp = "";
				number = "";
			}

		}
		System.out.println(result);

	}

	public void splitDigitLetters(String input) {

		// String input = "India100world20test30";
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
					reversed = reversed + reversedWord + ch;
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
		  HashMap<String,Integer> hmap= new HashMap<>();
	        HashMap<String, String> hmap2= new HashMap<>();
	    for(String entry:input){
	       char[] data= entry.toCharArray();
	       Arrays.sort(data);
	       String word=new String(data);
	        hmap.put(word,hmap.getOrDefault(word,0)+1);
	        hmap2.putIfAbsent(word,entry);
	    }
	    
	    
	    for(Map.Entry<String,Integer> entryData:hmap.entrySet()){
	        System.out.println(hmap2.get(entryData.getKey())+" : "+entryData.getValue());
	    }

	}

	/*
	 * input = India100world20test30 output= India=100 world=20 test=30
	 */
	 public static void splitLetterDigits(String input){
	        String letters="";
	        String number="";

	        
	    for(char ch:input.toCharArray()){
	        if(Character.isLetter(ch)){
	            if(!number.isEmpty()){
	                System.out.println(letters+" "+number);
	                letters="";
	                number="";
	            }
	            letters=letters+ch;
	        }
	            if(Character.isDigit(ch)){
	                number=number+ch;
	            }

	        }
	        if(!letters.isEmpty() || !number.isEmpty()){
	            System.out.println(letters+" "+number);
	        }


	    }

}
