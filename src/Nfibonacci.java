public class Nfibonacci {

    public static void main(String [] args){
        int num = 1;
        System.out.println(fibonacci(num));
    }

//    Dynamic programming of finding Fibonacci of nth number

    private static int fibonacci(int num) {
        if(num == 0 || num == 1) return num;
        int[] memo = new int[num];
        memo[0] = 0;
        memo[1] = 1;

        for(int i = 2; i < num; i++){
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[num-1] + memo[num-2];
    }

//    private static int fibonacci(int num) {
//        if(num == 0 || num == 1) return num;
//
//        return fibonacci(num-1 + fibonacci(num-2));
//    }

}
