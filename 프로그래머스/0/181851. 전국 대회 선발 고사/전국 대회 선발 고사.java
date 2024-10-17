import java.util.HashMap;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        HashMap<Integer, Integer> temp = new HashMap<>();
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i] == true){
                temp.put(rank[i], i); // true일 때 rank:index
            }
        }
        
        int a = -1;
        int b = -1;
        int c = -1;
        
        for(int i =1; i <= rank.length; i++){ // rank기준으로 가져와보기
            if(temp.get(i) != null){
                if(a == -1){
                    a = temp.get(i);
                } else if(b == -1){
                    b = temp.get(i);
                } else if (c == -1){
                    c = temp.get(i);
                    break;
                }
            }
        }
        
        return 10000*a + 100*b + c;
    }
}