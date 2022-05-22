package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1940JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        boolean[] check = new boolean[n];
        List<Integer> numArr = new ArrayList<>();
        for (String s : numbers) {
            int number = Integer.parseInt(s);
            numArr.add(number);
        }

        int answer = 0;
        for (int i=0; i<n; i++){
            int target = m - numArr.get(i);
            if (! check[i] && numArr.contains(target) && i != numArr.indexOf(target)) {
                answer +=1;
                check[i] = true;
                check[numArr.indexOf(target)] = true;
            }
        }
        System.out.println(answer);
    }
}
