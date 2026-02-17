package com.java.practice;

public class ImportantPrograms {
	// -Count vowels and consonants using matches in a string
	public static void countVowelConsonants(String input) {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("The Input is empty");
		}
		int vowel = 0;
		int consonant = 0;

		for (char ch : input.toCharArray()) {
			if (Character.toString(ch).matches("[a-zA-Z]")) {
				if (Character.toString(ch).matches("[AEIOUaeiou]")) {
					vowel += 1;
				} else {
					consonant += 1;
				}
			}

		}
		System.out.println("Vowel: " + vowel);
		System.out.println("Consonant: " + consonant);

	}
}
