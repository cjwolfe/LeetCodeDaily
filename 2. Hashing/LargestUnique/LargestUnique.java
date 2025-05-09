import java.util.*;
public class LargestUnique {
    public static int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();

        
        for (int num : nums){
            arr.put(num,arr.getOrDefault(num,0) + 1);
        }

        int result = -1;
        for (int num:nums){
            if(arr.get(num) == 1){
                result = Math.max(result,num);
            }

            // Incorrect logic
            // if(arr.get(num)){
            //     arr.remove(num);
            // } else { result = num;}
        }
        



        
        return result;
    }

    public static void main(String[] args){

        int[] nums = {5,7,3,9,4,9,8,3,1};

        int output = 8;

        System.out.println("Ans is " + largestUniqueNumber(nums) + ", expected output is " + output);
    
    }
}
