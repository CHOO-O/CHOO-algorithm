function solution(strArr) {
    var answer = [];
    
    for(var i = 0; i < strArr.length; i++){
        if(strArr[i].indexOf("ad") < 0){ 
            // ad 미포함 시 answer에 push
            answer.push(strArr[i]);
        }
    }
    
    return answer;
}