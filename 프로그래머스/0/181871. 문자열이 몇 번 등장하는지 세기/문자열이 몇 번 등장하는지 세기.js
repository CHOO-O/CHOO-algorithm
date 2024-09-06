function solution(myString, pat) {
    var answer = 0;
    var i = 0;
    
    while(1){
        if(myString.indexOf(pat, i) < 0){
            // 찾지 못했을 때 -1 반환
            break;
        } else {
            // 찾은 경우 i를 해당 index + 1 로 설정, answer 카운트 업
            i = myString.indexOf(pat, i) + 1;
            answer++;
        }
    }
    
    return answer;
}