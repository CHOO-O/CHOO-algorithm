import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] buffs = br.readLine().split(" ");
        long A = Long.parseLong(buffs[0]);
        long B = Long.parseLong(buffs[1]);
        long C = Long.parseLong(br.readLine());

        if(A+B >= C*2){
          System.out.println(A+B-2*C);
        } else{
          System.out.println(A+B);
        }
    }
}