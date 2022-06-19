package JiYeong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//81%에서 멈춤
public class Main2578JY {
    static int[][] my = new int[5][5];
    static boolean[][] check = new boolean[5][5];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                my[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                list.add(sc.nextInt());
            }
        }

        int count = 1;
        for (int i : list) {
            check(i);
            if (count >= 15 && checkBingo()) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }

    public static void check(int str) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (my[i][j] == str) {
                    check[i][j] = true;
                    break;
                }
            }
        }
    }

    public static boolean checkBingo() {
        int cnt = 0;
        for (int i=0; i<5; i++) {
            if (check[i][0] && check[i][1] && check[i][2] && check[i][3] && check[i][4]) {
                cnt++;
            }

            if (check[0][i] && check[1][i] && check[2][i] && check[3][i] && check[4][i]) {
                cnt++;
            }
        }

        if (check[0][0] && check[1][1] && check[2][2] && check[3][3] && check[4][4]) {
            cnt++;
        }

        if (check[0][4] && check[1][3] && check[2][2] && check[3][1] && check[4][0]) {
            cnt++;
        }

        if (cnt >= 3) {
            return true;
        } else {
            return false;
        }
    }
}
