package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main11170JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        int temp = 0;
        while (temp < count) {
            int tempResult = 0;
            String[] arrTemp = br.readLine().split(" ");
            int tempCount = 0;
            for (int i=Integer.parseInt(arrTemp[0]); i<=Integer.parseInt(arrTemp[1]); i++) {
                int t = i;
                if (t==0) {
                    tempCount++;
                    continue;
                }

                while (t>1) {
                    if (t % 10 == 0) {
                        tempCount++;
                    }
                    t /= 10;
                }
            }
            result.add(tempCount);
            temp++;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
