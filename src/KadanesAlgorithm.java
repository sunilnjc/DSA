/**
 * Problem statement
 *
 * Kadane's Algorithm
 * Write a function that takes in a non-empty array of integers and returns the maximum sum that can
 * be obtained by summing up all of the integers in a non empty subarray of the input array. A
 * subarray must only contain adjacent numbers (numbers next to each other in the input array).
 */

// Time complexity - O(N) || space complexity - O(1)
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] array = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        System.out.println(findMaximumSumInArray(array));

    }
    private static int findMaximumSumInArray(int[] array) {
        int maxEleHere = array[0];
        int maxSoFar = array[0];

        for(int i = 1; i <array.length; i++){
            int num = array[i];
            maxEleHere = Math.max(maxEleHere + num, num);
            maxSoFar = Math.max(maxEleHere, maxSoFar);
        }
        return maxSoFar;
    }
}
