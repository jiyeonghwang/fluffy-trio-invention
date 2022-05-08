package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1057JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputArr[0]);
        int jimin = Integer.parseInt(inputArr[1]);
        int hansu = Integer.parseInt(inputArr[2]);

        int count = 1;
        boolean flag = false;
        while (count<=n){
            if((jimin+1)/2 == (hansu+1)/2) {
                System.out.println(count);
                flag = true;
                break;
            }
            jimin = (jimin+1)/2;
            hansu = (hansu+1)/2;
            count +=1;
        }
        if(!flag) System.out.println(-1);
    }
}
