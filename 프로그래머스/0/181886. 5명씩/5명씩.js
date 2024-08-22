function solution(names) {
    var answer = [];
    var len = names.length;
    
    if(len <= 5){ // 1. names 길이 5명 이하일 때
        answer.push(names[0]);
        
        return answer;
    } else { // 2. names 길이 5명 초과일 때
        var temp = [...names];
        var tlen = temp.length;
        
        while(tlen > 5){ // 5명보다 클 때 while문 실행 ( 5 이하 되면 실행x )
            // 2-1. answer에 맨 앞사람 이름 추가
            answer.push(temp[0]);
            // 2-2. 앞에서부터 5개의 요소 삭제
            temp.splice(0, 5);
            tlen = temp.length;
        }
        // 2-3. 남은 인원 맨 앞사람 추가   
        if( tlen != 0 ){
            answer.push(temp[0]);    
        }
    }
    
    return answer;
}