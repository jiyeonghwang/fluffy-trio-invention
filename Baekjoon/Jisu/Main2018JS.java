package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2018JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] numArray = new int[num];
        for (int i = 0; i<num; i++){
            numArray[i] = i+1;
        }

        int p1 = 0, sum = 0, count = 0;
        for(int p2 = 0; p2<num; p2++){
            sum += numArray[p2];
            if (sum == num) count +=1;
            while (sum >= num){
                sum -= numArray[p1];
                p1 += 1;
                if (sum == num) count +=1;
            }
        }
        System.out.println(count);
    }
}
