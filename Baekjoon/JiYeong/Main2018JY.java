package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2018JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int cnt = sum/2 + 1;
        int lt=1, temp=0;
        int result = 0;

        for (int i=1; i<cnt+1; i++) {
            temp+=i;
            if(temp==sum) result++;
            while (temp>=sum) {
                temp-=lt++;
                if(temp==sum) result++;
            }
        }

        System.out.println(result+1);
    }
}
