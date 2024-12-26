import java.util.ArrayList;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        char[] b1 = bin1.toCharArray();
        char[] b2 = bin2.toCharArray();    
        if(b1.length >= b2.length){
            answer = sum(b1, b2);
        } else {
            answer = sum(b2, b1);
        }
        
        return answer;
    }
    
    private String sum(char[] l, char[] s){
        // l1이 더 긴 쪽, l2가 더 짧은 쪽
        ArrayList<Integer> res = new ArrayList<>();
        int buffer = 0;
        int li = l.length - 1;
        int si = s.length - 1;
        String result = "";
        
        // 1이 0개 : buffer 0, res 0
        // 1이 1개 : buffer 0, res 1
        // 1이 2개 : buffer 1, res 0
        // 1이 3개 : buffer 1, res 1
    
        while(si >= 0){
            if(l[li] == '1' && l[li] == s[si]){ // 1, 1
                if(buffer == 0){ // b0
                    res.add(0);
                    buffer = 1;
                } else { // b1
                    res.add(1);
                    buffer = 1;
                }
            } else if(l[li] == '0' && l[li] == s[si]){ // 0, 0
                if(buffer == 0){ // b0
                    res.add(0);
                    buffer = 0;
                } else { // b1
                    res.add(1);
                    buffer = 0;
                }
            } else { // 1, 0 or 0, 1
                if(buffer == 0){ // b0
                    res.add(1);
                    buffer = 0;
                } else { // b1
                    res.add(0);
                    buffer = 1;
                }
            }
            li--;
            si--;
        }
        
        int lfti = (l.length - s.length) - 1;
        while(lfti >= 0){
            if(l[lfti] == '1'){
                if(buffer == 1){
                    res.add(0);
                    buffer = 1;
                } else {
                    res.add(1);
                    buffer = 0;
                }
            } else {
                if(buffer == 1){
                    res.add(1);
                    buffer = 0;
                } else {
                    res.add(0);
                    buffer = 0;
                }
            }
            lfti--;
        }
        
        if(buffer == 1){
            res.add(1);
        }
        
        for(int i = res.size() - 1; i >= 0; i--){
            result += res.get(i);
        }
        
        return result;
    }
}