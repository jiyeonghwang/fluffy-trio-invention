package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20944JY {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=0; i<n; i++) {
//            sb.append("a");
//        }
//
//        System.out.println(sb);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean odd = false;
        StringBuilder sb = new StringBuilder();

        if (n%2 != 0) {
            odd = true;
        }

        for (int i=0; i<n/2; i++) {
            sb.append("a");
        }

        if (odd) {
            System.out.println( sb +"b"+ sb);
        } else {
            System.out.println( sb + "" + sb);
        }
    }
}
