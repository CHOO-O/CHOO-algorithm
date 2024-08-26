function solution(todo_list, finished) {
    var answer = [];
    var len = todo_list.length;
    
    for( var i = 0; i < len; i++){
        if(finished[i] == false){
            answer.push(todo_list[i]);
        }
    }
    
    return answer;
}