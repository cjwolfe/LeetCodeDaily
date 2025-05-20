import java.util.*;
public class LongestSubstring {
    public static String testString = "";
    public int lengthOfLongestSubstring(String s) {
        //hashset of input
        Set<Character> input = new HashSet<>();


        //convert s to hashset
/*         for(char i : s.toCharArray()){
            input.add(i);
        }

        testString = input.toString();
        //largest number of nonrepeating characters
        int ans = input.size();
        // edge case of all repeating characters
        if (ans == 1) return ans;
 */
        /* //two pointer method to search through s
        
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            if(maxLen == 0){
            maxLen++;
            }
            while(maxLen > ans){
                if(left == 0){
                maxLen--;

                }
                left++;
            }

        
        } */

        // this is a working sliding window approach to finding the smallest substring
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++){
            // if the character is already in the set, shrink the window
            while(input.contains(s.charAt(right))){
                input.remove(s.charAt(left));
                left++;
            }
            // advance through s
            input.add(s.charAt(right));
            //input.add(s.charAt(right));(was not working for some strange reason)
            maxLen = Math.max(maxLen, right - left +1);
        }



        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring n = new LongestSubstring();    

        String s = "abcabcbb";
        int output = 3;
        String s2 = "bbbbb";
        int output2 = 1;
        String s3 = "pwwkew";
        int output3 = 3;


        System.out.println("Input: " + s + "\nExpected Output: " + output + "\nActual Output: " + n.lengthOfLongestSubstring(s));
        System.out.println("Test string: " + testString);
        System.out.println("Input2: " + s2 + "\nExpected Output2: " + output2 + "\nActual Output2: " + n.lengthOfLongestSubstring(s2));
        System.out.println("Test string: " + testString);
        System.out.println("Input3: " + s3 + "\nExpected Output3: " + output3 + "\nActual Output3: " + n.lengthOfLongestSubstring(s3));
        System.out.println("Test string: " + testString);

    }
}
