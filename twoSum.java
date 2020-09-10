
import java.util.ArrayList;
import java.util.Arrays;

public class twoSum {

	 public static int[] twoSum(int[] nums, int target) {
		 int arr1 = 0;
		 int arr2 = 0;
		 
		 for(int i = 0 ; i <= nums.length; i++) {
			 for (int j = i+1 ; j < nums.length ;j++)
			 if(( nums[i] + nums[j])== target) {
				 arr1 = nums[i];
				 arr2 = nums[j];
			 }
		 }
		 return new int[] {arr1, arr2};
		 
	 } 
	public static void main(String[] args) {
		
		int targetMain;
		System.out.println("In Main");

		String numsMain = args[0];
		String[] numsString = numsMain.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] numsInt = new int[numsString.length];
		
		for(int i = 0; i< numsString.length;i++) {
			numsInt[i] = Integer.parseInt(numsString[i]);
		}
		targetMain = Integer.parseInt(args[1]);		
		
	  twoSum(numsInt, targetMain);
	}
}
