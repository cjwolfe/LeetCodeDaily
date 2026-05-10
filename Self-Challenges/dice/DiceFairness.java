// package dice;

//shoulda used hashmaps
import java.util.Scanner;
// import java.sql.Array;
// import java.util.Arrays;
public class DiceFairness{
        private int numSides;
        private int numDice;
        private int[] chartEx;
        private int[] chartUser;
        public static int numTries = 1000;
        public static Scanner s = new Scanner(System.in);
        public static int userNumSides;
        public static int userNumDice;
        private int numRolls = 0;
        private int userAverage;
        private int exampleAverage;

    // public static int[] chart = new int[21];
    public DiceFairness(int numSides, int numDice){
        this.numSides = numSides;
        this.numDice = numDice;


        setupChart();


    }

    
    public void setupChart(){
        this.chartEx = new int[numSides+1];
        this.chartUser = new int[numSides+1];
    }
    public void setNumSides(int input){
        this.numSides = input;
    }
    public void setNumDice(int input){
        this.numDice = input;
    }
    public void addRoll(){
        this.numRolls++;
    }

    public void prompt(){

        // setNumSides(userNumSides);
        // setNumDice(userNumDice);
        // setupChart();

        System.out.println("At any time, press q to quit.");

        // while(!s.next().equalsIgnoreCase("q")){
        //     // s.nextLine();
        // System.out.print("Please enter your dice roll:");
        //     if(s.next().equalsIgnoreCase("q")){
        //         break;
        //     }
        //     save(s.nextInt());
        //     // saves an example roll for each user roll
        //     // save();
        //     addRoll();


        // }
        StringBuilder sb = new StringBuilder();
        String tok = s.next();
        while(!tok.equalsIgnoreCase("q")){
            System.out.print("Prompt for dice roll:");
            try{
                sb.append(tok.trim().charAt(0));
                int temp = (int) tok.trim().charAt(0);
                save(temp);

                
            } catch (Exception e){
                
                System.out.println("Something went wrong with tokens");
            }
            tok = s.next();
            // System.out.println();
        }

        System.out.println("Here is what was logged: " + sb.toString());

        System.out.println("Here are your rolls compared to an example chart of the same number");
        System.out.println("Number of rolls logged: " + numRolls);
        printUser();
        // example runs here, use Rolls as n
        print();

            
        
        

    }
    
    /**
     * Saves dice roll to chart
     */
    public void save(){

        int temp = generator(this.numSides, this.numDice);
        if(temp != -1){
            this.chartEx[temp]++;
        }
    }

    public void save(int temp){
        if(temp != -1){
            this.chartUser[temp]++;
        }
    }

    /**
     * Rolls dice
     * @param numSides
     * @param numDice
     * @return dice result of one roll
     */
    public int generator(int numSides, int numDice){
        if(numDice < 0 || numDice > 500 || numSides < 0){
            // number of dice is not an acceptable number
            return -1;
        }

        int result = 0;
        
        while(numDice != 0){
            result += Math.floor(Math.random()*numSides)+1;
            numDice--;
        }

        return result;
    }


    /**
     * Prints out the exact number of each die rolled for the example chart.
     */
    public void print(){
        System.out.println("Dice Rolls | result");
        System.out.println("___________________");
        for(int i = 1; i < chartEx.length; i++){
            System.out.println(i + "       |" + chartEx[i]);
        }


    }
    /**
     * Prints out the exact number of each die rolled for the user's entered info
     */
    public void printUser(){
        System.out.println("Your Rolls | result");
        System.out.println("___________________");
        for(int i = 1; i < chartUser.length; i++){
            System.out.println(i + "       |" + chartUser[i]);
        }

    }

    public static void main(String[] args){

        System.out.println("Welcome to the Dice Fairness Calculator!");
        System.out.print("Please enter the number of side in the dice you wish to test:");
        userNumSides = s.nextInt();
        System.out.print("Please enter the number of dice you wish to test:");
        userNumDice = s.nextInt();
        // if(userNumSides < 0 || userNumDice < 0){
        //     System.out.println("You have entered an incorrect number of dice or sides of dice");
        //     return;
        // }
        // DiceFairness f = new DiceFairness(userNumSides,userNumDice);
        DiceFairness f = new DiceFairness(6,2);

        f.prompt();
        
    }

}