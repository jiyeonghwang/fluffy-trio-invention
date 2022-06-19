package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main2210JS {
    public static int[][] numbers;
    public static int[] digits;
    public static Set<String> set;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static void dfs(int x, int y, int depth){
        if(depth>5) {
            StringBuilder sb = new StringBuilder();
            for (int digit:digits){
                sb.append(digit);
            }
            set.add(sb.toString());
            return;
        }

        digits[depth] = numbers[x][y];
        for(int i=0; i<4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX>=0 && nextY >=0 && nextX <5 && nextY < 5) dfs(nextX, nextY, depth+1);
        }

    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numbers = new int[5][5];

        for (int i=0; i<5; i++){
            String[] numberStr = br.readLine().split(" ");
            for (int j=0; j<5; j++){
                numbers[i][j] = Integer.parseInt(numberStr[j]);
            }
        }

        set = new HashSet<>();
        digits = new int[6];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i, j, 0);
            }
        }
        System.out.println(set.size());
    }
}
