import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

    public static  void  main(String [] args){

        String s = "[((([])([]){}){}){}([])[]((())";
        System.out.println("string length "+ s.length());

        System.out.println(balancedBrackets("[((([])([]){}){}){}([])[]((())"));

    }

    public static boolean balancedBrackets(String str) {
        // Write your code here.
        Map<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i< str.length(); i++){
            if(brackets.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
            } else {
                char pop = stack.pop();
                if(brackets.get(pop) == str.charAt(i)){
                    continue;
                } else{
                    return false;
                }
            }
        }

        return true;
    }

}
