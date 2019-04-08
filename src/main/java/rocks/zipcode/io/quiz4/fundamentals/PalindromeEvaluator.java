package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        List<String> ans = new ArrayList();

        String[] substrings = StringEvaluator.getAllSubstrings(string);

        for(String s : substrings){
            if(reverseString(s).equals(s)){
                ans.add(s);
            }
        }


        return ans.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {

        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {

        StringBuilder sb = new StringBuilder(string);

        sb.reverse();
        return sb.toString();
    }
}
