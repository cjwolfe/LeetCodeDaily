import java.util.*;
public class Jewels {
    public int countJewels(String jewels, String stones){
        int count = 0;
        
        // hashmap containskey

        // convert jewels to hashset
        HashSet<Character> j = new HashSet<>();

        for(char i : jewels.toCharArray()){
            j.add(i);
        }

        // loop over stones, for each key in jewels
        for(char s : stones.toCharArray()){
            
        // if stones.containsKey(each key in jewels)
            if(j.contains(s)){
                count++;
            }
        // increment count


        }


        
        return count;
    }


    public static void main (String[] args){
        Jewels j = new Jewels();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int output = 3;
        String jewels2 = "z";
        String stones2 = "ZZ";
        int output2 = 0;

        System.out.println("Input Jewels: " + jewels + " and stones: " + stones);
        System.out.println("Expected Output: " +  output + " - Actual: " + j.countJewels(jewels,stones));

        System.out.println("Input Jewels: " + jewels2 + " and stones: " + stones2);
        System.out.println("Expected Output: " +  output2 + " - Actual: " + j.countJewels(jewels2,stones2));

        
    
    
    
    }



}
