package src;
import java.util.*;
public class L125_Validpalindrome {
    boolean checkpalindrome(String s){
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j) ){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s){
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String cleanedStr = cleaned.toString();
        return checkpalindrome(cleanedStr);
    }
}
