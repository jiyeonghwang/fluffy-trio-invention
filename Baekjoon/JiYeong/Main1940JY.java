package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1940JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int weight = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int temp = weight - list.get(i);
            if (list.contains(temp)) result++;
        }
        System.out.println(result / 2);
    }
}
