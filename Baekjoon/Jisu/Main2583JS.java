package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2583JS {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};

    public static int answer;
    public static int width;

    public static int[][] arr;
    public static boolean[][] check;
    public static List<Integer> widthArr = new ArrayList<>();

    public static void dfs(int x, int y){
        check[x][y] = true;
        width+=1;

        for (int k=0; k<4; k++){
            int nextX = dx[k]+x;
            int nextY = dy[k]+y;

            if (nextX >= 0 && nextX<arr.length && nextY >= 0 && nextY<arr[0].length){
                if ( !check[nextX][nextY] && arr[nextX][nextY] == 0) dfs(nextX, nextY);
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
                    if (!check[nextX][nextY] && arr[nextX][nextY] == 0) {
                        check[nextX][nextY] = true;
                        width +=1;
                        queue.add(new int[]{nextX, nextY});
                    }
                }

            }
        }
        widthArr.add(width);
        width = 1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[m][n];
        check = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken()), startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken()), endY = Integer.parseInt(st.nextToken());
            for(int x=startX; x<endX; x++){
                for(int y=startY; y<endY; y++){
                    arr[y][x] = 1;
                }
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!check[i][j] && arr[i][j] == 0) {
                    width = 0;
                    dfs(i, j);
                    answer += 1;
                    widthArr.add(width);
                }
            }
        }
        System.out.println(answer);
        Collections.sort(widthArr);
        for(int x:widthArr) System.out.print(x+" ");
    }
}
