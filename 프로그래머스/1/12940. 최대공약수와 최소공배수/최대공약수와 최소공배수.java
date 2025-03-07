import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        ArrayList<Integer> N = new ArrayList<>();
        ArrayList<Integer> M = new ArrayList<>();

        for(int i = 1; i*i <= n; i++){
            if(i*i == n){
                N.add(i);
            } else if(n%i == 0){
                N.add(i);
                N.add(n/i);
            }
        }
        
        for(int i = 1; i*i <= m; i++){
            if(i*i == m){
                M.add(i);
            } else if(m%i == 0){
                M.add(i);
                M.add(m/i);
            }
        }
        
        int[] Narr = new int[N.size()];
        int[] Marr = new int[M.size()];
        
        for(int i = 0; i < N.size(); i++){
            Narr[i] = N.get(i);
        }
        
        for(int i = 0; i < M.size(); i++){
            Marr[i] = M.get(i);
        }
        
        Arrays.sort(Narr);
        Arrays.sort(Marr);
        
        int yaksu = 0;
        boolean exit = false;
        
        for(int i = Narr.length - 1; i >= 0; i--){
            for(int j = Marr.length - 1; j >= 0; j--){
                if(exit == true){
                    break;
                }
                
                if(Narr[i] == Marr[j]){
                    yaksu = Narr[i];
                    answer[0] = yaksu;
                    exit = true;
                    break;
                }
            }
        }
        
        answer[1] = yaksu*(n/yaksu)*(m/yaksu);

        return answer;
    }
}