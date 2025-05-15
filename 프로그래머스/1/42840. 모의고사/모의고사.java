class Solution {
    public int[] solution(int[] answers) {
        int[] ans1 = {1, 2, 3, 4, 5};
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == ans1[idx1]) score1 ++;
            if(answers[i] == ans2[idx2]) score2 ++;
            if(answers[i] == ans3[idx3]) score3 ++;
            
            idx1++;
            if(idx1 == 5) idx1 = 0;
            idx2++;
            if(idx2 == 8) idx2 = 0;
            idx3++;
            if(idx3 == 10) idx3 = 0;
        }
        // 경우의 수
        // 한명만 1등, 두명이 공동1등, 세명이 공동1등
        
        if(score1 > score2 && score1 > score3){
            int[] answer = {1};
            return answer;
        } else if (score2 > score1 && score2 > score3){
            int[] answer = {2};
            return answer;
        } else if (score3 > score1 && score3 > score2){
            int[] answer = {3};
            return answer;
        } else if (score1 > score3 && score1 == score2){
            int[] answer = {1, 2};
            return answer;
        } else if (score1 > score2 && score1 == score3){
            int[] answer = {1, 3};
            return answer;
        } else if (score2 > score1 && score2 == score3){
            int[] answer = {2, 3};
            return answer;
        } else {
            int[] answer = {1, 2, 3};
            return answer;
        } 
    }
}