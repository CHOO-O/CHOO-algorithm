import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        String temp1 = myString.replace('A', 'X'); // A -> X
        String temp2 = temp1.replace('B', 'A'); // B -> A
        String temp3 = temp2.replace('X', 'B'); // X -> B
        
        boolean ans = temp3.contains(pat);
        
        if(ans == true){
            return 1; 
        } else {
            return 0;
        }

    }
}