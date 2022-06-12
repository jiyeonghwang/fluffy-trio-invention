package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10974DH {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = i+1;
        }

        perm(arr, 0, n, n);
        System.out.println(sb);
    }

    public static void perm(int[] arr, int len, int n, int k) {
        if (len == k) {
            for (int i=0;i<n-1;i++) {
                sb.append(arr[i]+" ");
            }
            sb.append(arr[n-1]+"\n");
            return;
        }

        for (int i=len;i<n;i++) {
            int tmp = arr[i];
            for (int j=i;j>len;j--) {
                arr[j] = arr[j-1];
            }
            arr[len] = tmp;

            perm(arr, len + 1, n, k);

            tmp = arr[len];
            for (int j=len;j<i;j++) {
                arr[j] = arr[j+1];
            }
            arr[i] = tmp;
        }
    }
}

