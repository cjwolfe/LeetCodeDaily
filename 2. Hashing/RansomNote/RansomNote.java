public class RansomNote {


    public boolean canConstruct(String ransomNote, String magazine) {
        //if(Math.random() > .5) return true;
        return ransomNote.equals(magazine);
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
        for(int i = 0; sb.length() < 47; i++){
            sb.append("*--*");
        }
        sb.append("\nInput strings:     " + ransomNote + " + " + magazine);
        sb.append("\nExpected Ouput:    " + output);
        sb.append("\nActual output:     " + temp.canConstruct(ransomNote, magazine));
        sb.append("\nInput strings:     " + ransomNote2 + " + " + magazine2);
        sb.append("\nExpected Ouput:    " + output2);
        sb.append("\nActual output:     " + temp.canConstruct(ransomNote2, magazine2));
        sb.append("\nInput strings:     " + ransomNote3 + " + " + magazine3);
        sb.append("\nExpected Ouput:    " + output3);
        sb.append("\nActual output:     " + temp.canConstruct(ransomNote3, magazine3));
        sb.append("\n");
        System.out.print(sb);





    }
}
