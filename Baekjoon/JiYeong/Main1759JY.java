package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1759JY {
    static char[] arr;
    static int[] visited;
    static int size;
    static int cnt;

    static void DFS (int start, int end, int x, int y) {
        for (int i = start; i < cnt; i++) {
            visited[i] = 1;
            DFS(i + 1, end + 1, x + (!check(arr[i]) ? 1 : 0), y + (!check(arr[i]) ? 0 : 1));
            visited[i] = 0; // 0이면 선택 안됨
        }
        if (end == size && x >= 2 && y >= 1) {
            print();
        }
    }

    static void print() {
        for (int i = 0; i < cnt; i++) {
            if (visited[i] == 1)
                System.out.print(arr[i]);
        }
        System.out.println();
    }

    static boolean check(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        cnt = Integer.parseInt(st.nextToken());
        arr = new char[cnt];
        visited = new int[cnt];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<cnt; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);
        DFS(0, 0, 0, 0);
    }
}
