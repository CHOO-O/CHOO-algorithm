class Solution {
    public int[] solution(int[] numbers, String direction) {
        int e = numbers.length;
        int[] answer = new int[numbers.length];
        
        switch(direction){
            case "right" :
                for(int i = 0; i < e-1; i++){
                    answer[i+1] = numbers[i];
                }
                answer[0] = numbers[e-1];
                break;
            case "left" :
                for(int i = 1; i < e; i++){
                    answer[i - 1] = numbers[i];
                }
                answer[e-1] = numbers[0];
                break;
        }
        
        return answer;
    }
}