package com.java.practice;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) throws Exception {
		int[] input= {2,6,11,15,8,1};
		String input2="abcdabghtycabcde";
		int input5=123321;
		String input6="LVIII";
		String[] input7={"flower","flow","flight"};
		LeetCodePrograms obj1= new LeetCodePrograms();
		//int[] result1=obj1.twoSumProgramBruteForce(input, 9);
		//int[] result2=obj1.twoSumProgramOptimized(input, 9);
		//int result3= obj1.longestSubstringLength(input2);
		//String result4=obj1.longestSubstring(input2);
		//System.out.print(Arrays.toString(result2));
		//boolean result5=obj1.checkPalindrome(input3);
		//int result6=obj1.convertRomanToInteger(input4);
		String result7=obj1.longestCommonPrefix(input7);
		System.out.println(result7);

	}

}
