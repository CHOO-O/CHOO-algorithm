class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for(int i = 0; i < code.length(); i++){
            char atCode =  code.charAt(i);
            if(mode == 0){ // mode가 0일 때
                if(atCode != '1'){ // code[idx]가 1이 아닐 때
                    ret =  i % 2 == 0 ? ret += atCode : ret ;
                } else {
                    mode = 1;
                }
            } else { //mode가 1일 때
                if(atCode != '1'){ // code[idx]가 1이 아닐 때
                    ret = i % 2 != 0 ? ret += atCode : ret ;
                } else {
                    mode = 0;
                }
            }
        }

        return ret.length() != 0 ? ret : "EMPTY";
    }
}