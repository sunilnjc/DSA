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
