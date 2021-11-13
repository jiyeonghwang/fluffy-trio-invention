package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630JS {
    public static int[][] paper;
    public static int white, blue;
    public static void recursive(int x, int y, int num){
        int[] dx = {x, x, x+num/2, x+num/2};
        int[] dy = {y, y+num/2, y, y+num/2};

        for (int i=0; i<4; i++) {
            int result = check(dx[i], dy[i], num/2);
            if (result == 0) white += 1;
            else if (result == 1) blue += 1;
            else recursive(dx[i], dy[i], num/2);
        }

    }
    public static int check(int x, int y, int num){
        int result = paper[x][y];

        for(int i=x; i<x+num; i++){
            for (int j=y; j<y+num; j++){
                if (result != paper[i][j]) return -1;
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
        if (result == 0) white += 1;
        else if (result == 1) blue += 1;
        else recursive(0, 0, num);
        System.out.println(white);
        System.out.println(blue);
    }
}
