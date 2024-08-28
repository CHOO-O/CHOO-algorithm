function solution(num_list) {
    var sum = 0;
    var prod = 1;
    
    if(num_list.length >= 11){
        for(var i of num_list){
            sum += i;
        }
        return sum;
    } else {
        for(var i of num_list){
            prod *= i;
        }
        return prod;
    }
}