class Day6 {
    // Comments are incorrect bits of logic
    public static int longestOnes(int[] nums, int k) {
        int left, ans, 
        //sum, 
        zeroes;
        //sum not necessary, was copied from code because that code needed to find an average, which is the sum/number.
        left = ans = 
        //sum = 
        zeroes = 0;

        for(int right = 0; right<nums.length; right++){
            //sum += nums[right];
            if(nums[right] == 0){
            zeroes++;
            }
            
            while(zeroes>k){
                // was this:
                // sum -= nums[left];
                // left++;
                // zeroes--;
                // Incorrect because we are not summing the window size.

                if (nums[left] == 0){
                zeroes--;
                }
                left++;
            }

            // was this:
            // if(zeroes == k){
            //     ans = Math.max(ans, sum);
            // }
            // Incorrect because the real answer is not the sum, it's the window size, which because
            // we can exclude the zeroes from the count (see above logic of nums[left] == 0) this
            // is checking the largest total sum, which is not the largest window size. 

            ans = Math.max(ans, right - left + 1);

        }

        return ans;
    }

    public static void main(String[] args){
    int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
    int k = 2;

    System.out.println("Ans is " + longestOnes(nums,k));
    
    
    int[] nums2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    int k2 = 3;

    System.out.println("Ans2 is " + longestOnes(nums2,k2));
    
    
    
    }
}