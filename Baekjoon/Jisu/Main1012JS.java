package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1012JS {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};
    public static int answer;

    public static int[][] arr;
    public static boolean[][] check;

    public static void dfs(int x, int y){
        check[x][y] = true;

        for (int k=0; k<4; k++){
            int nextX = dx[k]+x;
            int nextY = dy[k]+y;

            if (nextX >= 0 && nextX<arr.length && nextY >= 0 && nextY<arr[0].length){
                if ( !check[nextX][nextY] && arr[nextX][nextY] == 1) dfs(nextX, nextY);
            }

        }
    }

    public static void bfs(int x, int y){
        check[x][y] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0], currentY = current[1];
            for (int k = 0; k < 4; k++) {
                int nextX = dx[k] + currentX;
                int nextY = dy[k] + currentY;

                if (nextX >= 0 && nextX < arr.length && nextY >= 0 && nextY < arr[0].length) {
                    if (!check[nextX][nextY] && arr[nextX][nextY] == 1) {
                        check[nextX][nextY] = true;
                        queue.add(new int[]{nextX, nextY});
                    }
                }

            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int x=0; x<testCase; x++) {
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];
            check = new boolean[m][n];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!check[i][j] && arr[i][j] == 1) {
                        bfs(i, j);
                        answer += 1;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
