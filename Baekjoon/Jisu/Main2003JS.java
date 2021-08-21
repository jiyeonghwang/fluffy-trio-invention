package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2003JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String[] numArray = br.readLine().split(" ");

        int p1 = 0, p2 = 0, sum = 0, count = 0;
        while (p2 <= Integer.parseInt(input[0])){
            if (sum >= Integer.parseInt(input[1])){
                sum -= Integer.parseInt(numArray[p1]);
                p1 += 1;
            } else if (p2 == Integer.parseInt(input[0])) break;
            else if (sum < Integer.parseInt(input[1])){
                sum += Integer.parseInt(numArray[p2]);
                p2 += 1;
            }
            if (sum == Integer.parseInt(input[1])){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
