package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10205JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dataset = Integer.parseInt(br.readLine());
        int[] head = new int[dataset];
        String[] action = new String[dataset];
        int index = 0;
        for (int i = 0; i<dataset*2; i++){
            if (i%2 == 0) head[index] = Integer.parseInt(br.readLine());
            else action[index] = br.readLine();
            if (head[index] != 0 && action[index] != null) index +=1;
        }

        for (int j = 0; j<dataset; j++){
            int answer = head[j];
            for (int x = 0; x<action[j].length(); x++){
                if (action[j].charAt(x) == 'c') answer += 1;
                else if (action[j].charAt(x) == 'b') answer -= 1;
            }
            System.out.println("Data Set " + (j+1) + ":\n" + answer + "\n");
        }
    }
}
