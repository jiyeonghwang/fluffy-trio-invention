package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10994DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] board = new boolean[n*4-3][n*4-3];
        board = star(n, board);

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board.length;j++) {
                if (board[i][j]) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static boolean[][] star(int n, boolean[][] board) {
        int start = ((board.length+3)/4-n)*2;
        int end = start+n*4-3;

        for (int i=start;i<end;i++) {
            if (i == start || i == end-1) {
                for (int j=start;j<end;j++) {
                    board[i][j] = true;
                }
            } else {
                board[i][start] = true;
                board[i][end-1] = true;
            }
        }

        if (n > 0) {
            board = star(n-1, board);
        }

        return board;
    }
}
