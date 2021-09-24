package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main17952JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int allTime = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> result = new Stack<>();
        int answer = 0;

        String temp = "";
        for (int i=0; i<allTime; i++) {
            temp = br.readLine();
            if (temp.equals("0")) {
                if (!stack.isEmpty()) {
                    if (stack.peek() == 1) {
                        answer += result.peek();
                        result.pop();
                        stack.pop();
                    } else {
                        int j = stack.peek()-1;
                        stack.pop();
                        stack.push(j);
                    }
                }
            } else {
                String[] s = temp.split(" ");
                if (Integer.parseInt(s[2]) == 1) {
                    answer += Integer.parseInt(s[1]);
                } else {
                    stack.push(Integer.parseInt(s[2])-1);
                    result.push(Integer.parseInt(s[1]));
                }
            }
        }

        System.out.println(answer);
    }
}