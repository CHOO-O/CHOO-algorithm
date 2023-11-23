class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int pCount = 0;
        //1. 총 number명의 기사가 있음
        //2. 각 기사의 약수 개수로 공격력을 구하기
        //3. 만약 공격력이 limit을 초과하면
        //4. 해당 기사의 공격력을 power로 대체하기
        for(int i = 1; i <= number; i++){ 
            for(int j = 1; j*j <= i; j++){
                if(j*j == i) {
                    pCount++;
                } else if(i%j == 0){
                    pCount += 2;
                }
            }
            
            pCount = pCount > limit ? power : pCount;
            answer += pCount;
            pCount = 0;
        }
        
        return answer;
    }
}