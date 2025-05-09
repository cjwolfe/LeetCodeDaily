import java.util.*;
public class MatchLossesv2 {
    public static List<List<Integer>> findWinners(int[][] matches){
        // create maps to count losses (winners have no losses)
        Map<Integer,Integer> lossCount = new HashMap<>();
        Set<Integer> players = new HashSet<>();

        //populate the loss count, record all players
        for(int[] match : matches){
            //define winner/loser by arrays
            int winner = match[0];
            int loser = match[1];

            //record both players
            players.add(winner);
            players.add(loser);

            // losers have loss count incremented
            lossCount.put(loser, lossCount.getOrDefault(loser,0) +1);

        }

        // Lists to store players with 0 losses and exactly 1 loss
        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        // Classify Players based on their loss count
        for (int player : players) {
            int losses = lossCount.getOrDefault(player, 0);
            if (losses == 0) {
                noLoss.add(player);
            } else if (losses == 1) {
                oneLoss.add(player);
            }
        }

        // Sort both lists
        Collections.sort(noLoss);
        Collections.sort(oneLoss);

        // Prepare the answer list
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(noLoss);
        ans.add(oneLoss);

        return ans;
    }


    public static void main(String[] args) {
        int[][] matches = { {1,3},
                            {2,3},
                            {3,6},
                            {5,6},
                            {5,7},
                            {4,5},
                            {4,8},
                            {4,9},
                            {10,4},
                            {10,9}  };
        int[][] result = {  {1,2,10},
                            {4,5,7,8}   };

        System.out.println("Ans is " + findWinners(matches).toString() + ", expected ans is " + Arrays.deepToString(result));

        int[][] matches2 = {    {2,3},
                                {1,3},
                                {5,4},
                                {6,4}   };
        int[][] result2 =   {   {1,2,5,6},
                                {}      };
        System.out.println("Ans is " + findWinners(matches2).toString() + ", expected ans is " + Arrays.deepToString(result2));


    }
}
