package com.java.practice;

public class SetMismatch {

	
public static void main(String[] args) {
		
		System.out.println("In Main");

		String numsMain = args[0];
		String[] numsString = numsMain.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] numsInt = new int[numsString.length];
		
		for(int i = 0; i< numsString.length;i++) {
			numsInt[i] = Integer.parseInt(numsString[i]);
		}
		 int[] var = findErrorNums(numsInt);
	}
	
			public static int[] findErrorNums(int[] nums) {
				
				int MissNumber = 0;
				int repeatedNumber =0;
				int len = nums.length;
				int k;
				 for(int i = 0 ; i<len-1;i++){
			         for(int j = i+1; j<=len-1;j++){
			             if(nums[i] == nums[j]){
			                 repeatedNumber = nums[i];
			                 nums[i] = nums[i]-nums[j] ;
			                int sumofAll = (len*(len+1))/2;
			 				int sumofnums = 0;
			 				
			 				for( k = 0 ;k<=len-1; k++) {
			 					sumofnums = sumofnums + nums[k];
			 				}
			 				 MissNumber = sumofAll - sumofnums;
			             }
			             
			             
			          }
    
}
				return new int[] {repeatedNumber,MissNumber};
			}
}
