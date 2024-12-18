class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String regex = "";
        // x를 하나만 포함하는지를 확인하는 정규식
        // ^ [^x]* x [^x]* $
        
        for(String d : dic){ // d에 대해 
            int flag = 0;
            for(String s : spell){
                regex = "^[^" + s + "]*" + s + "[^" + s + "]*$";
                if(d.matches(regex)){ 
                    flag++; // d가 s를 딱 하나만 포함하면 flag ++
                }
            }
            if(flag == spell.length){
                return 1;
            }
        }
        
        return answer;
    }
}