//package Day 5;
//Comments here are mistakes I made.

public class MaxAverageSubarray {

    public static double findMaxAverage(int[] nums, int k){
    //ans was originally 0;
    double ans = Double.NEGATIVE_INFINITY;
    int left = 0;
    int curr = 0;


    int sum = 0;

    for(int right = 0; right < nums.length; right++){
        sum += nums[right];
        curr++;
        while (curr>k){
            sum -=nums[left];
            left++;
            //Initial was missing:
            curr--;
        }
        //Incorrect:
        //ans = sum/curr;
        if(curr == k){
            ans = Math.max(ans, (double)sum/k);
        }
    }
    //Initial algorithm was just finding largest element in array, not average of array

    return ans;
    }


    public static void main(String[] args){
    int[] array = {1,12,-5,-6,50,3};
    int k = 4;

    System.out.println("Ans is " + findMaxAverage(array,k));

    int[] array2 = {5};
    int j = 1;

    System.out.println("Ans2 is " + findMaxAverage(array2,j));
    
    int[] array3 = {1, 7, 5, 8, 7, 6, 2, 3};
    int i = 4;

    System.out.println("Ans2 is " + findMaxAverage(array3,i));
    
    


    
    }
}
