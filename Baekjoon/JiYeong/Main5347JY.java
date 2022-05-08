package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main5347JY {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String[]> list = new ArrayList<>();
        List<Long> result = new ArrayList<>();
        int cnt = Integer.parseInt(br.readLine());
        for (int i=0; i<cnt; i++) {
            list.add(br.readLine().split(" "));
        }

        for (String[] arr : list) {
            long gcd = GCD(Long.parseLong(arr[0]), Long.parseLong(arr[1]));
            result.add(Long.parseLong(arr[0])*Long.parseLong(arr[1])/gcd);
        }

        for (Long i : result) {
            System.out.println(i);
        }
    }

    public static long GCD(long num1, long num2) {
        if(num2 == 0) return num1;
        else return GCD(num2, num1 % num2);
    }
}
