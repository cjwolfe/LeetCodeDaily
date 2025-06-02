import java.util.*;

public class ABCs {
    // define hashset abcs
    public HashSet<Character> hashABCs = new HashSet<>();
    public HashSet<Character> hashFile = new HashSet<>();
    public String fileOutput;

    public void setup(){
        // reference string of the alphabet
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (char chars : alphabet.toCharArray()){
        hashABCs.add(chars);
        }
    // hashABCs is now the alphabet
    FileProcessor fp = new FileProcessor("./Self-Challenges/ABCsChecker/decklist.txt");
    FileProcessor fp2 = new FileProcessor("./Self-Challenges/ABCsChecker/decklist2.txt");
    //System.out.println("This is what the file contains: " + fp.processFile());
    
    // public void 
    fileOutput = fp.processFile().toLowerCase();

        for (char chars : fileOutput.toCharArray()){
            hashFile.add(chars);
        }
    }
    

    public String getAlphabet(){
        return hashABCs.toString();
    }
    public String getFileOutput(){
        return hashFile.toString();
    }

    public boolean containsAllLetters(){

        // if hashABCs == hashFile

        return hashABCs.equals(hashFile);
    }
    public String getLettersNeeded(){
        hashABCs.removeAll(hashFile);

        return hashABCs.toString();
    }

    public static void main(String[] args){
        // long startTime = System.currentTimeMillis();
        ABCs ex = new ABCs();
        ex.setup();
        System.out.println(ex.getAlphabet());
        System.out.println(ex.getFileOutput());
        if(ex.containsAllLetters()){
        System.out.println("The decklist contains all the necessary letters to win the game");
        } else {
        System.out.println("The decklist cannot win with \"Now I Know My ABC's\" ");
        System.out.println("You will need the following letters: " + ex.getLettersNeeded());
        }



/*         long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time elapsed: " + timeElapsed + "ms"); */



    
    
    
    }
}
