import java.util.*;

public class MinimumChangeToAmount {

    public static void main(String [] args){
        int[] denoms = {1,2,4};
        System.out.println(minNumberOfCoinsForChange(6, denoms));
    }
        public static int minNumberOfCoinsForChange(int n, int[] denoms) {
            // Write your code here.
            int[] numOfCoins = new int[n+1];
            Arrays.fill(numOfCoins, Integer.MAX_VALUE);
            int toCompare = 0;
            numOfCoins[0] = 0;
            for(int denom: denoms){
                for(int amount = 0; amount < numOfCoins.length; amount++){
                    if(denom <= amount){
                        if(numOfCoins[amount - denom] == Integer.MAX_VALUE){
                            toCompare = numOfCoins[amount - denom];
                        } else {
                            toCompare = numOfCoins[amount - denom] + 1;
                        }
                        numOfCoins[amount] = Math.min(toCompare, numOfCoins[amount]);
                    }
                }
            }
            return numOfCoins[n] != Integer.MAX_VALUE ? numOfCoins[n] : -1;
        }
}
