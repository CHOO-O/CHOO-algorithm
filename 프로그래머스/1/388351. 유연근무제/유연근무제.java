class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int injeong = 0;
        
        for(int i = 0; i < schedules.length; i++){
            int cnt = 0;
            boolean isOk = true;
            int day = startday;
            
            if(schedules[i]%100 >= 50){
                injeong = (schedules[i]%100 - 50) + (schedules[i]/100)*100 + 100;
            } else {
                injeong = schedules[i] + 10;
            }

            while(cnt < 7){
                if(day == 6){
                    day++;
                    cnt++;
                } else if(day == 7){
                    day = 1;
                    cnt++;
                } else {
                    if(timelogs[i][cnt] > injeong){
                        isOk = false;
                        break;
                    } else {
                        day++;
                        cnt++;
                    }
                }
                
            }
            
            if(isOk == true){
                answer++;
            }
        }
        
        return answer;
    }
}