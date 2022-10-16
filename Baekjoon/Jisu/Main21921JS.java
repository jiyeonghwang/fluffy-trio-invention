package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main21921JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]), x = Integer.parseInt(line[1]);

        String[] visitor = br.readLine().split(" ");

        int left = 0, right = 1, sum = Integer.parseInt(visitor[0]), idx = 1, max = 0, count = 1;

        while (left<n && right<n){
            if (idx==x){
                if(sum==max) count+=1;

                if (sum > max) {
                    max = sum;
                    count=1;
                }
                sum -= Integer.parseInt(visitor[left]);
                left += 1;
                idx -= 1;
            } else {
                sum += Integer.parseInt(visitor[right]);
                idx+=1;
                right+=1;
            }
        }

        if (max == 0) System.out.println("SAD");
        else {
            if (right == n && idx==x && sum==max) count+=1;
            System.out.println(max);
            System.out.println(count);
        }
    }
}
