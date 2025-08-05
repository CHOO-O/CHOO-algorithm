class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String burger = "1231";
        
        for(int i : ingredient){
            sb.append(i);
            
            if(sb.length() >= 4){
                int len = sb.length();
                
                if(sb.substring(len - 4, len).equals(burger)){
                    sb.delete(len - 4, len);
                    answer++;
                }
            }
        }
        
        return answer;
    }
}