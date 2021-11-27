package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1780JS {
    public static int[][] paper;
    public static int plus, zero, minus;
    public static void recursive(int x, int y, int num){
        int[] dx = {x, x, x, x+num/3, x+num/3, x+num/3, x+2*num/3, x+2*num/3, x+2*num/3};
        int[] dy = {y, y+num/3, y+2*num/3, y, y+num/3, y+2*num/3, y, y+num/3, y+2*num/3};

        for (int i=0; i<9; i++) {
            int result = check(dx[i], dy[i], num/3);
            if (result == -1) minus += 1;
            else if (result == 0) zero += 1;
            else if (result == 1) plus += 1;
            else recursive(dx[i], dy[i], num/3);
        }

    }
    public static int check(int x, int y, int num){
        int result = paper[x][y];

        for(int i=x; i<x+num; i++){
            for (int j=y; j<y+num; j++){
                if (result != paper[i][j]) return 2;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        paper = new int[num][num];
        for(int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<num; j++) paper[i][j] = Integer.parseInt(st.nextToken());
        }
        int result = check(0, 0, num);
        if (result == -1) minus += 1;
        else if (result == 0) zero += 1;
        else if (result == 1) plus += 1;
        else recursive(0, 0, num);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }
}
