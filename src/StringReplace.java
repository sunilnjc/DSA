import java.util.Locale;

public class StringReplace {
    public static void main(String[] args) {
        String sToReplace = "Hello World. This is Oregano Pizzerio";
        char chToReplace = 'o';
        System.out.println(stringToReplace(sToReplace, chToReplace));
    }

    private static String stringToReplace(String sToReplace, char chToReplace) {
        char ch[] = sToReplace.toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(var c: ch){
            if(Character.toLowerCase(c) == Character.toLowerCase(chToReplace)){
                sb.append(++count);
            }else {
                sb.append(c);
            }
        }
    return sb.toString();
    }
}
