package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6603DH {
    private static StringBuilder sb = new StringBuilder();
    private static int[] arr;
    private static int[] check;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while (!(input = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(input);
            arr = new int[Integer.parseInt(st.nextToken())];
            check = new int[arr.length];

            for (int i=0;i<arr.length;i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            printPermutation(0, 0);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void printPermutation(int startIdx, int level) {
        if (level == 6) {
            printArr(arr);
        }

        for(int i = startIdx; i < arr.length; i++) {
            check[i] = 1;
            printPermutation(i+1, level+1);
            check[i] = 0;
        }
    }

    public static void printArr(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            if(check[i] == 1) {
                sb.append(arr[i]+" ");
            }
        }
        sb.append("\n");
    }
}
