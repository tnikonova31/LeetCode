package easy.lenghtOfLastWorld;

public class LengthOfLastWord {
    public static int lengthOfLastWord (String s){
        int indexLastLetter=s.length();
        while(s.substring(indexLastLetter-1,indexLastLetter).equals(" ")){
            indexLastLetter--;
        }
        int lastIndexOfSpace = s.substring(0,indexLastLetter).lastIndexOf(" ");
        return s.substring(lastIndexOfSpace+1, indexLastLetter).length();
    }
}
