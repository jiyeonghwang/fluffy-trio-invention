package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11729DH {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        sb.append((int) Math.pow(2, num)-1+"\n");

        hanoi(num,1, 2, 3);

        System.out.println(sb);
    }

    public static void hanoi(int num, int start, int mid, int to) {
        if (num == 1) {
            sb.append(start+" "+to+"\n");
            return;
        }

        hanoi(num-1, start, to, mid);
        sb.append(start+" "+to+"\n");
        hanoi(num-1, mid, start, to);
    }
}
