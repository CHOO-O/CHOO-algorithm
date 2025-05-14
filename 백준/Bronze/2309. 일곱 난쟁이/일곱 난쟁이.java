import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 9명의 난쟁이들의 키를 받으며 키의 sum을 구한다.
        int[] heights = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++){
            int temp = Integer.parseInt(br.readLine());
            heights[i] = temp;
            sum += temp;
        }

        // 2. 키의 합이 sum - 100 이 되는 두 난쟁이의 번호를 구한다.
        int a = 0;
        int b = 0;
        int left = sum - 100;

        for(int i = 0; i < 8; i++){
            if(heights[i] >= left){
                continue;
            }

            for(int j = i+1; j < 9; j++){
                if(heights[i] + heights[j] == left){
                    a = i;
                    b = j;
                }
            }
        }

        // 3. heights 배열에서 두 난쟁이의 키는 음수로 바꿔버리고 sort해버린 뒤, index 2부터 print하기
        heights[a] = -1;
        heights[b] = -1;

        Arrays.sort(heights);

        for(int i = 2; i < 9; i++){
            System.out.println(heights[i]);
        }

    }
}
