package easy.palindromeNumber;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int reverseNumber = 0;
        if(x>=0){
            int i = x;
            for( ; i!= 0 ; i /= 10){
                reverseNumber = reverseNumber * 10 + i%10;
            }
            if(reverseNumber == x){
                return  true;
            }
        }
        return  false;
    }
}
