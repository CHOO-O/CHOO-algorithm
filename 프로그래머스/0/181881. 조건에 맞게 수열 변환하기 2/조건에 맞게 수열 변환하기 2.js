function solution(arr) {
    var answer = 0;
    var tarr = arr;
    var check = 0;

    while(1){
        for(var i = 0; i < arr.length; i++){
            if( tarr[i] >= 50 && tarr[i]%2 == 0){
                tarr.splice(i, 1, tarr[i]/2);
            } else if ( tarr[i] < 50 && tarr[i]%2 != 0){
                tarr.splice(i, 1, tarr[i]*2 + 1);
            } else {
                tarr.splice(i, 1, tarr[i]);
                check += 1;
            }   
        }
        answer += 1;
        
        if (check == arr.length){
            return answer - 1;
        } else {
            check = 0;
        }
    }

}