function solution(myString, pat) {
    var newString = myString.toLowerCase();
    var newPat = pat.toLowerCase();
    
    if (newString.indexOf(newPat) != -1){
        return 1;
    } else {
        return 0;
    }
}