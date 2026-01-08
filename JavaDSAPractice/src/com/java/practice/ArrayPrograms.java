package com.java.practice;

public class ArrayPrograms {
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining
	 * the relative order of the non-zero elements. Input: nums = [0,1,0,3,12]
	 * Output: [1,3,12,0,0]
	 */
	
	public int[] moveZeroes(int[] nums) {
	
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }

        while(k<nums.length){

            nums[k]=0;
            k++;
        }

        return nums;
    }
}
