package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main16237DH {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int count = e;

        while (a != 0 && d != 0) {
            count++;
            a--;
            d--;
        }

        while (b != 0 && c != 0) {
            count++;
            b--;
            c--;
        }

        while (a != 0 && c != 0) {
            count++;
            c--;
            if (a >= 2) {
                a-=2;
            } else {
                a--;
            }
        }

        while (a != 0 && b != 0) {
            count++;
            if (b >= 2) {
                a-=1;
                b-=2;
            } else if (a >= 3){
                a-=3;
                b--;
            } else if (a >= 2){
                a-=2;
                b--;
            } else {
                a--;
                b--;
            }
        }

        if (a != 0) {
            count += a/5;
            if (a%5 != 0) {
                count++;
            }
        }

        if (b != 0) {
            count += b/2;
            if (b%2 != 0) {
                count++;
            }
        }

        if (c != 0) {
            count += c;
        }

        if (d != 0) {
            count += d;
        }

        System.out.println(count);
    }
}
