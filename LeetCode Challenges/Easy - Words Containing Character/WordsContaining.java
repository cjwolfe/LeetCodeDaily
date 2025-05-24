import java.util.*;
class WordsContaining {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<>();


        // 1. iterate over words using i
        for (int i = 0; i < words.length; i++){
        // 2. compare each character in each string to char x
            for(int j = 0; j < words[i].length(); j++){
        // 3. if char x == string(charat j ), add ans at index i
                if(words[i].charAt(j) == x){
                    ans.add(i);
                    break;
                }
            }
        }
        /* ans.add(0, 1);
        ans.add(1, 2); */
        return ans;
    }

    public static void main(String[] args){
        WordsContaining wc = new WordsContaining();
        String[] words = {"leet", "code"};
        char x = 'e';
        int[] output = {0,1};
        String[] words2 = {"abc","bcd","aaaa","cbc"};
        char x2 = 'a';
        int[] output2 = {0,2};
        String[] words3 = {"abc","bcd","aaaa","cbc"};
        char x3 = 'z';
        int[] output3 = {};

        System.out.println("Input: " + Arrays.toString(words));
        System.out.println("Character: " + x);
        System.out.println("Expected output: " + Arrays.toString(output) + " Actual output: " + wc.findWordsContaining(words,x));
        System.out.println("Input: " + Arrays.toString(words2));
        System.out.println("Character: " + x2);
        System.out.println("Expected output: " + Arrays.toString(output2) + " Actual output: " + wc.findWordsContaining(words2,x2));
        System.out.println("Input: " + Arrays.toString(words3));
        System.out.println("Character: " + x3);
        System.out.println("Expected output: " + Arrays.toString(output3) + " Actual output: " + wc.findWordsContaining(words3,x3));

    
    }
}