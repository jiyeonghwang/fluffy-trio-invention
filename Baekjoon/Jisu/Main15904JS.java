package Jisu;

import java.util.*;

public class Main15904JS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputArray = scanner.nextLine().toCharArray();
        char[] charArray = new char[]{'U', 'C', 'P', 'C'};
        int index = 0;
        for (char input:inputArray){
            if(input == charArray[index]) index+=1;
            if(index==charArray.length) break;
        }
        if (index == charArray.length) System.out.println("I love UCPC");
        else System.out.println("I hate UCPC");
    }
}
