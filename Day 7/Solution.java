//package Day 7;

import java.util.Arrays;


public class Solution {
    public static int[] runningSum(int[] nums) {
        int[] ans = nums.clone();

        int sum = 0;
        
        //int[] ans = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            sum += nums[i-1];
            ans[i] += sum;
            // this just makes a little bit more logical sense to me idk why
        }
        // Chat GPT Proposes a cleaner version: 
        // for (int i = 1; i < nums.length; i++) {
        //     nums[i] += nums[i - 1];
        // }
        // return nums;

        return ans;
    }

    public static void main(String[] args){
        System.out.println("Hello World!");
        
        
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);

        System.out.println("Nums is " + Arrays.toString(nums));

        System.out.println("Result is" + Arrays.toString(result));


        int[] nums2 = {1,1,1,1,1};
        int[] result2 = runningSum(nums2);

        System.out.println("Nums is " + Arrays.toString(nums2));

        System.out.println("Result is" + Arrays.toString(result2));

        
        
    
    
    
    }
    
}
