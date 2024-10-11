import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        int len = arr.length;
        
        // 1. arr를 ArrayList로 변환
        ArrayList<Integer> temp = new ArrayList<>();
        for(int num : arr){
            temp.add(num);
        }
        
        // 2. 2의 i제곱이 arr의 크기보다 같거나 커질 때 까지 while문을 돌려 i값 찾기
        while(Math.pow(2, i) < len){
            i++;
        }
        
        // 3. 2의 i제곱만큼의 for문, ArrayList 길이랑 비교해서 0 추가해야 하면 그만큼 추가
        for(int k = 0; k < Math.pow(2,i); k++){
            if(k >= len){
                temp.add(0);
            } 
        }
        
        int[] answer = new int[temp.size()];
        
        for(int j = 0; j < temp.size(); j++){
            answer[j] = temp.get(j);
        }
        
        return answer;
    }
}