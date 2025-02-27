import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            String temp1 = Integer.toBinaryString(arr1[i]);
            while(temp1.length() < n){
                temp1 = "0" + temp1;
            }
            
            String temp2 = Integer.toBinaryString(arr2[i]);
            while(temp2.length() < n){
                temp2 = "0" + temp2;
            }
                    
            String temp3 = "";
            for(int j = 0; j < n; j++){
                if(temp1.charAt(j) == '0' && temp2.charAt(j) == '0'){
                    temp3 += " ";
                } else {
                    temp3 += "#";
                }
            }
            answer[i] = temp3;
        }
        
        return answer;
    }
}