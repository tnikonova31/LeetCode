package easy.validParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack <Character> braskets = new Stack<>();
        char [] brasketsInString = s.toCharArray();
        for(int i=0; i<brasketsInString.length; i++){
            if(isOpeningBrascet(brasketsInString[i])){
                braskets.push(brasketsInString[i]);
            } else if (braskets.empty()) {
                return false;
            } else{
                if((braskets.peek() == '(' && brasketsInString[i] == ')')
                || (braskets.peek() == '[' && brasketsInString[i] == ']')
                || (braskets.peek() == '{' && brasketsInString[i] == '}')){
                    braskets.pop();
                } else{
                    return  false;
                }
            }
        }

       if(braskets.empty()){
            return true;
        }
        return false;
    }

    public static boolean isOpeningBrascet(char brasket){
        if(brasket == '('
                || brasket=='['
                || brasket == '{'){
            return  true;
        }
        return false;
    }

}
