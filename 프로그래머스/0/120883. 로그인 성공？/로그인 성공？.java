class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        int i = 0;
        
        while(i < db.length){
            if(db[i][0].equals(id_pw[0])){
                if(db[i][1].equals(id_pw[1])){
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            }
            i++;
        }
        
        return answer;
    }
}