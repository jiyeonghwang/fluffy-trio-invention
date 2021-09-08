package DoHyung;

import java.util.Scanner;

public class SW1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            int testCaseNum = sc.nextInt();
            int[] scores = new int[101];

            for (int j=0;j<1000;j++) {
                scores[sc.nextInt()]++;
            }

            int maxCnt = 0;
            int maxIdx = -1;
            for (int j=0;j<101;j++) {
                if (maxCnt <= scores[j]) {
                    maxCnt = scores[j];
                    maxIdx = j;
                }
            }

            sb.append("#").append(testCaseNum).append(" ").append(maxIdx).append("\n");
        }

        System.out.println(sb);
    }
}
