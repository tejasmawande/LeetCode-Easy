package com.java.practice;

public class findLengthOfLCIS {

public static void main(String[] args) {
		
		System.out.println("In Main");

		String numsMain = args[0];
		String[] numsString = numsMain.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] numsInt = new int[numsString.length];
		
		for(int i = 0; i< numsString.length;i++) {
			numsInt[i] = Integer.parseInt(numsString[i]);
		}
		 int var = findLengthOfLCIS(numsInt);
		 System.out.println(var);
	}

public static int findLengthOfLCIS(int[] nums) {
	
	int numAnswer = 0;
	int count = 0;

	for(int i = 0;  i<nums.length;++i) {
	
		if(i>0 && nums[i-1]>=nums[i]) {
			count = i;
		}
		numAnswer = Math.max(numAnswer, i - count +1);
	}
	return numAnswer;
	
}

}
