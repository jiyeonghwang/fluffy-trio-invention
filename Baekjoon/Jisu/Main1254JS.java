package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1254JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palindrome = br.readLine();
        int size = palindrome.length();
        int answer = size;

        for (int i=0; i<size; i++){
            if (isPalindrome(palindrome.substring(i))) {
                break;
            }
            answer+=1;
        }
        System.out.print(answer);
    }

    public static boolean isPalindrome(String input){
        int size = input.length();

        for(int i = 0; i<size; i++){
            if (input.charAt(i) != input.charAt(size-i-1)) return false;
        }
        return true;
    }
}