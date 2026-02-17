package com.java.practice;

import java.util.Arrays;

public class ScenarioBased {

	/*
	In a shop there are 6 toys each toy cost is different [5, 8, 7, 2, 3, 1]
	and you have Rs.5 how many max toys you can buy, 
	write a java program to find the max toys one can buy 
	and also total cost of the toys. 
	*/
	
	public static void maxToyBuy(int[] toyCost, int budget) {
		int count=0;
		int totalCost=0;
		Arrays.sort(toyCost);
		for(int i=0;i<toyCost.length;i++) {
			
			if(totalCost+toyCost[i]<=budget) {
				totalCost=totalCost+toyCost[i];
				count+=1;
			}else {
				break;
			}
			
		}
		System.out.println(count+ " "+totalCost);
		
	}
	
	public static void main(String[]args) {
		int[] prices= {5, 8, 7, 2, 3, 1};
		int budget=5;
		maxToyBuy(prices, budget);
		
		
	}
}
