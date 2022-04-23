package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2965JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] kangaroo = br.readLine().split(" ");

        int answer = Math.max(Integer.parseInt(kangaroo[1]) - Integer.parseInt(kangaroo[0]) - 1,
                                Integer.parseInt(kangaroo[2]) - Integer.parseInt(kangaroo[1]) - 1);
        System.out.println(answer);
    }
}
