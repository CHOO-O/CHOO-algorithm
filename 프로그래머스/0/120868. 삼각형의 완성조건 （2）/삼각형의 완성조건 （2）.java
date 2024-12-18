class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        if(sides[0] > sides[1]){
            a = sides[0];
            b = sides[1];
        } else {
            a = sides[1];
            b = sides[0];
        }
        
        // 1. 나머지 한 변이 가장 긴 변일 때
        int s = a;
        while(s < a+b){
            answer++;
            s++;
        }
        
        // 2. 나머지 한 변이 가장 긴 변이 아닐 때
        int ss = a-1;
        while(ss + b > a && ss > 0){
            answer++;
            ss--;
        }
        
        return answer;
    }
}