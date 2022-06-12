package JiYeong;

import java.util.Scanner;
import java.util.Stack;

public class Main3986JY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int result=0;

        for(int i=0;i<N;i++) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();

            int j=0;
            for(; j<s.length(); j++) {
                if(!stack.isEmpty() && stack.peek() == s.charAt(j)) {
                    stack.pop();
                }
                else stack.push(s.charAt(j));
            }
            if(stack.size()==0) result++;
        }
        System.out.println(result);
    }
}
