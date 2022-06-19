package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main9935JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String bomb = br.readLine();
        Stack<Character> stack = new Stack<>();

        for(char x:str.toCharArray()){
            stack.push(x);
            if(stack.size() >= bomb.length()){
                boolean flag = true;
                for(int j=0; j<bomb.length(); j++){
                    if(stack.get(stack.size()-bomb.length()+j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0; j<bomb.length(); j++){
                        stack.pop();
                    }
                }
            }
        }

        if(!stack.isEmpty()){
            StringBuilder sb = new StringBuilder();
            for(char x:stack) sb.append(x);
            System.out.println(sb);
        }
        else System.out.println("FRULA");

    }
}
