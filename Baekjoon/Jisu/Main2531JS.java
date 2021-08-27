package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2531JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0, tmp = 0;

        int dish = Integer.parseInt(st.nextToken());
        int kind = Integer.parseInt(st.nextToken());
        int continuity = Integer.parseInt(st.nextToken());
        int coupon = Integer.parseInt(st.nextToken());

        int[] sushi = new int[dish];
        int[] eating = new int[kind+1];
        for (int i = 0; i<dish; i++) sushi[i] = Integer.parseInt(br.readLine());

        for (int j=0; j<continuity; j++){
            if (eating[sushi[j]] == 0) tmp+=1;
            eating[sushi[j]] +=1;
        }

        for(int i=1; i<dish; i++){
            eating[sushi[i-1]] -= 1;
            if (eating[sushi[i-1]] == 0) tmp -= 1;

            int target = (i + continuity - 1) % dish;
            if (eating[sushi[target]] == 0) tmp+=1;
            eating[sushi[target]] +=1;

            if (answer <= tmp) {
                if (eating[coupon] == 0) answer = tmp+1;
                else answer = tmp;
            }
        }

        System.out.println(answer);
    }
}
