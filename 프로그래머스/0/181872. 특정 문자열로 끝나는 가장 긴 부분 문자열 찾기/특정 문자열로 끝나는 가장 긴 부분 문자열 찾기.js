function solution(myString, pat) {
    var answer = '';
    
    answer = myString.slice(0, myString.lastIndexOf(pat) + pat.length);
    /* 
        myString.lastIndexOf(pat)는 pat의 첫 글자 기준 인덱스를 반환함
        그러나 slice(startindex, [endindex])의 endindex는
        해당 index값 미만까지 자르기 때문에 (포함 안함)
        마지막 글자 기준 인덱스 값 + 1 을 해주게 되어 pat.length를 더하게 됨
    */ 
    
    return answer;
}