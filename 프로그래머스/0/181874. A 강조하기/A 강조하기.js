function solution(myString) {
    var answer = '';
    
    for(var i = 0; i < myString.length; i++){
        if(myString[i] === 'a'){
            answer += myString[i].toUpperCase();
        } else if(myString[i] === 'A'){
            answer += myString[i];
        } else {
            answer += myString[i].toLowerCase();
        }
    }
    
    return answer;
}