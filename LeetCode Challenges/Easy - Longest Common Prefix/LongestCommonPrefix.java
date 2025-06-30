
import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] input){
        String ans = "";


    
        return ans;
    }
    

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String output = "fl";

        String[] strs2 = {"dog", "racecar", "car"};
        String output2 = "";

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println("Input = " + Arrays.toString(strs));
        System.out.println("Expected output = " + output);
        System.out.println("Actual output = " + lcp.longestCommonPrefix(strs));





    }


}
