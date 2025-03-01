class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        
        for(int a = 0; a < len; a++){
            for(int b = a + 1; b < len; b++){
                for(int c = b + 1; c < len; c++){
                    int temp = nums[a] + nums[b] + nums[c];
                    // System.out.println(nums[a] + " + " + nums[b] + " + " + nums[c] + " = " + temp );
                    boolean flag = false;
                    
                    // 소수 판단 (1 or temp 이외의 약수가 존재하지 않는가)
                    for(int i = 2; i*i <= temp; i++){
                        if(i*i == temp){
                            flag = false;
                            break;
                        } else if(temp%i == 0){
                            flag = false;
                            break;
                        } 
                        flag = true;
                    }
                    
                    answer = flag ? answer + 1 : answer ;
                }
            }
        }

        return answer;
    }
}