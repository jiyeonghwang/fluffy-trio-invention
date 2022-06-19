package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main2210JY {
    static Set<String> set = new HashSet<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] map = new String[5][5];

        for(int i=0;i<5;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++) {
                map[i][j] = st.nextToken();
            }
        }

        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                dfs(map, i, j, 0, map[i][j]);
            }
        }
        System.out.println(set.size());
    }

    public static void dfs(String[][] m, int x, int y, int cnt, String tmp) {
        if(cnt == 5) {
            set.add(tmp);
            return;
        }
        for(int i=0;i<4;i++) {
            int nowx = x+dx[i];
            int nowy = y+dy[i];
            if((0<=nowx&&nowx<5)&&(0<=nowy&&nowy<5)) {
                dfs(m, nowx, nowy, cnt+1, tmp+m[nowx][nowy]);
            }
        }
    }
}
