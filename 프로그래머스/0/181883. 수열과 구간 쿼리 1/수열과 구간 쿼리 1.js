function solution(arr, queries) {
    var answer = arr;

    for(var i = 0; i < queries.length; i++){
        var s = queries[i][0];
        var e = queries[i][1];
        
        for(var j = s; j <= e; j++){
            // splice: j번째 index부터 1개의 값을 제거, answer[j] + 1한 값으로 대체
            answer.splice(j, 1, answer[j] + 1)
        }
    }
    
    return answer;
}