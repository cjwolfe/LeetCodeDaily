//package Day 8;

class Solution {
    public static int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;

        for(int num : nums){
            sum +=num;
            minSum = Math.min(minSum, sum);
        
        }

        /**
         * TODO: Dissect what is wrong with this code and why it doesn't quite work properly
         *         int start = 0;
         *         int sum = 0;
         *         //find largest value in nums
         *         for(int num : nums){
         *             //filter to start as a positive value
         *             if(start < num){
         *                 start = num;
         *             }
         *         }
         *         while(Math.min(sum, start) < 1){
         *                     sum = nums[0] + start;
         *         for(int i = 1; i < nums.length; i++){
         *             sum = nums[i] + sum;
         *             }
         *         }
         *  
         *      //this should return sum
        **/

            //Prev attempt
        // while(sum == 0){
        //     for (int i = 0; i < nums.length; i++){
        //         sum = nums[i] + start;
        //     }
        // }
        //while(ans<0)

            //Another prev attempt
        // if (ans>0){
        //     for (int i = 0; i<nums.length; i++) {
        //         sum = nums[i] + ans;

        //         // if (sum < 1){
        //         // ans++;
        //         // break;
        //         // }
        //         // if (nums[i] + ans > sum){
        //         //     sum = Math.max(nums[i] + ans, sum);
        //         // }
        //     }

        // }
        //return sum;
        return 1 - minSum;
    }

    // public static int checkIt(int j){

    //     return j;
    // }

    public static void main(String[] args){
        System.out.println("hello world");

        int[] nums = {-3,2,-3,4,2};

        System.out.println("Ans is: " + minStartValue(nums));
        
        int[] nums2 = {1,2};

        System.out.println("Ans is: " + minStartValue(nums2));


    }
}