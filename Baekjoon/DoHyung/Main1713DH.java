package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1713DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pictures = Integer.parseInt(br.readLine());
        int recommand = Integer.parseInt(br.readLine());

        int[] picArr = new int[pictures];
        int[] orderArr = new int[pictures];
        int[] recommandArr = new int[pictures];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<recommand;i++) {
            int n = Integer.parseInt(st.nextToken());

            int index = -1;
            for (int j=0;j<pictures;j++) {
                if (picArr[j] == n) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                int minIdx = 0;
                for (int j=0;j<pictures;j++) {
                    if (recommandArr[j] < recommandArr[minIdx]) {
                        minIdx = j;
                    } else if (recommandArr[j] == recommandArr[minIdx]) {
                        if (orderArr[j] < orderArr[minIdx]) {
                            minIdx = j;
                        }
                    }
                }

                picArr[minIdx] = n;
                orderArr[minIdx] = i;
                recommandArr[minIdx] = 1;
            } else {
                recommandArr[index]++;
            }
        }

        Arrays.sort(picArr);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<pictures;i++) {
            if (picArr[i] != 0) {
                sb.append(picArr[i]).append(" ");
            }
        }

        System.out.println(sb);
    }

}