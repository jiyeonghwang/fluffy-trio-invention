package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11729JS {
    static int answer = 0;
    static StringBuffer sb = new StringBuffer();
    public static void hanoi(int n, int from, int via, int to){
        answer +=1;
        if (n==1) {
            sb.append(from).append(" ").append(to).append("\n");;
            return;
        }
        hanoi(n-1, from, to, via);
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(n-1, via, from, to);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n==1){
            System.out.println(n);
            System.out.println("1 3");
            return;
        }
        hanoi(n, 1, 2, 3);
        System.out.println(answer);
        System.out.print(sb.toString());
    }
}
