package easy.validPalindrome;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder newS = new StringBuilder();
            char arr[] = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(Character.isLetterOrDigit(arr[i]) && !Character.isSpaceChar(arr[i])){
                    newS.append(arr[i]);
                }
            }
            if(newS.length()>0) {
                char [] arr2 = newS.toString().toLowerCase().toCharArray();
                for (int i = 0; i < newS.length()/2; i++) {
                    if(arr2[i] != arr2[arr2.length-1-i]){
                        return false;
                    }
                }
            }
       return true;
    }
}
