
import java.util.*;
public class MaxBalloons {

    public String ref = "balloon";
    public char[] refArray = ref.toCharArray();

    public int maxNumberOfBalloons(String text) {
        

        if(text.length() < ref.length()) return 0;

        //convert text to array
        char[] input = text.toCharArray();
        
        //compare using hashmap?
        HashMap<Character, Integer> map = new HashMap<>();
        for (char chars : refArray){
            // was an if statement that checked if the element was already there or not, 
            // not necessary because I made a string with exactly what I was looking for.
                map.put(chars, map.getOrDefault(chars, 0) + 1);

            //could do this individually


            //old
            //map.put(chars,1);
            // am I doing this correctly? Should I be adding the same values with a count?
        }

        //separate map for input

        HashMap<Character, Integer> map2 = new HashMap<>();

        //old
        //int ans = 0;

        for(char c : input){
            map2.put(c, map2.getOrDefault(c, 0) +1);
        
        }

        /**
         * 
         * 
         * Old shit
         * for (char chars : input){
            if(!map.containsKey(chars)){
                map2.put(chars, map2.getOrDefault(chars, 0) + 1);
            }
            // if(ans < map2.getOrDefault(chars, 0) + 1){
            //     ans++;
            // }

        }*/

        //this section was GPT

        int maxBalloons = Integer.MAX_VALUE;
        for(char chars : map.keySet()){
            int required = map.get(chars);
            int available = map2.getOrDefault(chars, 0);

            maxBalloons = Math.min(maxBalloons, available/required);

            //old
            //if(map.get(chars).equals(map2.get(chars))){
            //ans++;
            //}
            // if(map2.containsKey(chars)){
            //     ans++;                
            // }
            //ans++;
        }
        //old
        //ans = Collections.max(map2.values());


        
         /* 
         Old shit
         for (char key : map.keySet()){
            if(map2.containsKey(key)){
                ans++;



                // Integer array = map2.get(key);
                // int count = 0;
                // for (Integer i : array){
                //     if (i == key){
                //         count ++;
                //     }
                // }

            }
        }

        for (char chars:refArray){
            for(int i = 0; i < theoreticalMax; i++){
            if(map.containsKey(chars) && map2.containsKey(chars)){
                ans = i;
                }
            }
        }

        count number of balloons */
        

        


        return maxBalloons;
    }

    public static void main(String[] args){
        String text = "nlaebolko";
        int output = 1;
        String text2 = "loonbalxballpoon";
        int output2 = 2;
        String text3 = "leetcode";
        int output3 = 0;
        String text4 = "poop";
        int output4 = 0;

        MaxBalloons mb = new MaxBalloons();

        System.out.println("Ans is: " + mb.maxNumberOfBalloons(text) + ", expected " + output);
        System.out.println("Ans is: " + mb.maxNumberOfBalloons(text2) + ", expected " + output2);
        System.out.println("Ans is: " + mb.maxNumberOfBalloons(text3) + ", expected " + output3);
        System.out.println("Ans is: " + mb.maxNumberOfBalloons(text4) + ", expected " + output4);
    
    
    }
}
