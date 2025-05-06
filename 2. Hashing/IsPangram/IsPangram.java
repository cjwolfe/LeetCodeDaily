import java.util.*;
public class IsPangram {
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }
        Set <Character> seen = new HashSet<>(26);
        boolean ans = false;
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(Character.isLetter(c)){
                seen.add(c);
            }

            // not necessary, because we can check the size of C later.
            // if(seen.contains(c)){               
            //     //return c;
            // }
            // seen.add(c);

        }
        // this isn't correct, looping over the hashmap is not how to do this.
        // for (int i = 0; i < seen.size(); i++){
        //     ans = !seen.isEmpty();
        // }

        // compare the size to the size of the alphabet

        if(seen.size() < 26){
            ans = false;
        } else {
            ans = true;
        }
        // initially, I had these backwards.


        return ans;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog"; // true
        String sentence2 = "leetcode"; // false
        String sentence3 = "howquicklydaftjumpingzebrasvevv"; // false

        System.out.println("Ans is " + checkIfPangram(sentence));
        System.out.println("Ans2 is " + checkIfPangram(sentence2));
        System.out.println("Ans3 is " + checkIfPangram(sentence3));



    }
}
