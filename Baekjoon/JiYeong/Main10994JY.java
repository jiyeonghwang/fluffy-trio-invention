package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10994JY {
    static char arr[][];

    public static void drawStar(int s, int len) {
        for(int i=s; i<len; i++) {
            arr[s][i] = '*'; //맨 위 가로줄
            arr[len-1][i] = '*'; //맨 아래 가로줄
            arr[i][s] = '*'; //왼쪽 세로줄
            arr[i][len-1] = '*'; //오른쪽 세로줄
        }

        if(len == 1) return;

        drawStar(s+2, len-2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = 1 + (n-1)*4;
        arr = new char[len][len];

        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                arr[i][j] = ' ';
            }
        }

        drawStar(0, len);

        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
