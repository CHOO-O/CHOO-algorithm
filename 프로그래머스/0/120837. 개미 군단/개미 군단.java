class Solution {
    public int solution(int hp) {
        int answer = 0;
        int temp = 0;
        
        // 장군 5, 병정 3, 일 1
        if(hp%5 != 0){
            temp = hp%5;
            answer = hp/5 + temp/3 + temp%3;
        } else {
            answer = hp/5;
        }
        
        return answer;
    }
}