import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        } else {
            return gcd(y, x%y);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a  = Integer.parseInt(st.nextToken());
        int b  = Integer.parseInt(st.nextToken());

        // 1. 최대공약수 GCD(a, b) = GCD(b, r)
        int g = gcd(a, b);
        System.out.println(g);

        // 2. 최대공배수 LCM(a, b) = (a*b)/g
        System.out.println((a*b)/g);
    }
}