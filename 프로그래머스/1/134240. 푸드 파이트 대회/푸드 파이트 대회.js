function solution(food) {
    var answer = '';
    var half = '';
    
    for(var i = 1; i < food.length; i++){
        for(var j = 0; j < Math.floor(food[i]/2); j++){
            // food[i]/2 정수처리 안하면 한 번 더 동작해서 잘못된 값 출력함
            half += i;
        }
    }
    
    var reverse = half.split("").reverse().join(""); // 외울 것. 문자열 뒤집기
    
    answer = half + "0" + reverse; 
    
    return answer;
}