function solution(num_list) {
    var answer = 0;
    // 2^n <= 값 < 2^n+1일 때 n번의 연산 필요
    
    for(var i = 0; i < num_list.length; i++){
        var check = false;
        var n = 0;
        while(check == false){
            if(num_list[i] >= Math.pow(2,n) && num_list[i] < Math.pow(2, n+1)){
                check = true;
                answer += n;
            } else {
                check = false;
                n++;
            }
        }
    }
    
    return answer;
}