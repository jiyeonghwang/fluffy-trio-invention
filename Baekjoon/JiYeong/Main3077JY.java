package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main3077JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] answer = br.readLine().split(" ");
        String[] test = br.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        int result = 0;

        for (int i=0; i<cnt; i++) {
            map.put(answer[i], i);
        }

        for (int i=0; i<cnt-1; i++) {
            for(int j=i+1; j<cnt; j++) {
                if (map.get(test[i]) < map.get(test[j])) {
                    result++;
                }
            }
        }

        System.out.println(result+"/"+ cnt*(cnt-1)/2);
    }
}