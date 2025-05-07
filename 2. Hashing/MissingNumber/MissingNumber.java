public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length + 1;

        int[] hash = new int[n + 1];

        for(int i = 0; i < n - 1; i++){
            hash[nums[i]]++;
            // loops over hash array, incrementing each unique number in nums
        }

        // i = 1 is incorrect in this loop. IDK why.
        for(int i = 0; i <= n; i++){
            if(hash[i] == 0){
                return i;
            }
        }

        // 1. create hashmap of array
        // 2. for each element of the array, see if hashmap contains the number

        // for this day, I did some googling and reading and didn't use chatGPT! 
        // also, I copied a fair amount of this code but I am new at hashmaps so idk
        // I did get the pseudocode steps pretty much spot on. Below are wrong answers.



        // subtract array from itself? no.

        // reiterating over array creates more complexity
        // counting size of array? then figure out missing number?
        

        return -1;        
    }

    public static void main (String[] args){
        int[] nums = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};

        System.out.println("Ans is " + missingNumber(nums) + " expected: 2");
        System.out.println("Ans2 is " + missingNumber(nums2) + " expected: 2");
        System.out.println("Ans2 is " + missingNumber(nums3) + " expected: 8");

    
    
    
    }
}
