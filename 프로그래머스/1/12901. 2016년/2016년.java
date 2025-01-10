class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        // 31일: 1 3 5 7 8 10 12
        // 30일: 4 6 9 11
        // 29일: 2
        
        // 1월 1일부터 a월 b일까지의 일 수는?
        int m = 1;
        int res = 0;
        while(m != a){
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                res += 31;
            } else if(m == 4 || m == 6 || m == 9 || m == 11){
                res += 30;
            } else {
                res += 29;
            }
            m++;
        }
        
        res += (b - 1);
        
        switch(res%7){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5: 
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }
        
        return answer;
    }
}