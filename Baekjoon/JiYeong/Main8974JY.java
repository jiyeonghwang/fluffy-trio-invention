package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main8974JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[1001];
        arr[1] = 1;
        int cnt = 0;
        int standard = 2;
        int temp = 2;
        for (int i = 2; i < 1001; i++) {
            if (cnt < standard) {
                arr[i] = temp;
                cnt++;
            } else {
                temp++;
                standard++;
                arr[i] = temp;
                cnt = 1;
            }
        }

        String[] input = br.readLine().split(" ");
        int result = 0;
        for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
