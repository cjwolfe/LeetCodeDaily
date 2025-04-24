class Solution {
    public int[] sortedSquares(int[] nums) {
        //square array
        int[] ans = new int[nums.length];
        for(int i= 0; i<nums.length; i++){
            ans[i] = nums[i] * nums[i];
        }
        //sort array
        for(int i = 0; i< ans.length-1; i++){
            for(int j = i+1; j< ans.length; j++){
                if(ans[i]>ans[j]){
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans;
        
//         int left = 0;
//         int right = ans.length-1;
//         while(left < right){
//             int temp = ans[left];
//             if(ans[left] > ans[right]){
//                 ans[left] = ans[right];
//                 ans[right] = temp;
//             }
            
//             left++;
//             right--;
            
            
//         }
        
    }
}