package easy.noAnswerlongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        sortByLenght(strs);
        String prefix;

        if (strs.length == 0) {
            return "";
        } else{
            prefix = strs[0];
            for (int i = 1; i < strs.length; i++){
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()){
                        return "";
                    }
                }
            }
        }

        return prefix.toString();
    }





    public static String[] sortByLenght(String [] strs){
        Comparator<String> sortByLength = new Comparator<String>(){
            @Override
            public int compare (String s1, String s2) {
                if(s1.length() > s2.length()){
                    return 1;
                }else{
                    if(s1.length() < s2.length()){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        };
        Arrays.sort(strs, sortByLength);
        return strs;
    }
}
