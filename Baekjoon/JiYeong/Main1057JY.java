package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1057JY {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int zimin = Integer.parseInt(arr[1]);
        int hansu = Integer.parseInt(arr[2]);
        int result = 0;
        while(zimin != hansu) {
            zimin = zimin/2 + zimin%2;
            hansu = hansu/2 + hansu%2;
            result++;
        }
        System.out.println(result);
    }
}
