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
    }

    public String getUserInput(){
        String userInput = "";
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please input your decklist name: ");
            while(input.hasNextLine()){
                userInput = input.nextLine();
            }
        }
        return userInput;
    }

    public void getDecklist(String decklist){
        FileProcessor fp = new FileProcessor("Self-Challenges/ABCsChecker/decklists/" + decklist + ".txt");
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
        ABCs ex = new ABCs();
        ex.setup();
        ex.getDecklist(ex.getUserInput());




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
