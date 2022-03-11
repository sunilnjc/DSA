import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

    public static void main(String [] args){

        System.out.println(longestCommonSubsequence("fish", "fosh"));
    }

    private static List<Character> longestCommonSubsequence(String fish, String fosh) {
        int doubleArr[][] = new int[fish.length()+1][fosh.length()+1];
        int result = 0;
        for(int i=1; i<fish.length()+1; i++){
            for (int j=1; j<fosh.length()+1; j++){
                if(fish.charAt(i-1) == fosh.charAt(j-1)){
                    if(i==0 || j==0){
                        doubleArr[i][j] = 1;
                    } else {
                        doubleArr[i][j] = doubleArr[i-1][j-1] + 1;
                    }
                    if(result < doubleArr[i][j]){
                        result = doubleArr[i][j];
                    }
                } else {
                    doubleArr[i][j] = Math.max(doubleArr[i-1][j], doubleArr[i][j-1]);
                }
            }
        }
        return buildSequence(doubleArr, fish);
    }

    private static List<Character> buildSequence(int[][] doubleArr, String fish) {
        List<Character> sequence = new ArrayList<Character>();
        int i = doubleArr.length - 1;
        int j = doubleArr[0].length - 1;

        while(i != 0 && j != 0){
            if(doubleArr[i][j] == doubleArr[i-1][j]){
                i--;
            } else if (doubleArr[i][j] == doubleArr[i][j-1]){
                j--;
            } else{
                sequence.add(0, fish.charAt(j - 1));
                i--;
                j--;
            }
        }
        return sequence;
    }
}
