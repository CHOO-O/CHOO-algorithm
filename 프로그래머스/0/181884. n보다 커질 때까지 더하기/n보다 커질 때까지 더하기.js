function solution(numbers, n) {
    var answer = 0;
    var sum = 0;
    
    for(var i = 0; i < numbers.length; i++){
        sum = sum + numbers[i];
        
        if(sum > n){
            return sum;
        }
    }
    
    return answer;
}