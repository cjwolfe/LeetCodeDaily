import java.util.*;
public class RansomNote {


    public boolean canConstruct(String ransomNote, String magazine) {
        
        // Check edge cases
        if(ransomNote.isEmpty()) return false;
        if(magazine.isEmpty()) return false;
   
        // initialize a frequency map of each letter in magazine
        HashMap<Character, Integer> mag = new HashMap<>();
        for(char chars : magazine.toCharArray()){
            mag.put(chars, mag.getOrDefault(chars, 0) + 1);
        }


        // iterate over ransomNote checking if it exists in the map with a non-zero count
            // return false quickly
        // char [] note = ransomNote.toCharArray();


        for(char chars : ransomNote.toCharArray()){
            //if the letter is missing or the count is zero, return false.
            if(!mag.containsKey(chars) || mag.get(chars) == 0){
                return false;                
            }
            mag.put(chars, mag.get(chars) -1);

            if(mag.get(chars) == 0){
                mag.remove(chars);
            }


            
        }
        return true;

        //if (mag.isEmpty()) return true; else return false;


        //if (count == 0) return true; else return false;

    }


    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        boolean output = false;
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        boolean output2 = false;
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        boolean output3 = true;

        RansomNote temp = new RansomNote();

        StringBuilder sb = new StringBuilder();

        sb.append("RansomNote.java\n");

        for(@SuppressWarnings("unused")
        int i = 0; sb.length() < 47; i++){

            sb.append("*--*");
        }
        sb.append("\nInput strings:     ").append(ransomNote).append(" + ").append(magazine);
        sb.append("\nExpected Ouput:    ").append(output);
        sb.append("\nActual output:     ").append(temp.canConstruct(ransomNote, magazine));
        sb.append("\nInput strings:     ").append(ransomNote2).append(" + ").append(magazine2);
        sb.append("\nExpected Ouput:    ").append(output2);
        sb.append("\nActual output:     ").append(temp.canConstruct(ransomNote2, magazine2));
        sb.append("\nInput strings:     ").append(ransomNote3).append(" + ").append(magazine3);
        sb.append("\nExpected Ouput:    ").append(output3);
        sb.append("\nActual output:     ").append(temp.canConstruct(ransomNote3, magazine3));
        sb.append("\n");
        System.out.print(sb);





    }
}
