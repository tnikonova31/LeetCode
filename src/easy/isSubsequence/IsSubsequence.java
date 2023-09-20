package easy.isSubsequence;

public class IsSubsequence {
    public static boolean isIsSubsequence(String s, String t){
        if(s.equals(t) || s.isEmpty()){
            return true;
        } else if (t.isEmpty()) {
            return false;
        }
        int lastIndex=0;
        int indexInSequence;

        for(int i=0; i<s.length(); i++){
            indexInSequence = t.indexOf(s.charAt(i),lastIndex);
            if(lastIndex == indexInSequence && lastIndex >0){
                indexInSequence = t.indexOf(s.charAt(i),lastIndex+1);
            }
            if(indexInSequence == -1 || indexInSequence < lastIndex){
                return false;
            }
            lastIndex = indexInSequence;
        }
        return true;
    }
}
