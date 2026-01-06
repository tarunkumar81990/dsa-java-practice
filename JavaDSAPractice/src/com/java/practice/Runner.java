package com.java.practice;

public class Runner {

	public static void main(String[] args) throws Exception {
		//int[] input= {2,6,11,15,8,1};
		//String input2="abcdabghtycabcde";
		//int input5=123321;
		//String input6="LVIII";
		//String[] input7={"flower","flow","flight"};
		//String path="\\src\\com\\java\\testdata\\javaCode.txt";
		//CommonPrograms obj1= new CommonPrograms();
		StringPrograms obj2= new StringPrograms();
		//int[] result1=obj1.twoSumProgramBruteForce(input, 9);
		//int[] result2=obj1.twoSumProgramOptimized(input, 9);
		//int result3= obj1.longestSubstringLength(input2);
		//String result4=obj1.longestSubstring(input2);
		//System.out.print(Arrays.toString(result2));
		//boolean result5=obj1.checkPalindrome(input3);
		//int result6=obj1.convertRomanToInteger(input4);
		//String result7=obj1.longestCommonPrefix(input7);
		//System.out.println(result7);
		//boolean result8=obj1.checkValidParentheses(path);
		//System.out.println(result8);
		//int[] nums = {0,0,1,1,1,2,2,3,3,4};
		//obj1.removeDuplicateSortedArray(nums);
		//String input8="apple";
		//String result8=obj2.reverseStringWithoutBuidler(input8);
		//String result8=obj2.reverseStringWithBuidler(input8);
		//obj2.frequencyOfLetters("aabbfhhjjj");
		//obj2.firstNonRepeatingChar("aabbfhhjjj");
		//obj2.StringExpansion("ac2b4c5");
		//System.out.println(result8);
		String[] input={"eat","tea","ate","team","mate","test"};
		obj2.getCountOfAnagrams(input);

	}

}
