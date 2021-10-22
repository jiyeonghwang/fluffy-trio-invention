package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1780DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];

        for (int i=0;i<board.length;i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            for (int j=0;j<board.length;j++) {
                board[i][j] = Integer.parseInt(input.nextToken());
            }
        }

        int check = check(n, board, 0, 0);
        if (check == -1) {
            System.out.println("1\n0\n0");
            return;
        } else if (check == 0) {
            System.out.println("0\n1\n0");
            return;
        } else if (check == 1) {
            System.out.println("0\n0\n1");
            return;
        }

        int[] result = cut(n, board, 0, 0);
        System.out.println(result[0]+"\n"+result[1]+"\n"+result[2]);

    }

    public static int[] cut(int n, int[][] board, int i, int j) {
        int neg = 0;
        int zero = 0;
        int pos = 0;

        int[] iIdx = {i, i, i, i+n/3, i+n/3, i+n/3, i+2*n/3, i+2*n/3, i+2*n/3};
        int[] jIdx = {j, j+n/3, j+2*n/3, j, j+n/3, j+2*n/3, j, j+n/3, j+2*n/3};

        for (int k=0;k<9;k++) {
            int result = check(n/3, board, iIdx[k], jIdx[k]);
            if (result == -1) {
                neg++;
            } else if (result == 0) {
                zero++;
            } else if (result == 1) {
                pos++;
            } else {
                int[] tmp = cut(n/3, board, iIdx[k], jIdx[k]);
                neg+=tmp[0];
                zero+=tmp[1];
                pos+=tmp[2];
            }
        }

        return new int[]{neg, zero, pos};
    }

    public static int check(int n, int[][] board, int i, int j) {
        int value = board[i][j];

        for (int x=i;x<i+n;x++) {
            for (int y=j;y<j+n;y++) {
                if (value != board[x][y]) {
                    return -2;
                }
            }
        }

        return value;
    }
}