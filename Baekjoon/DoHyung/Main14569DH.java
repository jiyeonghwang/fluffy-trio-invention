package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main14569DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfClass = Integer.parseInt(br.readLine());
        List<List<Integer>> classes = new ArrayList<List<Integer>>();

        for (int i=0;i<numOfClass;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            ArrayList<Integer> times = new ArrayList<Integer>();

            for (int j=0;j<cnt;j++) {
                times.add(Integer.parseInt(st.nextToken())-1);
            }
            classes.add(times);
        }

        int numOfStudents = Integer.parseInt(br.readLine());
        int[][] students = new int[numOfStudents][];

        for (int i=0;i<numOfStudents;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            int[] emptyTimes = new int[50];

            for (int j=0;j<cnt;j++) {
                emptyTimes[Integer.parseInt(st.nextToken())-1] = 1;
            }
            students[i] = emptyTimes;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<numOfStudents;i++) {
            int canTake = 0;
            for (int j=0;j<numOfClass;j++) {
                boolean check = true;
                for (int k=0;k<classes.get(j).size();k++) {
                    if (students[i][classes.get(j).get(k)] != 1) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    canTake++;
                }
            }
            sb.append(canTake+"\n");
        }

        System.out.println(sb);
    }
}
