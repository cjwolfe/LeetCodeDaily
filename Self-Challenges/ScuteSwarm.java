//package Self-Challenges;

public class ScuteSwarm {

    public static int[] landfall(int scute, int insect, int land){
        

        //handle this better than just if statements, use different modules to handle the logic separately.
        
        if(land>=6){
            // if(scute==1){
            //     scute++;
            //     land++;
            // }
            // else{
            scute*=2;
            land++;
            //}
        }
        else{
            insect++;
            land++;
        }
        // handle multiple lands at a time
        // handle token doubling effect



        int[] ans = {scute,insect,land};

        return ans;
    }


    public static void main(String[] args) {
        
        int[] result = {128,2,6};

        
        
        //handle text output better

        

        System.out.print("After a landfall with " + result[0] + " Scute Swarm(s) on the battlefield, " + result[1] + " Insect(s) on the battlefield, and\n " );
        System.out.print( + result[2] + " Land(s) on the battlefield,\n");

        result = landfall(result[0],result[1],result[2]);

        System.out.println("The final result will be " + result[0] + " Scute Swarms, " + result[1] + " Insects, and " +  result[2] + " Lands.");



    }



}
