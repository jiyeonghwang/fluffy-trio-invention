package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main3077JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int kind = Integer.parseInt(br.readLine());
        String[] answer = new String[kind];
        Map<String, Integer> submit = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <kind; i++){
            answer[i] = st.nextToken();
        }
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j <kind; j++){
            String key = st.nextToken();
            submit.put(key, submit.getOrDefault(key, j+1));
        }

        int count = 0;
        for (int x=0; x<kind-1; x++){
            for(int y=x+1; y<kind; y++){
                if (submit.get(answer[x]) < submit.get(answer[y])) count +=1;
            }
        }
        String output = count + "/" + kind * (kind - 1) / 2;
        System.out.println(output);
    }
}
