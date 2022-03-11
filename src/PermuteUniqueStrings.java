import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuteUniqueStrings {
    public static void main(String [] args){

        System.out.println(permuteUniqueStringChars("abc"));

    }

    private static Set<String> permuteUniqueStringChars(String remainder) {
        int length = remainder.length();
        Set<String> result  = new HashSet<String>();
        if(length == 0){
            result.add("");
            return  result;
        }
        for(int i=0; i<length; i++){
            String before = remainder.substring(0,i);
            String after = remainder.substring(i+1, length);
            Set<String> partials = permuteUniqueStringChars(before + after);
            for(String s: partials){
                result.add(remainder.charAt(i) + s);
            }
        }
        return result;
    }
}
