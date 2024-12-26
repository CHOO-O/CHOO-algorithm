import java.util.Arrays;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int cnt = 1;
        
        char[] arr = A.toCharArray();
        char[] barr = B.toCharArray();
        char[] tarr = new char[A.length()];
        
        if(A.equals(B)){
            return 0;
        }
        
        while(cnt < A.length()){
            tarr[0] = arr[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++){
                int j = i + 1;
                tarr[j] = arr[i];
            }
            if(Arrays.equals(tarr, barr)){
                return cnt;
            }
            arr = Arrays.copyOf(tarr, tarr.length);
            cnt++;
        }

        return -1;
    }
}