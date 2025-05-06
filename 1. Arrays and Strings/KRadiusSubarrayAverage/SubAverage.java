import java.util.Arrays;

public class SubAverage {
    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        // not how this is supposed to work, see Arrays.fill above.
        // for (int i:ans){
        //     ans[i] = -1;
        // }
        if (k == 0) return nums.clone();
        
        int windowSize = 2 * k + 1;
        if (n < windowSize) return ans;

        // not used due to new technique of using i as center of array
        // int left = 0;
        // int curr = 0;
        long sum = 0;

        // first window sum
        for(int i = 0; i < windowSize; i++){
            sum += nums[i];
        }
        ans[k] = (int)(sum/windowSize);
        

        for(int i = windowSize; i < n; i++){
            sum += nums[i] - nums[i - windowSize];
            ans[i - k] = (int)(sum/windowSize);
        }
        // redundant because of arrays.fill
        // for (int i = 0; i< ans.length; i++){
        //     if(ans[i] == 0){ ans[i] = -1;}
        // }

        // window sum was not hitting every element in the array
        // for(int right = 0; right < n; right++){
        //     sum += nums[right];
        //     ans[curr] = (int)sum/windowSize;
        //     curr++;
            //ans[curr] = sum;
            // while(curr>windowSize){
            //     sum-=nums[left];
            //     left++;
            //     curr--;
            // }

            // if(curr + 1 > window){
            // ans[curr] = curr;
            // }               
            // else {
                
            // }

        //}


        //loop though array
        //if (window < 2k+curr){ return -1}
        //else {sum of subarray}

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int[] nums2 = {100000};
        int k2 = 0;

        System.out.println("Ans is " + Arrays.toString(getAverages(nums,k)));


    }
}
