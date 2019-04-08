package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        String[] stringArray = string.split("");

        Set<String> ans = new HashSet<>();



        for(int i = 0; i < string.length(); i++){

            for(int j = i+1; j <= string.length(); j++){

              String temp = string.substring(i,j);
                ans.add(temp);
            }

        }
        return ans.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] string1Subs = getAllSubstrings(string1);
        String[] string2Subs = getAllSubstrings(string2);

       String ans = "";

        List<String> string2ArrayList = new ArrayList<>();
        Arrays.stream(string2Subs).forEach( st -> string2ArrayList.add(st));

        for(String string : string1Subs){
            if(string2ArrayList.contains(string)){
                ans+=string + ",";
            }
        }

        return ans.split(",");
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        String[] substrings = getCommonSubstrings(string1,string2);
        String temp = substrings[0];
        for(String s : substrings){
            if(s.length() > temp.length()){
                temp = s;
            }
        }
        return temp;
    }
}
