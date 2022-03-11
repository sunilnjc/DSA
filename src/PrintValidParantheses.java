import java.util.ArrayList;
import java.util.List;

public class PrintValidParantheses {
    public static void main(String [] args){

        int count = 2;
        System.out.println(generateParens(count));
    }

    private static List<String> generateParens(int count) {
        List<String> result = new ArrayList<>();
        char[] str = new char[count * 2];
        addParen(result, str, count, count,0);
        return result;
    }

    private static void addParen(List<String> result, char[] str, int leftRem, int rightRem, int index) {

        if(leftRem < 0 || rightRem < leftRem) return;

        if(leftRem==0 && rightRem ==0){
            result.add(String.copyValueOf(str));
            System.out.println(result);
        }else {
            str[index] = '(';
            addParen(result, str, leftRem - 1, rightRem, index + 1);

            str[index] = ')';
            addParen(result, str, leftRem, rightRem - 1, index + 1);
        }
    }
}
