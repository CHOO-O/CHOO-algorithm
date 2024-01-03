import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        char[] list = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i = 0; i < my_string.length(); i++){
            char temp = my_string.charAt(i); 
            for(int j = 0; j < list.length; j++){ 
                if(temp == list[j]){ //만약 문자열의 i번째 글자가 list의 j번째 알파벳과 같으면
                    answer[j] += 1; // answer의 j번째 값에 1을 더해준다
                }
            }
        }
        
        return answer;
    }
}