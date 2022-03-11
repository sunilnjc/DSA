import java.util.Arrays;

public class FindRepeatingElement {

    public static void main(String[] args) {

        int[] N = {3, 1, 3, 4, 3, 2};
        int counter = 0;
        int repeatedEleCount = N.length / 3;
        int element = 0;

        System.out.println(findRepeatedEle(N, counter));

        // Solution1 :  Time complexity - O(N * 2)
        for(int i = 0; i < N.length; i++){
            for(int j = i+1; j < N.length; j++){
                if(N[i] == N[j]){
                    counter++;
                    element = N[i];
                }
            }
        }
        if(counter > repeatedEleCount){
            System.out.println("the element is " + element);
        }
    }

    //Solution2:  Time complexity - O(NlogN) - as I am using sorting
    private static int findRepeatedEle(int[] N, int counter) {
        int element = 0;
        Arrays.sort(N);
        int repeatedEleCount = N.length / 3;
        for (int i = 0; i < N.length; i++) {
            if (i < N.length - 1) {
                if (N[i] == N[i + 1]) {
                    counter++;
                }
            }
        }
        if(counter == repeatedEleCount) {
            return element;
        }
        return element;
    }
}
