function solution(my_string) {
    var answer = [];
    var splitArr = my_string.split(" ");
    
    answer = splitArr.filter(i => i !== "");

    return answer;
}