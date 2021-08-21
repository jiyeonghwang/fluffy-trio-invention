package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2002JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int temp = 0, lt = 0;
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList();
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i=0; i<size; i++) {
            temp+=list.get(i);
            if(temp==sum) answer++;
            while (temp >= sum) {
                temp-=list.get(lt++);
                if(temp==sum) answer++;
            }
        }

        System.out.println(answer);
    }
}
