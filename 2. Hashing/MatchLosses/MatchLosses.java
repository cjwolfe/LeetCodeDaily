
import java.util.*;

public class MatchLosses {

    // @SuppressWarnings("unread")
    @SuppressWarnings("unchecked")

    public static List<List<Integer>> findWinners(int[][] matches) {
        
        // matches [i] = [winner_i, loser_i]
        int length = matches.length;

        TreeSet<Integer> wins = new TreeSet<>();
        TreeSet<Integer> losses = new TreeSet<>();

        // count wins, never lost
        for(int i = 0; i < length; i++){
            int winner = matches[i][0];
            int loser = matches[i][1];

            wins.add(winner);
            losses.add(loser);
            
        }

        // remove all players who have lost from winners set
        for(int loser : losses){
            wins.remove(loser);
        }

        // count losses, lost exactly one
     

        // create return list
        TreeSet<Integer>[] treeSetArray = new TreeSet[2];
        // treeSetArray[0] = new TreeSet<>(wins.toArray());
        // tresSetArray[1] = new TreeSet<>(losses.toArray());


        List<List<Integer>> ans = new ArrayList<>();

        for(TreeSet<Integer> set : treeSetArray){
            ans.add(new ArrayList<>(set));
        }

        //added to shut up vscode
        ans.add(new ArrayList<>(wins));

        
        // add inner lists
        // ans.add(new ArrayList<>());
        // ans.add(new ArrayList<>());

        //can now add elements to inner lists
        //ans.get(0).add(1);
        // for( ; ; ){
        
        // }
        



        
        
        // add winners to output list
        // not like this tho
        // for(int i : ans.get(0)){
        //     ans.get(0).add(i);
        
        // }
        // int j = wins.size();

        // for( int i = 0; i < j; i++){
        //     while(wins.contains(i)){
        //     ans.get(0).add(i);
        //     }
        
        // }

        // add losers to output list

        
        
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
