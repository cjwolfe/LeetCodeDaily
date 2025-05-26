
import java.util.Arrays;

public class EvenNumDigits {
    public int findNumbers(int[] nums) {
        int ans = 0;
        String emptyString = "";
        for(int num : nums){
            emptyString += num;
            int n = emptyString.length();
            if (n % 2 == 0){
                ans++;
            }
            emptyString = "";
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        int output = 2;

        int[] nums2 = {555,901,482,1771};
        int output2 = 1;

        EvenNumDigits obj = new EvenNumDigits();

        System.out.println("Nums is " + Arrays.toString(nums));
        System.out.println("Expected output: " + output + " actual output = " + obj.findNumbers(nums));

        System.out.println("Nums is " + Arrays.toString(nums2));
        System.out.println("Expected output: " + output2 + " actual output = " + obj.findNumbers(nums2));


    }
}
