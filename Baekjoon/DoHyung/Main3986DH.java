package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main3986DH {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i=0;i<n;i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<Character>();

            for (char c:input.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (stack.peek() == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }

            if (stack.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
