import java.util.*;
public class MaxBalloons {
    public static int maxNumberOfBalloons(String text) {
        String ref = "balloon";

        if(text.length() < ref.length()) return 0;

        char[] refArray = ref.toCharArray();

        //convert text to array
        char[] input = text.toCharArray();
        

        //compare using hashmap?
        HashMap<Character, Integer> map = new HashMap<>();
        for (char chars : refArray){
            if(!map.containsKey(chars)){
                map.put(chars, map.getOrDefault(chars, 0) + 1);
            }
            //map.put(chars,1);
            // am I doing this correctly? Should I be adding the same values with a count?
        }

        //separate map for input
        HashMap<Character, Integer> map2 = new HashMap();


        for (char chars: input){
            if(!map.containsKey(chars)){
                map2.put(chars, map2.getOrDefault(chars, 0) + 1);
            }
        }

        //compare two maps

        int ans = 0;
        

        //ans = Collections.max(map2.values());

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

        // for (char chars:refArray){
        //     for(int i = 0; i < theoreticalMax; i++){
        //     if(map.containsKey(chars) && map2.containsKey(chars)){
        //         ans = i;
        //         }
        //     }
        // }

        //count number of balloons

        


        return ans;
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

        System.out.println("Ans is: " + maxNumberOfBalloons(text) + ", expected " + output);
        System.out.println("Ans is: " + maxNumberOfBalloons(text2) + ", expected " + output2);
        System.out.println("Ans is: " + maxNumberOfBalloons(text3) + ", expected " + output3);
        System.out.println("Ans is: " + maxNumberOfBalloons(text4) + ", expected " + output4);
    
    
    }
}
