package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main17952DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] homework = new int[t][2];
        int index = -1;
        int score = 0;

        for (int j=0;j<t;j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("1")) {
                index++;
                homework[index][0] = Integer.parseInt(st.nextToken());
                homework[index][1] = Integer.parseInt(st.nextToken())-1;
            } else {
                if (index == -1) {
                    continue;
                }
                homework[index][1]--;
            }

            if (homework[index][1] == 0) {
                score += homework[index][0];
                homework[index][0]=0;
                homework[index][1]=0;
                index--;
            }
        }

        System.out.println(score);
    }
}