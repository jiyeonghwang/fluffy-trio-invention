package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main3986JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int idx = 0, answer = 0;
        while (idx<n){
            idx+=1;
            char[] word = br.readLine().toCharArray();
            if(word.length %2 != 0) continue;
            Stack<Character> stack = new Stack<>();

            for(char x:word){
                if(stack.isEmpty()) stack.push(x);
                else{
                    if(stack.peek() != x) stack.push(x);
                    else stack.pop();
                }
            }
            if(stack.isEmpty()) answer+=1;
        }
        System.out.println(answer);
    }
}
