import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuteUniqueStringsMethod2 {
    public static void main(String [] args){

        Set<String> result  = new HashSet<String>();
        System.out.println(permuteUniqueStringChars("","aac", result));

    }

    private static Set<String> permuteUniqueStringChars(String prefix, String remainder, Set<String> result) {
        int length = remainder.length();
        if(length == 0) result.add(prefix);
        for(int i=0; i<length; i++){
            String before = remainder.substring(0,i);
            String after = remainder.substring(i+1, length);
            char ch = remainder.charAt(i);
            permuteUniqueStringChars(prefix + ch, before + after, result);
        }
        return result;
    }
}
