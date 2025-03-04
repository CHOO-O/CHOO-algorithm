class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String scoreStr = dartResult.replaceAll("[^\\d]", " ");
        String[] scoreStrArr = scoreStr.split("\\s+");
        int[] scoreIntArr = new int[3];
        for(int i = 0; i < 3; i++){
            scoreIntArr[i] = Integer.parseInt(scoreStrArr[i]);
        }
        // int형태로 점수 배열에 저장
        
        String bonusStr = dartResult.replaceAll("[\\d]", " ");
        String[] bonusArr = bonusStr.split("\\s+");
        // 보너스+옵션 string 배열, 맨 앞 공백 하나 들어가서 길이 4
        
        boolean[] flagArr = {false, false, false};
        // 부호 저장할 배열.. true이면 마이너스
        
        int cnt = 0;
        while(cnt < 3){
            if(bonusArr[cnt+1].length() == 1){
                if((bonusArr[cnt+1].substring(0,1)).equals("D")){
                    scoreIntArr[cnt] = (int)Math.pow(scoreIntArr[cnt], 2);
                } else if((bonusArr[cnt+1].substring(0,1)).equals("T")){
                    scoreIntArr[cnt] = (int)Math.pow(scoreIntArr[cnt], 3);
                }    
            } else {
                if((bonusArr[cnt+1].substring(0,1)).equals("D")){
                    scoreIntArr[cnt] = (int)Math.pow(scoreIntArr[cnt], 2);
                } else if((bonusArr[cnt+1].substring(0,1)).equals("T")){
                    scoreIntArr[cnt] = (int)Math.pow(scoreIntArr[cnt], 3);
                }
                
                if(bonusArr[cnt+1].substring(1,2).equals("*")){
                    if(cnt != 0){
                        scoreIntArr[cnt-1] = scoreIntArr[cnt-1]*2;
                    }
                    scoreIntArr[cnt] = scoreIntArr[cnt]*2;
                } else if(bonusArr[cnt+1].substring(1,2).equals("#")){
                    flagArr[cnt] = true;
                }
            }
            
            cnt++;
        }
        // 보너스에 따라 점수 배열 값 조정
        
        for(int c = 0; c < 3; c++){
            if(flagArr[c] == false){
                answer += scoreIntArr[c];
            } else {
                answer -= scoreIntArr[c];
            }
        }
        // 최종 점수 계산
        
        return answer;
    }
}