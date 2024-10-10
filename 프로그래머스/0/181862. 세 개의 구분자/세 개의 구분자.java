import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        // 1. a, b, c를 각각 공백으로 치환
        String temp = myStr.replaceAll("[abc]", " ");
        
        // 2. 치환한 문자열을 공백을 기준으로 split
        String[] tempSplit = temp.split(" ");

        // 3. split한 배열에서 값이 공백인 요소를 제거
        ArrayList<String> tempList = new ArrayList<>(Arrays.asList(tempSplit));
        tempList.removeIf(a -> a.equals(""));
        String[] answer = tempList.toArray(new String[0]);
        
        // 4. 제거한 결과가 빈 배열일 때 처리
        if(answer.length == 0){
            String[] ansE = {"EMPTY"};
            return ansE;
        } else {
            return answer;
        }
    }
}