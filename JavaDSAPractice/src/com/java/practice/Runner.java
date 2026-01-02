package com.java.practice;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		int[] input= {2,6,11,15,8,1};
		String input2="abcdabghtycabcde";
		LeetCodePrograms obj1= new LeetCodePrograms();
		//int[] result1=obj1.twoSumProgramBruteForce(input, 9);
		//int[] result2=obj1.twoSumProgramOptimized(input, 9);
		//int result3= obj1.longestSubstringLength(input2);
		String result4=obj1.longestSubstring(input2);
		//System.out.print(Arrays.toString(result2));
		System.out.println(result4);

	}

}
