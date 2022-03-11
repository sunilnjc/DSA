/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String s1 = "mary";
        String s2 = "army";
        System.out.println(findValidAnagrams(s1, s2));
    }
    public static boolean findValidAnagrams(String s1, String s2){
        if( s1 == null || s2 == null){
            return false;
        }
        if(s1.length() != s2.length()){
            return false;
        }

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

//        Arrays.equals(ch1, ch2);

//        String s3 = String.valueOf(ch1);
//        String s4 = String.valueOf(ch2);

        if(Arrays.equals(ch1, ch2)){
            return true;
        }

        return false;
    }
}