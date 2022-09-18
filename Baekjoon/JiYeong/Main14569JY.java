package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14569JY {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long[] timetable = new long[1001];

        int n = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

            int k = Integer.parseInt(st.nextToken());
            for(int j = 0 ; j < k ; j++) {
                int time = Integer.parseInt(st.nextToken());
                timetable[i] |= ((long)1 << time);
            }

        }

        int m = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0 ; i < m ; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

            int size = Integer.parseInt(st.nextToken());
            long tmp = 0;
            for(int j = 0 ; j < size ; j++) {
                int time = Integer.parseInt(st.nextToken());
                tmp |= ((long)1 << time);
            }

            // 비트연산자 ~: 반대의 의미
            tmp = ~tmp;

            int cnt = 0; for(int j = 0 ; j < n ; j++) {
                if((tmp & timetable[j]) == 0) {
                    cnt++;
                }
            }
            sb.append(cnt +"\n");
        }

        System.out.println(sb);
    }
}
