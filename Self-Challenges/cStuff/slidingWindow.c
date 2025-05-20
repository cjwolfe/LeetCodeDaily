#include <stdio.h>

int maxSum(int arr[], int n, int k)
{
    if(k>n){
        // not enought elements for the window size, exit
        return -1;
    }
    // create tracker for maximum sum
    int maxSum = 0;
    // 1. compute sum of first window of size k
    for (int i = 0; i < k; i++)
    {
        maxSum = maxSum + arr[i];
        /* code */
    }
    int windowSum = maxSum;

    // 2. slide the window across the array
    for(int i = k; i < n; i++)
    {   
        windowSum = windowSum + arr[i] - arr[i-k];
        if(windowSum > maxSum){
            maxSum = windowSum;
        }
    
    }
    


    return maxSum;
}

int main()
{
    // Given an array of integers and a number k, find the maximum sum of a subarray of size k.
    int arr1[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}; int k1 = 4; // should return 39
    int arr2[] = {100, 200, 300, 400}; int k2 = 2;           // should return 700
    int arr3[] = {2, 3}; int k3 = 3;                         // invalid if k > n
    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    int n3 = sizeof(arr3) / sizeof(arr3[0]);

    printf("1. Max sum of subarray of size %d is %d, should be 39\n", k1, maxSum(arr1, n1, k1));
    printf("2. Max sum of subarray of size %d is %d, should be 700\n", k2, maxSum(arr2, n2, k2));
    printf("3. Max sum of subarray of size %d is %d, should be invalid\n", k3, maxSum(arr3, n3, k3));
    return 0;


}