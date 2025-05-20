import java.util.*;

public class CountingElements{
    @SuppressWarnings("unchecked")
    public static int countElements(int[] arr){
        int n = arr.length + 1;

        // never used
        //int[] hash = new int[n + 1];
        int sum = 0;

        @SuppressWarnings("rawtypes")
        HashSet set = new HashSet<>();
        //HashSet comparisonSet = new HashSet<>();

        for( int i = 0; i < n - 1; i++){

            set.add(arr[i]);
            //comparisonSet.add(arr[i]+1);
            // hash[arr[i]]++;
            // if(hash[arr[i]] > sum){
            //     sum++;
            // }
        }

        // this directly loops over the array instead of checking both values while manually looping.
        for (int num:arr){
            if(set.contains(num+1)){
                sum++;
            }
        }
        // needlessly complicated because it also has two true conditions that are needed to sum++
        // results in sum++ not being ++'d when it needs to be.
        // for(int i = 0; i < hash.length; i++){
        //     if(set.contains(i) && comparisonSet.contains(i)){
        //         sum ++;
        //     }   
        // }
        //hashmap array
        //loop over array, counting unique numbers of x+1
    
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {1,1,3,3,5,5,7,7};
        int[] arr3 = {1,1,2,2};

        System.out.println("Ans is " + countElements(arr) + ", expected 2");
        System.out.println("Ans2 is " + countElements(arr2) + ", expected 0");
        System.out.println("Ans3 is " + countElements(arr3) + ", expected 2");



    }

}