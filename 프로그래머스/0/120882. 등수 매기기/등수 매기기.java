import java.util.Arrays;
import java.util.LinkedHashMap;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        for(int i = 0; i < score.length; i++){
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        double[] sort = Arrays.copyOf(avg, score.length);
        Arrays.sort(sort);
        
        LinkedHashMap<Double, Integer> map = new LinkedHashMap<>();
        
        for(int i = score.length-1; i >= 0; i--){
            map.put(sort[i], map.getOrDefault(sort[i], 0) + 1);
        }
        // 중복랭크 어떻게 처리할것인지
        // hashset에 sort를 기준으로
        // 점수 - 개수 로 저장 후
        // 위에서부터 rank를 저장하기
        // 1개면 넣은 후 rank + 1
        // n개면 넣은 후 rank + n
        int rank = 1;
        
        for(Double key : map.keySet()){
            // System.out.println(key + "," + map.get(key));
            if(map.get(key) == 1){
                for(int i = 0; i < score.length; i++){
                    if(avg[i] == key){
                        answer[i] = rank;
                    }
                }
                rank++;
            } else {
                for(int i = 0; i < score.length; i++){
                    if(avg[i] == key){
                        answer[i] = rank;
                    }
                }
                rank += map.get(key);
            }
        }

        return answer;
    }
}