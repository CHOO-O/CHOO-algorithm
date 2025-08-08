import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        // 0. 최대점수보다 높은 점수의 사과 쳐내기
        int idx = score.length - 1;
        
        while(idx >= 0){
            if(score[idx] > k){
                idx--;    
            } else { 
                break;
            }
        }
        
        int count = idx + 1; // k점 이하인 사과의 개수
        
        // 사과 수가 박스최소개수보다 적으면 나가리
        if(m > count){
            System.out.println("여기서?" + count);
            return 0;
        }
        
        int box = count / m; // 결과적으로 나오는 박스 수 
        int boxCount = 0;
                
        while(true){
            answer += score[idx-m+1]*m;
            idx -= m;
            boxCount++;
            if(box == boxCount){
                break;
            }
        }
        
        return answer;
    }
}