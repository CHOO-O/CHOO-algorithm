import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // 더 나은 방법 : 
        // 10진수 정수 값을 비트 연산하면 2진수 형태로 비트 연산을 수행한 뒤 10진수 형태로 저장하게 된다.
        // 이를 다시 Integer.toBinaryString(str)을 사용해 2진수 변환한 string으로 변환해준다.
        for(int i = 0; i < n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        
        // replaceAll을 사용해 간단하게 치환해준다.
        // 길이가 n이 되지 않을 경우를 반드시 고려한다.
        for(int j = 0; j < n; j++){
            String temp = answer[j];
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            while(temp.length() < n){
                temp = " " + temp;
            }
            
            answer[j] = temp;
        }
        
        return answer;
    }
}