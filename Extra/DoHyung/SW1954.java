package DoHyung;

import java.util.Scanner;

public class SW1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            sb.append("#").append(i+1).append("\n");

            int length = sc.nextInt();
            int[][] board = new int[length][length];

            int j = 0;
            int k = 0;
            int direction = 0; //"Right", "Down", "Left", "Up"
            int num = 1;
            while (num < length*length) {
                board[j][k] = num;
                if (direction == 0) {
                    if (k < length-1 && board[j][k+1]==0) {
                        k++;
                        num++;
                    } else {
                        direction++;
                    }
                } else if (direction == 1) {
                    if (j < length-1 && board[j+1][k]==0) {
                        j++;
                        num++;
                    } else {
                        direction++;
                    }
                } else if (direction == 2) {
                    if (k > 0 && board[j][k-1]==0) {
                        k--;
                        num++;
                    } else {
                        direction++;
                    }
                } else if (direction == 3) {
                    if (j > 0 && board[j-1][k]==0) {
                        j--;
                        num++;
                    } else {
                        direction = 0;
                    }
                }
            }
            board[j][k] = num;

            for (int x=0;x<length;x++) {
                for (int y=0;y<length;y++) {
                    sb.append(board[x][y]);
                    if (y == length-1) {
                        sb.append("\n");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
