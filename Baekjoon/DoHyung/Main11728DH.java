package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11728DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] first = new int[n];
        int[] second = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            first[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            second[i] = Integer.parseInt(st.nextToken());
        }

        int firstIdx = 0;
        int secondIdx = 0;
        int index = 0;
        int[] answer = new int[n+m];
        while (firstIdx<n && secondIdx<m) {
            if (first[firstIdx] < second[secondIdx]) {
                answer[index] = first[firstIdx];
                firstIdx++;
                index++;
            } else {
                answer[index] = second[secondIdx];
                secondIdx++;
                index++;
            }
        }

        while (firstIdx<n) {
            answer[index] = first[firstIdx];
            firstIdx++;
            index++;
        }

        while (secondIdx<m) {
            answer[index] = second[secondIdx];
            secondIdx++;
            index++;
        }

        StringBuilder sb = new StringBuilder();
        for (int num:answer) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}
