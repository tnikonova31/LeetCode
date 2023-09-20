package easy.romanToInteger;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int answer=0;
        HashMap<Character, Integer> value = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        char[] input = s.toCharArray();
        int i=0;
        while(i!=input.length-1){
            if (isIV(input[i], input[i+1])
                || isIX(input[i], input[i+1])
                || isXL(input[i], input[i+1])
                || isXC(input[i], input[i+1])
                || isCD(input[i], input[i+1])
                || isCM(input[i], input[i+1])) {
                    answer=answer-value.get(input[i]);
            } else{
                answer=answer+value.get(input[i]);
            }
            i++;
        }
       answer=answer+value.get(input[i]);
       return answer;
    }

    private static boolean isCM(char first, char second) {
        return first == 'C' && second == 'M';
    }

    private static boolean isCD(char first, char second) {
        return first == 'C' && second == 'D';
    }

    private static boolean isXC(char first, char second) {
        return first == 'X' && second == 'C';
    }

    private static boolean isXL(char first, char second) {
        return first == 'X' && second == 'L';
    }

    public static boolean isIV(char first, char second){
        return first == 'I' && second == 'V';
    }

    public static boolean isIX(char first, char second){
        return first == 'I' && second == 'X';
    }
}
